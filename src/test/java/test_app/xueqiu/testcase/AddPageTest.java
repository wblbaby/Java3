package test_app.xueqiu.testcase;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import test_app.xueqiu.page.AddPage;
import test_app.xueqiu.page.DeletePage;
import test_app.xueqiu.page.MainPage;
import test_app.xueqiu.page.SearchPage;

import java.net.MalformedURLException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddPageTest {
    static MainPage mainPage;
    static AddPage addPage;
    @BeforeAll
    static void beforeAll() throws MalformedURLException {
        addPage = new MainPage().toAdd();
    }
//    @ParameterizedTest
//    @CsvSource({
//            "alibaba",
//            "jd",
//            "tx"
//    })
    static Stream<String> stringProvider(){
    return Stream.of("alibaba","tx","jd");
}
    @ParameterizedTest
    @MethodSource("stringProvider")
    void add(String param) {
        assertEquals(addPage.search(param).add(),"已添加");
    }

}
