package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Элементы главной страницы
public class Main_Page {

    private static WebDriver driver;



    // локаторы главной страницы
    private By cookieButton = By.id("rcc-confirm-button");  // сообщение о кукисах
    private By firstOrderButton = By.className("Button_Button__ra12g"); //первая кнопка заказать
    private By secondOrderButton = By.className("Home_FinishButton__1_cWm"); //вторая кнопка

    public Main_Page(WebDriver driver) {
        Main_Page.driver = driver;
    }

    // метод проверяет, активна ли кнопка «Заказать»
    public boolean checkBotton() {
        return driver.findElement(firstOrderButton).isEnabled();
    }

    // Кликнуть по кнопке по первой кнопке куки
    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }

    // Кликнуть по кнопке по первой кнопке заказа
    public void clickFirstOrderButton() {
        driver.findElement(firstOrderButton).click();
    }

    // Кликнуть по кнопке ро второй кнопке заказа
    public void clickSecondtOrderButton() {
        driver.findElement(secondOrderButton).click();
    }
}
