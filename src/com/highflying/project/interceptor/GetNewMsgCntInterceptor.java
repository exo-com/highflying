package com.highflying.project.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.highflying.project.service.IMessageService;



public class GetNewMsgCntInterceptor extends HandlerInterceptorAdapter {
	@Resource(name="messageService")
	private IMessageService messageService; 
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			Integer memberidx = (Integer)session.getAttribute("memberidx");
			if(memberidx != null) {
				request.setAttribute("newmsgcount", messageService.getNewMsgCount(memberidx));
			}
		}
		
		return super.preHandle(request, response, handler);
	}
	
}
