package glide.backoffice.dataprovider;


import org.testng.annotations.DataProvider;

import glide.backoffice.method.users.members.MembersFilterDto;


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
				.email("sujit.pandey+24@glidemobility.com")
				.build();

		return new Object[][] {{memberFilterDto}};
	}

	@DataProvider
	public Object[][] filterByEmail() {

		memberFilterDto=MembersFilterDto.builder()
				.email("sujit.pandey+24@glidemobility.com")
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


	

}
