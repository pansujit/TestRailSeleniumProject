package glide.backoffice.test.fleets.vehicles;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import glide.backoffice.dataprovider.VehicleDataProvider;
import glide.backoffice.dataprovider.VehicleFilterDataProvider;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.fleets.vehicles.VehicleDto;
import glide.backoffice.method.fleets.vehicles.VehicleFilterDto;
import glide.backoffice.method.fleets.vehicles.VehicleMethod;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended3;

public class VehicleTest  extends BaseClassExtended3{
	
	SoftAssert softAssert;
	@BeforeMethod(alwaysRun=true)
	public void loginToSystem() throws MalformedURLException, InterruptedException{
		
		openBrowser();
		login();
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		headerMethod.selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		siteMenuItems.clickOnVehicles();
	}
	
	@Test(dataProvider="addVehicle",dataProviderClass = VehicleDataProvider.class)
	public void AddAVehicleTest(VehicleDto vehicleDto) {
		List<Boolean> assertValue= new ArrayList<>();
		softAssert= new SoftAssert();
		VehicleMethod vehicleMethod=PageFactory.initElements(driver, VehicleMethod.class);
		assertValue=vehicleMethod.addANewVehicle(vehicleDto);
		softAssert.assertTrue(assertValue.get(0),"The company name is different; given was: "+ vehicleDto.getCompanyName());
		softAssert.assertTrue(assertValue.get(1),"The company name is different; given was: " +vehicleDto.getCarModel());
		softAssert.assertTrue(assertValue.get(2),"The company name is different; given was: "+ vehicleDto.getCarBrand());
		softAssert.assertTrue(assertValue.get(3),"The company name is different; given was: "+vehicleDto.getFuelType());
	}
	
	/*@Test(dataProvider="editVehicle",dataProviderClass = VehicleDataProvider.class)
	public void editAVehicleTest(VehicleDto vehicleDto) {
		List<Boolean> assertValue= new ArrayList<>();
		softAssert= new SoftAssert();
		VehicleMethod vehicleMethod=PageFactory.initElements(driver, VehicleMethod.class);
		assertValue=vehicleMethod.editAVehicle(vehicleDto);	
		softAssert.assertTrue(assertValue.get(0),"The company name is different; given was: "+ vehicleDto.getCompanyName());
		softAssert.assertTrue(assertValue.get(1),"The company name is different; given was: " +vehicleDto.getCarModel());
		softAssert.assertTrue(assertValue.get(2),"The company name is different; given was: "+ vehicleDto.getCarBrand());
		softAssert.assertTrue(assertValue.get(3),"The company name is different; given was: "+vehicleDto.getFuelType());
	}
	
	/*@Test
	public void viewAVehicleTest() {
		List<Boolean> assertValue= new ArrayList<>();
		softAssert= new SoftAssert();
		VehicleMethod vehicleMethod=PageFactory.initElements(driver, VehicleMethod.class);
		assertValue=vehicleMethod.viewAVehicle();
		softAssert.assertTrue(assertValue.get(0),"The Edit vehicle button is not displayed");
		softAssert.assertTrue(assertValue.get(1),"The Add status button is not displayed");
		softAssert.assertAll();
	}
	
	

	
	@Test(dataProvider="filterVehicle",dataProviderClass = VehicleFilterDataProvider.class)
	public void filterVehicleTest(VehicleFilterDto vehicleFilterDto) {
		VehicleMethod vehicleMethod=PageFactory.initElements(driver, VehicleMethod.class);
		vehicleMethod.filtervehicle(vehicleFilterDto);
	}*/
	

}
