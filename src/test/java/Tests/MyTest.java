package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by DELL on 3/26/2017.
 */

@Description("This is an example test suite")
public class MyTest extends BaseTest {


    @Title("Failing test")
    @Test(description = "Login Test")
    public void testTest() throws Exception {
        app.login.login("mytest_test", "337774a");
        Assert.assertEquals(app.afterLogin.getMailUser(), "mytest_test@mail.ru", "Error ");

    }


}
