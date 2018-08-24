package autotest;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;







public class vision {
	 public static  int MachinesShiftDetailId;
  	public static  int MachinesId;
	public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException {
		
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("vision.txt")),true));
    	
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver服务地址
        WebDriver driver =new ChromeDriver(); //新建一个WebDriver 的对象
        driver.get("http://"+panel.MDCurl+"/vision/setting/api");//打开指定的网站
        driver.manage().window().maximize();

        
        driver.navigate().refresh();
       
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
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(5) > span:nth-child(2) > label > span.mu > span")).click();
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

    	        
    	        driver.navigate().refresh();
    	       
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
    	         WebElement draggable7 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[3]"));
    	         new Actions(driver).dragAndDropBy(draggable7, 850, 200).build().perform();
    	         WebElement draggable8 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/div[2]"));
    	         new Actions(driver).dragAndDropBy(draggable8, 690, 200).build().perform();
    	         
    	         
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
    	       
    	         //第九个表
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id, 'cardView')]"))).perform();//右键
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[1]/div/span")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[2]/div/div/div[2]/ul[2]/li")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div[4]/div[5]")).click();
    	         shebei.time1();
    	         
    	         
    	        
    	       

    	     //CPS MDC      
    	     //1.设备实时状态对比 
    	         
    	            driver.get("http://"+panel.MDCurl+"/vision/00000");//打开指定的网站
    	            driver.manage().window().maximize();
