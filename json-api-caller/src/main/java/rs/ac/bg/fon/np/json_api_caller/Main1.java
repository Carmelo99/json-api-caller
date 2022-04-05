package rs.ac.bg.fon.np.json_api_caller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;


public class Main1 {
	
	private static final String BASE_URL="http://api.countrylayer.com/v2/alpha/";
	
	
	public static void main(String[] args) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		System.getenv("api_key1");
		try {
			URL url = new URL(BASE_URL+"DE?access_key="+System.getenv("api_key"));
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			
			BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
			JsonObject result = gson.fromJson(rd, JsonObject.class);
			
			Country country = new Country();
			country.setName(result.get("name").getAsString());
			country.setCapital(result.get("capital").getAsString());
			country.setFullName(result.get("altSpellings").getAsJsonArray().get(1).getAsString());
			
			
			
			System.out.println(country);
			
			rd.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
