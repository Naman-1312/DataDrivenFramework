package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	WebDriver driver;
	
	@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Admin\\eclipse-workspace\\Testng Datadriven Framework\\KG_DataDriven\\Drivers\\chromedriver.exe");	
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://studentpanel2.testpedia.in/");
}
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
