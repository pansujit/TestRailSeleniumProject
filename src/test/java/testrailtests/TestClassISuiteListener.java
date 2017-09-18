package testrailtests;


import java.io.IOException;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestContext;

import org.testng.ITestResult;

import testrail.APIException;
import testrail.TestRailAPI;
import testrail.TestRailTestForTest;

public class TestClassISuiteListener implements ISuiteListener {
	 static Logger log = Logger.getLogger(TestClassISuiteListener.class.getName());
	Map<String, String> XMLFiles= new HashMap<String, String>();
	@Override
	public void onFinish(ISuite arg0) {
		log.info("this is just testing");
		Map<String, ISuiteResult> y=arg0.getResults();
		List<String> passTestCaseName=new ArrayList<String>();
		List<String> failedTestCaseName=new ArrayList<String>();
		for (Map.Entry<String, ISuiteResult> result : y.entrySet()) {
			ITestContext testContext = result.getValue().getTestContext();
			Set<ITestResult> passtest=testContext.getPassedTests().getAllResults();
			List<ITestResult> list = new ArrayList<ITestResult>(passtest);


			for(ITestResult result1:list) {
				passTestCaseName.add(result1.getMethod().getMethodName());

			}
			Set<ITestResult> failedtest=testContext.getFailedTests().getAllResults();
			List<ITestResult> failedList = new ArrayList<ITestResult>(failedtest);
			for(ITestResult result1:failedList) {
				failedTestCaseName.add(result1.getMethod().getMethodName());
			}
			Set<ITestResult> skipppedtest=testContext.getSkippedTests().getAllResults();
			List<ITestResult> skipppedList = new ArrayList<ITestResult>(skipppedtest);
			for(ITestResult result1:skipppedList) {
				System.out.println("final skipped"+result1.getMethod().getMethodName());
			}
		}
		System.out.println("Running on after suite method");
		String yy=arg0.getParameter("configuration");
		String[] config_data=yy.split(",");
		int projectId=1;
		int planID=35;
		//int suiteId=1;
		Integer runId = null;
		HashMap<String,Integer> customFieldToID= new HashMap<String,Integer>();
		try {

			TestRailTestForTest testme= new TestRailTestForTest();
			runId=testme.getMyPlanID(config_data,planID,projectId);
			TestRailTestForTest testme1= new TestRailTestForTest();
			customFieldToID=testme1.get_cases(1,1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		try {
			if(!customFieldToID.isEmpty() && runId!=null) {
				TestRailTestForTest testme2= new TestRailTestForTest();
				for(int i=0;i<passTestCaseName.size();i++) {
					testme2.addResult(1,runId/*testRailTestRunId*/, customFieldToID.get(passTestCaseName.get(i).trim()));

				}
			}

		}catch(Exception e) {
			e.printStackTrace();
		}

		try {
			if(!customFieldToID.isEmpty() && runId!=null) {
				TestRailTestForTest testme2= new TestRailTestForTest();
				for(int i=0;i<failedTestCaseName.size();i++) {
					testme2.addResult(5, runId/*testRailTestRunId*/, customFieldToID.get(failedTestCaseName.get(i).trim()));
				}
			}

		}catch(Exception e) {
			e.printStackTrace();
		}

		//Map<String, String> x=arg0.getXmlSuite().getAllParameters();

		if(XMLFiles.size()==0) {
			TestRailTestForTest closeRun= new TestRailTestForTest();
			try {
				closeRun.closeRun(planID);
			} catch (IOException | APIException e) {
				
				e.printStackTrace();
			}
		}
	}

	@Override
	//@Parameters(value = { "configuration" })
	public void onStart(ISuite arg0) {
		Map<String, String> XMLFiles=arg0.getXmlSuite().getAllParameters();
		System.out.println("The size on start is " +XMLFiles.size());

	}

}
