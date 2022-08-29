package assignment.salesforce;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjSpecMethodSales {
public ChromeDriver driver;
public String excelfile;
@DataProvider(name="testData")
public String[][] fetchdata() throws IOException {
	String[][] readData = SalesforceExcel.salesdata();
	return readData;
}
	@BeforeMethod
	
	public void preCond() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("anju@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@3110");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();

	}
	
	@AfterMethod
	
	public void postCond() {
		
		driver.close();	

	}

}
