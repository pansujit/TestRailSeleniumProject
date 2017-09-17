package testrail;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestRailTestForTest
{
	public  HashMap<String,Integer> hm=new HashMap<String,Integer>();  
	public  HashMap<String,Integer> configToID=new HashMap<String,Integer>();  
	public  HashMap<Integer,String> idToConfig=new HashMap<Integer,String>();  
	static public  HashMap<String,Integer> browserToID=new HashMap<String,Integer>(); 
	static public ListMultimap<String, HashMap<String,Integer>> multimap = ArrayListMultimap.create();
	static public  HashMap<String,Integer> mobileToID=new HashMap<String,Integer>();  
	static public  HashMap<String,Integer> mobileBrowserToID=new HashMap<String,Integer>();  
	static public  HashMap<String,Integer> OSToID=new HashMap<String,Integer>();  
	static public  HashMap<String,Integer> temp=new HashMap<String,Integer>();  
	static Utility utility= new Utility();;
	static List<JSONObject> runObjects= new ArrayList<JSONObject>();


	public static APIClient client()
	{
		// TODO make this read from settings/config file
		APIClient client = new APIClient("https://testlme.testrail.net/");
		client.setUser("ranorextester2016@gmail.com");
		client.setPassword("mcse@1234");

		return client;
	}




	// runID and configuration from get plan
	public static void get_plan(int planId) throws MalformedURLException, IOException, APIException
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
			//System.out.println(array);
		}
		runData.clear();
		List<Object[]> y=new ArrayList<Object[]>();
		List<List<Integer>>config=new ArrayList<List<Integer>>();
		Set<Integer> runID= new HashSet<Integer>();
		runData=utility.JSONArrayToJSONObject(entriesArray);
		for(JSONObject testData:runData){
			y.add(((JSONArray)testData.get("config_ids")).toArray());
			runID.add(((Long)runData.get(0).get("id")).intValue());
		}
		for(Object[] data:y){
			List<Integer>temp=new ArrayList<Integer>();
			for(int i=0;i<data.length;i++ ){
				int x=((Long)data[i]).intValue();
				temp.add(x);
			}
			config.add(temp);
		}
		for(Integer x:runID){
			System.out.println("the run id +"+ " "+x);
		}
	}

	public static void getconfig(int projectId) throws MalformedURLException, IOException, APIException{
		APIClient client=TestRailTestForTest.client();
		System.out.println((client.sendGet("get_configs/" + projectId)).getClass().getName());
		JSONArray c = (JSONArray) client.sendGet("get_configs/" + projectId);
		for(int i=0;i<c.size();i++){
			if(((JSONObject)c.get(i)).get("name").toString().equalsIgnoreCase("browser")){
				runObjects.clear();
				runObjects=utility.JSONArrayToJSONObject(utility.JSONObjectToJSONArray((JSONObject)c.get(i), "configs"));
				System.out.println(runObjects.size());
				for(JSONObject data: runObjects){
					String tempString= data.get("name").toString();
					Integer tempInt= ((Long)data.get("id")).intValue();
					browserToID.put(tempString, tempInt);

				}
			}
			else if(((JSONObject)c.get(i)).get("name").toString().equalsIgnoreCase("mobile")){
				runObjects.clear();
				runObjects=utility.JSONArrayToJSONObject(utility.JSONObjectToJSONArray((JSONObject)c.get(i), "configs"));
				for(JSONObject data: runObjects){
					String tempString= data.get("name").toString();
					Integer tempInt= ((Long)data.get("id")).intValue();
					mobileToID.put(tempString, tempInt);

				}
			}
			else if(((JSONObject)c.get(i)).get("name").toString().equalsIgnoreCase("mobileBrowser")){
				runObjects.clear();
				runObjects=utility.JSONArrayToJSONObject(utility.JSONObjectToJSONArray((JSONObject)c.get(i), "configs"));
				for(JSONObject data: runObjects){
					String tempString= data.get("name").toString();
					Integer tempInt= ((Long)data.get("id")).intValue();
					mobileBrowserToID.put(tempString, tempInt);

				}
			}
			else if(((JSONObject)c.get(i)).get("name").toString().equalsIgnoreCase("operating system")){
				runObjects.clear();
				runObjects=utility.JSONArrayToJSONObject(utility.JSONObjectToJSONArray((JSONObject)c.get(i), "configs"));
				for(JSONObject data: runObjects){
					String tempString= data.get("name").toString();
					Integer tempInt= ((Long)data.get("id")).intValue();
					OSToID.put(tempString, tempInt);
				}
			}

		}

		Collection<Integer> x= browserToID.values();
		for (Integer y:x)
		{
			System.out.println(y);

		}
	}




}
