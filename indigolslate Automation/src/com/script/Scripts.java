package com.script;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v106.network.Network;




public class Scripts {


	public static void main(String[] args) throws InterruptedException{
		
System.setProperty("webdriver.chrome.driver","D:\\Indigoslate projects\\seleniumdriver\\chromedriver_win32 (1)\\chromedriver.exe");
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://workplace-insights-staging.azurewebsites.net/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("c-shellmenu_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("shellmenu_2")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"feature-uid5fc0\"]/div/div/div[1]/div/div[2]/a")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.id("i0116")).sendKeys("prashant.dhoke@zensar.com");
		Thread.sleep(2000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("signup")).click();
		Thread.sleep(2000);
		
		ChromeDriver driver2 = new ChromeDriver();
		DevTools devTools = driver2.getDevTools();
		devTools.createSession();
//		int maxTotalBufferSize,maxResourceBufferSize,maxPostDataSize;
//		devTools.send(Network.enable(Optional<Integer> maxTotalBufferSize,Optional<Integer> maxResourceBufferSize,Optional<Integer> maxPostDataSize));
//		devTools.send(Network.enable(Optional<Integer> Optional<Integer> Optional<Integer> >));
		//devTools.send(Network.enable(null, null, null));
		//devTools.send(Fetch.enable(Optional.ofNullable(null),Optional.ofNullable(null),Optional.ofNullable(null)));
		
		
	}

}
