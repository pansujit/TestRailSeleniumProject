package glide.backoffice.locators.accounts.supercompanies;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SuperCompanyDto {
	String companyName;
	String companyAddress;
	String email;
	String phoneNumber;
	String taxNumber;
	String subscriptionURL;
	String termsURL;
	String capital;
	String lockUnlockTime;
	String invoiceNumberSuffix;
	String emailTemplate;
	String configuration;
	String companyLegalForm;
}
