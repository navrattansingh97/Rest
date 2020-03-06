package com.niit.rtt.myrest;

import javax.ws.rs.*;

@Path("employee")
public class EmployeeResource {
@GET
@Path("{empno}")
@Produces("application/jason")
public String getJson(@PathParam("empno")int empno) {
	switch(empno) {
	case 1:return"{'name':'John Show','age':28}";
	case 2: return"{'name':'peter Norton','age':35}";
	default: return"{'name':'Jack of All','age':18}";
	}
}
}
