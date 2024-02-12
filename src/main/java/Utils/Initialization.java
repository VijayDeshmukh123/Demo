package Utils;



import static com.absli.APIData.ApiData.CreatLead_AxisBank;
import static com.absli.base.BasePage.getDriver;
import static com.absli.base.BasePage.setDriver;

import java.io.IOException;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import com.absli.APIData.ApiData;
import com.absli.base.BasePage;
import com.absli.utils.PropertiesUtils;


    public class Initialization {
        static String url;
        static PropertiesUtils prop;

        public void initialization(WebDriver driver, HashMap<String, String> testData,String LeadID,String Plan,String FirstName,String LastName,String Gender,String PhoneNO,String PanNo) throws InterruptedException, IOException {

            String url=CreatLead_AxisBank(testData,LeadID,Plan,FirstName,LastName,Gender,PhoneNO,PanNo);
            System.out.println(url);
            BasePage.setDriver();
            Thread.sleep(3000);
            Thread.sleep(3000);

            System.out.println("Browser setup by Thread " + Thread.currentThread().getId() + " and Driver reference is : " + BasePage.getDriver());
            getDriver().get(url);
            Thread.sleep(3000);
            Thread.sleep(3000);
            System.out.println("Title printed by Thread " + Thread.currentThread().getId() + " - " + BasePage.getDriver().getTitle() + " on driver reference " + BasePage.getDriver());
            BasePage.getDriver().manage().deleteAllCookies();
            BasePage.getDriver().manage().window().maximize();
            Thread.sleep(3000);



        }




    }



