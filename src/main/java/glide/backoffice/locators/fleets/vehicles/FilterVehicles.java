package glide.backoffice.locators.fleets.vehicles;

import org.openqa.selenium.By;

public class FilterVehicles {
	/**
	 * This locator will find the GearBox Manual tag in Vehicle management Filter page in the Fleet management->Vehicle Management
	 */
	final public By LabelTagFleetVehicleMgmtFilterGearBoxManual= By.xpath(".//input[@id='transmissionTypes_MANUAL']/../label");
	/**
	 * This locator will find the GearBox Automatic tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By labelTagFleetVehicleMgmtFilterGearBoxAuto= By.xpath(".//input[@id='transmissionTypes_AUTOMATIC']/../label");
	/**
	 * This locator will find the Air Conditioning tag in Vehicle management  filter page in the Fleet management->Vehicle Management
	 */
	final public By labelTagFleetVehicleMgmtFilterAccAC= By.xpath(".//input[@id='accessories_AIR_CONDITIONING']/../label");
	/**
	 * This locator will find the Radio CD tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By labelTagFleetVehicleMgmtFilterAccRadio= By.xpath(".//input[@id='accessories_RADIO_CD']/../label");
	/**
	 * This locator will find the Bluetooth tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By labelTagFleetVehicleMgmtFilterAccBluetooth= By.xpath(".//input[@id='accessories_BLUETOOTH']/../label");
	/**
	 * This locator will find the GPS tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By labelTagFleetVehicleMgmtFilterAccGPS= By.xpath(".//input[@id='accessories_GPS']/../label");
	/**
	 * This locator will find the Folding_Seat tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By labelTagFleetVehicleMgmtFilterAccSeat= By.xpath(".//input[@id='accessories_FOLDING_SEATS']/../label");
	/**
	 * This locator will find the Large Truck tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By lableTagFleetVehicleMgmtFilterAccTruck= By.xpath(".//input[@id='accessories_LARGE_TRUCK']/../label");
	/**
	 * This locator will find the Fuel type Hybrid tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By labelTagFleetVehicleMgmtFilterFuelHybrid= By.xpath(".//input[@id='fuelTypes_HYBRID']/../label");
	/**
	 * This locator will find the Fuel type Petrol tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By labelTagFleetVehicleMgmtFilterFuelPetrol= By.xpath(".//input[@id='fuelTypes_PETROL']/../label");
	/**
	 * This locator will find the Fuel type Electric tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By labelTagFleetVehicleMgmtFilterFuelElectric= By.xpath(".//input[@id='fuelTypes_ELECTRIC']/../label");
	/**
	 * This locator will find the Fuel type LPG tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By labelTagFleetVehicleMgmtFilterFuelLPG= By.xpath(".//input[@id='fuelTypes_LPG']/../label");
	/**
	 * This locator will find the Fuel type Diesel tag in Vehicle management Filter page in the Fleet management->Vehicle Management
	 */
	final public By labelTagFleetVehicleMgmtFilterFuelDiesel= By.xpath(".//input[@id='fuelTypes_DIESEL']/../label");
	/**
	 * This locator will find the System Type tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By selectTagFleetVehicleMgmtFilterSystemType= By.xpath(".//div[@class='boxedSelectBlockInner']//select[@name='systemType']");
	/**
	 * This locator will find the Brand tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By selectTagFleetVehicleMgmtFilterBrand= By.xpath(".//div[@class='boxedSelectBlockInner']//select[@name='brand']");
	/**
	 * This locator will find the Category tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By selectTagFleetVehicleMgmtFlterCatagory= By.xpath(".//div[@class='boxedSelectBlockInner']//select[@name='catagory']");
	/**
	 * This locator will find the color tag in Vehicle management page in the Fleet management->Vehicle Management
	 */
	final public By selectTagFleetVehicleMgmtFilterColor= By.xpath(".//div[@class='boxedSelectBlockInner']//select[@name='color']");
	/**
	 * This locator will find the Vehicle Status tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By selectTagFleetVehicleMgmtFilterVehicleStatus= By.xpath(".//div[@class='boxedSelectBlockInner']//select[@name='vehicleStatus']");
	/**
	 * This locator will find the Type tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By selectTagFleetVehicleMgmtFilterType= By.xpath(".//div[@class='boxedSelectBlockInner']//select[@name='type']");
	/**
	 * This locator will find the Version tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By selectTagFleetVehicleMgmtFilterVersion= By.xpath(".//div[@class='boxedSelectBlockInner']//select[@name='version']");
	/**
	 * This locator will find the Cleanliness status tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By selectTagFleetVehicleMgmtFilterCleanliness= By.xpath(".//div[@class='boxedSelectBlockInner']//select[@name='cleanliness']");
	/**
	 * This locator will find the Plate Number tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By inputTagFleetVehicleMgmtFilterPlateNumber= By.xpath(".//input[@id='plateNumber']");

	/**
	 * This locator will find the Reset tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By aTagFleetVehicleMgmtFilterReset= By.xpath(".//div[@class='vehiclesFiltersForm_actions']/button[@class='ekButton ekButton--reverse vehiclesFiltersForm_actionsButton']");
	/**
	 * This locator will find the Search tag in Vehicle management filter page in the Fleet management->Vehicle Management
	 */
	final public By aTagFleetVehicleMgmtFilterSearch= By.xpath(".//div[@class='vehiclesFiltersForm_actions']/button[@class='ekButton vehiclesFiltersForm_actionsButton']");

}
