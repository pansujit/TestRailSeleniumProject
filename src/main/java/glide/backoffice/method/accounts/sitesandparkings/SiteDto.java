package glide.backoffice.method.accounts.sitesandparkings;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SiteDto {
	
	
	String siteName;
	String siteAddress;
	String selectCompany;
	String selectTimeZone;
	boolean automaticShorteningBooing;
	boolean automaticExtendingBooing;
	boolean penaltyOnExpiredBooing;
	boolean enableSmartcard;
	boolean spontaneousBooking;
	boolean spontaneousBookingType;
	boolean phisingSmartcard;

}
