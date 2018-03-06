package glide.backoffice.method.accounts.companies;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto {
	
	String companyName;
	String address;
	String email;
	String countryCode;
	String phoneNumber;
	String taxNumber;
	String capital;
	String companyLegalForm;
	String agencyCode;
	String logoURL;
	String appliedConfiguration;
	
}

