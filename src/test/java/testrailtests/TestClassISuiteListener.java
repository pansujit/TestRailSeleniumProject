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
				System.out.println("final testing"+result1.getMethod().getMethodName());
			}
		}
			

	}

	@Override
	public void onStart(ISuite arg0) {
		List<ITestNGMethod> x= arg0.getAllMethods();
		for(ITestNGMethod data: x) {
			System.out.println(data.getMethodName());
		}
		



	}

}
