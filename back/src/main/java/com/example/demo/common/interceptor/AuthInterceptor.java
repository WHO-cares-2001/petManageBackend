package com.example.demo.common.interceptor;

import com.example.demo.common.utils.JwtUtil;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object o) throws Exception{

        // 如果是OPTIONS则结束请求
        if (HttpMethod.OPTIONS.toString().equals(req.getMethod())) {
            resp.setStatus(HttpStatus.NO_CONTENT.value());
            return true;
        }
        String token = req.getHeader("Authorization");
        System.out.println(token);
        String id = JwtUtil.validateToken(token);
        req.setAttribute("id", id);
        req.setAttribute("token", token);
        return true;
    }
}

