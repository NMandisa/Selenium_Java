package za.co.fynbos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	//public static void main( String[] args )
    //{
	@Test
	public void firstTest()
	{
        System.out.println( "Hello World!" );
        WebDriver driver = new FirefoxDriver();// what opens up selenium
        driver.get("https://localhost:8080/website/sign.vpd");//our test website
        
        WebElement element = driver.findElement(By.id("usernameInput"));//find a textbox there
        element.sendKeys("admin");
        
        element = driver.findElement(By.id("passwordInput"));
        element.sendKeys("test");
        
        element = driver.findElement(By.name("submit"));
        element.click();
        
        System.out.println("Test Completed");
    
    }
}
