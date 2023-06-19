package testcases;

import base.Base;

public class Verify_Lavel_Learn_At_Your_Own_Space_Appears_In_Landing_Page extends Base {

	public static void main(String[] args) {
		setup();
		navigateURL();
		
		// driver.findElement(By.xpath("//div[@class='collapse navbar-collapse mean-menu']/div/div/form/button")).click();
		click("//div[@class='collapse navbar-collapse mean-menu']/div/div/form/button");

	}

}
