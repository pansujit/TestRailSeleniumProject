import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGTest {
	
	
	@Test(threadPoolSize = 1, invocationCount = 20,  timeOut = 10000, dataProvider="mydata")
	public void testServer(int i) {
		System.out.println("x "+ System.currentTimeMillis());
		System.out.println(i);
		System.out.println("y "+ System.currentTimeMillis());
	}
	
	@DataProvider
	public Object[][] mydata() {
		Random random= new Random();
		int test=random.nextInt();
		 return new Object[][]{{5},{2},{3},{4}};
		
	}

}
