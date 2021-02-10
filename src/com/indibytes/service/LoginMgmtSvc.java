package com.indibytes.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.RequestWrapper;

import org.glassfish.jersey.process.internal.RequestScoped;

import com.indibytes.DAO.EmployeeDAO;
import com.indibytes.pojo.Employee;

@Path("/LoginMgmtSvc") 
public class LoginMgmtSvc {
	EmployeeDAO empDAO = new EmployeeDAO();
	
	  @GET
	  
	  @Path("/users")
	  
	  @Produces(MediaType.APPLICATION_JSON) public List<Employee> getUsers(){
	  return empDAO.getAllUsers(); }
	  
	  @POST
	  
	  @Path("/users")
	  
	  @Produces(MediaType.APPLICATION_JSON)
	  
	  @Consumes(MediaType.APPLICATION_JSON) public List<Employee> addUser(Employee
	  emp){ return empDAO.addUser(emp); }
	  
	  @GET
	  
	  @Path("/users/{name}")
	  
	  @Produces(MediaType.APPLICATION_JSON) public Employee
	  getUser(@PathParam("name") String name){ return empDAO.getUserByName(name); }
	 
	 
	

}
