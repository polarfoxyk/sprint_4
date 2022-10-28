package Page_Object;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.startsWith;


public class First_page {

    private WebDriver driver;

    //Переход на страницу
    //private By Page = driver.get("https://qa-scooter.praktikum-services.ru/");


    // вопросы о важном, 1 пункт выпадаха
    private By QuestOne = By.id("accordion__heading-0");
    // вопросы о важном, 1 пункт текст
    private By AnswerOne = By.id("accordion__panel-0");
    // вопросы о важном, 2 пункт выпадаха
    private By QuestTwo = By.id("accordion__heading-1");
    // вопросы о важном, 2 пункт текст
    private By AnswerTwo = By.id("accordion__panel-1");
    // вопросы о важном, 3 пункт выпадаха
    private By QuestThree = By.id("accordion__heading-2");
    // вопросы о важном, 3 пункт текст
    private By AnswerThree = By.id("accordion__panel-2");
    // вопросы о важном, 4 пункт выпадаха
    private By QuestFour = By.id("accordion__heading-3");
    // вопросы о важном, 4 пункт текст
    private By AnswerFour = By.id("accordion__panel-3");
    // вопросы о важном, 5 пункт выпадаха
    private By QuestFive = By.id("accordion__heading-4");
    // вопросы о важном, 5 пункт текст
    private By AnswerFive = By.id("accordion__panel-4");
    // вопросы о важном, 6 пункт выпадаха
    private By QuestSix = By.id("accordion__heading-5");
    // вопросы о важном, 6 пункт текст
    private By AnswerSix = By.id("accordion__panel-5");
    // вопросы о важном, 7 пункт выпадаха
    private By QuestSeven = By.id("accordion__heading-6");
    // вопросы о важном, 7 пункт текст
    private By AnswerSeven = By.id("accordion__panel-6");
    // вопросы о важном, 8 пункт выпадаха
    private By QuestEight = By.id("accordion__heading-7");
    // вопросы о важном, 8 пункт текст
    private By AnswerEight = By.id("accordion__panel-7");
    // кнопка "Заказать" внизу страницы"
    private By ButtonZakazBody = By.className("Button_UltraBig__UU3Lp");
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

    public First_page(WebDriver driver) {
        this.driver = driver; // Инициализировали в нём поле driver
    }

    public void checkQuestOne() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonZakazHeader));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(QuestOne));
        driver.findElement(QuestOne).click();
        String text = driver.findElement(AnswerOne).getText();
        MatcherAssert.assertThat("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", containsString(text));
    }

    ;

    public void checkQuestTwo() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonZakazHeader));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(QuestTwo));
        driver.findElement(QuestTwo).click();
        String text = driver.findElement(AnswerTwo).getText();
        MatcherAssert.assertThat("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", containsString(text));
    }

    ;

    public void checkQuestThree() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonZakazHeader));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(QuestThree));
        driver.findElement(QuestThree).click();
        String text = driver.findElement(AnswerThree).getText();
        MatcherAssert.assertThat("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.\n" +
                "\n.", containsString(text));
    }

    public void checkQuestFour() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonZakazHeader));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(QuestFour));
        driver.findElement(QuestFour).click();
        String text = driver.findElement(AnswerFour).getText();
        MatcherAssert.assertThat("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", containsString(text));
    }

    public void checkQuestFive() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonZakazHeader));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(QuestFive));
        driver.findElement(QuestFive).click();
        String text = driver.findElement(AnswerFive).getText();
        MatcherAssert.assertThat("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", containsString(text));
    }

    public void checkQuestSix() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonZakazHeader));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(QuestSix));
        driver.findElement(QuestSix).click();
        String text = driver.findElement(AnswerSix).getText();
        MatcherAssert.assertThat("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", containsString(text));
    }

    public void checkQuestSeven() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonZakazHeader));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(QuestSeven));
        driver.findElement(QuestSeven).click();
        String text = driver.findElement(AnswerSeven).getText();
        MatcherAssert.assertThat("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", containsString(text));
    }

    public void checkQuestEight() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonZakazHeader));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(QuestEight));
        driver.findElement(QuestEight).click();
        String text = driver.findElement(AnswerEight).getText();
        MatcherAssert.assertThat("Да, обязательно. Всем самокатов! И Москве, и Московской области.", containsString(text));
    }

    public void clickOrderHeader(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonZakazHeader));
        driver.findElement(ButtonZakazHeader).click();
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

    public void clickButtonDalee(){
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

    public void clickButtonOrderPopap(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonOrderPopap));
        driver.findElement(ButtonOrderPopap).click();

}

    public void clickButtonYesPopap(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonYesPopap));
        driver.findElement(ButtonYesPopap).click();

    }

    public  void checkOrderComplete(){
        String text = driver.findElement(OrderComplete).getText();
        MatcherAssert.assertThat(text, startsWith("Заказ оформлен"));

    }
    public void clickOrderBody(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(ButtonZakazHeader));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(ButtonZakazBody));
        driver.findElement(ButtonZakazBody).click();
    }


}
