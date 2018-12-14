package com.rest.jax.rs.controller;





import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.rest.jax.rs.model.User;



@Path("/regis")
public class Registration {
	
	private User user;
	
	
	
	//@SuppressWarnings("deprecation")
	@GET
	@Path("/registration")
	public ResponseBuilder getRegistration(@Context final HttpServletRequest req, @Context final HttpServletResponse res) throws Exception {
		System.out.println("i am here ");
		RequestDispatcher dispatcher=req.getRequestDispatcher("/WEB-INF/view/registration.jsp");
		res.encodeRedirectURL("rest");
		
		dispatcher.forward(req, res);
		//req.getRequestDispatcher("/WEB-INF/view/registration.jsp").forward(req, res);
		return Response.ok();
	}
	
	
	@POST
	@Path("/registrationForm")
	public Response getRegister(@FormParam("name") String name,
			@FormParam("mobile") Long mobile,
			@FormParam("address") String address,
			@FormParam("DOB") String dob,
			@FormParam("email") String email,
			@FormParam("pass") String pass
			) {
		Date d=Date.valueOf(dob);
		System.out.println("name "+name);
		String details="Name-: "+name+" Mobile No.-: "+mobile+" Address-: "+address+" DOB-: "+d+" Email-: "+email+" Password-: "+"******";
		return Response.status(200).entity("Get Registration Details "+details).build();
	}
	
	public Response getLogin(@FormParam("username") String uname,
			@FormParam("password") String pass) {
	if(uname==user.getName()) {
		if(pass==user.getPassword()) {
			return Response.status(200).allow("").build();
		}
	}
		return Response.status(200).allow("success.jsp").build();
	}
	
	

}
