package testrail;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import glide.backoffice.utility.ProjectUtility;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestRailTestForTest
{
	static Logger log = Logger.getLogger(TestRailTestForTest.class.getName());
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
	/**
	 * The configToRunID holds the dictionary between the list of config and corresponding runID
	 */
	private  HashMap<List<Integer>,Integer> configToRunID=new HashMap<List<Integer>,Integer>();

	/**
	 * This is public static class which will create the rest client to send the data.
	 * @return APIClient
	 */
	public static  APIClient client()
	{

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
		log.info("creating a local list of jsonObject in method get_plan");
		List<JSONObject> runData= new ArrayList<JSONObject>();

		log.info("calling APIClient from method get_plan");
		APIClient client=TestRailTestForTest.client();


		log.info("getting response and casting to jsonObject in method get_plan");
		JSONObject c = (JSONObject) client.sendGet("get_plan/" + planId);

		log.info("creating local JSONArray object and  getting the all objects in \"entries\" in json object in method get_plan");
		List<JSONArray>entriesArray=utility.JSONObjectToJSONArray(c,"entries");

		log.info("converting JSON array to JSON Object in method get_plan");
		runData.clear();
		runData=utility.JSONArrayToJSONObject(entriesArray);

		// Clean JSON array Lists
		entriesArray.clear();

		log.info("getting runs Array Object from entries field in method get_plan");
		entriesArray=utility.JSONObjectToJSONArray(runData,"runs");

		// Clearing JSON list Object
		runData.clear();

		log.info("Converting JSON Array to JSON Object in method get_plan");
		List<JSONObject> runDataABC=utility.JSONArrayToJSONObject(entriesArray);

		log.info("Looping on the JSON object to get the \"config_id\" and runId in method get_plan");
		for(int i=0;i<runDataABC.size();i++) {
			Integer xxxx= null;
			JSONObject testData=(JSONObject)runDataABC.get(i);
			xxxx=((Long)testData.get("id")).intValue();

			log.info("calling method to Add config_id to the list and runId in method get_plan");
			addToDictionary(((JSONArray)testData.get("config_ids")).toArray(),xxxx);
		}
	}
	/**
	 * This is private method to add list of configuration id to run id. The array of object is changed to the
	 * list of integer and each list then mapped to the corresponding RunID. 
	 * @param object This will be the array of object(the Long should be the type of object)
	 * @param x This should be the Integer(runID)
	 */
	private  void addToDictionary(Object[] object,int x) {
		log.info("Running private method add to Dictionary");
		List<Integer> testme= new ArrayList<Integer>();
		// This loop will convert each object element to integer
		for (int i=0;i<object.length;i++) {
			testme.add(((Long)object[i]).intValue());
		}
		// adding into the dictionary as config_id as key and RunID as value.
		configToRunID.put(testme, x);
	}
	/**
	 * This getConfig method gets the available configuration in the given project.
	 * @param projectId This projectID should be Integer.
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws APIException
	 */
	public  void getConfig(int projectId) throws MalformedURLException, IOException, APIException{
		log.info("Running the getConfig method");
		log.info("Instantiation APIClient method");
		APIClient client=TestRailTestForTest.client();
		log.info("Sending Get Request to get the available configuration in the project" +":"+" "+projectId);
		JSONArray c = (JSONArray) client.sendGet("get_configs/" + projectId);
		// looping over the size of the JsonArray to get the available configuration
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
	/**
	 * This get_case method will accumulate the all available test cases in the given project with given suiteID.
	 * @param suiteId should be integer and if project is provided with suite then suite id is compulsory else optional
	 * @param projectId Should be integer and required in any case.
	 * @return HashMap{@code <String, Integer>}
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws APIException
	 */
	public  HashMap<String, Integer> get_cases(int suiteId,int projectId) throws MalformedURLException, IOException, APIException {
		log.info("Running get_cases method which will returns the dictionary of custom_name and test caseID ");
		log.info("Calling APIClient from the get_cases method");
		APIClient client=TestRailTestForTest.client();
		log.info("Calling get_case api method in test rail with projectid :"+ " "+ projectId + "and suiteId :"+ suiteId);
		JSONArray abab = (JSONArray) client.sendGet("get_cases/" + projectId+"&suite_id="+suiteId);
		//creating new JSON Array list.
		List<JSONArray> Jsonarray=new ArrayList<JSONArray>();
		Jsonarray.add(abab);
		// calling JSONArray to JSONObject converter method.
		List<JSONObject> tata=utility.JSONArrayToJSONObject(Jsonarray);
		//looping over the jsonObject and mapping in the dictionary.
		for(int i=0;i<tata.size();i++) {
			JSONObject myObject= (JSONObject)tata.get(i);
			hm.put(myObject.get("custom_automation").toString(), ((Long)myObject.get("id")).intValue());
		}
		log.info("Returning Dictionary from the method get_cases");
		return hm;
	}

	/**
	 * This method will call another various method to get the RunID for the given config.
	 * @param config_data should be string array {@code (String[])}
	 * @param planId {@code (int planId)}
	 * @param projectId {@code (int projectId)}
	 * @return Integer 
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws APIException
	 */
	public  Integer getMyPlanID(String[] config_data,int planId,int projectId) throws MalformedURLException, IOException, APIException {
		log.info("Running getMyPlanID method");

		List<Integer> mydata= new ArrayList<Integer>();
		log.info("Running the get_plan Method");
		get_plan(planId);
		log.info("Running the getConfig Method");
		getConfig(projectId);
		log.info("Getting the config-ids from the Dictionary ");
		// the OSToID is a dictionary which includes the all the available configuration name and their corresponding integer value.
		Integer a=OSToID.get(config_data[1].trim());
		Integer b=OSToID.get(config_data[0].trim());
		mydata.add(0,a);
		mydata.add(1,b);
		log.info("Returning the Run id from dictionary");
		// returning the RunId of the given configuration from the dictionary 
		return configToRunID.get(mydata);
	}

	@SuppressWarnings("unchecked")
	public void closeRun(int planID) throws MalformedURLException, IOException, APIException {
		log.debug("The Test is going to run the closeRun method which will close the given test plan");
		APIClient client= TestRailTestForTest.client();
		@SuppressWarnings("rawtypes")
		Map data = new HashMap();
		data.put("comment", "closing");
		log.info("Caling api method to close the plan in method closeRun");
		JSONObject object=(JSONObject)client.sendPost("/close_plan/"+planID, data);
		System.out.println(object);
	}
	@SuppressWarnings("unchecked")
	public  JSONObject addResult(int p_statusId,int p_runId, int p_caseId) throws Exception
	{
		log.info("The Test is going to update result on the given testcase of the given project with given run");
		APIClient client = TestRailAPI.client();
		@SuppressWarnings("rawtypes")
		Map data = new HashMap();
		data.put("status_id", new Integer(p_statusId));
		data.put("comment", "is exeuted on" + (new Date()).toString());
		log.info("Sending the APi Request for add result in testrail");
		JSONObject r = (JSONObject) client.sendPost("add_result_for_case/" + p_runId + "/" + p_caseId, data);

		return r;
	}

}
