package com.aop.f0r.auth;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.security.auth.login.LoginException;
import java.lang.reflect.Method;

/**
 * @Author: dj
 * @Date: 2019/7/20 19:25
 * @Version 1.0
 */
@Aspect
@Component
public class ControllerAspect {

    private static final Logger logger = LoggerFactory.getLogger(ControllerAspect.class);

    @Resource
    private UserService userService;

    /**
     * 定义切点
     */
    @Pointcut("execution(public * com.aop.f0r.auth.*.*(..))")
    public void privilege() {}

    @Around("privilege()")
    public Object isAccessMethod(ProceedingJoinPoint proceedingJoinPoint)
        throws Throwable{
        //获取访问目标方法
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = methodSignature.getMethod();
        //得到方法的访问权限
        String methodAccess = AnnotationParse.privilegeParse(method);
        //如果该方法上没有权限注解，直接调用目标方法
        if(StringUtils.isBlank(methodAccess )){
            return proceedingJoinPoint.proceed();
        }else {
            //获取当前用户的权限
            String currentUserAuth = userService.getCurrentUserAuth();
            if(currentUserAuth == null){
                throw new LoginException("未登录！");
            }
            if(methodAccess.equals(currentUserAuth)){
                return proceedingJoinPoint.proceed();
            }else {
                throw new Exception("权限不够！");
            }
        }
    }
}
