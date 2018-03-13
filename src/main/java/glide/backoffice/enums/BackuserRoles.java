package glide.backoffice.enums;

import java.util.Random;

public enum BackuserRoles {
	ADMIN,FLEET_MANAGER,CALL_CENTER_OPERATOR;

	public static String getBackuserRoles(){
		BackuserRoles[] backuserRole = BackuserRoles.values();
		Random generator = new Random();
		return backuserRole[generator.nextInt(backuserRole.length)].toString();
	}
	
	public static String getBackUserValue(String value) {
		String myValue=null;
		switch(value) {
		case "ADMIN":
			myValue="Admin";
			break;
		case "FLEET_MANAGER":
			myValue="Fleet manager";
			break;
		case "CALL_CENTER_OPERATOR":
			myValue="Callcenter officer";
			break;
		default:
		}
	
		return myValue;
		
	}
}
