package bingTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class BingTest {
	@Test
	public void loginTest () throws IOException {
		// TODO Auto-generated method stub
		File pathToBinary = new File("F:\\Anandhi estee\\Software\\firefox-47.0.1.win64.sdk\\firefox-sdk\\bin\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//store the screenshot as object
		FileUtils.copyFile(src, new File("F:\\Anandhi estee\\Automation\\Java\\Seleniumworkspace\\Git_HubTest\\ScreenShot\\bing.jpeg"));
	}

}
