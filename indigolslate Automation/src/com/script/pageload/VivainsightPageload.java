package com.script.pageload;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class VivainsightPageload {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\driver\\msedgedriver.exe");
		
		EdgeDriver driver=new EdgeDriver();
		
		long start,finish,total_time;
		start=System.currentTimeMillis();
		driver.get("https://workplace-insights-staging.azurewebsites.net/");
		 finish=System.currentTimeMillis();
		 total_time =finish - start;
		System.out.println(total_time);
	
		
		
	}
	
}

