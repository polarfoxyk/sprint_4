import Page_Object.First_page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//public class Test_Orders {

@RunWith(Parameterized.class)
public class Test_Orders {
    private final String name;
    private final String surname;
    private final String addres;
    private final String phone;


    public Test_Orders(String name, String surname, String addres, String phone) {
        this.name = name;
        this.surname = surname;
        this.addres = addres;
        this.phone = phone;

    }

    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Иван", "Иванов", "Улица улица 2", "89026547898"},
                {"Петр", "Петров", "Улица улица 2", "89026540000"},
        };
    }


    @Test
    public void testOrderHeader() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        First_page first_page = new First_page(driver);
        first_page.clickOrderHeader();
        first_page.sendOneForm(name, surname, addres, phone);
        first_page.clickButtonDalee();
        first_page.sendTwoForm("02.11.2022", "тут будет комментарий");
        first_page.clickButtonOrderPopap();
        first_page.clickButtonYesPopap();
        first_page.checkOrderComplete();

        driver.quit();

    }

    @Test
    public void testOrderBody() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        First_page first_page = new First_page(driver);
        first_page.clickOrderBody();
        first_page.sendOneForm(name, surname, addres, phone);
        first_page.clickButtonDalee();
        first_page.sendTwoForm("02.11.2022", "тут будет комментарий");
        first_page.clickButtonOrderPopap();
        first_page.clickButtonYesPopap();
        first_page.checkOrderComplete();

        driver.quit();

    }
}

