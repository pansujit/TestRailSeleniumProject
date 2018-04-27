package glide.backoffice.test.fleets.vehicles;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.VehicleDataProvider;
import glide.backoffice.dataprovider.VehicleFilterDataProvider;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.fleets.vehicles.VehicleDto;
import glide.backoffice.method.fleets.vehicles.VehicleFilterDto;
import glide.backoffice.method.fleets.vehicles.VehicleMethod;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class VehicleTest  extends BaseClassExtended{
	
	
	@BeforeMethod
	public void loginToSystem() throws MalformedURLException, InterruptedException{
		
		OpenBrowser();
		login();
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		headerMethod.selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		siteMenuItems.clickOnVehicles();
	}
	/*
	@Test(dataProvider="addVehicle",dataProviderClass = VehicleDataProvider.class)
	public void AddAVehicleTest(VehicleDto vehicleDto) {
		VehicleMethod vehicleMethod=PageFactory.initElements(driver, VehicleMethod.class);
		vehicleMethod.addANewVehicle(vehicleDto);		
	}
	
	@Test(dataProvider="editVehicle",dataProviderClass = VehicleDataProvider.class)
	public void editAVehicleTest(VehicleDto vehicleDto) {
		VehicleMethod vehicleMethod=PageFactory.initElements(driver, VehicleMethod.class);
		vehicleMethod.editAVehicle(vehicleDto);	
	}
	
	/*@Test
	public void viewAVehicleTest() {
		VehicleMethod vehicleMethod=PageFactory.initElements(driver, VehicleMethod.class);
		vehicleMethod.viewAVehicle();	
	}*/
	
	
	/*@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}*/
	
	@Test(dataProvider="filterVehicle",dataProviderClass = VehicleFilterDataProvider.class)
	public void filterVehicleTest(VehicleFilterDto vehicleFilterDto) {
		VehicleMethod vehicleMethod=PageFactory.initElements(driver, VehicleMethod.class);
		vehicleMethod.filtervehicle(vehicleFilterDto);
	}
	

}
