package Scenarios;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson1 {
	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();

		FileReader reader = new FileReader(".\\HARFolder\\exactspaceHAR1.json");

		JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

		JSONArray value = (JSONArray) jsonObject.get("status");

		System.out.println(value);
		
		



	//		Object obj = jsonParser.parse(reader);
	//
	//
	//		JSONObject logObj = (JSONObject)obj;
	//		JSONObject arr = (JSONObject)logObj.get("log");
	//
	//
	//
	//		JSONArray arr1 = (JSONArray)arr.get("response");
	//
	//		String[] arr2 = new String[arr1.size()];
	//
	//		for(int i=0;i<arr1.size();i++)
	//		{
	//			JSONObject data = (JSONObject)arr1.get(i);
	//			String status = (String)data.get("status");
	//			System.out.println(status);
	//		}
	//
	//		//		for(int i=0;i<arr1.size();i++)
	//		//		{
	//		//			JSONObject ent = (JSONObject)arr1.get(i);
	//		//			Integer str = (Integer)ent.get("status");
	//		//
	//		//			System.out.println(str);
}
}
