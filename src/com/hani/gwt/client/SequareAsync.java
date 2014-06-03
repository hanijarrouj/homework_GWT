package com.hani.gwt.client;


import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface SequareAsync {
	

	void equation(double a, double b, double c, AsyncCallback<String> callback);
	
	
	
}