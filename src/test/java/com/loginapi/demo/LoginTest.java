package com.loginapi.demo;
import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.restassured.response.Response;

public class LoginTest {

	 @Test
	 public void makeSureThatGoogleIsUp() {
		 given().when().get("http://www.google.com").then().statusCode(200);
	 }
	 
	 @Test
	public void userSignIn() {
		 
	Response res = given()
	     .contentType("application/json")
	     .body("{\"usernameOrEmail\":\"abdullah@gmail.com\",\"password\":\"abdullah\"}")
	     .when()
	     .post("http://localhost:8080/api/auth/signin");
		 String body = res.getBody().asString();
		 System.out.println(body);
		 
	}
	 
}