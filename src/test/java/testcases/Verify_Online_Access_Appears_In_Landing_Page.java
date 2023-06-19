package testcases;



import base.Base;

public class Verify_Online_Access_Appears_In_Landing_Page extends Base {

	public static void main(String[] args) {

		setup();
		// go to https: //skyitschool.com
		driver.get("https://skyitschool.com/");

//		// Get the Text of that Element (H3)
//
//		WebElement element = driver.findElement(By.xpath("//h3[text()='Online 24/7 Access']"));
//
//		// Get the text of that element
//		String s = element.getText();
		String	s = getElementText("//h3[text()='Online 24/7 Access']");

		// Verify the text is "Online 24/7 Access"
	
		if (s.contentEquals("Online 24/7 Access"))
			System.out.println("Online 24/7 Access - Pass");
		else
			System.out.println("Online 24/7 Access - Fail");

		tearDown();//Close driver
	}

}
