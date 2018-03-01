


import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import glide.backoffice.enums.Status;

import static com.jayway.restassured.RestAssured.given;

public class Testme {

	@Test
	public  void testme() {
		/*String  BASEURI = "https://elb-gwadmin-dev-2-glide.tech.rcimobility.com";
		String  AUTHENTICATE="/api/v2/users/authenticate";
		String  SEARCHBOOKING="/api/v2/bookings/search-index";
		
		//Create new jsonObject and add some properties
		JsonObject newObject = new JsonObject();
		    newObject.addProperty("login", "admin@glidemobility.com");
		    newObject.addProperty("password", "1Aaaaaaa");


		Response postResponse = 
		                given()
		        .contentType("application/json")
		        .body(newObject.toString())
		        .when()
		        .post(BASEURI+AUTHENTICATE);
		System.out.println(postResponse.getStatusCode());
		System.out.println(postResponse.getHeader("x-auth-token"));

		
		JsonObject page = new JsonObject();
		JsonObject searchBooking = new JsonObject();
		
		page.addProperty("number", 1);
		page.addProperty("size", 1);
		
		searchBooking.addProperty("memberLogin", "sujit.pandey+14@glidemobility.com");
		searchBooking.add("page", page);
		searchBooking.addProperty("status", "SCHEDULED");
		searchBooking.addProperty("type", "CAR_SHARING");
		searchBooking.addProperty("vehicleRegistrationNumber", "RO-TEST-96");
		Response searchBookingResponse=given()
		.header("X-AUTH-TOKEN", postResponse.getHeader("x-auth-token"))
		.contentType("application/json")
		.body(searchBooking.toString())
		.when()
		.post(BASEURI+SEARCHBOOKING);
		System.out.println(searchBookingResponse.getStatusCode());
		JsonPath x=searchBookingResponse.jsonPath();
		System.out.println(searchBookingResponse.prettyPrint());
		//String y=x.getString("results.id");
		String y=searchBookingResponse.jsonPath().getString("results.id[0]");
		
		//System.out.println("96a8000c-a7df-47db-9a9a-57d32279ddf7".equalsIgnoreCase(y));*/
		System.out.println(Status.valueOf("Completed"));
		
	}	
}
