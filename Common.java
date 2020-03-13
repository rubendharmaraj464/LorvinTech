package demoPacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver","D:\\Ruben\\Lorvin Technologes\\chromedriver_win32\\chromedriver.exe"); 

        WebDriver driver=new ChromeDriver(); 

        driver.navigate().to("http://www.javatpoint.com/"); 

  

  //Maximize the browser 

   driver.manage().window().maximize(); 

   Thread.sleep(5000);

   driver.findElement(By.id("gs_tti50")).click();

	}
	
	public void Print()
	{
		System.out.print("Called common Succesfully");
		//code
		//code
	}

	public void update()
	{
		System.out.print("Called common Succesfully");
		//code
		//code
	}
	

}
