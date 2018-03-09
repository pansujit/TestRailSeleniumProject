package glide.backoffice.method.accounts.configurations;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConfigDto {
	
	String configName;
	String vatNumber;
	String vatPercentage;

}
