import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.Main_Page;
import pages.Order_Page;
import pages.Rent_page;
import org.junit.Test;


import static org.junit.Assert.assertTrue;
public class OrderTest extends BaseTest{
    @Test
    public void OrderingByFirstOrderButton() {

        Main_Page objMainPage = new Main_Page(driver);
        objMainPage.checkBotton();
        objMainPage.clickCookieButton();
        objMainPage.clickFirstOrderButton();

        new Order_Page(driver)
                .sendClientFirstName("Мария")
                .sendClientfirstName("тест")
                .sendDeliveryAddress("Питер, Кораблестроителей, 56")
                .selectMetroStation("Марьина Роща")
                .sendDeliveryClientPhoneNumber("555555555555")
                .clickNextButton();

        boolean isDisplayed = new Rent_page(driver)
                .sendRentalDate("02.05.2026")
                .setRentalTime()
                .clickCheckBoxColourBlackPearl()
                .sendComment("что то !")
                .clickOrderButton()
                .clickOrderButtonYes()
                .isModalOrderWindowDisplayed();
        assertTrue("Ой-вей! Окно заказа не появилось? Ну, таки, и я уже передумал...", isDisplayed);
    }
    @Test
    public void sOrderingByFirstrOrderButton() {
        new Main_Page(driver)
                //.openSite()
               // .clickCookieButton()
                .clickSecondtOrderButton();

        new Order_Page(driver)
                .sendClientFirstName("Мария")
                .sendClientfirstName("Шлимансон")
                .sendDeliveryAddress("Москва, Образцова, 11")
                .selectMetroStation("Марьина Роща")
                .sendDeliveryClientPhoneNumber("83223223322")
                .clickNextButton();

        boolean isDisplayed = new Rent_page(driver)
                .sendRentalDate("28.03.2025")
                .setRentalTime()
                .clickCheckBoxColourBlackPearl()
                .sendComment("Таки не поцарапайте мне аппарат, я вас прошу!")
                .clickOrderButton()
                .clickOrderButtonYes()
                .isModalOrderWindowDisplayed();
        assertTrue("Ой-вей! Окно заказа не появилось? Ну, таки, и я уже передумал...", isDisplayed);
    }
}
