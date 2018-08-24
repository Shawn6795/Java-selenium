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
    	
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver�����ַ
        WebDriver driver =new ChromeDriver(); //�½�һ��WebDriver �Ķ���
        driver.get("http://"+panel.MDCurl+"/vision/setting/api");//��ָ������վ
        driver.manage().window().maximize();

        
        driver.navigate().refresh();
       
        shebei.time2();
   	
        //
        List<WebElement> checkboxs = driver.findElements(By.xpath("//div[contains(text(),'��ǰ���')]"));
        String ban= checkboxs.get(0).getText();
        
        if(ban.equals("��ǰ���")) {
        	checkboxs.get(0).click();
        }
        else {
        	checkboxs.get(1).click();
        }
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(5) > span:nth-child(3) > label > span.mu > span")).click();
        shebei.time1();
        if(ban.equals("��ǰ���")) {
        	checkboxs.get(0).click();
        }
        else {
        	checkboxs.get(1).click();
        }
        shebei.time1();
        
        //
        driver.findElement(By.xpath("//div[contains(text(),'�豸ÿСʱ����')]")).click();
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(1) > span:nth-child(2) > label > span.mu > span")).click();
        shebei.time1();
        driver.findElement(By.xpath("//div[contains(text(),'�豸ÿСʱ����')]")).click();
        shebei.time1();
        
        //
        driver.findElement(By.xpath("//div[contains(text(),'�豸�ڶ���')]")).click();
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(1) > span:nth-child(4) > label > span.mu > span")).click();
        shebei.time1();   
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(5) > span:nth-child(2) > label > span.mu > span")).click();
        shebei.time1();
        driver.findElement(By.xpath("//div[contains(text(),'�豸�ڶ���')]")).click();
        shebei.time1();
        
        //
        driver.findElement(By.xpath("//div[contains(text(),'�豸������Ϣ')]")).click();
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(4) > span:nth-child(2) > label > span.mu > span")).click();
        shebei.time1();
        driver.findElement(By.xpath("//div[contains(text(),'�豸������Ϣ')]")).click();
        shebei.time1();
        
        //
        driver.findElement(By.xpath("//div[contains(text(),'�豸״̬�ֲ�')]")).click();
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(2) > span:nth-child(2) > label > span.mu > span")).click();
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(1) > span:nth-child(7) > label > span.mu > span")).click();
        shebei.time1();
        driver.findElement(By.xpath("//div[contains(text(),'�豸״̬�ֲ�')]")).click();
        shebei.time1();
        
        //
        driver.findElement(By.xpath("//div[contains(text(),'ʵʱ״̬')]")).click();
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(3) > span:nth-child(2) > label > span.mu > span")).click();
        shebei.time1();
        driver.findElement(By.xpath("//div[contains(text(),'ʵʱ״̬')]")).click();
        shebei.time1();
        
        //
        driver.findElement(By.xpath("//div[contains(text(),'��β���')]")).click();
        shebei.time1();
        driver.findElement(By.cssSelector("#app > div > div.relationshipBox > div > div.ivu-collapse-item.ivu-collapse-item-active > div.ivu-collapse-content > div > p > div > span:nth-child(5) > span:nth-child(4) > label > span.mu > span")).click();
        shebei.time1();
        driver.findElement(By.xpath("//div[contains(text(),'��β���')]")).click();
        shebei.time1();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/button[1]/span")).click();
        shebei.time1();
      //CPS MDC      
    	//1.vision 
    	        driver.get("http://"+panel.MDCurl+"/vision/build/00000");//��ָ������վ
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
    	         
    	         
    	         //��һ��ͼ��
    	         Actions action = new Actions(driver) ;
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id, 'inner_chartBar')]"))).perform();//�Ҽ�
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time2();
    	         //�ڶ���ͼ��
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id,'inner_chartBarLoop')]"))).perform();
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li[1]/div/div[2]/ul[2]/li")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time2();
    	         //������ͼ��
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
    	         //���ĸ�ͼ��
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]"))).perform();
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time2();
    	         //�����ͼ��
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
    	         
    	         //������ͼ��
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
    	         //���߸�ͼ��
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id, 'cardVTop')]"))).perform();//�Ҽ�
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time2();
    	         //�ڰ˸�ͼ��
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id, 'cardMix')]"))).perform();//�Ҽ�
    	         driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/ul/li[1]")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/ul/li/div/div[2]/ul[2]/li")).click();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	         driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/button[2]")).click();
    	         shebei.time1();
    	       
    	         //�ھŸ���
    	         action.contextClick(driver.findElement(By.xpath("//div[contains(@id, 'cardView')]"))).perform();//�Ҽ�
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
    	     //1.�豸ʵʱ״̬�Ա� 
    	         
    	            driver.get("http://"+panel.MDCurl+"/vision/00000");//��ָ������վ
    	            driver.manage().window().maximize();
