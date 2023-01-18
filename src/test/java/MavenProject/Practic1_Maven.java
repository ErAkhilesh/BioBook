package MavenProject;

import org.testng.annotations.Test;

public class Practic1_Maven {
	@Test(groups= "smoke")
	public void update2()
	{
		System.out.println("Today is Monday");
	}

	@Test(groups = "regression")
	public void delete2()
	{
		System.out.println("Yesterday was sunday");
	}
}
