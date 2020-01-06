package javaAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver drive= new ChromeDriver();
		
		drive.get("http://demo.automationtesting.in/Windows.html");
		
		drive.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		drive.close();
		
		
	}

}
