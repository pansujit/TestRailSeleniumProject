package glide.backoffice.method.vehicleplanning;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehiclePlanningDto {
	
	String plateNumber;
	String memberEmail;
	String startDate;
	String endDate;
	String startTimeHour;
	String startTimeMinutes;
	String endTimeHour;
	String endTimeMinutes;
	String status;
	String secondStatus;
	String firstname;
	String startDateTimeForBooking;
	String endDateTimeForBooking;
	boolean statusToSelectTripType;
	String usageType;
	boolean paidBooking;
	String vehicleStatus;

}
