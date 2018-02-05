package glide.backoffice.enums;

import java.util.Random;

public enum BackuserRoles {
	ADMIN,FLEET_MANAGER,CALL_CENTER_OPERATOR;

	public static String getBackuserRoles(){
		BackuserRoles[] backuserRole = BackuserRoles.values();
		Random generator = new Random();
		return backuserRole[generator.nextInt(backuserRole.length)].toString();
	}
}
