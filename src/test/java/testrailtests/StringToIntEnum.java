package testrailtests;

public enum StringToIntEnum {

	firefox,
	chrome,
	opera,
	safari;
	int getBrowserValueInInteger() {
        switch (this) {
            case firefox:
                return 1;
            case chrome:
                return 2;
            case opera:
                return 3;
            case safari:
                return 4;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
	}

	
}
