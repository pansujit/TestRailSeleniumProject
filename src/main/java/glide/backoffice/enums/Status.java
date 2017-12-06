package glide.backoffice.enums;

public enum Status {
Completed("Completed"),Cancelled("Cancelled"),Scheduled("Scheduled"),Inprogress("Inprogress");
	
	   private String value;

	   Status(final String value) {
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
