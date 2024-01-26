import org.openqa.selenium.WebDriver;
import pages.Main_Page;
import org.junit.Test;
import pages.Order_Page;


public class SecondTesk extends BaseTest{
   @Test public void checkLogo() {

        Main_Page objMainPage = new Main_Page(driver);

        objMainPage.clickCookieButton();
        objMainPage.clickFirstOrderButton();

        Order_Page objOderPage = new Order_Page(driver);
        objOderPage.clickLogo();

        objMainPage.checkBotton();
    }
    @Test public void checkLogoYandex() {
        Main_Page objMainPage = new Main_Page(driver);
        objMainPage.clickCookieButton();
        objMainPage.clickLogoYandex();

    }
}
