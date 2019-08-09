package lfx.week2;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class WebUtil {
	
	public Object getString (HttpServletRequest hsr,String name,String defaultValue){
		String requestURI = hsr.getRequestURI();
		
		String substring = requestURI.substring(requestURI.lastIndexOf("=")+1);
		
		if(substring instanceof String){
			return true;
		}else{
			return defaultValue;
		}
		
	}
	
	public int getint (HttpServletRequest hsr,String name,int defaultValue){
		String requestURI = hsr.getRequestURI();
		
		String substring = requestURI.substring(requestURI.lastIndexOf("=")+1);
		
		Integer parseInt = Integer.parseInt(substring);
		
		if(!(parseInt instanceof Integer) || substring.indexOf(name)==-1){
			return defaultValue;
		}else{
			return 0;
		}
		
	}
	
	public String getUrI (HttpServletRequest hsr,String name,int defaultValue){
		String requestURI = hsr.getRequestURI();
		
		return requestURI;
		
	}
	
	public String getCookValue (Cookie cookie){
		
		return cookie.getValue();
		
	}
	
}
