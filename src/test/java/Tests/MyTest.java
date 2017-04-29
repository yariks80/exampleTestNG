package Tests;

import Pages.LoginPage;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by DELL on 3/26/2017.
 */

@Description("This is an example test suite")
public class MyTest extends BaseTest {
    Logger logger = Logger.getLogger("MYTest");
    LoginPage loginPage;
    @BeforeClass
    public void beforeClassMyTest() throws Exception {
        loginPage= new LoginPage(driver);

    }
    @Title("Failing test")
    @Test(description = "Login Test")
    public void testTest() throws Exception {


      String actual = loginPage.login("mytest_test","337774a").getMailUser();
      logger.info("actual - " + actual);

       Assert.assertEquals(actual,"mytest_test@mail.ru","Error ");

    }


}
