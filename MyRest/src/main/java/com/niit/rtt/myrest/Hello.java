package com.niit.rtt.myrest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
@GET
@Produces(MediaType.TEXT_PLAIN)
public String sayPlaintextHello() {
	return "Hello JArsey Plain";
}
@GET
@Path("/xmlhello")
@Produces(MediaType.TEXT_XML)
public String sayXMLHello() {
	return "<html>"+"<title>"+"Hello jersey"+"</title>"+"<body><h1>"+"Hello jarsey html"+"</h1> </body>"+"</html>";
}
}
