package testrail;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestRailAPI
{
	static HashMap<String,Integer> hm=new HashMap<String,Integer>();  

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
	public static HashMap<String, Integer> getCasesWithCustomfield(int projectID) throws Exception
	{
		APIClient client = TestRailAPI.client();
		System.out.println((client.sendGet("get_cases/" + projectID)).getClass().getName());
		JSONArray c = (JSONArray) client.sendGet("get_cases/" + projectID);
		return customFieldTestCaseAutomation(c);
		//return c;
	}

	//this method will parse the json  object and map the custom field with key testcase id.
	public static HashMap<String, Integer> customFieldTestCaseAutomation(JSONArray data) {
		System.out.println(data.size());
		for(int i=0; i<data.size();i++)
		{
			JSONObject testdata= (JSONObject)data.get(i);

			if(!(testdata.get("custom_automation")==null))  {
				String key=(String)testdata.get("custom_automation");
				System.out.println("the key is " + key);
				int value=((Long)testdata.get("id")).intValue();
				System.out.println("the value is " + value);
				hm.put(key,value);
				
			}

		}
		return hm;


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
