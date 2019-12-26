package com.jayphone.arch.base;

import androidx.annotation.NonNull;

import com.jayphone.arch.di.component.AppComponent;

/**
 * Created by JayPhone on 2019/12/25
 * 框架要求框架中的每个 {@link android.app.Application} 都需要实现此类, 以满足规范
 */
public interface App {
    /**
     * 将 {@link AppComponent} 返回出去, 供其它地方使用, {@link AppComponent} 接口中声明的方法返回的实例, .
     * 在 {@link #getAppComponent()} 拿到对象后都可以直接使用
     */
    @NonNull
    AppComponent getAppComponent();
}
