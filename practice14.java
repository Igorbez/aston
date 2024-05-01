import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MTSTests {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Установка пути к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "путь_к_драйверу\\chromedriver.exe");
        // Отключение уведомлений Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
    }

    @Test
    public void testEmptyFieldsMessages() {
        driver.get("https://www.mts.by/");
        
        // Проверка надписей в незаполненных полях для каждого варианта оплаты услуг
        checkEmptyFieldsMessages("Услуги связи");
        checkEmptyFieldsMessages("Домашний интернет");
        checkEmptyFieldsMessages("Рассрочка");
        checkEmptyFieldsMessages("Задолженность");
    }

    private void checkEmptyFieldsMessages(String paymentOption) {
        WebElement paymentOptionDropdown = driver.findElement(By.id("paymentOption"));
        paymentOptionDropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[contains(text(), '" + paymentOption + "')]"));
        option.click();
        
        // Проверка надписей в незаполненных полях
        WebElement phoneNumberField = driver.findElement(By.id("phoneNumber"));
        assert phoneNumberField.getAttribute("placeholder").contains("номер") : "Неверная надпись в поле номера телефона";
        
        // Далее проверить другие поля аналогичным образом
    }

    @Test
    public void testContinueButtonAndDisplayedElements() {
        driver.get("https://www.mts.by/");
        
        // Выбор варианта "Услуги связи"
        WebElement paymentOptionDropdown = driver.findElement(By.id("paymentOption"));
        paymentOptionDropdown.click();
        WebElement servicesOption = driver.findElement(By.xpath("//option[contains(text(), 'Услуги связи')]"));
        servicesOption.click();
        
        // Заполнение полей
        WebElement phoneNumberInput = driver.findElement(By.id("phoneNumber"));
        phoneNumberInput.sendKeys("297777777");
        // Заполнить остальные поля
        
        // Нажать кнопку "Продолжить"
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Продолжить')]"));
        continueButton.click();
        
        // Проверка корректности отображения суммы, номера телефона, иконок платежных систем и надписей в незаполненных полях
        WebElement sumElement = driver.findElement(By.xpath("//div[@class='sum']"));
        assert sumElement.isDisplayed() : "Сумма не отображается";
        
        WebElement phoneNumberElement = driver.findElement(By.xpath("//div[@class='phone']"));
        assert phoneNumberElement.getText().contains("297777777") : "Номер телефона не отображается корректно";
        
        // Далее проверить отображение других элементов аналогичным образом
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
