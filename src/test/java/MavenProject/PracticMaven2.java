package MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticMaven2 {
	WebDriver driver;
	String URL=System.getProperty("url");
	@Test
	public void launch()
	{
	
		driver= new ChromeDriver();
		driver.get(URL);
	}
	
	
}
