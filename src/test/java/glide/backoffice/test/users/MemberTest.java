package glide.backoffice.test.users;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import glide.backoffice.test.baseclass.BaseClassExtended;
import glide.backoffice.utility.SeleniumUtility;

public class MemberTest extends BaseClassExtended {
	
	@Test
	public void testMember() throws ParseException {
		//MemberMethod member= PageFactory.initElements(driver, MemberMethod.class);
		//member.clickOnMember();
		System.out.println("Clicking this information is way to complicated");
		driver.findElement(By.xpath(".//input[@name='pickupDate']")).click();
		SeleniumUtility.fixedWait(5);
		String actualDate1=driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div/div/div[1]/div/div[3]/div[1]/div[1]/div/div")).getText();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");

	    SimpleDateFormat month_date = new SimpleDateFormat("MM");
	    String actualDate= "December 2017";
	    Date actual= new Date();
	    Date date1 = sdf.parse(actualDate);
	    int rr=Integer.parseInt(month_date.format(date1));
	    int zz=Integer.parseInt(month_date.format(actual));
	    for(int i=0;i<(rr-zz);i++) {
	    	driver.findElement(By.xpath(" html/body/div[2]/div/div[1]/div/div/div[1]/div/div[3]/div[1]/div[3]/button")).click();
	    	SeleniumUtility.fixedWait(1);
	    }
	    System.out.println("Month :" + month_date.format(date1));
		List<WebElement> x= driver.findElements(By.xpath("html/body/div[2]/div/div[1]/div/div/div[1]/div/div[3]/div[2]/div/div/div//span"));
		for(WebElement e:x) {
			System.out.println("this" + e.getText().toString());
			if( e.getText().equals("13"))
			{
				e.click();
				break;
			}
		}
		SeleniumUtility.fixedWait(5);
	}

}
