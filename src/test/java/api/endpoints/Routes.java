package api.endpoints;

// create, update , get and delete for petstore 

// https://petstore.swagger.io
//https://petstore.swagger.io/v2/user                           create
//https://petstore.swagger.io/v2/user/{username}				get
//https://petstore.swagger.io/v2/user/{username}				update
//https://petstore.swagger.io/v2/user/{username}				delete

public class Routes {

	public static String base_Url = "https://petstore.swagger.io/v2";

	// user model and we can create route for different modules

	public static String post_url = base_Url + "/user";
	public static String get_url = base_Url + "/user/{username}";
	public static String update_url = base_Url + "/user/{username}";
	public static String delete_url = base_Url + "/user/{username}";

}
