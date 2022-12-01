package com.script.pageload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAPIntegrationSuitBOM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Indigoslate projects\\seleniumdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		long start, finish,totaltime;
		start=System.currentTimeMillis();
		driver.get("https://71681-sap-integration-suite.netlify.app/");
		finish=System.currentTimeMillis();
		totaltime=finish-start;
		System.out.println("Total page load time of SAP Integration suite URL ="  +totaltime );

	}

}
