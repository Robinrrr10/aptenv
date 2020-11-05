package com.github.aptenv;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.github.aptenv.services.ApiVariables;

@ApplicationPath("v1")
public class aptApp extends Application {

	private Set<Class<?>> allSer = new HashSet<Class<?>>();
	
	public aptApp() {
		System.out.println("1, 2, 3,........");
		allSer.add(ApiVariables.class);
		System.out.println("aptenv is ready");
	}
	
	public Set<Class<?>> getClasses(){
		return allSer;
	}
}
