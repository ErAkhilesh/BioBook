package MavenProject;

import org.testng.annotations.Test;

public class Practic_Maven {
	@Test(groups= "smoke")
	public void update()
	{
		System.out.println("update successfully");
	}

	@Test(groups = "regression")
	public void delete()
	{
		System.out.println("delete successfully");
	}

}
