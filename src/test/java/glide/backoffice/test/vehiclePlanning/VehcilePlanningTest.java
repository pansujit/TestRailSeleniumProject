package glide.backoffice.test.vehiclePlanning;

import java.net.MalformedURLException;
import java.util.Random;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.BackuserDataProvider;
import glide.backoffice.dataprovider.VehiclePlanningDataProvider;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.vehicleplanning.VehiclePlanningDto;
import glide.backoffice.method.vehicleplanning.VehiclePlanningMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class VehcilePlanningTest extends BaseClassExtended {
	
	@BeforeClass
	public void clickOnVehiclePlanning() throws MalformedURLException, InterruptedException {
		OpenBrowser();
        SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class);
		HeaderMethod headerMethod= PageFactory.initElements(driver, HeaderMethod.class);
		headerMethod.selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		headerMethod.selectCompany(Config.getProperty("SUB_COMPANY_NAME"));
        siteMenuItems.clickOnVehiclePlanning();
	}
	/*@Test(dataProvider="createRoundTripBusinessBooking",dataProviderClass = VehiclePlanningDataProvider.class)
	/*public void homepageVehiclePlanningTest() {
		VehiclePlanningMethod vehiclePlanningMethod=PageFactory.initElements(driver, VehiclePlanningMethod.class);
		vehiclePlanningMethod.homepageVerification();
	}*/
	/*public void homepageVehiclePlanningTest(VehiclePlanningDto vehiclePlanningDto) {
		VehiclePlanningMethod vehiclePlanningMethod=PageFactory.initElements(driver, VehiclePlanningMethod.class);
		vehiclePlanningMethod.createBooking(vehiclePlanningDto);
	}
	@Test(dataProvider="addStatusVehiclePlanning",dataProviderClass = VehiclePlanningDataProvider.class)
	public void homepageVehiclePlanningTest(VehiclePlanningDto vehiclePlanningDto) {
		VehiclePlanningMethod vehiclePlanningMethod=PageFactory.initElements(driver, VehiclePlanningMethod.class);
		vehiclePlanningMethod.addStatusFromVehiclePlanning(vehiclePlanningDto);;
	}
	
	@Test(dataProvider="addStatusVehiclePlanning",dataProviderClass = VehiclePlanningDataProvider.class)
	public void homepageVehiclePlanningDaysTest(VehiclePlanningDto vehiclePlanningDto) {
		VehiclePlanningMethod vehiclePlanningMethod=PageFactory.initElements(driver, VehiclePlanningMethod.class);
		vehiclePlanningMethod.daysRowsCount(vehiclePlanningDto);	
	}*/
	@Test
	public void backAndFrontArrowTest() {
		VehiclePlanningMethod vehiclePlanningMethod=PageFactory.initElements(driver, VehiclePlanningMethod.class);
		vehiclePlanningMethod.backAndFrontArrow();
	}

	/*@AfterClass
	public void closeAllBrowser() {
		closeBrowser();
	}
*/
}
