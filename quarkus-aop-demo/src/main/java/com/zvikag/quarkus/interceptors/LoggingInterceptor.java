package com.zvikag.quarkus.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Logged
@Priority(2020)
@Interceptor
public class LoggingInterceptor {


    Logger log = LoggerFactory.getLogger("LoggingInterceptor.java");

    @AroundInvoke
    Object logInvocation(InvocationContext context) throws Exception {
       log.info("Time when executing the method=" +  System.currentTimeMillis());
        Object ret = context.proceed();
        log.info("Time when the method finished=" + System.currentTimeMillis());
        // ...log after
        return ret;
    }

}
