package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main4 {

	public static void main(String[] args) {
		
		
		try (FileWriter fw = new FileWriter("rucni_upis.json")){
			
			Country c = new Country();
			c.setName("Sri Lanka");
			c.setCapital("Sri Jayawardenepura Kotte");
			c.setFullName("Democratic Socialist Republic of Sri Lanka");
			
			
			JsonObject obj = new JsonObject();
			obj.addProperty("name", c.getName());
			obj.addProperty("capital", c.getCapital());
			obj.addProperty("fullName", c.getFullName());
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			gson.toJson(obj, fw);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
