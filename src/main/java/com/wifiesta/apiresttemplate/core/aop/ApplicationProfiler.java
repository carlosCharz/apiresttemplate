package com.wifiesta.apiresttemplate.core.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Profiler that logs method names for the controllers
 *
 * @author charz
 */

@Aspect
@Component
public class ApplicationProfiler {

  private static final Logger logger = LoggerFactory.getLogger(ApplicationProfiler.class);

  @Around("execution(* com.wifiesta.apiresttemplate.core.controller.*.*(..))")
  public Object aroundControllers(ProceedingJoinPoint pjp) throws Throwable {
    Signature method = pjp.getSignature();
    String packageName = method.getDeclaringTypeName();
    String controllerName = packageName.substring(packageName.lastIndexOf(".") + 1);
    logger.info(controllerName + " -> " + method.getName());
    return pjp.proceed();
  }

}
