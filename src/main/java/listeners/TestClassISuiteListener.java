package listeners;



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
import testrail.TestRailTestForTest;

/**
 * This is after suite testNG listeners to collect result and sent it the testrail. The following are mandatory to
 * Publish the result in testlink. The "projectID", "suiteID" and "PlanID". 
 * @author sujitpandey
 *
 */

public class TestClassISuiteListener implements ISuiteListener {
	public static String testme=null;
	static Logger log = Logger.getLogger(TestClassISuiteListener.class.getName());
	/**
	 * This is after suite method, which run for every suites defined in the suitefile.xml. It will collect the projectID, planID
	 * as well as suiteID and results. This results will send to the testrail with their respective case and run.
	 */
	@Override
	public void onFinish(ISuite arg0) {
		List<String> passTestCaseName=new ArrayList<String>();
		List<String> failedTestCaseName=new ArrayList<String>();
		log.info("Running On Finish Method on ItestSuiteListener");
		log.info("Getting Results of all test from Isuite Results");
		Map<String, ISuiteResult> y=arg0.getResults();
		log.info("Getting entry set of all test results to avoid duplicate name, looping over the results");
		for (Map.Entry<String, ISuiteResult> result : y.entrySet()) {
			ITestContext testContext = result.getValue().getTestContext();
			log.info("saving all passed test cases into the list");
			Set<ITestResult> passtest=testContext.getPassedTests().getAllResults();
			List<ITestResult> list = new ArrayList<ITestResult>(passtest);
			log.info("Adding passed test to the String list");
			for(ITestResult result1:list) {
				passTestCaseName.add(result1.getMethod().getMethodName());

			}
			log.info("saving all failed test cases into the list");
			Set<ITestResult> failedtest=testContext.getFailedTests().getAllResults();
			List<ITestResult> failedList = new ArrayList<ITestResult>(failedtest);
			log.info("Adding failed test to the String list");
			for(ITestResult result1:failedList) {
				failedTestCaseName.add(result1.getMethod().getMethodName());
			}
			log.info("saving all skipped test cases into the list");
			Set<ITestResult> skipppedtest=testContext.getSkippedTests().getAllResults();
			List<ITestResult> skipppedList = new ArrayList<ITestResult>(skipppedtest);
			for(ITestResult result1:skipppedList) {
				System.out.println("final skipped"+result1.getMethod().getMethodName());
			}
		}
		try {
		log.info("Getting configuration parameter, projectIdn SuiteId and PlanId");
		String yy=arg0.getParameter("configuration");
		String[] config_data=yy.split(",");
		int projectId=1;
		int planID=41;
		//int suiteId=1;
		Integer runId = null;
		HashMap<String,Integer> customFieldToID= new HashMap<String,Integer>();


		

			TestRailTestForTest testme= new TestRailTestForTest();
			log.info("getting runId from given configuration, plan and project");
			runId=testme.getMyPlanID(config_data,planID,projectId);
			log.info("Getting Id of the test cases when PlanID and SuiteID is provided.");
			TestRailTestForTest testme1= new TestRailTestForTest();
			customFieldToID=testme1.get_cases(1,1);


			log.info("Sending passed test result to the testrail");
			try {
				log.info("Checking if the caseid or run id is not null");
				if(!customFieldToID.isEmpty() && runId!=null) {
					TestRailTestForTest testme2= new TestRailTestForTest();
					for(int i=0;i<passTestCaseName.size();i++) {
						try {
							log.info("Sending the passed result to the testcase");
							testme2.addResult(1,runId, customFieldToID.get(passTestCaseName.get(i).trim()));
						}catch(Exception e) {
							log.error("The testcaseID may exists in project but configure to Run in this run id"+" "+ "testcaseID"+
									" "+customFieldToID.get(passTestCaseName.get(i).trim()));
						}
					}
				}

			}catch(Exception e) {
				log.error("There is some error on getting caseid or RunIdon getting passed test result\n"+e.getMessage());
			}

			log.info("sendin result for the failed testcases in testrail");
			try {
				log.info("Checking if the caseid or run id is not null");
				if(!customFieldToID.isEmpty() && runId!=null) {
					TestRailTestForTest testme2= new TestRailTestForTest();
					for(int i=0;i<failedTestCaseName.size();i++) {
						try {
							log.info("Sending the failed result to the testcase");
							testme2.addResult(5, runId, customFieldToID.get(failedTestCaseName.get(i).trim()));
						}catch(Exception e) {
							log.error("The testcaseID may exists in project but configure to Run in this run id"+" "+ "testcaseID"+
									" "+customFieldToID.get(failedTestCaseName.get(i).trim()));
						}
					}
				}

			}catch(Exception e) {
				log.error("There is some error on getting caseid or RunId on getting failed test result\n"+e.getMessage());

			}
		}catch(Exception e) {
			log.error("There is some error on getting configuration on suite\n"+e.getMessage());

		}
	}

	@Override
	public void onStart(ISuite arg0) {
		testme=arg0.getParameter("configuration");

	}

}
