package cool.ddn.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor extends HandlerInterceptorAdapter {

    //重写预处理方法
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        //判断session里sesson是否为空，如果未登录就重定向到登录页
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/admin");
            return false;
        }

        return true;
    }
}
