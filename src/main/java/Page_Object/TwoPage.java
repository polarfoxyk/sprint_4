package Page_Object;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.startsWith;

public class TwoPage {
    private WebDriver driver;
    // кнопка "Заказать" в шапке
    private By ButtonZakazHeader = By.cssSelector(".Header_Nav__AGCXC>.Button_Button__ra12g");

    //форма заказа:
    //Имя
    private By Name = By.xpath(".//input[@placeholder = '* Имя']");
    //Фамилия
    private By Surname = By.xpath(".//input[@placeholder = '* Фамилия']");
    //Адрес
    private By Address = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    //Метро
    private By Underground = By.xpath(".//input[@placeholder = '* Станция метро']");
    //Телефон
    private By Phone = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    //Кнопка "Далее"
    private By ButtonDalee = By.className("Button_Middle__1CSJM");

    //форма заказа 2 страница:
    //Дата
    private By Date = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    //Срок
    private By Term = By.className("Dropdown-placeholder");
    //Цвет черный
    private By ColorBlack = By.id("black");
    //Комментарий
    private By Comment = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    //кнопка "Заказать"
    private By ButtonOrderPopap = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");

    //Попап подтверждения:
    //Кнопка "Да"
    private By ButtonYesPopap = By.xpath(".//button[text()='Да']");
    //Попап Заказ оформлен:
    //Текст "Заказ оформлен"
    private By OrderComplete = By.className("Order_ModalHeader__3FDaJ");

    public TwoPage(WebDriver driver) {
        this.driver = driver; // Инициализировали в нём поле driver
    }

    public void sendOneForm(String name, String surname, String addres, String phone) {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonZakazHeader));
        driver.findElement(Name).sendKeys(name);
        driver.findElement(Surname).sendKeys(surname);
        driver.findElement(Address).sendKeys(addres);
        driver.findElement(Phone).sendKeys(phone);
        driver.findElement(Underground).click();
        driver.findElement(By.className("select-search__select")).click();

    }

    public void clickButtonDalee() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonZakazHeader));
        driver.findElement(ButtonDalee).click();

    }

    public void sendTwoForm(String date, String comment) {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonZakazHeader));
        driver.findElement(Date).sendKeys(date);
        driver.findElement(Date).sendKeys(Keys.ENTER);
        driver.findElement(Term).click();
        driver.findElement(By.className("Dropdown-menu")).click();
        driver.findElement(ColorBlack).click();
        driver.findElement(Comment).sendKeys(comment);
    }

    public void clickButtonOrderPopap() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonOrderPopap));
        driver.findElement(ButtonOrderPopap).click();

    }

    public void clickButtonYesPopap() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonYesPopap));
        driver.findElement(ButtonYesPopap).click();

    }

    public void checkOrderComplete() {
        String text = driver.findElement(OrderComplete).getText();
        MatcherAssert.assertThat(text, startsWith("Заказ оформлен"));


    }
}