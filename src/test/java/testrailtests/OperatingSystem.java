package testrailtests;

public enum OperatingSystem {
	windows("windows"),
	mac("mac"),
	linux("linux");
	private String osname;
	private OperatingSystem(String s) {
		osname = s;
	}
	public String getOSName()
	{
		return osname;
	}

}
