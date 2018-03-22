package listeners;

//import glide.backoffice.test.baseclass.BaseClassExtended;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class MethodListener implements IInvokedMethodListener {
	//protected static Logger log = Logger.getLogger(BaseClassExtended.class.getName());

	  @Override
	  public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		  //log.info("Starting method:---- "+method.getTestMethod().getMethodName());



	  }
	  @Override
	  public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		  //log.info("Closing method"+" " + method.getTestMethod().getMethodName()  +" "+ "with the result:---- "+
			//	  testResult.getStatus());

	  }

	}
