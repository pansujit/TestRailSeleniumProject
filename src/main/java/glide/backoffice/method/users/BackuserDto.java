package glide.backoffice.method.users;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BackuserDto {

	String firstName;
	String lastName;
	String email;
	String countryCode;
	String phoneNumber;
	String address;
	String superCompanyName;
	String companyName;
	String role;
	
}
