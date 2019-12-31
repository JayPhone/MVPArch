package com.jayphone.arch.base;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;

import com.jayphone.arch.base.delegate.AppDelegate;
import com.jayphone.arch.base.delegate.AppLifecycles;
import com.jayphone.arch.di.component.AppComponent;
import com.jayphone.arch.utils.Preconditions;

/**
 * Created by JayPhone on 2019/12/25
 * MVPArms 是一个整合了大量主流开源项目的 Android MVP 快速搭建框架, 其中包含 Dagger2、Retrofit、RxJava 以及
 * RxLifecycle、RxCache 等 Rx 系三方库, 并且提供 UI 自适应方案, 本框架将它们结合起来, 并全部使用 Dagger2 管理
 * 并提供给开发者使用, 使用本框架开发您的项目, 就意味着您已经拥有一个 MVP + Dagger2 + Retrofit + RxJava 项目
 */
public class BaseApplication extends Application implements App {
    private AppLifecycles mAppDelegate;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        if (mAppDelegate == null) {
            mAppDelegate = new AppDelegate(base);
        }
        mAppDelegate.attachBaseContext(base);
    }

    /**
     * 在模拟环境中程序终止时会被调用
     */
    @Override
    public void onCreate() {
        super.onCreate();
        if (mAppDelegate != null) {
            mAppDelegate.onCreate(this);
        }
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        if (mAppDelegate != null) {
            mAppDelegate.onTerminate(this);
        }
    }

    /**
     * 将 {@link AppComponent} 返回出去, 供其它地方使用, {@link AppComponent} 接口中声明的方法所返回的实例,
     * 在 {@link #getAppComponent()} 拿到对象后都可以直接使用
     *
     * @return AppComponent
     * @see ArmsUtils#obtainAppComponentFromContext(Context) 可直接获取 {@link AppComponent}
     */
    @NonNull
    @Override
    public AppComponent getAppComponent() {
        Preconditions.checkNotNull(mAppDelegate, "%s不能为空", mAppDelegate.getClass().getName());
        Preconditions.checkState(mAppDelegate instanceof App, "%s必须实现%s", mAppDelegate.getClass().getName(), App.class.getName());
        return ((App) mAppDelegate).getAppComponent();
    }
}
