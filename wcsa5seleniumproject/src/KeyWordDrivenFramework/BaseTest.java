package KeyWordDrivenFramework;

public class BaseTest extends Flib {
	
   //it is use to open and close the browser
	public void openBrowser()
	{
		Flib flib = new Flib();
		  = flib.readPropertyData("./data/config.properties","Browser");

	}
	
	
	
}
