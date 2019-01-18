
package mateDesktopAutomation;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Test1 {
	
	WiniumDriver driver = null;
	
	@BeforeClass
	
	public void setUpEnvironment() throws IOException{
		
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Users\\Dobri\\Desktop\\mate\\mate.exe");
		
		try{
			
			driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	
	public void testNotepadApplication()
	{
		driver.findElementByXPath("/*[contains(@ControlType,'ControlType.Window')]").click();
		
	}
	
	@AfterClass
	
	public void tearDown() throws IOException
	{
		driver.close();
	}
	
		
}
