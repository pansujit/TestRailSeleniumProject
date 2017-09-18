package testrail;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestRailTestForTest
{
	public   HashMap<String,Integer> hm=new HashMap<String,Integer>();  
	public  HashMap<String,Integer> configToID=new HashMap<String,Integer>();  
	public  HashMap<Integer,String> idToConfig=new HashMap<Integer,String>();  
	public  HashMap<String,Integer> browserToID=new HashMap<String,Integer>(); 
	public ListMultimap<String, HashMap<String,Integer>> multimap = ArrayListMultimap.create();
	public  HashMap<String,Integer> mobileToID=new HashMap<String,Integer>();  
	public  HashMap<String,Integer> mobileBrowserToID=new HashMap<String,Integer>();  
	private  HashMap<String,Integer> OSToID=new HashMap<String,Integer>();  
	private  ProjectUtility utility= new ProjectUtility();;
	List<JSONObject> runObjects= new ArrayList<JSONObject>();
	private  HashMap<List<Integer>,Integer> configToRunID=new HashMap<List<Integer>,Integer>();

	public static  APIClient client()
	{
		// TODO make this read from settings/config file
		APIClient client = new APIClient("https://testlme.testrail.net/");
		client.setUser("ranorextester2016@gmail.com");
		client.setPassword("mcse@1234");
		return client;
	}

	/**
	 * This method will return the list of configuration and runID. The dictionary is created from list to runID. 
	 * @param planId should be Integer
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws APIException
	 */
	public  void get_plan(int planId) throws MalformedURLException, IOException, APIException
	{
		//creating a local list of jsonObject
		List<JSONObject> runData= new ArrayList<JSONObject>();

		// Calling for api client
		APIClient client=TestRailTestForTest.client();

		//creating list of Objects
		List<Object[]> y=new ArrayList<Object[]>();

		// getting response and casting to jsonObject
		JSONObject c = (JSONObject) client.sendGet("get_plan/" + planId);
		// creating local JSONArray object and  getting the all objects in "entries" in json object
		List<JSONArray>entriesArray=utility.JSONObjectToJSONArray(c,"entries");

		//converting JSON array to JSON Object
		runData.clear();
		runData=utility.JSONArrayToJSONObject(entriesArray);

		// Clean jSOn array Lists
		entriesArray.clear();
		// getting runs Array Object from entries field
		entriesArray=utility.JSONObjectToJSONArray(runData,"runs");

		// Clearing JSON list Object
		runData.clear();

		//Converting JSON Array to JSON Object
		List<JSONObject> runDataABC=utility.JSONArrayToJSONObject(entriesArray);

		// Looping on the JSON object to get the "config_id" and runId
		//for(JSONObject testData:runData){
		for(int i=0;i<runDataABC.size();i++) {
			Integer xxxx= null;
			JSONObject testData=(JSONObject)runDataABC.get(i);
			xxxx=((Long)testData.get("id")).intValue();

			//Adding config_id to the list
			addToDictionary(((JSONArray)testData.get("config_ids")).toArray(),xxxx);

		}


	}
	private  void addToDictionary(Object[] object,int x) {
		List<Integer> testme= new ArrayList<Integer>();
		for (int i=0;i<object.length;i++) {
			testme.add(((Long)object[i]).intValue());
		}
		configToRunID.put(testme, x);

	}
	public  void getConfig(int projectId) throws MalformedURLException, IOException, APIException{
		APIClient client=TestRailTestForTest.client();
		JSONArray c = (JSONArray) client.sendGet("get_configs/" + projectId);
		for(int i=0;i<c.size();i++){
			if(((JSONObject)c.get(i)).get("name").toString().equalsIgnoreCase("browser")){
				runObjects.clear();
				runObjects=utility.JSONArrayToJSONObject(utility.JSONObjectToJSONArray((JSONObject)c.get(i), "configs"));

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

	}
	public  HashMap<String, Integer> get_cases(int suiteId,int projectId) throws MalformedURLException, IOException, APIException {
		APIClient client=TestRailTestForTest.client();
		JSONArray abab = (JSONArray) client.sendGet("get_cases/" + projectId+"&suite_id="+suiteId);
		List<JSONObject> tata=utility.JSONArrayToJSONObject(abab);
		for(int i=0;i<tata.size();i++) {
			JSONObject myObject= (JSONObject)tata.get(i);
			hm.put(myObject.get("custom_automation").toString(), ((Long)myObject.get("id")).intValue());
		}
		return hm;
	}


	public  Integer getMyPlanID(String[] config_data,int planId,int projectId) throws MalformedURLException, IOException, APIException {

		List<Integer> mydata= new ArrayList<Integer>();
		get_plan(planId);
		getConfig(projectId);
		Integer a=OSToID.get(config_data[1].trim());
		Integer b=OSToID.get(config_data[0].trim());
		mydata.add(0,a);
		mydata.add(1,b);
		return configToRunID.get(mydata);
	}

	public void closeRun(int planID) throws MalformedURLException, IOException, APIException {
		APIClient client= TestRailTestForTest.client();
		System.out.println("The run id is for close is " + planID);
		Map data = new HashMap();
		data.put("comment", "closing");
		JSONObject object=(JSONObject)client.sendPost("/close_plan/"+planID, data);

		System.out.println(object);
	}
	public  JSONObject addResult(int p_statusId,int p_runId, int p_caseId) throws Exception
	{
		APIClient client = TestRailAPI.client();
		Map data = new HashMap();
		data.put("status_id", new Integer(p_statusId));
		data.put("comment", "is exeuted on" + (new Date()).toString());
		JSONObject r = (JSONObject) client.sendPost("add_result_for_case/" + p_runId + "/" + p_caseId, data);

		return r;
	}

}
