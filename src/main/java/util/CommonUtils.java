package util;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.absli.base.TestBase;
import org.openqa.selenium.interactions.Actions;
import io.qameta.allure.Allure;

public class CommonUtils extends TestBase {
	
	
	public static void clickButton(WebDriver driver,WebElement Element_Name) throws Exception
	{
		try
		{
			wait.waitForElementToBeVisibleweb( getDriver(), Element_Name, 5,"time out to find element on page");
			if(Element_Name.isDisplayed()) {
				Element_Name.click();
	            Allure.step( "Click on Element"+Element_Name.getText());
	        }else {
	            System.out.println( "Element is no visible");
	        }
			
			
		}
		catch(Throwable t)
		{ 
			
			t.printStackTrace();
			throw new Exception("Element Not Present");
		}
	}

    //Method to click on the button/Icon
    public static void Click(WebElement element) {
       // BasicConfigurator.configure();
        //WaitUtils.fluentWaitForElement(getDriver(), element, 30, 2);
        if (element.isDisplayed()) {
            Actions actions = new Actions(getDriver());
            actions.click(element).perform();
           // logger.info("DOM element clicked");
            Allure.step("DOM element clicked");
        } else {
            Allure.step("DOM element is not clicked");
            //logger.error("DOM element is not clicked");
        }

    }
	public static void EnterText(WebDriver driver, WebElement ele, String sValue) throws Exception {
		wait.waitForElementToBeVisibleweb( getDriver(), ele, 5,"time out to find element on page");
		Actions actions = new Actions(driver);
		try
		{
			if(ele.isDisplayed()) {
			actions.moveToElement(ele);
			actions.click();
			actions.sendKeys(sValue);
			actions.build().perform();
			 Allure.step( "Enter Values As  >"   +sValue);
			}
			// Allure.step(Element_Name+" Entered",sValue + " entered in "+ Element_Name);
		}  catch(Throwable t)
		{ 
			// Allure.step(Element_Name+" does not Exist",Element_Name+" does not Exist", screenName);
			t.printStackTrace();
			throw new Exception("Element Not Present");
		}


	}
	
	 public static int calculateAge(Date birthDate) {
	       
	        // Get the current date
	        Date currentDate = new Date();

	        // Calculate the difference in years
	        int age = currentDate.getYear() - birthDate.getYear();

	        // Adjust for leap years
	        if (birthDate.getMonth() > currentDate.getMonth() ||
	                (birthDate.getMonth() == currentDate.getMonth() && birthDate.getDay() > currentDate.getDay())) {
	            age--;
	        }

	        return age;
	    }


}
