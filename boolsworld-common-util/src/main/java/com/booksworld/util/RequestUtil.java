package com.booksworld.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

public class RequestUtil {
	
	private static final Logger LOG = LoggerFactory.getLogger(RequestUtil.class);


	public static String stringParam(HttpServletRequest request, String paramName) {
		String result = request.getParameter(paramName);
		if (StringUtil.isEmpty(result)) {
			result = null;
		} else {
			result.trim();
		}
		return result;
	}

	/**
	 * 
	 * @param request
	 * @param paramName
	 * @return 返回-1为参数非int或为null
	 */
	public static Integer intParam(HttpServletRequest request, String paramName) {
		String result = request.getParameter(paramName);
		int ret = -1;
		if (result != null) {
			try {
				ret = Integer.valueOf(result.trim());
			} catch (NumberFormatException e) {

			}
		}
		return ret;
	}
	
	/**
	 * 获取boolean类型参数
	 * @param request
	 * @param paramName
	 * @return
	 */
	public static Boolean booleanParam(HttpServletRequest request,String paramName){
		String param = request.getParameter(paramName);
		if(StringUtil.isEmpty(param)){
			return null;
		}
		try {
			return Boolean.valueOf(param);
		} catch (Exception e) {
			//LOG.error(e);
			LOG.error("error" + e);
		}
		return null;
	}

	/**
	 * 获取cookie值
	 * 
	 * @param request
	 * @param cookieName
	 * @return
	 */
	public static String cookieVal(HttpServletRequest request, String cookieName) {
		if (request == null || StringUtil.isEmpty(cookieName)) {
			return null;
		}
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : request.getCookies()) {
				if (cookie.getName().equals(cookieName)) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}

	/**
	 * 判断ajax请求
	 * 
	 * @param request
	 * @return
	 */
	public static boolean isAjax(HttpServletRequest request) {
		return (request.getHeader("X-Requested-With") != null
				&& "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString()));
	}

	/**
	 * 请求参数转换成queryString的形式
	 * 
	 * @return
	 */
	public static String paramsToQueryString(HttpServletRequest request) {
		Enumeration<String> paramNames = request.getParameterNames();
		StringBuilder builder = new StringBuilder();
		int index = 0;
		while (paramNames.hasMoreElements()) {
			String paramName = paramNames.nextElement();
			String value = request.getParameter(paramName);
			if (index != 0) {
				builder.append("&");
			}
			builder.append(paramName).append("=").append(value);
			index++;
		}
		return builder.toString();
	}

	/**
	 * 是否是GET请求
	 * 
	 * @param request
	 * @return
	 */
	public static boolean isGet(HttpServletRequest request) {
		return "GET".equals(request.getMethod());
	}

	/**
	 * 获取客户端真实ip
	 * 
	 * @param request
	 * @return
	 */
	public static String getRequestRealIp(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip != null && ip.contains(",")) {
			ip = ip.split(",")[0];
		}
		if (!checkIp(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (!checkIp(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (!checkIp(ip)) {
			ip = request.getHeader("X-Real-IP");
		}

		if (!checkIp(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	private static boolean checkIp(String ip) {
		if (ip == null || ip.length() == 0 || "unkown".equalsIgnoreCase(ip)) {
			return false;
		}
		return true;
	}

}
