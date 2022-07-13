package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	@GetMapping("/users")
	public Response getUser()
	{
		Response data = new Response();
		data.put("userid", "1");
		data.put("firstName", "vishal");
		data.put("lastName", "kotecha");
		return data;
	}
}
