package crawling;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CGV {
   private WebDriver driver;
   public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
   public static final String WEB_DRIVER_PATH = "C:/chromedriver.exe";
   
   public static void main(String[] args) {
      CGV cgv = new CGV();
      String url = "http://www.cgv.co.kr/movies/?lt=1&ft=0";
      
      //운영체제에 드라이버 설정
      System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
      
      //ChromeDriver를 driver에 담아주기
      cgv.driver = new ChromeDriver();
      cgv.driver.get(url);
      
   }
   
}











