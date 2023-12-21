package dev.software_development.application.aop;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import dev.software_development.domain.auth.constant.Action;
import dev.software_development.domain.auth.constant.Resource;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Authorize {

    Action action();

    Resource resource();
}
