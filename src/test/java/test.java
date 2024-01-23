
package Locator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;


//import static sun.security.util.KnownOIDs.EC;

public class test {
    private static final String URL_MAIN = "https://qa-scooter.praktikum-services.ru/";
    private WebDriver webDriver;

    @Before
    public void setUp() throws Exception {
        // set up the webDriver defined upper in class-level
        webDriver = new ChromeDriver();
        // we're going to navigate in every test to the Google's search page
        webDriver.navigate().to(URL_MAIN);
    }

    @After
    public void tearDown() throws Exception {
        // we're not forgetting about closing the webdriver after every test
        webDriver.close();
    }
    @Test
    public void testTest() {

       WebDriver driver = new ChromeDriver();
       driver.get(URL_MAIN);
        driver.findElement(By.id("rcc-confirm-button")).click();
        new WebDriverWait(driver, Duration.of(5, ChronoUnit.SECONDS));

       // driver.findElement(By.className("accordion")).
       //         wait.until(EC.vibility_of_element_located("accordion"));

        driver.findElement(By.className("Button_Button__ra12g")).click();
        new WebDriverWait(driver, Duration.of(5, ChronoUnit.SECONDS))


                .until(ExpectedConditions.elementToBeClickable(By.tagName("button")));
        //driver.findElement(By.id("accordion__heading-0")).click();
        final String expectedPageTitle = "Для кого самокат";
        //assertThat(webDriver.getTitle()).isEqualTo(expectedPageTitle);
        driver.findElement(By.xpath(".//input[@placeholder='* Имя']")).sendKeys("Мария");
        driver.findElement(By.xpath(".//input[@placeholder='* Фамилия']")).sendKeys("Карпова");
        driver.findElement(By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']")).sendKeys("Ереван");
        // private void selectMetroFromOptions(String mesto){
        //    final String metroOptionTemplate = ".//div[@class='select-search__select']//*[text()='%s']";
        //    driver.findElement(By.xpath("//input[@placeholder='* Станция метро']")).click();
        // }

        driver.findElement(By.linkText("Щёлковская")).click();
        //driver.findElement(By.xpath(".//*[text()='Щёлковская']")).click();
        driver.findElement(By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']")).sendKeys("12345678922");
        driver.findElement(By.xpath("//button[text()='Далее']")).click();
        //String text = driver.findElement(By.className("haccordion__panel-0")).getText();
        //System.out.println("Текст кнопки: " + text);
        //driver.quit();
    }

}
