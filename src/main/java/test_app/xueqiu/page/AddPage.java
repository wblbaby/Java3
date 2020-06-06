package test_app.xueqiu.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AddPage {
    private AndroidDriver driver;
    private By nameLocator = By.id("name");

    public AddPage(){

    }

    public AddPage(AndroidDriver driver){
        this.driver = driver;
    }

    public AddPage search(String keyword){
        MobileElement el5 = (MobileElement)driver.findElementById("com.xueqiu.android:id/search_input_text");
        el5.sendKeys(keyword);
        return this;
    }

    public String add(){
        driver.findElement(nameLocator).click();
        MobileElement el9 = (MobileElement) driver.findElementById("com.xueqiu.android:id/follow_btn");
        el9.click();
        return driver.findElement(By.id("followed_btn")).getText();
    }
}
