package glide.backoffice.dataprovider;


import org.testng.annotations.DataProvider;

import glide.backoffice.method.common.Config;
import glide.backoffice.method.users.members.MembersFilterDto;

/**
 * This class contains all the data necessary to run the member page, the rest data can be got from the properties file
 * @author sujitpandey
 * @created on Mar 1, 2018 5:53:01 PM
 */
public class MembersDataProvider {

	MembersFilterDto memberFilterDto;


	@DataProvider
	public Object[][] filterByName() {

		/**Faker faker = new Faker(new Locale("fr"));*/
		memberFilterDto=MembersFilterDto.builder()
				.name("sujit")
				.build();

		return new Object[][] {{memberFilterDto}};
	}
	@DataProvider
	public Object[][] filterByNameAndEmail() {

		memberFilterDto=MembersFilterDto.builder()
				.name("sujit")
				.email(Config.getProperty("EDIT_MEMBER"))
				.build();

		return new Object[][] {{memberFilterDto}};
	}

	@DataProvider
	public Object[][] filterByEmail() {

		memberFilterDto=MembersFilterDto.builder()
				.email(Config.getProperty("EDIT_MEMBER"))
				.build();

		return new Object[][] {{memberFilterDto}};
	}
	@DataProvider
	public Object[][] filterByVIP() {

		memberFilterDto=MembersFilterDto.builder()
				.vip(true)
				.build();

		return new Object[][] {{memberFilterDto}};
	}
	@DataProvider
	public Object[][] filterByLastName() {

		/**Faker faker = new Faker(new Locale("fr"));*/
		memberFilterDto=MembersFilterDto.builder()
				.lastname("pandey")
				.build();

		return new Object[][] {{memberFilterDto}};
	}

	

}
