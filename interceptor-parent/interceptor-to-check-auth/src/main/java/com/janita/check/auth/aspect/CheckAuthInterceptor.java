package com.janita.check.auth.aspect;

import com.google.common.collect.Lists;
import com.janita.check.auth.annotation.CheckAuth;
import com.janita.check.auth.role.RoleCheckResolver;
import com.janita.check.auth.service.CheckAuthService;
import com.janita.check.auth.utils.HttpHeaderUtils;
import lombok.AllArgsConstructor;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.AnnotatedElement;

import static com.janita.check.auth.role.Role.getByCode;
import static com.janita.check.auth.utils.HttpHeaderUtils.USER_ROLE;

/**
 * 类说明：角色校验
 *
 * @author zhucj
 * @since 2019-07-25 - 14:31
 */
@AllArgsConstructor
public class CheckAuthInterceptor extends HandlerInterceptorAdapter {

    private CheckAuthService webTokenService;

    private RoleCheckResolver roleCheckResolver;

    private static ThreadLocal<Boolean> passValid = ThreadLocal.withInitial(() -> Boolean.FALSE);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        CheckAuth checkAuth = getAnnotation(handlerMethod.getMethod());
        if (null == checkAuth) {
            checkAuth = getAnnotation(handlerMethod.getBeanType());
        }
        if (null == checkAuth) {
            return true;
        }
        String role = HttpHeaderUtils.getRequestHeader(USER_ROLE);
        if (roleCheckResolver == null || roleCheckResolver.needCheck()) {
            if (StringUtils.isEmpty(role)) {
                throw new IllegalArgumentException("你是什么角色？");
            }
            webTokenService.checkAuth(getByCode(Integer.valueOf(role)), Lists.newArrayList(checkAuth.role()));
        }
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        // if (passValid.get()) {
        //     AuthenticationActiveResolverImpl.clear();
        // }
        passValid.remove();
    }

    private CheckAuth getAnnotation(AnnotatedElement element) {
        return element.getAnnotation(CheckAuth.class);
    }
}
