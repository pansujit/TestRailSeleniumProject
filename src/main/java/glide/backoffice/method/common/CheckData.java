package glide.backoffice.method.common;


public class CheckData {


	public enum Parameter{

		BO_URL("BO_URL"),
		BASEURI("BASEURI"),


		BO_ADMIN("BO_ADMIN"),


		EDIT_BACK_USER("EDIT_BACK_USER"),


		BO_PASSWORD("BO_PASSWORD"),


		MEMBER_LOGIN("MEMBER_LOGIN"),
		MEMBER_FIRSTNAME("MEMBER_FIRSTNAME"),
		MEMBER_LASTNAME("MEMBER_LASTNAME"),
		EDIT_MEMBER("EDIT_MEMBER"),


		SUPER_COMPANY_NAME("SUPER_COMPANY_NAME"),
		EDIT_SUPER_COMPANY_NAME("EDIT_SUPER_COMPANY_NAME"),


		SUPER_COMPANY_CONFIGURATION("SUPER_COMPANY_CONFIGURATION"),
		SUB_COMPANY_CONFIGURATION("SUB_COMPANY_CONFIGURATION"),


		SUPER_COMPANY_EMAIL_TEMPLATE("SUPER_COMPANY_EMAIL_TEMPLATE"),


		EDIT_SUB_COMPANY_NAME("EDIT_SUB_COMPANY_NAME"),


		EDIT_CONFIGURATION_NAME("EDIT_CONFIGURATION_NAME"),


		VEHICLE_PLATE_NUMBER("VEHICLE_PLATE_NUMBER"),
		EDIT_VEHICLE_PLATE_NUMBER("EDIT_VEHICLE_PLATE_NUMBER"),
		VEHICLE_BRAND("VEHICLE_BRAND"),
		VEHICLE_MODEL("VEHICLE_MODEL"),
		VEHICLE_VERSION("VEHICLE_VERSION"),
		VEHICLE_COLOR("VEHICLE_COLOR"),


		SITE_NAME("SITE_NAME"),
		EDIT_SITE_NAME("EDIT_SITE_NAME"),
		EDIT_PARKING_NAME("EDIT_PARKING_NAME"),


		EDIT_HOTLINE("EDIT_HOTLINE");

		private final String key;

		Parameter(String key) {
			this.key = key;
		}

		public String getKey() {
			return key;
		}
	}

	public static String get(Parameter param) {

		return param.getKey();

	}

}
