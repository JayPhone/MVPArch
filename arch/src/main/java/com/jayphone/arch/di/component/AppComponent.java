package com.jayphone.arch.di.component;

import com.jayphone.arch.di.module.AppModule;
import com.jayphone.arch.di.module.ClientModule;
import com.jayphone.arch.di.module.GlobalConfigModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by JayPhone on 2019/12/24
 */
@Singleton
@Component(modules = {AppModule.class, ClientModule.class, GlobalConfigModule.class})
public interface AppComponent {
}
