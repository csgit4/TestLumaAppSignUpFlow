/**
 * 
 */
package com.incubyte.lumaapphucks;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.apache.commons.io.FileUtils;
import com.incubyte.utilities.BaseTest;
import com.incubyte.utilities.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * Somnath Shinde
 */
public class LumaAppHooks {

	private ConfigReader cr;
	public static Properties prop;
	public static BaseTest btest;
	public static WebDriver driver;
	public static Scenario scn;

	@Before(order = -1)
	public void clearExe() {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Before // ()
	public void inti_Browser(Scenario scn) {
		cr = new ConfigReader();
		prop = cr.getProp();
		btest = new BaseTest();
		driver = btest.initiBrowser(prop.getProperty("bName"));
		LumaAppHooks.scn = scn;
	}

//	@Before(order = 2)
//	public void start_Up() {
//		driver = btest.initiBrowser(prop.getProperty("bName"));
//	}
//	
//	

	@After(order = 5)
	public void tearDown() {
		driver.quit();
	}

	@After(order = 10)
	public void takeScreenShot() {
		if (LumaAppHooks.scn.isFailed()) {
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String scrName = LumaAppHooks.scn.getName().replaceAll(" ", "")+".png";
			File destinationFile = new File("./screenshot/"+scrName);
			try {
				FileUtils.copyFile(screenshot, destinationFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
