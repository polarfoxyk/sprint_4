import Page_Object.FirstPpage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tests_Quests {

    @Test
    public void questOneTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        FirstPpage firstPpage = new FirstPpage(driver);
        firstPpage.checkQuestOne();

        driver.quit();

    }

    @Test
    public void questTwoTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        FirstPpage firstPpage = new FirstPpage(driver);
        firstPpage.checkQuestTwo();

        driver.quit();

    }

    @Test
    public void questTwoThree() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        FirstPpage firstPage = new FirstPpage(driver);
        firstPage.checkQuestThree();

        driver.quit();

    }

    @Test
    public void questTwoFour() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        FirstPpage firstPage = new FirstPpage(driver);
        firstPage.checkQuestFour();

        driver.quit();

    }

    @Test
    public void questTwoFive() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        FirstPpage firstPage = new FirstPpage(driver);
        firstPage.checkQuestFive();

        driver.quit();

    }

    @Test
    public void questTwoSix() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        FirstPpage firstPage = new FirstPpage(driver);
        firstPage.checkQuestSix();

        driver.quit();

    }

    @Test
    public void questTwoSeven() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        FirstPpage firstPage = new FirstPpage(driver);
        firstPage.checkQuestSeven();

        driver.quit();

    }

    @Test
    public void questTwoEight() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        FirstPpage firstPage = new FirstPpage(driver);
        firstPage.checkQuestEight();

        driver.quit();

    }


}