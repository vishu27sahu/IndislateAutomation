package com.script.pageload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SurfaceCie {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Indigoslate projects\\seleniumdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		long start, finish,totaltime;
		start=System.currentTimeMillis();
		driver.get("https://www.exploresurface.com/");
		finish=System.currentTimeMillis();
		totaltime=finish-start;
		System.out.println("Total page load time of surface CIE URL ="  +totaltime );

	}

}
