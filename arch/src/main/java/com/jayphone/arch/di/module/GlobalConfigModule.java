package com.jayphone.arch.di.module;

import dagger.Module;

/**
 * Created by JayPhone on 2019/12/24
 * 框架独创的建造者模式 {@link Module},可向框架中注入外部配置的自定义参数
 */
@Module
public class GlobalConfigModule {
    private GlobalConfigModule(Builder builder) {

    }

    public static final class Builder {
        private Builder() {

        }

        public void build() {
            new GlobalConfigModule(this);
        }
    }
}
