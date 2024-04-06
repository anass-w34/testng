package example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class NewTest {
private ChromeDriver driver;
@Test
public void testYouTubeTitle() {
driver.get(&quot;https://www.youtube.com/&quot;);
String title = driver.getTitle();
Assert.assertTrue(title.contains(&quot;YouTube&quot;));
}
@BeforeTest
public void beforeTest() {
String chromeDriverPath = &quot;src/Driver/chromedriver.exe&quot;;
System.setProperty(&quot;webdriver.chrome.driver&quot;, chromeDriverPath);

// Initialize ChromeDriver
ChromeOptions options = new ChromeOptions();
options.addArguments(&quot;--remote-allow-origins=*&quot;);
driver = new ChromeDriver(options);
}
@AfterTest
public void afterTest() {
driver.quit();
}
}