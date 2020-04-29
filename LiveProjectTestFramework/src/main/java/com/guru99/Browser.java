package com.guru99;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	static int scc = 0;
	static String path = "E:/Selenium/";

	static WebDriver driver = new FirefoxDriver();

	public static void goTo(String url) {
		driver.get(url);

	}

	public static String title() {
		return driver.getTitle();
	}

	public static void close() {
		driver.close();
	}

	public static void takescreenshots(String testcaseName) throws IOException {

		/*
		 * Screenshot screenShot = new AShot().takeScreenshot(driver);
		 * 
		 * ImageIO.write(screenShot.getImage(), "jpg", new
		 * File(path+testcaseName+".jpg"));
		 */

		scc = (scc + 1);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String png = (path + testcaseName + scc + ".png");
		FileUtils.copyFile(scrFile, new File(png));
	}

}
