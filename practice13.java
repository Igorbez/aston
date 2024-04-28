import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

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
    public void testBlockTitle() {
        driver.get("https://www.mts.by/");
        WebElement block = driver.findElement(By.xpath("//div[@class='homepage-replenishment']"));
        WebElement title = block.findElement(By.tagName("h2"));
        String titleText = title.getText();
        // Проверка названия блока
        assert titleText.equals("Онлайн пополнение без комиссии") : "Название блока не соответствует ожидаемому";
    }

    @Test
    public void testPaymentSystemLogos() {
        driver.get("https://www.mts.by/");
        WebElement block = driver.findElement(By.xpath("//div[@class='homepage-replenishment']"));
        List<WebElement> logos = block.findElements(By.tagName("img"));
        // Проверка наличия логотипов платежных систем
        assert logos.size() > 0 : "Логотипы платежных систем не найдены";
    }

    @Test
    public void testMoreAboutServiceLink() {
        driver.get("https://www.mts.by/");
        WebElement block = driver.findElement(By.xpath("//div[@class='homepage-replenishment']"));
        WebElement link = block.findElement(By.partialLinkText("Подробнее о сервисе"));
        // Проверка работы ссылки "Подробнее о сервисе"
        link.click();
        String currentUrl = driver.getCurrentUrl();
        assert currentUrl.contains("details") : "Ссылка 'Подробнее о сервисе' не открывает ожидаемую страницу";
    }

    @Test
    public void testContinueButton() {
        driver.get("https://www.mts.by/");
        WebElement phoneNumberInput = driver.findElement(By.id("phoneNumber"));
        phoneNumberInput.sendKeys("297777777");
        WebElement servicesDropdown = driver.findElement(By.id("services"));
        servicesDropdown.click();
        WebElement servicesOption = driver.findElement(By.xpath("//option[@value='service']"));
        servicesOption.click();
        WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
        // Проверка работы кнопки "Продолжить"
        continueButton.click();
        String currentUrl = driver.getCurrentUrl();
        assert currentUrl.contains("confirmation") : "Кнопка 'Продолжить' не выполняет ожидаемое действие";
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
