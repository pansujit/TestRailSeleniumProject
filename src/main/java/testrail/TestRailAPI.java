package testrail;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TestRailAPI
{
	public static HashMap<String,Integer> hm=new HashMap<String,Integer>();  
	public static HashMap<String,Integer> configToID=new HashMap<String,Integer>();  
	public static HashMap<Integer,String> idToConfig=new HashMap<Integer,String>();  

	

	public static APIClient client()
	{
		// TODO make this read from settings/config file
		APIClient client = new APIClient("https://testlme.testrail.net/");
		client.setUser("ranorextester2016@gmail.com");
		client.setPassword("mcse@1234");

		return client;
	}


	public static JSONObject getCase(int p_caseId) throws Exception
	{
		APIClient client = TestRailAPI.client();
		JSONObject c = (JSONObject) client.sendGet("get_case/" + p_caseId);

		return c;
	}
	// This will give the all test cases of the given project. The project id should be provided from the maven pom.xml.
	// And with this we can get all custom automation field and test cases. The runID also should be provided by maven.
	public static void getCasesWithCustomfield(int projectID) throws Exception
	{
		APIClient client = TestRailAPI.client();
		JSONArray c = (JSONArray) client.sendGet("get_cases/" + projectID);
		//return customFieldTestCaseAutomation(c);
		//return c;
		customFieldTestCaseAutomation(c);
	}
	public static List<String> testString= new ArrayList<String>();
	//this method will parse the json  object and map the custom field with key testcase id.
	public static void customFieldTestCaseAutomation(JSONArray data) {
		for(int i=0; i<data.size();i++)
		{
			JSONObject testdata= (JSONObject)data.get(i);

			if(!(testdata.get("custom_automation")==null))  {
				String key=(String)testdata.get("custom_automation");
				int value=((Long)testdata.get("id")).intValue();
				hm.put(key,value);
				
			}

		}
		//return hm;


	}
	static List<JSONObject> runObjects= new ArrayList<JSONObject>();
	// runID and configuration from get plan
	public static void get_plan(int planId) throws MalformedURLException, IOException, APIException
	{
		APIClient client = TestRailAPI.client();
		JSONObject c = (JSONObject) client.sendGet("get_plan/" + planId);
		JSONArray entriesArray=(JSONArray)c.get("entries");
		for(int i=0; i<entriesArray.size();i++)
		{
			 runObjects.add((JSONObject)entriesArray.get(i));
		}
		JSONArray run=(JSONArray)runObjects.get(0).get("runs");
		arrayToObject(run);
	}
	
	public static void arrayToObject(JSONArray listArray)
	{
		for(int i=0; i<listArray.size();i++)
		{
			JSONObject c= (JSONObject) listArray.get(i);
			configToID.put((String)c.get("config"), ((Long)c.get("id")).intValue());
			idToConfig.put(((Long)c.get("id")).intValue(), (String)c.get("config"));
			testString.add((String)c.get("config"));
		}
	}

	public static JSONObject addResult(int p_statusId, String p_comment, int p_runId, int p_caseId) throws Exception
	{
		APIClient client = TestRailAPI.client();
		Map data = new HashMap();
		data.put("status_id", new Integer(p_statusId));
		data.put("comment", p_comment);
		JSONObject r = (JSONObject) client.sendPost("add_result_for_case/" + p_runId + "/" + p_caseId, data);

		return r;
	}


}
