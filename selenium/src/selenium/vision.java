package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;






public class vision {
	public static void time1() {
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	
	public static void time2() {
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	 public static void main(String[] args) throws IOException {
	    	
	        System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver服务地址
	        WebDriver driver =new ChromeDriver(); //新建一个WebDriver 的对象
	        
	//CPS MDC      
	//1.vision 
	        //setting api
	        driver.get("http://lzwl.project/vision/build/00000");//打开指定的网站
	        driver.manage().window().maximize();
//	        driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//	        driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//	        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
	        System.out.println(driver.getCurrentUrl());
	        driver.navigate().refresh();
	        System.out.println(driver.getCurrentUrl());
	        selenium.time2();
	        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/ul/li[1]")).click();
	        WebElement draggable = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[1]"));
            new Actions(driver).dragAndDropBy(draggable, 50, -100).build().perform();
         WebElement draggable1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]")); 
         selenium.time1();
            new Actions(driver).dragAndDropBy(draggable1, -20, 200).build().perform();
            selenium.time1();
         WebElement draggable2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[3]")); 
         new Actions(driver).dragAndDropBy(draggable2, 400, -150).build().perform();
         selenium.time1();
         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/ul/li[2]")).click();
         WebElement draggable3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div")); 
         new Actions(driver).dragAndDropBy(draggable3, 450, 260).build().perform();
         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/ul/li[3]")).click();
         selenium.time1();
         WebElement draggable4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[4]"));
         new Actions(driver).dragAndDropBy(draggable4, 960, -100).build().perform();
         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/ul/li[4]")).click();
         selenium.time1();
         WebElement draggable5 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div"));
         new Actions(driver).dragAndDropBy(draggable5, 1070, -70).build().perform();
         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/ul/li[5]")).click();
         selenium.time1();
         WebElement draggable6 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[1]"));
         new Actions(driver).dragAndDropBy(draggable6, 990, 300).build().perform();
         WebElement draggable7 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]"));
         new Actions(driver).dragAndDropBy(draggable7, 850, 200).build().perform();
         WebElement draggable8 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]"));
         new Actions(driver).dragAndDropBy(draggable8, 690, 200).build().perform();
	         
         
         //第九个表
         Actions action = new Actions(driver) ;
         action.contextClick(driver.findElement(By.xpath("//div[contains(@id, 'cardView')]"))).perform();//右键
         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
         selenium.time1();
         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[1]/div/span")).click();
         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[2]/ul[2]/li")).click();
         selenium.time1();
         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
         selenium.time1();
         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
         selenium.time1();
         driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div[4]/div[5]")).click();
         selenium.time1();
//	         //第一个图表
//	         Actions action = new Actions(driver) ;
//	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id, 'inner_chartBar')]"))).perform();//右键
//	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[1]/div/div[2]/ul[2]/li[1]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time1();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time2();
//	         //第二个图表
//	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id,'inner_chartBarLoop')]"))).perform();
//	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[1]/div/div[2]/ul[2]/li[2]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time1();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time2();
//	         //第三个图表
//	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id,'inner_chartPieVs')]"))).perform();
//	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
//	         vision.time1();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[1]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[2]/ul[2]/li[1]")).click();
//	         vision.time1();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time1();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time2();
//	         //第四个图表
//	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]"))).perform();
//	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li[3]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time1();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time2();
//	         //第五个图表
//	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id,'device')]"))).perform();
//	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
//	         vision.time1();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[1]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[2]/ul[2]/li[1]")).click();
//	         vision.time1();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time2();
//	         
//	         //第六个图表
//	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id,'warningBar')]"))).perform();
//	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
//	         vision.time1();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[1]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[2]/ul[2]/li[1]")).click();
//	         vision.time1();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time1();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time2();
//	         //第七个图表
//	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id, 'cardVTop')]"))).perform();//右键
//	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[1]/div/div[2]/ul[2]/li[1]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time1();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time2();
//	         //第八个图表
//	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id, 'cardMix')]"))).perform();//右键
//	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li[2]")).click();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time1();
//	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
//	         vision.time1();
//	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div[4]/div[5]")).click();
//	         vision.time1();
//	         driver.get("http://lzwl.project/vision/00000");
	         
	         
	 }

}
