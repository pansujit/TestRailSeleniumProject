package glide.backoffice.method.users.members;

import lombok.*;
/**
 * This class is for the filter member mostly used for the filter and edit members
 * @author sujitpandey
 * @created on Mar 1, 2018 5:49:42 PM
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MembersFilterDto {
	boolean vip;
	String name;
	String email;
	String lastname;

}
