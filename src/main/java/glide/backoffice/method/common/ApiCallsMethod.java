package glide.backoffice.method.common;

import static com.jayway.restassured.RestAssured.given;

import com.google.gson.JsonObject;
import com.jayway.restassured.response.Response;

import glide.backoffice.utility.SeleniumUtility;

public class ApiCallsMethod {
	
	private ApiCallsMethod() {
		
	}

	private static final  String  AUTHENTICATE="/api/v2/users/authenticate";
	private static final  String  SEARCHBOOKING="/api/v2/bookings/search-index";
	private static final  String  SEARCHVEHICLE="/api/v2/vehicles/search";

	/**
	 * This method login to the and if successful returns the xauth token if not return null
	 * @return - Should be String
	 */
	private static String autheticateUserForXAuthToken() {
		//Create new jsonObject and add some properties
		SeleniumUtility.fixedWait(2);
		JsonObject newObject = new JsonObject();
		    newObject.addProperty("login", Config.getProperty("BO_ADMIN"));
		    newObject.addProperty("password", Config.getProperty("BO_PASSWORD"));
			Response postResponse = 
	                given()
	        .contentType("application/json")
	        .body(newObject.toString())
	        .when()
	        .post(Config.getProperty("BASEURI")+AUTHENTICATE);
			if(postResponse.getStatusCode()!=403 || postResponse.getStatusCode()!=400)
			{
				return postResponse.getHeader("x-auth-token");
			}
			else
				return null;
			
	}
	/**
	 * This is public static method to get the bookingID of the given vehicle plate number, departure date, type and status
	 * @return String
	 */
	public static String getBookingID() {
		String token=autheticateUserForXAuthToken();
		if(token==null) {
			return null;
		}
	
		// This new json object to create the page object
		JsonObject page = new JsonObject();
		page.addProperty("number", 1);
		page.addProperty("size", 1);
		
		// This new Json add object will create the Json request for booking search
		JsonObject searchBooking = new JsonObject();
		searchBooking.addProperty("memberLogin", Config.getProperty("MEMBER_LOGIN"));
		searchBooking.add("page", page);
		searchBooking.addProperty("status", "scheduled".toUpperCase());
		searchBooking.addProperty("type", "CAR_SHARING");
		searchBooking.addProperty("vehicleRegistrationNumber", Config.getProperty("VEHICLE_PLATE_NUMBER"));
		
		// The will call the api  Search booking
		Response searchBookingResponse=given()
				.header("X-AUTH-TOKEN", token)
				.contentType("application/json")
				.body(searchBooking.toString())
				.when()
				.post(Config.getProperty("BASEURI")+SEARCHBOOKING);
		return searchBookingResponse.jsonPath().getString("results.id[0]");
	
	}
	
	public static String  getVehicleId() {
		
		String token=autheticateUserForXAuthToken();
		if(token==null) {
			return null;
		}
	
		// This new json object to create the page object
		JsonObject page = new JsonObject();
		page.addProperty("number", 1);
		page.addProperty("size", 1);
		
		// This new Json add object will create the Json request for booking search
		JsonObject searchVehicle = new JsonObject();
		searchVehicle.addProperty("plateNumber", Config.getProperty("EDIT_VEHICLE_PLATE_NUMBER"));
		searchVehicle.add("page", page);
		// The will call the api  Search booking
		Response searchBookingResponse=given()
				.header("X-AUTH-TOKEN", token)
				.contentType("application/json")
				.body(searchVehicle.toString())
				.when()
				.post(Config.getProperty("BASEURI")+SEARCHVEHICLE);
		return searchBookingResponse.jsonPath().getString("results.id[0]");
		
	}

}
