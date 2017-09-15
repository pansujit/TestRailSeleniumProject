package testrailtests;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;

public class TestClassISuiteListener implements ISuiteListener {

	@Override
	public void onFinish(ISuite arg0) {
		List<String> data= new ArrayList<String>();
		List<ITestNGMethod> x= arg0.getAllMethods();
		Map<String, ISuiteResult> y=arg0.getResults();
		ISuiteResult z=y.get("Test");

		//z.getTestContext().getCurrentXmlTest().getSuite()
		/*List<String> list = new ArrayList<String>(w);
		for(String mydata : list) {
			System.out.println(mydata);
		}*/
		for (Map.Entry<String, ISuiteResult> result : y.entrySet()) {
			ITestContext testContext = result.getValue().getTestContext();
			Set<ITestResult> passtest=testContext.getPassedTests().getAllResults();
			List<ITestResult> list = new ArrayList<ITestResult>(passtest);
			for(ITestResult result1:list) {
				System.out.println("final pass"+result1.getMethod().getMethodName());
			}
			Set<ITestResult> failedtest=testContext.getFailedTests().getAllResults();
			List<ITestResult> failedList = new ArrayList<ITestResult>(failedtest);
			for(ITestResult result1:failedList) {
				System.out.println("final failed"+result1.getMethod().getMethodName());
			}
			Set<ITestResult> skipppedtest=testContext.getSkippedTests().getAllResults();
			List<ITestResult> skipppedList = new ArrayList<ITestResult>(skipppedtest);
			for(ITestResult result1:skipppedList) {
				System.out.println("final failed"+result1.getMethod().getMethodName());
			}
		}


	}

	@Override
	@Parameters(value = { "configuration" })
	public void onStart(ISuite arg0) {
		/*List<ITestNGMethod> x= arg0.getAllMethods();
		for(ITestNGMethod data: x) {
			System.out.println(data.getMethodName());
		}*/
		System.out.println(arg0.getParameter("configuration"));
		int projectId=1;
		int planID=1;
		int suiteId=1;
		


	}

}
