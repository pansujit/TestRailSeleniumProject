package glide.backoffice.method.bookings;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {
	
	
	String memberEmail;
	String startAddress;
	String endAddress;
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

}
