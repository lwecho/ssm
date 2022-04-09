package edu.wfu.lu.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import edu.wfu.lu.po.User;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// ��ȡ�����URL
				String url = request.getRequestURI();
				// URL:���˵�¼�����⣬������URL���������ؿ���
				if (url.indexOf("/login.action") >= 0) {
					return true;
				}
				// ��ȡSession
				HttpSession session = request.getSession();
				User user = (User) session.getAttribute("USER_SESSION");
				// �ж�Session���Ƿ����û����ݣ�����У��򷵻�true,��������ִ��
				if (user != null) {
					return true;
				}
				// �����������ĸ�����ʾ��Ϣ����ת������¼ҳ��
				request.setAttribute("msg", "����û�е�¼�����ȵ�¼��");
				request.getRequestDispatcher("/WEB-INF/jsp/login.jsp")
				                                        .forward(request, response);
		
		
		
		return false;
	}
	
	

}
