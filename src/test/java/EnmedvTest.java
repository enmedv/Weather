import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnmedvTest {
    // Задание 1.
    // TC_11_01
    // 1.  Открыть базовую ссылку
    // 2.  Нажать на пункт меню Guide
    // 3.  Подтвердить, что вы перешли на страницу со ссылкой https://openweathermap.org/guide
    // и что title этой страницы OpenWeatherMap API guide - OpenWeatherMap

//    @Test
//    public void testH1_WhenClickBottomGuide() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "/Applications/ChromeDriver/chromedriver");
//        WebDriver driverTask1 = new ChromeDriver();
//
//         // Arrange
//        String url1 = "https://openweathermap.org/";
//        String expectedResult1 = "Guide";
//
//        // Act
//     driverTask1.get(url1);
//     Thread.sleep(5000);
//     WebElement searchButtonGuide = driverTask1.findElement(
//             By.xpath("//div[@id = 'desktop-menu']//li//a[@href = '/guide']")
//     );
//
//     searchBottomGuide.click();
//
//     WebElement h1GuideTitle = driverTask1.findElement(
//             By.xpath("//main[@class = 'wrapper']//h1[@class = 'breadcrumb-title']")
//     );
//
//     Thread.sleep(2000);
//     String actualResult1 = h1GuideTitle.getText();
//
//     Assert.assertEquals(actualResult1, expectedResult1);
//
//     driverTask1.quit();
//}

    // Задание 2
    // 1.  Открыть базовую ссылку
    // 2.  Нажать на единицы измерения Imperial: °F, mph
    // 3.  Подтвердить, что температура для города показана в Фарингейтах

//    @Test
//    public void testDivTag_WhenChangeTemperatureUnits() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "/Applications/ChromeDriver/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        //Arrange
//        String url = "https://openweathermap.org/";
//        String expectedResult = "Imperial: °F, mph";
//
//        // Act
//        driver.get(url);
//        Thread.sleep(5000);
//        WebElement searchButtonTemperatureUnits = driver.findElement(
//                By.xpath("//div[@id = 'weather-widget']//div[text() = 'Imperial: °F, mph']")
//        );
//
//        searchBottomTemperatureUnits.click();
//
//        Thread.sleep(2000);
//        String actualResult = searchBottomTemperatureUnits.getText();
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//        driver.quit();
//    }

    // Задание 3
    // 1. Открыть базовую ссылку
    // 2. Подтвердить, что внизу страницы есть панель с текстом
    // “We use cookies which are essential for the site to work.
    // We also use non-essential cookies to help us improve our services. Any data collected is anonymised.
    // You can allow all cookies or manage them individually.”
    // 3. Подтвердить, что на панели внизу страницы есть 2 кнопки “Allow all” и “Manage cookies”

    @Test
    public void test_WhenConfirmTextAboutCookies() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/ChromeDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Arrange
        String url = "https://openweathermap.org/";
        String expectedResult1 = "We use cookies which are essential for the site to work. We also use non-essential cookies to help us improve our services. Any data collected is anonymised. You can allow all cookies or manage them individually.";
        String expectedResult2 = "Allow all";
        String expectedResult3 = "Manage cookies";

        driver.get(url);
        Thread.sleep(5000);
        WebElement searchPanelWithCookies = driver.findElement(
                By.xpath("//div[@id = 'stick-footer-panel']//p[@class = 'stick-footer-panel__description']")
        );

//        searchPanelWithCookies.click();
        Thread.sleep(2000);

        WebElement searchButtonAllowAll = driver.findElement(
                By.xpath("//div[@id = 'stick-footer-panel']//button[text() = 'Allow all']")
        );
//        searchButtonAllowAll.click();

        Thread.sleep(2000);

        WebElement searchButtonManageCookies = driver.findElement(
                By.xpath("//div[@id = 'stick-footer-panel']//a[@href = '/cookies-settings']")
        );
//        searchButtonManageCookies.click();
        Thread.sleep(5000);

        String actualResult1 = searchPanelWithCookies.getText();
        String actualResult2 = searchButtonAllowAll.getText();
        String actualResult3 = searchButtonManageCookies.getText();

        Assert.assertEquals(actualResult1, expectedResult1);
        Assert.assertEquals(actualResult2, expectedResult2);
        Assert.assertEquals(actualResult3, expectedResult3);

        driver.quit();
    }

    // Задание 4.
    // 1.  Открыть базовую ссылку
    // 2.  Подтвердить, что в меню Support есть 3 подменю с названиями “FAQ”,
    //     “How to start” и “Ask a question”

    @Test
    public void test_WhenConfirmInMenuSupportThreeButton() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Applications/ChromeDriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "https://openweathermap.org/";
        String expectedResult1 = "FAQ";
        String expectedResult2 = "How to start";
        String expectedResult3 = "Ask a question";

        driver.get(url);
        Thread.sleep(5000);

        WebElement searchMenuSupport = driver.findElement(
                By.xpath("//div[@id = 'support-dropdown']")
        );
        searchMenuSupport.click();

        WebElement searchButtonFAQ = driver.findElement(
                By.xpath("//ul[@class = 'dropdown-menu dropdown-visible']//a[@href = '/faq']")
        );

        WebElement searchButtonHowToStart = driver.findElement(
                By.xpath("//ul[@class = 'dropdown-menu dropdown-visible']//a[text() = 'How to start']")
        );

        driver.quit();
    }

}
