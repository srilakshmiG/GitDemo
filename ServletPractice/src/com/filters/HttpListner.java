package com.filters;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class HttpListner implements HttpSessionListener{
 int count =0;
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		count ++;
		System.out.println("number of active sessions::" +count);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		count --;
		System.out.println("number of active sessions::" +count);
		
	}

}
