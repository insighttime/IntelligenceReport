package com.lightinit.economicinformation.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,Object handler, Exception ex) throws Exception {
        Object user = request.getSession().getAttribute("userName");
        System.out.println("afterCompletion----" + user + " ::: " + request.getRequestURL());
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        Object user = request.getSession().getAttribute("userName");
        System.out.println("postHandle----" + user + " ::: " + request.getRequestURL());

    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws  Exception {
        Object user = request.getSession().getAttribute("userName");
        System.out.println("preHandle----" + user + " ::: " + request.getRequestURL());

        if (user == null) {
        request.setAttribute("msg","无权限请先登录");
        // 获取request返回页面到登录页
        request.getRequestDispatcher("/").forward(request, response);
        return false;
        }
        return true;
    }
}
