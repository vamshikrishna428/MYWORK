package Scenarios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
//	String filepath = "F:\\Eclipse workspace\\selenium workspace\\MYWORK\\HARFolder\\testJson.json";

	public void getValue(String key) throws FileNotFoundException, IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		
		FileReader reader = new FileReader(".\\HARFolder\\exactspaceHAR1.json");
		
		Object obj = jsonParser.parse(reader);
		
		JSONObject logObj = (JSONObject)obj;
		
		JSONObject arr = (JSONObject)logObj.get("log");
		
		JSONArray arr1 = (JSONArray)arr.get("entries");
		System.out.println(arr1);
		
		
		
//		Parsing the contents of the JSON file
//		JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(filepath));
		
//		JSONArray arr = (JSONArray)jsonObject.get("entries");
//		
//		System.out.println(arr.get(0));
		
//		String value = (String) jsonObject.get(key);
//		return value;
	}
	
	public static void main(String[]args) throws FileNotFoundException, IOException, ParseException {
		ReadJson json1 = new ReadJson();
		json1.getValue("test");
//		System.out.println(json1.getValue("response"));
	}

}
