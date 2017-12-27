package listeners;

import org.apache.log4j.Logger;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IInvokedMethodListener2;
import org.testng.ITestContext;
import org.testng.ITestResult;

import glide.backoffice.test.baseclass.BaseClassExtended;

public class MethodListener implements IInvokedMethodListener {
	protected static Logger log = Logger.getLogger(BaseClassExtended.class.getName());

	  @Override
	  public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		  log.info("Starting method:---- "+method.getTestMethod().getMethodName());



	  }
	  @Override
	  public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		  log.info("Closing method"+" " + method.getTestMethod().getMethodName()  +" "+ "with the result:---- "+
				  testResult.getStatus());

	  }

	}
