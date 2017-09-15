package testrail;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TestRailTestForTest
{
	public  HashMap<String,Integer> hm=new HashMap<String,Integer>();  
	public  HashMap<String,Integer> configToID=new HashMap<String,Integer>();  
	public  HashMap<Integer,String> idToConfig=new HashMap<Integer,String>();  
	static Utility utility= new Utility();;



	public static APIClient client()
	{
		// TODO make this read from settings/config file
		APIClient client = new APIClient("https://testlme.testrail.net/");
		client.setUser("ranorextester2016@gmail.com");
		client.setPassword("mcse@1234");

		return client;
	}



	List<JSONObject> runObjects= new ArrayList<JSONObject>();
	// runID and configuration from get plan
	public static  void get_plan(int planId) throws MalformedURLException, IOException, APIException
	{
		List<JSONObject> runData= new ArrayList<JSONObject>();
		APIClient client=TestRailTestForTest.client();
		System.out.println((client.sendGet("get_plan/" + planId)).getClass().getName());
		JSONObject c = (JSONObject) client.sendGet("get_plan/" + planId);

		List<JSONArray>entriesArray=utility.JSONObjectToJSONArray(c,"entries");

		runData=utility.JSONArrayToJSONObject(entriesArray);
		entriesArray.clear();
		entriesArray=utility.JSONObjectToJSONArray(runData,"runs");
		for(JSONArray array:entriesArray) {
			System.out.println(array);
		}
		runData.clear();
		runData=utility.JSONArrayToJSONObject(entriesArray);
		Object[] y=((JSONArray)runData.get(0).get("config_ids")).toArray();
		Integer[] integerArray = new Integer[y.length];
		 
		// copy elements from object array to integer array
		for (int i = 0; i < y.length; i++)
		{

			integerArray[i] = ((Long)y[i]).intValue();
		}
		System.out.println(Arrays.toString(integerArray));
	
	
		//runData=utility.JSONArrayToJSONObject(entriesArray.get(0));*/

		//System.out.println(c.get("entries"));
	}




}
