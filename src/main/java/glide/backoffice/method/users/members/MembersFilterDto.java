package glide.backoffice.method.users.members;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MembersFilterDto {
	boolean vip;
	String name;
	String email;

}
