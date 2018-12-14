package com.rest.jax.rs.controller;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.catalina.Session;

import com.rest.jax.rs.model.User;

@Path("/login")
public class Login {

	private User user;
	HttpSession httpsession;
	Session session;

	@GET
	@Path("/loginForm")
	public ResponseBuilder userLog(@Context final HttpServletRequest req,@Context final HttpServletResponse res) throws ServletException, IOException{
		System.out.println("here to redirect for login page");
		RequestDispatcher dispatcher =req.getRequestDispatcher("/WEB-INF/view/login.jsp");
		res.encodeRedirectURL("");
		dispatcher.forward(req, res);
		return Response.ok();
	}
	@POST
	@Path("/log")
	public ResponseBuilder userLoginForm(@FormParam("name") String name,@FormParam("pass") String pass, @Context final HttpServletRequest req,@Context final HttpServletResponse res) throws ServletException, IOException, NullPointerException{
		System.out.println("here to redirect for success page");
		RequestDispatcher dispatcher=req.getRequestDispatcher("/WEB-INF/view/success.jsp");
		res.encodeRedirectURL("");
		if((name=="raju")&&(pass=="abc")) {
			System.out.println("SUCCESS");
			dispatcher.forward(req, res);
			return Response.ok();
		}
		else
			System.out.println("not success");
		return Response.status(200);
	}
}
