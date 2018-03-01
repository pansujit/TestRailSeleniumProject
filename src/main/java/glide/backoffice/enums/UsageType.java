package glide.backoffice.enums;

public enum UsageType {
	
	Private("Private"),Business("Business");
	
	   private String value;

	   UsageType(final String value) {
	        this.value = value;
	    }

	    public String getValue() {
	        return value;
	    }

	    @Override
	    public String toString() {
	        return this.getValue();
	    }

}
