import Page_Object.FirstPpage;
import Page_Object.TwoPage;
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
        FirstPpage firstPage = new FirstPpage(driver);
        firstPage.clickOrderHeader();
        TwoPage twoPage = new TwoPage(driver);
        twoPage.sendOneForm(name, surname, addres, phone);
        twoPage.clickButtonDalee();
        twoPage.sendTwoForm("02.11.2022", "тут будет комментарий");
        twoPage.clickButtonOrderPopap();
        twoPage.clickButtonYesPopap();
        twoPage.checkOrderComplete();

        driver.quit();

    }

    @Test
    public void testOrderBody() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        FirstPpage firstPage = new FirstPpage(driver);
        firstPage.clickOrderBody();
        TwoPage twoPage = new TwoPage(driver);
        twoPage.sendOneForm(name, surname, addres, phone);
        twoPage.clickButtonDalee();
        twoPage.sendTwoForm("02.11.2022", "тут будет комментарий");
        twoPage.clickButtonOrderPopap();
        twoPage.clickButtonYesPopap();
        twoPage.checkOrderComplete();

        driver.quit();

    }
}

