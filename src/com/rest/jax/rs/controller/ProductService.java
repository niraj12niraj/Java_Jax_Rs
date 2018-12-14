package com.rest.jax.rs.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/product")
public class ProductService {

	@POST
	@Path("/add")
	public Response getForm(
			@FormParam("id")int id,
			@FormParam("name") String name,
			@FormParam("price") Float price) {
		
		return Response.status(200).entity("Prduct Successfully Added! id:-"+id+" Name: "+name+" Price: "+price).build();
	}
}
