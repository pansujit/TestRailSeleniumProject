package listeners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import testrail.TestRail;
import testrail.TestRailAPI;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class TestListener implements ITestListener
{
    // shows more detailed logs in console if set to true
    Boolean debugInfo = true;
    HashMap<String,Integer> hm=new HashMap<String,Integer>(); 
    
    //runs any time a test starts
    @Override
    public void onTestStart(ITestResult arg0)
    {
        String timeStamp = new SimpleDateFormat("dd/MM/yyy HH:mm:ss").format(Calendar.getInstance().getTime());

        ITestNGMethod m = arg0.getMethod();

        // get test method name
        String methodName = m.getMethodName();
        // get test browser name
        String browserName = m.getXmlTest().getParameter("browserName");

        System.out.println("");
        System.out.println("===============================================");

        if (browserName == null)
        {
            System.out.println("Test started - " + methodName + " at " + timeStamp);
        }
        else
        {
            System.out.println("Test started - " + methodName + " on browser " + browserName + " at " + timeStamp);
        }

        System.out.println("===============================================");
        System.out.println("");
        try {
        	hm=TestRailAPI.getCasesWithCustomfield(1);
        	System.out.println("the key value pair is" + hm.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
    }

    // runs any time a test passes
    @Override
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("I am testing");
        System.out.println("===============================================");

        // if you have chosen to record test results to TestRail
        if (true)//Common.postResultsToTestRail)
        {
        	   System.out.println("I am here");
            ITestNGMethod m = result.getMethod();
            // get the method name for the test
            String methodName = m.getMethodName();
            // get the browser name for the test
            String browserName = m.getXmlTest().getParameter("browserName");

            // get the TestRail Test Run Id from the TestNG.xml file
            int testRailTestRunId = 0;
            String testRailTestRunIdStr = m.getXmlTest().getParameter("testRailTestRunId");
            System.out.println("this is custom generated string need to delete" + testRailTestRunIdStr);
            // if the Test Run id parameter exists in the xml then store it as an int
            /*if (testRailTestRunIdStr != null && !testRailTestRunIdStr.isEmpty())
            {
                testRailTestRunId = Integer.parseInt(testRailTestRunIdStr);
            }*/
            
            // get the TestRail Test Case id from the Test annonation description value
            String[] testCaseIds = returnTestCaseId(result);
           // System.out.println("testme"+testCaseIds.length);	
            // if the Test Case Id and Test Run Id have both been set then try to add the test result to TestRail
            if (true)// && testRailTestRunId != 0)
            {
                // the comment that will be added to the Test Run result
                Object commentFromTest = result.getTestContext().getAttribute("Comment");
                if (debugInfo)
                    System.out.println("Comment attribute = " + commentFromTest);

                String additionalComment;
                if (commentFromTest == null)
                {
                    additionalComment = "";
                }
                else
                {
                    additionalComment = "\n\nAdditional info - " + commentFromTest.toString();
                }

                String testRailComment = "Automated TestNG Test - PASS; \n\nTest method name = " + methodName + "\nBrowser name = " + browserName + additionalComment;
                System.out.println(testRailComment);

                try
                {
                    // add the result to TestRail
                    for (String testCaseId : testCaseIds)
                    {
                        System.out.println(testCaseId);
                        TestRailAPI.addResult(1, testRailComment, 4/*testRailTestRunId*/, hm.get(testCaseId));
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else
            {
                // if the Test Case Id or Test Run Id have not been set correctly record a message to the log
                System.out.println("Test results are not being recorded to TestRail for test " + methodName + " on browser " + browserName);
            }
        }
        System.out.println("===============================================");
    }

    // runs any time a test fails
    public void onTestFailure(ITestResult arg0)
    {
        System.out.println("");
        System.out.println("===============================================");
        // store the failure exception
        String errorMessage = arg0.getThrowable().toString();

        // if you have chosen to record test results to TestRail
        if (true)//Common.postResultsToTestRail)
        {
            ITestNGMethod m = arg0.getMethod();
            // store the test method name
            String methodName = m.getMethodName();

            // store the test browser name
            String browserName = m.getXmlTest().getParameter("browserName");

            // get the TestRail Test Run Id from the TestNG.xml file
            int testRailTestRunId = 0;
            String testRailTestRunIdStr = m.getXmlTest().getParameter("testRailTestRunId");
            // if the Test Run id parameter exists in the xml then store it as an int
            if (testRailTestRunIdStr != null && !testRailTestRunIdStr.isEmpty())
            {
                testRailTestRunId = Integer.parseInt(testRailTestRunIdStr);
            }

            // get the TestRail Test Case id from the Test annonation description value
            String[] testCaseIds = returnTestCaseId(arg0);

            // if the Test Case Id and Test Run Id have both been set then try to add the test result to TestRail
            if (true )
            {
                // the comment that will be added to the Test Run result
                Object commentFromTest = arg0.getTestContext().getAttribute("Comment");
                if (debugInfo)
                    System.out.println("Comment attribute = " + commentFromTest);

                String additionalComment;
                if (commentFromTest == null)
                {
                    additionalComment = "";
                }
                else
                {
                    additionalComment = "\nAdditional info - " + commentFromTest.toString();
                }
                String testRailComment = "Automated TestNG Test - FAIL\n\nTest method name = " + methodName + "\nBrowser name = " + browserName + "\n\nFailure Exception = " + errorMessage + additionalComment;

                try
                {
                    // add the result to TestRail
                    for (String testCaseId : testCaseIds)
                    {
                        System.out.println(testCaseId);
                        TestRailAPI.addResult(5, testRailComment, 4/*testRailTestRunId*/, hm.get(testCaseId));
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            else
            {
                // if the Test Case Id or Test Run Id have not been set correctly record a message to the log
                System.out.println("Test results are not being recorded to TestRail for test " + methodName + " on browser " + browserName);
            }
        }
        System.out.println("===============================================");
    }

    public void onTestSkipped(ITestResult arg0)
    {
    }

    public void onFinish(ITestContext arg0)
    {
    }

    public void onStart(ITestContext arg0)
    {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
    {
    }

    public String[] returnTestCaseId(ITestResult result)
    {
        ITestNGMethod testNGMethod = result.getMethod();
        Method method = testNGMethod.getConstructorOrMethod().getMethod();
        TestRail testRailAnnotation = method.getAnnotation(TestRail.class);
        String[] testCaseIds;
        try
        {
            testCaseIds = testRailAnnotation.customfield();
        }
        catch (Exception ex)
        {
            return null;
        }
        return testCaseIds;
    }


}
