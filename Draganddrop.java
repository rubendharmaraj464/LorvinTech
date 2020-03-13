package demoPacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws Exception {
		
		 System.setProperty("webdriver.chrome.driver","D:\\Ruben\\Lorvin Technologes\\chromedriver_win32\\chromedriver.exe");		  
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");

		 driver.manage().window().maximize();
		 
		 Thread.sleep(5000);
		 driver.switchTo().frame(0);
		 
		 Actions action = new Actions(driver);
		 action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		 
		 
		 //driver.close();

	}

}
