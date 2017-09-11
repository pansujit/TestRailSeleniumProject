package testrailtests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testrail.TestRail;
import testrail.TestRailAPI;

@Listeners(listeners.TestListener.class)				

public class TestRailTests
{
   /* @Test
    public void testAPI() throws Exception
    {
        TestRailAPI api = new TestRailAPI();
        String testRailCase = api.getCase(1).toString();
        System.out.println(testRailCase);
    }*/

    @Test
    @TestRail(customfield = {"baba"})
    public void passTest()
    {
        Assert.assertTrue(false);
    }
    @Test
    @TestRail(customfield = {"bibi"})
    public void passTest1()
    {
        Assert.assertTrue(true);
    }
    @Test
    @TestRail(customfield = {"cici"})
    public void passTest2()
    {
        Assert.assertTrue(false);
    }
    @Test
    @TestRail(customfield = {"didi"})
    public void passTest3()
    {
        Assert.assertTrue(true);
    }
    
}
