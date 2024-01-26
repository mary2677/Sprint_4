import org.junit.Test;
import pages.MainList;
import pages.Main_Page;
import pages.Order_Page;
import pages.Rent_page;

import static org.junit.Assert.assertTrue;
public class OrderTest extends BaseTest{
    @Test
    public void OrderingByFirstOrderButton() {

        Main_Page objMainPage = new Main_Page(driver);
        objMainPage.checkBotton();
        objMainPage.clickCookieButton();
        objMainPage.clickFirstOrderButton();

        Order_Page objOderPage = new Order_Page(driver);

        objOderPage.sendClientFirstName("Мария");
        objOderPage.sendClientSecondName("Николаева");
        objOderPage.sendDeliveryAddress("Питер, Кораблестроителей, 56");
        objOderPage.selectMetroStation("Марьина Роща");
        objOderPage.sendDeliveryClientPhoneNumber("555555555555");
        objOderPage.clickNextButton();


        Rent_page objRentPage = new Rent_page(driver);

        objRentPage.sendRentalDate("02.05.2026");
        objRentPage.setRentalTime();
        objRentPage.clickCheckBoxColourBlackPearl();
        objRentPage.sendComment("что то !");
        objRentPage.clickOrderButton();
        objRentPage.clickOrderButtonYes();


        boolean isDisplayed = new Rent_page(driver).isModalOrderWindowDisplayed();
        assertTrue("Ошибка", isDisplayed);
    }

    @Test
    public void sOrderingByFirstrOrderButton() {

        MainList objMainList = new MainList(driver);

        objMainList.scrollPageToEndOfList();

        Main_Page objMainPage = new Main_Page(driver);

        objMainPage.clickCookieButton();
        objMainPage.clickSecondtOrderButton();


        Order_Page objOderPage = new Order_Page(driver);

        objOderPage.sendClientFirstName("Мария");
        objOderPage.sendClientSecondName("Карпова");
        objOderPage.sendDeliveryAddress("Новый, Тереза, 11");
        objOderPage.selectMetroStation("Сокольники");
        objOderPage.sendDeliveryClientPhoneNumber("777777777777");
        objOderPage.clickNextButton();


        Rent_page objRentPage = new Rent_page(driver);

        objRentPage.sendRentalDate("09.05.2025");
        objRentPage.setRentalTime();
        objRentPage.clickCheckBoxColourGreyDespair();
        objRentPage.sendComment("Очень жду!");
        objRentPage.clickOrderButton();
        objRentPage.clickOrderButtonYes();
        boolean isDisplayed = new Rent_page(driver).isModalOrderWindowDisplayed();
        assertTrue("Ошибка...", isDisplayed);
    }
}
