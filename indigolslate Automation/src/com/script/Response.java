package com.script;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Response {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\driver\\msedgedriver.exe");
		
		EdgeDriver driver=new EdgeDriver();
		
///////////////////////////////////////////////////////////////////////////////////
		////////////// to get Http response code , request method and all////////
		
//		HttpURLConnection cn = (HttpURLConnection)new URL("https://workplace-insights-staging.azurewebsites.net/").openConnection();
//	      cn.connect();
//	      //get response code
//	      int res = cn.getResponseCode();
//	      //get request method
//	     String a= cn.getRequestMethod();
//	      System.out.println("Http response code: " + res);
//	      System.out.println("Http request method: " + a);
//	      driver.quit();
		
//		driver.get("https://workplace-insights-staging.azurewebsites.net/");
//		 String url="";
//	      List<WebElement> allURLs = driver.findElements(By.tagName("a"));
//	      System.out.println("Total links on the Wb Page: " + allURLs.size());
//
//	      //We will iterate through the list and will check the elements in the list.
//	      Iterator<WebElement> iterator = allURLs.iterator();
//	      while (iterator.hasNext()) {
//	    	  url = iterator.next().getText();
//	    	  System.out.println(url);
//	      }
		
		
///////////////////////////////////////////////////////////////////////////////////////
		///////////////How to find broken links in Selenium tests///////////////////////
		
		   //Storing the links in a list and traversing through the links
		
		driver.get("https://workplace-insights-staging.azurewebsites.net/");
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // This line will print the number of links and the count of links.
        System.out.println("No of links are "+ links.size()); 
        
  
      
        //checking the links fetched.
        for(int i=0;i<links.size();i++)
        {
            WebElement E1= links.get(i);
            String url= E1.getAttribute("href");
            verifyLinks(url);
        }
        
        driver.quit();
		
		//capture time before page load
//	      long s = System.currentTimeMillis();
//	      //URL launch
//	      driver.get("https://www.tutorialspoint.com/videotutorials/subscription.php");
//	      //verify page is loaded
//	     // WebDriverWait wt = new WebDriverWait(driver, null);
//	      
//	      WebDriverWait wt=new WebDriverWait(driver, null);
//	      wt.until(ExpectedConditions.elementToBeClickable (By.className("s-buy")));
//	      //capture time after page load
//	      long e = System.currentTimeMillis();
//	      //compute time
//	      long r = e – s;
//	      System.out.println("Page load time in milliseconds: " + r);
//	      driver.close();
    }
       
		


public static void verifyLinks(String linkUrl)
{
    try
    {
        URL url = new URL(linkUrl);

        //Now we will be creating url connection and getting the response code
        HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
        httpURLConnect.setConnectTimeout(5000);
        httpURLConnect.connect();
        if(httpURLConnect.getResponseCode()>=400)
        {
        	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
        }    
   
        //Fetching and Printing the response obtained
        else{
            System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+" - "+httpURLConnect.getResponseCode()+" - "+httpURLConnect.getRequestMethod());
        }
    }catch (Exception e) {
  }
}
}

