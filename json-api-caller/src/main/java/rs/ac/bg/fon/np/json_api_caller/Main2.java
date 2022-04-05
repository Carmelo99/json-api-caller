package rs.ac.bg.fon.np.json_api_caller;



import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main2 {

	
	
	
	public static void main(String[] args) {
		
		Country country1 = new Country();
		country1.setName("Serbia");
		country1.setCapital("Belgrade");
		country1.setFullName("Republic of Serbia");
		
		Country country2 = new Country();
		country2.setName("DR Kongo");
		country2.setCapital("Kinshasa");
		country2.setFullName("Democratic Republic of the Congo");
		
		Country country3 = new Country();
		country3.setName("England");
		country3.setCapital("London");
		country3.setFullName("Kingdom of England");
		
		
		Country[] countries = {country1,country2,country3};
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try (FileWriter fw = new FileWriter("niz_objekata.json")){
			
			gson.toJson(countries,fw);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
