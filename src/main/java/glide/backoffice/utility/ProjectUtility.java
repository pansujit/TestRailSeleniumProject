package glide.backoffice.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ProjectUtility {
	private List<JSONObject> testDataObject= new ArrayList<JSONObject>();
	private List<JSONArray> testDataArray= new ArrayList<JSONArray>();
	private HashMap<String,Integer> customFieldToId= new HashMap<String,Integer>();

	/**
	 * This method will convert the jsonarray to list of the json object.
	 * @param jsonArray
	 * @return list<JSONObject>
	 */
	public List<JSONObject> JSONArrayToJSONObject(List<JSONArray> jsonArray) {
		for(JSONArray array:jsonArray) {
			for(int i=0; i<array.size();i++)
			{
				testDataObject.add((JSONObject)array.get(i));

			}
		}
		return testDataObject;
	}


	public List<JSONArray> JSONObjectToJSONArray(List<JSONObject> JsonObject,String value) {
		if(value==null||value.isEmpty() ) {
			return null;
		}
		else {
			for(JSONObject object: JsonObject) {
				testDataArray.add((JSONArray)object.get(value));
			
				
			}
		}
		
		return testDataArray;

	}
	
	public List<JSONObject> JSONArrayToJSONObject(JSONArray jsonArray) {
		
			for(int i=0; i<jsonArray.size();i++)
			{
				testDataObject.add((JSONObject)jsonArray.get(i));

			}
		
		return testDataObject;
	}
	public List<JSONArray> JSONObjectToJSONArray(JSONObject JsonObject,String value) {
		if(value==null||value.isEmpty() ) {
			return null;
		}
		else {
				
				testDataArray.add((JSONArray)JsonObject.get(value));
			}
	

		return testDataArray;

	}
	/**
	 * This method make the key value pair of the custom field and test caseID.
	 * @param testCases
	 * @param customFieldName
	 * @return customFieldToId
	 */
	public  HashMap<String,Integer> getCustomFieldAndTestID(List<JSONObject> testCases, String customFieldName){

		for(JSONObject testCase: testCases) {
			if(!(testCase.get("custom_automation")==null))  {

				String key=(String)testCase.get(customFieldName);
				int value=((Long)testCase.get("id")).intValue();
				customFieldToId.put(key,value);

			}
		}


		return customFieldToId;
	}

	public  void get(JSONArray listArray)
	{
		for(int i=0; i<listArray.size();i++)
		{
			/*JSONObject c= (JSONObject) listArray.get(i);
			configToID.put((String)c.get("config"), ((Long)c.get("id")).intValue());
			idToConfig.put(((Long)c.get("id")).intValue(), (String)c.get("config"));
			System.out.println("hi"+c.get("id"));
			System.out.println("hello"+ c.get("config"));
			testString.add((String)c.get("config"));*/
		}
	}
}
