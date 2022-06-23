package crawling;

import java.util.List;
//import java.util.Scanner;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Linkareer {
   private static WebDriver driver;
   private String url;
   
      public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
      public static final String WEB_DRIVER_PATH = "C:/chromedriver.exe";
      
      int count = 0;
      int index = 0;
        
         //드라이버 설정
         public Linkareer() {            
         System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);         
         //브라우저 옵션
         ChromeOptions options = new ChromeOptions();
         options.addArguments("headless");
         driver = new ChromeDriver(options);
         url = "https://linkareer.com/list/contest";
         driver.get(url);
         }
         
         public void operate() {
            searchString();
             driver.close();
             driver.quit();
         }
         // 1.전체보기
         public void searchString() {
            List<WebElement> titles = driver.findElements(By.cssSelector("a h5"));
//              공모전 클릭하기
            //선택자1:not(선택자2) : 선택자1안에 선택자2를 제외한 나머지
            for (WebElement contestName : titles) {
                   //1부터 시작하는 번호와 함께 영화 제목을 출력한다.
                   System.out.println(++count + ". " + contestName.getText());
                }
             System.out.println(" 관심있는 공모전 번호를 입력하세요.");
//             index = sc.nextInt();
             
             
//             driver.findElement(By.id("lyricArea")).findElement(By.className("button_more")).click();
//             try {Thread.sleep(500);} catch (InterruptedException e) {;}
//             
//             
//             try {
//                driver.findElement(By.className("adult_register"));
//                System.out.println("성인 인증이 필요한 가사입니다.");
//             } catch (Exception e) {
//                try {
//                   driver.findElement(By.className("d_register"));
//                   System.out.println("가사가 없는 곡입니다.");
//                } catch (Exception e1) {
//                   System.out.println(driver.findElement(By.id("d_video_summary")).getText());
//                }
//             }
         }
         public static void main(String[] args) {
        	 Linkareer c = new Linkareer ();
            c.operate();
        
         }         
}            
            
            
            // 2.분야별 보기
            // 3. 시상 규모(금액)별 보기
            // 4. 참여 가능 대상 별 보기
            // 5. 주최 기관 별 보기
            // 6. 뒤로가기
            // 7. 나가기
            

            
    