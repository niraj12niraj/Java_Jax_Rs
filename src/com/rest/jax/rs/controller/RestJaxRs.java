package com.rest.jax.rs.controller;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class RestJaxRs {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param")String msg) {
		String output="param :"+msg;
		System.out.println("param --"+msg);
		return Response.status(200).entity(output).build();
	}
	
	
}
