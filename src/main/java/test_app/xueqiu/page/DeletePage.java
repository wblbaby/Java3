package test_app.xueqiu.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DeletePage {
    private AndroidDriver driver;

    public DeletePage(){

    }

    public DeletePage(AndroidDriver driver){
        this.driver = driver;
    }

    public String delete(){
        MobileElement hq = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.RelativeLayout[2]");
        hq.click();
        MobileElement eg = (MobileElement) driver.findElementById("com.xueqiu.android:id/edit_group");
        eg.click();
        MobileElement ca = (MobileElement) driver.findElementById("com.xueqiu.android:id/check_all");
        ca.click();
        MobileElement cf = (MobileElement) driver.findElementById("com.xueqiu.android:id/cancel_follow");
        cf.click();
        MobileElement tr = (MobileElement) driver.findElementById("com.xueqiu.android:id/tv_right");
        tr.click();
        return driver.findElementById("com.xueqiu.android:id/empty_data_desc").getText();
    }
}
