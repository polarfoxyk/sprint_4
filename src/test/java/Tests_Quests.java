import Page_Object.First_page;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tests_Quests {

    @Test
    public void questOneTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        First_page first_page = new First_page(driver);
        first_page.checkQuestOne();

        driver.quit();

    }

    @Test
    public void questTwoTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        First_page first_page = new First_page(driver);
        first_page.checkQuestTwo();

        driver.quit();

    }

    @Test
    public void questTwoThree() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        First_page first_page = new First_page(driver);
        first_page.checkQuestThree();

        driver.quit();

    }

    @Test
    public void questTwoFour() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        First_page first_page = new First_page(driver);
        first_page.checkQuestFour();

        driver.quit();

    }

    @Test
    public void questTwoFive() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        First_page first_page = new First_page(driver);
        first_page.checkQuestFive();

        driver.quit();

    }

    @Test
    public void questTwoSix() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        First_page first_page = new First_page(driver);
        first_page.checkQuestSix();

        driver.quit();

    }

    @Test
    public void questTwoSeven() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        First_page first_page = new First_page(driver);
        first_page.checkQuestSeven();

        driver.quit();

    }

    @Test
    public void questTwoEight() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        First_page first_page = new First_page(driver);
        first_page.checkQuestEight();

        driver.quit();

    }


}