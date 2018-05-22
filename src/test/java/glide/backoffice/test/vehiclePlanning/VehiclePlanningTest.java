package glide.backoffice.test.vehiclePlanning;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import glide.backoffice.dataprovider.VehiclePlanningDataProvider;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.vehicleplanning.VehiclePlanningDto;
import glide.backoffice.method.vehicleplanning.VehiclePlanningMethod;
import glide.backoffice.test.baseclass.BaseClassExtended3;

public class VehiclePlanningTest extends BaseClassExtended3 {

	SoftAssert softAssert;
	@BeforeMethod
	public void clickOnVehiclePlanning() throws MalformedURLException, InterruptedException{
		openBrowser();
		login();
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class);
		HeaderMethod headerMethod= PageFactory.initElements(driver, HeaderMethod.class);
		headerMethod.selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		headerMethod.selectCompany(Config.getProperty("SUB_COMPANY_NAME"));
		siteMenuItems.clickOnVehiclePlanning();
	}
	@Test(description="This test verifies that vehicle planning contains all desired text and button")
	public void homepageVehiclePlanningTest() {
		List<Boolean> assertValue= new ArrayList<>();
		softAssert= new SoftAssert();
		
		VehiclePlanningMethod vehiclePlanningMethod=PageFactory.initElements(driver, VehiclePlanningMethod.class);
		assertValue= vehiclePlanningMethod.homepageVerification();
		
		softAssert.assertTrue(assertValue.get(0),"The refresh button is not visible");
		softAssert.assertTrue(assertValue.get(1),"The add status button is not visible");
		softAssert.assertTrue(assertValue.get(2),"The site is not displayed");
		softAssert.assertTrue(assertValue.get(3),"The days is not displayed");
		softAssert.assertTrue(assertValue.get(4),"The date is not displayed");
		softAssert.assertAll();
	}
	
	@Test(dataProvider="addStatusVehiclePlanning",dataProviderClass = VehiclePlanningDataProvider.class)
	public void addStatusVehiclePlanningTest(VehiclePlanningDto vehiclePlanningDto) {
		List<Boolean> assertValue= new ArrayList<>();
		softAssert= new SoftAssert();
		
		VehiclePlanningMethod vehiclePlanningMethod=PageFactory.initElements(driver, VehiclePlanningMethod.class);
		assertValue=vehiclePlanningMethod.addStatusFromVehiclePlanning(vehiclePlanningDto);
		
		softAssert.assertTrue(assertValue.get(0),"The given status in not correctly return as given :" + vehiclePlanningDto.getStatus());
		softAssert.assertTrue(assertValue.get(1),"The status is empty for given vehicle");
		softAssert.assertAll();
	}

	@Test(dataProvider="addStatusVehiclePlanning",dataProviderClass = VehiclePlanningDataProvider.class)
	public void homepageVehiclePlanningDaysTest(VehiclePlanningDto vehiclePlanningDto) {
		List<Boolean> assertValue= new ArrayList<>();
		softAssert= new SoftAssert();
		
		VehiclePlanningMethod vehiclePlanningMethod=PageFactory.initElements(driver, VehiclePlanningMethod.class);
		assertValue=vehiclePlanningMethod.daysRowsCount(vehiclePlanningDto);	

		softAssert.assertTrue(assertValue.get(0),"The slot is more or less than 24 for 1 day slot");
		softAssert.assertTrue(assertValue.get(1),"The slot is more or less than 3 for 3 days slots");
		softAssert.assertTrue(assertValue.get(2),"The slot is more or less than 7 for 7 days slots");
		softAssert.assertAll();

	}
	@Test
	public void backAndFrontArrowTest() {
		List<Boolean> assertValue= new ArrayList<>();
		softAssert= new SoftAssert();
		
		VehiclePlanningMethod vehiclePlanningMethod=PageFactory.initElements(driver, VehiclePlanningMethod.class);
		assertValue=vehiclePlanningMethod.backAndFrontArrow();
		
		softAssert.assertTrue(assertValue.get(0),"The arrow button is not clicked because dates are equal");
		softAssert.assertAll();
	}
	
	
	@Test(dataProvider="createRoundTripBusinessBooking",dataProviderClass = VehiclePlanningDataProvider.class)
	public void CreateBookingVehiclePlanningTest(VehiclePlanningDto vehiclePlanningDto) {
		List<String> assertValue= new ArrayList<>();
		softAssert= new SoftAssert();
		
		VehiclePlanningMethod vehiclePlanningMethod=PageFactory.initElements(driver, VehiclePlanningMethod.class);
		assertValue=vehiclePlanningMethod.createBooking(vehiclePlanningDto);
		
		softAssert.assertEquals(assertValue.get(0),vehiclePlanningDto.getStatus().toLowerCase(),
				"The status is not as given status. given status is "+ vehiclePlanningDto.getStatus());
		softAssert.assertEquals(assertValue.get(1),vehiclePlanningDto.getUsageType().toLowerCase(),
				"The booking Usage type is not same as given Usage type: "+ vehiclePlanningDto.getUsageType());
		softAssert.assertEquals(assertValue.get(2),Config.getProperty("MEMBER_FIRSTNAME")+" "+ Config.getProperty("MEMBER_LASTNAME"),
				"The member full name is not same as given full name :" 
		+Config.getProperty("MEMBER_FIRSTNAME")+" "+ Config.getProperty("MEMBER_LASTNAME"));
		softAssert.assertAll();
	}

}
