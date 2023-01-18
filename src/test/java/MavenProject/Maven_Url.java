package MavenProject;

import org.testng.annotations.Test;

public class Maven_Url {
	@Test
	public void CreateTest()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PW = System.getProperty("password");
		
		
	System.out.println(BROWSER);
	System.out.println(URL);
	System.out.println(USERNAME);
	System.out.println(PW);




	

	}
}