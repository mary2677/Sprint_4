package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;

public class MainList {

    private static WebDriver driver;
       private static final String[] questionsArray = new String[]{
            "accordion__heading-0",
            "accordion__heading-1",
            "accordion__heading-2",
            "accordion__heading-3",
            "accordion__heading-4",
            "accordion__heading-5",
            "accordion__heading-6",
            "accordion__heading-7"};

    private static final String[] answersArray = new String[]{
            "accordion__panel-0",
            "accordion__panel-1",
            "accordion__panel-2",
            "accordion__panel-3",
            "accordion__panel-4",
            "accordion__panel-5",
            "accordion__panel-6",
            "accordion__panel-7"};

    public MainList(WebDriver driver){
        this.driver = driver;
    }

    //Прокрутка главной страницы до последнего элемента списка
    public MainList scrollPageToEndOfList() {
        WebElement lastQuestionArrow = driver.findElement(By.id(questionsArray[7]));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastQuestionArrow);
        return this;
    }
    /** Клик по стрелке выпадающего списка */
    public static void clickQuestionArrow(int questionNumber) {
        // new WebDriverWait(driver, 3)
        //        .until(ExpectedConditions.elementToBeClickable(By.id(questionsArray[questionNumber])));
        driver.findElement(By.id(questionsArray[questionNumber])).click();
    }
    /** Проверка текста в открытой панели */
    public static void checkTextInOpenPanel(String expectedText, int answerNumber) {
         new WebDriverWait(driver, Duration.of(5, ChronoUnit.SECONDS))
               .until(ExpectedConditions.visibilityOfElementLocated(By.id(answersArray[answerNumber])));
        String answerText = driver.findElement(By.id(answersArray[answerNumber])).getText();
        assertEquals(expectedText, answerText);
    }


    /** Клик по кнопке вопроса */
   /*  public Main_Page clickQuestionButton(String questionButtonLocator) {
        //   new WebDriverWait(driver, 5)
        //          .until(ExpectedConditions.elementToBeClickable(By.id(questionButtonLocator)));
        driver.findElement(By.id(questionButtonLocator)).click();
    }*/

}
