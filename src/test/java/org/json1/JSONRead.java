package org.json1;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONRead {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fr=new FileReader("/Users/dineshwaren/eclipse-workspace/JSONReadOct04/src/test/resources/new.json");
	    JSONParser jsonparser=new JSONParser();
	    Object object = jsonparser.parse(fr);
	    JSONObject jsonObj=(JSONObject)object;
	    Object object2 = jsonObj.get("name");
	    Object object3 = jsonObj.get("age");
	    Object object4 = jsonObj.get("status");
	    Object object5 = jsonObj.get("address");
	    Object object6 = jsonObj.get("courses");
	    
	    System.out.println(object2);
	    System.out.println(object3);
	    System.out.println(object4);
	    //System.out.println(object5);
	    //System.out.println(object6);
	    
	    JSONObject jsonObj1=(JSONObject)object5;
	    Object object7 = jsonObj1.get("city");
	    Object object8 = jsonObj1.get("state");
	    
	    System.out.println(object7);
	   System.out.println(object8);
	   
	   JSONArray jsonArray=(JSONArray)object6;
       for(int i=0;i<jsonArray.size();i++) {
    	   Object object9 = jsonArray.get(i);
    	   System.out.println(object9);
       }
	    
	
	}
	

}
