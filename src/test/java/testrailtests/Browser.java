package testrailtests;

public enum Browser {
	
	chrome("Chrome"),
	ie("Internet explorer"),
	firefox("Firefox"),
	safari("Safari");
	private String browserName;
	 
	private Browser(String s) {
		browserName = s;
	}
 
	public String getBrowserName() {
		return browserName;
	}

}
