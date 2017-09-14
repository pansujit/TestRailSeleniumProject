package testrailtests;

public class Jptclass {

	public static void main(String[] args) {
		System.out.println(System.getProperty("os.name"));
		System.out.println(Browser.ie.getBrowserName());
		System.out.println(OperatingSystem.windows.getOSName());
	}

}
