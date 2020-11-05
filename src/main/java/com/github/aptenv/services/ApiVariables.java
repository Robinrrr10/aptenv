package com.github.aptenv.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.github.aptenv.entities.Details;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("variables")
public class ApiVariables {

	@Path("all")
	@GET
	public Details getAllVariables() {
		Details detail = new Details();
		String ename = "codeenv";
		if( System.getenv("ename") != null)
			ename = System.getenv("ename");
		detail.setName(ename);
		detail.setPlace(System.getProperty("pname", "codeparam"));
		return detail;
	}
	
	@Path("env")
	@GET
	public Details getCustomEnvVar(@QueryParam("name") String name) {
		Details detail = new Details();
		detail.setName(name);
		String result = "codeenv";
		if(System.getenv(name) != null)
			result = System.getenv(name);
		detail.setResult(result);
		return detail;
	}
	
	@Path("properties")
	@GET
	public Details getCustomPropertiesVariable(@QueryParam("name") String name) {
		Details detail = new Details();
		detail.setName(name);
		detail.setResult(System.getProperty(name, "codeparam"));
		return detail;
	}
	
}
