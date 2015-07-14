package com.subaozuche.controller.core;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseBackendController {
	private static Logger baseLogger = LoggerFactory.getLogger(BaseBackendController.class);

	@Autowired
	protected HttpServletRequest request;

	public BaseBackendController() {
		baseLogger.debug("this is BaseBackendController Constructor=======");
	}

	protected void checkLogin(HttpServletRequest request) {
		baseLogger.debug("Working now is ");
		try {
			if (request.getSession() != null) {
				baseLogger.debug("SESSION is " + request.getSession().getAttribute("adminUserId"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}