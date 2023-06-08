package TestScript;

import org.testng.annotations.Test;

public class test1 {
	@Test(priority=1)
	public void Openingpage()
	
	{
		System.out.println("web page opened sucessfully");
	}
	@Test(priority=2)
	public void title()
	{
		System.out.println("title of the page is : Welcome");
	}
	@Test(priority=3)
	public void url()
	{
		System.out.println("url of the page is :http://www.yahoomail.com");
	}
	
@Test(priority=4)
public void CLose()
{
	System.out.println("application sucessfully closed");
}

}
