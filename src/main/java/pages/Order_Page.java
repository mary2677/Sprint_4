package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

// элемнеты страницы
public class Order_Page {
    private  WebDriver driver;
    private final By ClientfirstName = By.xpath(".//input[@placeholder='* Имя']");
    private final By ClientLastName = By.xpath(".//input[@placeholder='* Фамилия']");
    private final By deliveryAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By deliveryMetroStation = By.xpath(".//input[@placeholder='* Станция метро']");
    private final By deliveryClientPhoneNumber = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By NextButton = By.xpath(".//button[(@class ='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее')]");

    public Order_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForLoadHeader(){
        new WebDriverWait(driver, Duration.of(5, ChronoUnit.SECONDS))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("ClientLastName")));
    }
    public Order_Page sendClientfirstName(String firstName) {

        driver.findElement(ClientfirstName).sendKeys(firstName);
        return this;
    }
    public Order_Page sendClientFirstName(String firstName) {
        driver.findElement(ClientLastName).sendKeys(firstName);
        return this;
    }
    /** Ввод адреса доставки */
    public Order_Page sendDeliveryAddress(String address) {
        driver.findElement(deliveryAddress).sendKeys(address);
        return this;
    }

    /** Выбор станции метро */
    public Order_Page selectMetroStation(String metroStationFromOrder) {
        driver.findElement(deliveryMetroStation).click();
        driver.findElement(deliveryMetroStation).sendKeys(metroStationFromOrder);
        driver.findElement(deliveryMetroStation).sendKeys(Keys.DOWN,Keys.ENTER);
        return this;
    }

    /** Ввод телефона клиента */
    public Order_Page sendDeliveryClientPhoneNumber(String phoneNumber) {
        driver.findElement(deliveryClientPhoneNumber).sendKeys(phoneNumber);
        return this;
    }

    /** Клик по кнопке "Далее" */
    public Order_Page clickNextButton() {
        driver.findElement(NextButton).click();
        return this;
    }
}
