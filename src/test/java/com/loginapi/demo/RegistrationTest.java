package com.loginapi.demo;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.restassured.response.Response;

public class RegistrationTest {
	
	@Test
	public void userSignUp() {
		 
	Response res = given()
	     .contentType("application/json")
	     .body("{\"name\":\"Ismail\",\"username\":\"ismail\",\"email\":\"ismail@gmail.com\",\"password\":\"ismail\"}")
	     .when()
	     .post("http://localhost:8080/api/auth/signup");
		 String body = res.getBody().asString();
		 System.out.println(body);
		 
	}

}
