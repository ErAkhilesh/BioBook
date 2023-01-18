package MavenProject;

import org.testng.annotations.Test;

public class regression_Practic {
@Test(groups= "regression")
public void update()
{
	System.out.println("Today is wednesday");
}


@Test(groups="smoke")
public void deleted() {
	System.out.println("Tomorrow will thursday");
}

@Test(groups= {"smoke","regression"})
public void utilize() {
	System.out.println("Yesterday was tuesday");
}


@Test
public void school()
{
	System.out.println("Education is better for tomorrow");
}
}

