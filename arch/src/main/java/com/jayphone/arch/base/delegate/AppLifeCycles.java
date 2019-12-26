package com.jayphone.arch.base.delegate;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;

/**
 * Created by JayPhone on 2019/12/25
 * 用于代理 {@link Application} 的生命周期
 */
public interface AppLifeCycles {
    void attachBaseContext(@NonNull Context base);

    void onCreate(@NonNull Application application);

    void onTerminate(@NonNull Application application);
}
