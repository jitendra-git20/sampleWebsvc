package com.indibytes.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/") 
public class HelloService {

	@GET 
	   @Path("/bye") 
	   @Produces(MediaType.TEXT_PLAIN) 
	public String sayHi() {
	   
	   return "-------------------Hi----------------------";  
	}
	 
	
}
