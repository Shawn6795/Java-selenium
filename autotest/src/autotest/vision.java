package autotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;





public class vision {
	public static void main(String[] args) {
    	
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver服务地址
        WebDriver driver =new ChromeDriver(); //新建一个WebDriver 的对象
        driver.get("http://"+panel.MDCurl+"/vision/setting/api");//打开指定的网站
        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        shebei.time2();
   	
        //
        List<WebElement> checkboxs = driver.findElements(By.xpath("//div[contains(text(),'当前班次')]"));
        String ban= checkboxs.get(0).getText();
        
        if(ban.equals("当前班次")) {
        	checkboxs.get(0).click();
        }
        else {
        	checkboxs.get(1).click();
        }
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(5) > span:nth-child(3) > label > span.mu > span")).click();
        shebei.time1();
        if(ban.equals("当前班次")) {
        	checkboxs.get(0).click();
        }
        else {
        	checkboxs.get(1).click();
        }
        shebei.time1();
        
        //
        driver.findElement(By.xpath("//div[contains(text(),'设备每小时产量')]")).click();
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(1) > span:nth-child(2) > label > span.mu > span")).click();
        shebei.time1();
        driver.findElement(By.xpath("//div[contains(text(),'设备每小时产量')]")).click();
        shebei.time1();
        
        //
        driver.findElement(By.xpath("//div[contains(text(),'设备稼动率')]")).click();
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(1) > span:nth-child(4) > label > span.mu > span")).click();
        shebei.time1();           
        driver.findElement(By.xpath("//div[contains(text(),'设备稼动率')]")).click();
        shebei.time1();
        
        //
        driver.findElement(By.xpath("//div[contains(text(),'设备报警信息')]")).click();
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(4) > span:nth-child(2) > label > span.mu > span")).click();
        shebei.time1();
        driver.findElement(By.xpath("//div[contains(text(),'设备报警信息')]")).click();
        shebei.time1();
        
        //
        driver.findElement(By.xpath("//div[contains(text(),'设备状态分布')]")).click();
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(2) > span:nth-child(2) > label > span.mu > span")).click();
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(1) > span:nth-child(7) > label > span.mu > span")).click();
        shebei.time1();
        driver.findElement(By.xpath("//div[contains(text(),'设备状态分布')]")).click();
        shebei.time1();
        
        //
        driver.findElement(By.xpath("//div[contains(text(),'实时状态')]")).click();
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(3) > span:nth-child(2) > label > span.mu > span")).click();
        shebei.time1();
        driver.findElement(By.xpath("//div[contains(text(),'实时状态')]")).click();
        shebei.time1();
        
        //
        driver.findElement(By.xpath("//div[contains(text(),'班次产量')]")).click();
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(5) > span:nth-child(4) > label > span.mu > span")).click();
        shebei.time1();
        driver.findElement(By.xpath("//div[contains(text(),'班次产量')]")).click();
        shebei.time1();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/button[1]/span")).click();
        shebei.time1();
      //CPS MDC      
    	//1.vision 
    	        driver.get("http://"+panel.MDCurl+"/vision/build/00000");//打开指定的网站
    	        driver.manage().window().maximize();

    	        System.out.println(driver.getCurrentUrl());
    	        driver.navigate().refresh();
    	        System.out.println(driver.getCurrentUrl());
    	        shebei.time2();
    	        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/ul/li[1]")).click();
    	        WebElement draggable = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[1]"));
    	            new Actions(driver).dragAndDropBy(draggable, 50, -100).build().perform();
    	         WebElement draggable1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]")); 
    	         shebei.time1();
    	            new Actions(driver).dragAndDropBy(draggable1, -20, 200).build().perform();
    	            shebei.time1();
    	         WebElement draggable2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[3]")); 
    	         new Actions(driver).dragAndDropBy(draggable2, 400, -150).build().perform();
    	         shebei.time1();
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/ul/li[2]")).click();
    	         WebElement draggable3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div")); 
    	         new Actions(driver).dragAndDropBy(draggable3, 450, 260).build().perform();
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/ul/li[3]")).click();
    	         shebei.time1();
    	         WebElement draggable4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[4]"));
    	         new Actions(driver).dragAndDropBy(draggable4, 960, -100).build().perform();
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/ul/li[4]")).click();
    	         shebei.time1();
    	         WebElement draggable5 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div"));
    	         new Actions(driver).dragAndDropBy(draggable5, 1070, -70).build().perform();
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/ul/li[5]")).click();
    	         shebei.time1();
    	         WebElement draggable6 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[1]"));
    	         new Actions(driver).dragAndDropBy(draggable6, 990, 300).build().perform();
    	         WebElement draggable7 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]"));
    	         new Actions(driver).dragAndDropBy(draggable7, 850, 200).build().perform();
    	         
    	         //第一个图表
    	         Actions action = new Actions(driver) ;
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id, 'inner_chartBar')]"))).perform();//右键
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time2();
    	         //第二个图表
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id,'inner_chartBarLoop')]"))).perform();
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[1]/div/div[2]/ul[2]/li")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time2();
    	         //第三个图表
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id,'inner_chartPieVs')]"))).perform();
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[2]/ul[2]/li")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time2();
    	         //第四个图表
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]"))).perform();
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time2();
    	         //第五个图表
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id,'device')]"))).perform();
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[2]/ul[2]/li")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time2();
    	         
    	         //第六个图表
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id,'warningBar')]"))).perform();
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[2]/ul[2]/li")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time2();
    	         //第七个图表
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id, 'cardVTop')]"))).perform();//右键
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time2();
    	         //第八个图表
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id, 'cardMix')]"))).perform();//右键
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div[4]/div[5]")).click();
    	         shebei.time1();
    	         driver.get("http://"+panel.MDCurl+"/vision/00000");    
 }
}
