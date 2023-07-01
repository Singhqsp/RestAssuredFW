package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import api.payloads.UserPayload;

public class UserEndpoint {
	
	public static Response createuser(UserPayload payload)
	{
		Response  res= given()
				     .contentType(ContentType.JSON)
				     .contentType(ContentType.JSON)
				     .when()
				     .body(payload)
				     .post(Routes.postUrl);
		 
		    return res;
				
	}
	
	public static Response getUser(String username)
	{
		Response res =given()
				       .pathParam("username",username)
				       .when()
				       .get(Routes.getUrl);
		      return res;
		
	}
	public static Response updateData(String username,UserPayload payload)
	{
		Response res = given()
				          .contentType(ContentType.JSON)
				          .contentType(ContentType.JSON)
				       .pathParam("username",username)
				       .body(payload)
				       .when()
				       .put(Routes.updateUrl);
				       
				       return res;
				
				       
				          
	}

	public static Response deleteUser(String username)
	{
		Response res =given()
				       .pathParam("username",username)
				       .when()
				       .delete(Routes.deleteUrl);
		      return res;
		
	}
	
	
	
	
	
	
	

}
