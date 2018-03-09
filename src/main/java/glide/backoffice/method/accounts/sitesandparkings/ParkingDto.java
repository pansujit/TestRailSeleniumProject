package glide.backoffice.method.accounts.sitesandparkings;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParkingDto {
	String parkingName;
	String latitude;
	String longitude;
	String radius;
	String additionalInformation;
	boolean allTimeOpen;
	boolean privateAccess;
	boolean disableAccess;
	boolean electricCharge;
	boolean gsmConnection;

}
