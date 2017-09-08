package cn.aptech.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import cn.aptech.pojo.Student;
import cn.aptech.pojo.User;
import cn.aptech.tools.Constants;

public class SysInterceptor extends HandlerInterceptorAdapter {
	private Logger logger = Logger.getLogger(SysInterceptor.class);

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.debug("SysInterceptor preHandle ==========================");
		HttpSession session = request.getSession();

		User backendUser = (User) session.getAttribute(Constants.USER_SESSION);
		Student devUser = (Student) session.getAttribute(Constants.STUDENT_USER_SESSION);

		if (null != devUser) { 
			return true;
		} else if (null != backendUser) { 
			return true;
		} else {
			response.sendRedirect(request.getContextPath() + "/403.jsp");
			return false;
		}

	}
}
