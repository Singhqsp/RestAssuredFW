package api.endpoints;

//Swagger URI  -->https://petstore.swagger.io
//Create User User(Post)-->https://petstore.swagger.io/v2/user
//GatUser(Get): https://petstore.swagger.io/v2/user/{username}
//Update user (Put):https://petstore.swagger.io/v2/user/{username}
//Delete Data(Delete):https://petstore.swagger.io/v2/user/1

//In routes we will create Url
public class Routes {
	//BaseUrl Common
	public static String baseUrl="https://petstore.swagger.io/v2";

	//User module::
	
    public static String postUrl=baseUrl+"/user";	
    public static String getUrl=baseUrl+"/user/{username}";
    public static String updateUrl=baseUrl+"/user/{username}";
    public static String deleteUrl=baseUrl+"/user/{username}";
    
    //Same way we can go for Store module URL
}
