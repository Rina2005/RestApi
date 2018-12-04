package com.qaulitest.restapi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApiTest 
{
	@Test
	public void testWeatherApi()
	{
		//Get the base URI 
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weatherfull/city/";
		
		RequestSpecification httprequest=RestAssured.given();
		
        //Get the response by sending  request with parameter
	    Response responce=	httprequest.request(Method.GET,"hyderabad");
	    
	    
	    // Get the status line 
	    String responsebody=responce.getStatusLine().toString();
	    
        //Check for response status code 
	    Assert.assertEquals(responsebody, "HTTP/1.1 200 OK");
		
	}
	
	
}
