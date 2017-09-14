package testrailtests;

import org.testng.annotations.AfterTest;

public class Aftersuite extends Beforetest  {
	
	@AfterTest
	public void clearResult() {
		System.out.println("size is "+ methodName.size());
		for(String data: methodName) {
			System.out.println(data);
		}
		System.out.println("running after suite");
		methodName.clear();
	}

}
