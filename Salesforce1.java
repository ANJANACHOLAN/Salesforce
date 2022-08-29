package assignment.salesforce;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Salesforce1 extends ProjSpecMethodSales{
@Test	
public void sales() throws InterruptedException {
	
Thread.sleep(5000);	
driver.findElement(By.xpath("//div[contains(@class,'slds-form-element__control slds-grow')]//input[1]")).sendKeys("Individuals");
driver.findElement(By.xpath("//lightning-formatted-rich-text[@class='slds-rich-text-editor__output']//mark")).click();
driver.findElement(By.xpath("//div[text()='New']")).click();
driver.findElement(By.xpath("//a[@class='select']")).click();
driver.findElement(By.xpath("(//li[@class='uiMenuItem uiRadioMenuItem']//a)[3]")).click();
driver.findElement(By.xpath("//input[contains(@class, 'lastName compoundBLRadius')]")).sendKeys("Cholan");
driver.findElement(By.xpath("//button[@title='Save']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[@class='slds-button slds-show']")).click();
driver.findElement(By.xpath("//button[@class='slds-button']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Customers");
driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("(//li[@class='slds-button slds-button--neutral']//a)[1]")).click();
driver.findElement(By.xpath("//div[@class='autocompleteWrapper slds-grow']//input")).sendKeys("cholan");
String text = driver.findElement(By.xpath("(//div[@title='Cholan']//mark)[1]")).getText();

if(text.equalsIgnoreCase("cholan")) {
	
	System.out.println("Name appears");
}
else {
	System.out.println("Name doesn't appear");
	
}

}


}


