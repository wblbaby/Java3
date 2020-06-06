package test_app.xueqiu.testcase;

import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import test_app.xueqiu.page.DeletePage;
import test_app.xueqiu.page.MainPage;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeletePageTest {
    static MainPage mainPage;
    static DeletePage deletePage;
    @BeforeAll
    static void beforeAll() throws MalformedURLException {
        deletePage = new MainPage().toDelete();
    }

    @Test
    void delete(){
        assertEquals(deletePage.delete(),"该分组暂无股票");
//        MobileElement ac = (MobileElement) driver.findElementById("com.xueqiu.android:id/action_close");
//        ac.click();
    }
}
