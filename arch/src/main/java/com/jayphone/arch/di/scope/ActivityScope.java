package com.jayphone.arch.di.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by JayPhone on 2019/12/24
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {
}