//    	            driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//    	            driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//    	            driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //�����Ť
    	            driver.navigate().refresh();
    	            shebei.time2();
    	            
    	            String Mzhuangtai=driver.findElement(By.xpath("//li[contains(text(),'״̬')]")).getText();
    	            String Mhege=driver.findElement(By.xpath("//li[contains(text(),'�ϸ����')]")).getText();
    	            String Mbuhege=driver.findElement(By.xpath("//li[contains(text(),'���ϸ����')]")).getText();
    	            String Mchengxuming=driver.findElement(By.xpath("//li[contains(text(),'������')]")).getText();
    	            String Mzhuzhouzhuansu=driver.findElement(By.xpath("//li[contains(text(),'����ת��')]")).getText();
    	            String Mzhuzhoubeilv=driver.findElement(By.xpath("//li[contains(text(),'���ᱶ��')]")).getText();
    	            String Mjinjisudu=driver.findElement(By.xpath("//li[contains(text(),'�����ٶ�')]")).getText();
    	            String Mjinjibeilv=driver.findElement(By.xpath("//li[contains(text(),'��������')]")).getText();
    	            String Merweima=driver.findElement(By.xpath("//li[contains(text(),'�����ά��')]")).getText();
    	            String Mkaishijiagong=driver.findElement(By.xpath("//li[contains(text(),'��ʼ�ӹ��ź�')]")).getText();
    	            String Mjieshujiagong=driver.findElement(By.xpath("//li[contains(text(),'�����ӹ��ź�')]")).getText();
    	            String Mxzhou=driver.findElement(By.xpath("//li[contains(text(),'X���е')]")).getText();
    	            String Myzhou=driver.findElement(By.xpath("//li[contains(text(),'Y���е')]")).getText();
    	            String Mzzhou=driver.findElement(By.xpath("//li[contains(text(),'Z���е')]")).getText();
    	            String Mbaojinghao=driver.findElement(By.xpath("//li[contains(text(),'������')]")).getText();
    	            String Mbaojingxinxi=driver.findElement(By.xpath("//li[contains(text(),'������Ϣ')]")).getText();
    	            String Mshebei=Mzhuangtai+Mhege+Mbuhege+Mchengxuming+Mzhuzhouzhuansu+Mzhuzhoubeilv+Mjinjisudu+Mjinjibeilv+Merweima+
    	         		   Mkaishijiagong+Mjieshujiagong+Mxzhou+Myzhou+Mzzhou+Mbaojinghao+Mbaojingxinxi;
    	            
    	            System.out.println(Mshebei);
    	            
    	            driver.get("http://"+panel.DMPurl+"/WebAdmin/quickclient.html");
    	            shebei.time2();
    	            driver.findElement(By.xpath("//*[@id=\"treeview\"]/ul/li/ul/li/div")).click();
    	            shebei.time1();
    	            String Dzhuangtai=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[1]/td[5]")).getText();
    	            String Dhege="�ϸ��������:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[2]/td[5]")).getText();
    	            String Dbuhege="���ϸ��������:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[3]/td[5]")).getText();
    	            String Dchengxuming="������:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[6]/td[5]")).getText();
    	            String Dzhuzhouzhuansu="����ת��:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[7]/td[5]")).getText();
    	            String Dzhuzhoubeilv="���ᱶ��:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[8]/td[5]")).getText();
    	            String Djinjisudu="�����ٶ�:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[9]/td[5]")).getText();
    	            String Djinjibeilv="��������:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[10]/td[5]")).getText();
    	            String Derweima="�����ά��:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[11]/td[5]")).getText();
    	            String Dkaishijiagong="��ʼ�ӹ��ź�:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[12]/td[5]")).getText();
    	            String Djieshujiagong="�����ӹ��ź�:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[13]/td[5]")).getText();
    	            String Dxzhou="X���е����:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[14]/td[5]")).getText();
    	            String Dyzhou="Y���е����:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[15]/td[5]")).getText();
    	            String Dzzhou="Z���е����:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[16]/td[5]")).getText();
    	            String Dbaojinghao="������:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[4]/td[5]")).getText();
    	            String Dbaojingxinxi="������Ϣ:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[5]/td[5]")).getText();
    	            if(Dzhuangtai.equals("2")) {
    	         	   Dzhuangtai="����";
    	            }
    	             Dzhuangtai="״̬:"+Dzhuangtai;
    	             
    	             String Dshebei=Dzhuangtai+Dhege+Dbuhege+Dchengxuming+Dzhuzhouzhuansu+Dzhuzhoubeilv+Djinjisudu+Djinjibeilv+Derweima+
    	             		   Dkaishijiagong+Djieshujiagong+Dxzhou+Dyzhou+Dzzhou+Dbaojinghao+Dbaojingxinxi;
    	             
    	                System.out.println(Dshebei);
    	            if(Mshebei.equals(Dshebei)) {
    	         	   System.out.println("�豸״̬��ͬ");
    	            }else {
    	         	   System.out.println("�豸״̬��ͬ");
    	            }
    	           
    	           //״̬�ֲ�
    	            driver.get("http://"+panel.MDCurl+"/vision/00000");
    	            shebei.time1();
    	            
    	            String Mname=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[1]")).getText();
    	            String Moffline=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[2]")).getText();
    	            String Mfree=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[3]")).getText();
    	            String Mrun=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[4]")).getText();
    	            String Mstop=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[5]")).getText();
    	            String Mdebug=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[6]")).getText();
    	            
    	            String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName="+panel.Databasename+";user=sa;password=P@ssw0rd";//sa�������    
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
    	                System.out.println("�豸״̬�ֲ���");
    	                System.out.println(Mzong);
    	                System.out.println(Dzong);
    	                System.out.println();
    	              
    	            
    	            
    	            //����
    	            
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
    	         String Dchanliang=sum+"��";
    	         
    	         System.out.println(Dchanliang);
    	            
    	            if(Mchanliang.equals(Dchanliang)) {
    	         	   System.out.println("������ͬ");
    	            }else
    	            {
    	         	   System.out.println("������ͬ");
    	            }
    	            
    	            
    	            
    	            //��ǰ���
    	            driver.get("http://"+panel.MDCurl+"/MachineShiftSetting");
    	          driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
    	          driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
    	          driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //�����Ť
    	          driver.navigate().refresh();

    	          
    	            shebei.time1();
    	            String Mban=driver.findElement(By.xpath("//*[@id=\"MachineShiftTable\"]/tbody/tr/td[4]")).getText();
    	           
    	            Calendar c = Calendar.getInstance();
    	            int hour = c.get(Calendar.HOUR_OF_DAY);
    	            
    	            if(hour<16 && hour>=8) {
    	         	   Mban=Mban+"-���";
    	            }else if(hour>=16 && hour<=23) {
    	         	   Mban=Mban+"-�а�";
    	            }else if(hour>=0 && hour<8) {
    	         	   Mban=Mban+"-���";
    	            }
    	            System.out.println();
    	            System.out.println(Mban);
    	            driver.get("http://"+panel.MDCurl+"/vision/00000");
    	            driver.navigate().refresh();
    	            shebei.time1();
    	            String Dban=driver.findElement(By.className("card-value")).getText();
    	            System.out.println(Dban);
    	            if(Mban.equals(Dban)) {
    	         	   System.out.println("��ǰ�����ͬ");
    	            }else {
    	         	   System.out.println("��ǰ��β�ͬ");
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