//    	            driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//    	            driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//    	            driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
    	            driver.navigate().refresh();
    	            shebei.time2();
    	            
    	            String Mzhuangtai=driver.findElement(By.xpath("//li[contains(text(),'状态')]")).getText();
    	            String Mhege=driver.findElement(By.xpath("//li[contains(text(),'合格零件')]")).getText();
    	            String Mbuhege=driver.findElement(By.xpath("//li[contains(text(),'不合格零件')]")).getText();
    	            String Mchengxuming=driver.findElement(By.xpath("//li[contains(text(),'程序名')]")).getText();
    	            String Mzhuzhouzhuansu=driver.findElement(By.xpath("//li[contains(text(),'主轴转速')]")).getText();
    	            String Mzhuzhoubeilv=driver.findElement(By.xpath("//li[contains(text(),'主轴倍率')]")).getText();
    	            String Mjinjisudu=driver.findElement(By.xpath("//li[contains(text(),'进给速度')]")).getText();
    	            String Mjinjibeilv=driver.findElement(By.xpath("//li[contains(text(),'进给倍率')]")).getText();
    	            String Merweima=driver.findElement(By.xpath("//li[contains(text(),'零件二维码')]")).getText();
    	            String Mkaishijiagong=driver.findElement(By.xpath("//li[contains(text(),'开始加工信号')]")).getText();
    	            String Mjieshujiagong=driver.findElement(By.xpath("//li[contains(text(),'结束加工信号')]")).getText();
    	            String Mxzhou=driver.findElement(By.xpath("//li[contains(text(),'X轴机械')]")).getText();
    	            String Myzhou=driver.findElement(By.xpath("//li[contains(text(),'Y轴机械')]")).getText();
    	            String Mzzhou=driver.findElement(By.xpath("//li[contains(text(),'Z轴机械')]")).getText();
    	            String Mbaojinghao=driver.findElement(By.xpath("//li[contains(text(),'报警号')]")).getText();
    	            String Mbaojingxinxi=driver.findElement(By.xpath("//li[contains(text(),'报警信息')]")).getText();
    	            String Mshebei=Mzhuangtai+Mhege+Mbuhege+Mchengxuming+Mzhuzhouzhuansu+Mzhuzhoubeilv+Mjinjisudu+Mjinjibeilv+Merweima+
    	         		   Mkaishijiagong+Mjieshujiagong+Mxzhou+Myzhou+Mzzhou+Mbaojinghao+Mbaojingxinxi;
    	            
    	            System.out.println(Mshebei);
    	            
    	            driver.get("http://"+panel.DMPurl+"/WebAdmin/quickclient.html");
    	            shebei.time2();
    	            driver.findElement(By.xpath("//*[@id=\"treeview\"]/ul/li/ul/li/div")).click();
    	            shebei.time1();
    	            String Dzhuangtai=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[1]/td[5]")).getText();
    	            String Dhege="合格零件计数:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[2]/td[5]")).getText();
    	            String Dbuhege="不合格零件计数:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[3]/td[5]")).getText();
    	            String Dchengxuming="程序名:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[6]/td[5]")).getText();
    	            String Dzhuzhouzhuansu="主轴转速:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[7]/td[5]")).getText();
    	            String Dzhuzhoubeilv="主轴倍率:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[8]/td[5]")).getText();
    	            String Djinjisudu="进给速度:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[9]/td[5]")).getText();
    	            String Djinjibeilv="进给倍率:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[10]/td[5]")).getText();
    	            String Derweima="零件二维码:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[11]/td[5]")).getText();
    	            String Dkaishijiagong="开始加工信号:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[12]/td[5]")).getText();
    	            String Djieshujiagong="结束加工信号:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[13]/td[5]")).getText();
    	            String Dxzhou="X轴机械座标:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[14]/td[5]")).getText();
    	            String Dyzhou="Y轴机械座标:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[15]/td[5]")).getText();
    	            String Dzzhou="Z轴机械座标:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[16]/td[5]")).getText();
    	            String Dbaojinghao="报警号:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[4]/td[5]")).getText();
    	            String Dbaojingxinxi="报警信息:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[5]/td[5]")).getText();
    	            if(Dzhuangtai.equals("2")) {
    	         	   Dzhuangtai="运行";
    	            }
    	             Dzhuangtai="状态:"+Dzhuangtai;
    	             
    	             String Dshebei=Dzhuangtai+Dhege+Dbuhege+Dchengxuming+Dzhuzhouzhuansu+Dzhuzhoubeilv+Djinjisudu+Djinjibeilv+Derweima+
    	             		   Dkaishijiagong+Djieshujiagong+Dxzhou+Dyzhou+Dzzhou+Dbaojinghao+Dbaojingxinxi;
    	             
    	                System.out.println(Dshebei);
    	            if(Mshebei.equals(Dshebei)) {
    	         	   System.out.println("设备状态相同");
    	            }else {
    	         	   System.out.println("设备状态不同");
    	            }
    	           
    	           //状态分布
    	            driver.get("http://"+panel.MDCurl+"/vision/00000");
    	            shebei.time1();
    	            
    	            String Mname=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[1]")).getText();
    	            String Moffline=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[2]")).getText();
    	            String Mfree=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[3]")).getText();
    	            String Mrun=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[4]")).getText();
    	            String Mstop=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[5]")).getText();
    	            String Mdebug=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[6]")).getText();
    	            
    	            String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName="+panel.Databasename+";user=sa;password=P@ssw0rd";//sa身份连接    
    	            Connection con = null;    
    	            Statement stmt = null;    
    	            ResultSet rs = null;    
    	                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
    	                con = DriverManager.getConnection(url);  
    	                
    	                String S="SELECT Id FROM dbo.Machines where Name='"+Mname+"'";
    	                stmt = con.createStatement();    
    	                rs = stmt.executeQuery(S); 
    	                while (rs.next()) { 
    	                    MachinesId=rs.getInt(1);
    	                   }
    	               
    	                int[] offlinearr =new int[100];
    	                int[] freearr =new int[100];
    	                int[] totalarr =new int[100];
    	                int[] debugarr =new int[100];
    	                int[] runarr =new int[100];
    	                int[] stoparr =new int[100];
    	                double offlinesum=0;
    	                double freesum=0;
    	                double totalsum=0;
    	                double debugsum=0;
    	                double runsum=0;
    	                double stopsum=0;
    	                
    	                String S2="SELECT * FROM dbo.DailyStatesSummaries where MachineId='"+MachinesId+"' order by MachinesShiftDetailId desc";
    	                stmt = con.createStatement();    
    	                rs = stmt.executeQuery(S2); 
    	                int a=0;
    	                while (rs.next()) { 
    	                    offlinearr[a]=rs.getInt(3);
    	                    freearr[a]=rs.getInt(4);
    	                    totalarr[a]=rs.getInt(5);
    	                    debugarr[a]=rs.getInt(9);
    	                    runarr[a]=rs.getInt(10);
    	                    stoparr[a]=rs.getInt(11);
    	                    a++;
    	                   }
    	                
    	                for( int b=0;b<100;b++) {
    	             	   offlinesum+=offlinearr[b];
    	             	   freesum+=freearr[b];
    	             	   totalsum+=totalarr[b];
    	             	   debugsum+=debugarr[b];
    	             	   runsum+=runarr[b];
    	             	   stopsum+=stoparr[b];
    	              	   }
    	                DecimalFormat df = new DecimalFormat("#0.00");
    	                
    	                String Doffline=df.format((offlinesum/totalsum)*100)+"%";
    	                String Dfree=df.format((freesum/totalsum)*100)+"%";
    	                String Drun=df.format((runsum/totalsum)*100)+"%";
    	                String Dstop=df.format((stopsum/totalsum)*100)+"%";
    	                String Ddebug=df.format((debugsum/totalsum)*100)+"%";
    	                
    	                String Mzong=Moffline+" "+Mfree+" "+Mrun+" "+Mstop+" "+Mdebug;
    	                String Dzong=Doffline+" "+Dfree+" "+Drun+" "+Dstop+" "+Ddebug;
    	                
    	                System.out.println();
    	                System.out.println("设备状态分布：");
    	                System.out.println(Mzong);
    	                System.out.println(Dzong);
    	                System.out.println();
    	              
    	            
    	            
    	            //产量
    	            
    	            shebei.time1();
    	          String Mchanliang = driver.findElement(By.className("cardMixTop")).getText();
    	          System.out.println(Mchanliang);

    	              String SQL="SELECT TOP 1 MachinesShiftDetailId FROM dbo.DailyStatesSummaries order by MachinesShiftDetailId desc";
    	              stmt = con.createStatement();    
    	              rs = stmt.executeQuery(SQL); 
    	              
    	              while (rs.next()) { 
    	               MachinesShiftDetailId=rs.getInt(1);
    	              }
    	              
    	              String SQL2="SELECT Yield FROM dbo.Capacities where MachinesShiftDetailId='"+MachinesShiftDetailId+"'";
    	              stmt = con.createStatement();    
    	              rs = stmt.executeQuery(SQL2); 
    	              int i=0;
    	              int [] arr=new int[100];
    	              while (rs.next()) { 
    	              	 arr[i]=rs.getInt(1);
    	              	i++;
    	              }
    	         int sum=0;
    	         for( int j=0;j<100;j++) {
    	      	   sum+=arr[j];
    	      	   
    	         }
    	         String Dchanliang=sum+"件";
    	         
    	         System.out.println(Dchanliang);
    	            
    	            if(Mchanliang.equals(Dchanliang)) {
    	         	   System.out.println("产量相同");
    	            }else
    	            {
    	         	   System.out.println("产量不同");
    	            }
    	            
    	            
    	            
    	            //当前班次
    	            driver.get("http://"+panel.MDCurl+"/MachineShiftSetting");
    	          driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
    	          driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
    	          driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
    	          driver.navigate().refresh();

    	          
    	            shebei.time1();
    	            String Mban=driver.findElement(By.xpath("//*[@id=\"MachineShiftTable\"]/tbody/tr/td[4]")).getText();
    	           
    	            Calendar c = Calendar.getInstance();
    	            int hour = c.get(Calendar.HOUR_OF_DAY);
    	            
    	            if(hour<16 && hour>=8) {
    	         	   Mban=Mban+"-早班";
    	            }else if(hour>=16 && hour<=23) {
    	         	   Mban=Mban+"-中班";
    	            }else if(hour>=0 && hour<8) {
    	         	   Mban=Mban+"-晚班";
    	            }
    	            System.out.println();
    	            System.out.println(Mban);
    	            driver.get("http://"+panel.MDCurl+"/vision/00000");
    	            driver.navigate().refresh();
    	            shebei.time1();
    	            String Dban=driver.findElement(By.className("card-value")).getText();
    	            System.out.println(Dban);
    	            if(Mban.equals(Dban)) {
    	         	   System.out.println("当前班次相同");
    	            }else {
    	         	   System.out.println("当前班次不同");
    	            }
    	            String jiadonglv =driver.findElement(By.className("item")).getText();
    	            System.out.println();
    	            System.out.println(jiadonglv);
    	            try {
    		    		Process process = Runtime.getRuntime().exec(
    		    		"cmd.exe /c notepad vision.txt");
    		    		} catch (Exception e) {
    		    		e.printStackTrace();
    		    		}  
    	          
    	        }
 }

