package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Main3 {

	public static void main(String[] args) {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		try(FileReader fr = new FileReader("niz_objekata.json")) {
		Type typeToken = new TypeToken<LinkedList<Country>>() {}.getType();
		LinkedList<Country> countries = gson.fromJson(fr, typeToken);
		
		for (Country c: countries) {
			System.out.println(c);
		}
				
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
