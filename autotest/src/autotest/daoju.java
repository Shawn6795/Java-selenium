package autotest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class daoju {
	 public static void main(String[] args)  {
	    	
	        System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver�����ַ
	        WebDriver driver =new ChromeDriver(); //�½�һ��WebDriver �Ķ���
	        //���������ĸ
	        String str="";
	        String str2="";
	        for (int i = 0;i<5;i++){
	            str = str+ (char)(Math.random()*26+'A');
	            str2=str2+(char)(Math.random()*26+'A');
	        }
	        
	        int i=(int)(Math.random()*900)+100;
	        String str3=""+i;
	        
	//CPS MDC      
	//���߹��� 
	        //��½
	        driver.get("http://"+panel.MDCurl+"/CutterParameter");//��ָ������վd.mdc.product
	        driver.manage().window().maximize();
	        driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
	        driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
	        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //�����Ť
	        System.out.println(driver.getCurrentUrl());
	        driver.navigate().refresh();
	        System.out.println(driver.getCurrentUrl());
	        shebei.time2();
	        
	        //�½���������
	        File fileD = new File("daoju.txt");
	        if(!fileD.exists()) {
	        try {
	        FileOutputStream out = new FileOutputStream(fileD);
	   		out.write(2);
	   		out.close();
	   		
	   		driver.findElement(By.id("btnCreate")).click();
	        shebei.time1();
	      driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
	      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
	      .findElement(By.className("form-validation"))
	      .findElement(By.name("Name"))
	      .sendKeys(str);
	      shebei.time1();
	        driver.findElement(By.className("save-button")).click();
	        
	        shebei.time1();
	        driver.findElement(By.id("btnCreate")).click();
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("Name"))
		      .sendKeys(str2);
	        driver.findElement(By.className("save-button")).click();
	        
	        //����ά��
	        driver.get("http://"+panel.MDCurl+"/CutterType");//��ָ������վd.mdc.product
//	        driver.manage().window().maximize();
//	        driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//	        driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//	        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //�����Ť
//	        System.out.println(driver.getCurrentUrl());
	        driver.navigate().refresh();
	        System.out.println(driver.getCurrentUrl());
	        shebei.time2();
	        
	        //��������
	        shebei.time1();
         driver.findElement(By.id("btnCreateRootCutterType")).click();
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("Name"))
		      .sendKeys(str2);
	        
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("CutterNoPrefix"))
		      .sendKeys(str3);
	        shebei.time1();
	        driver.findElement(By.className("save-button")).click();
	        
	        //��������
	        shebei.time1();
	        driver.findElement(By.xpath("//span[contains(text(),'"+str2+"')]")).click();
	        driver.findElement(By.id("btnCreateCutterModel")).click();
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("Name"))
		      .sendKeys(str3);
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("OriginalLife"))
		      .sendKeys("8");
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("WarningLife"))
		      .sendKeys("5");
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("Parameter1"))
		      .sendKeys("53");
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("Parameter2"))
		      .sendKeys("53");
	         shebei.time1();
	         
	        driver.findElement(By.className("save-button")).click();
	        
	        //����״̬
	        driver.get("http://"+panel.MDCurl+"/CutterState");//��ָ������վd.mdc.product
//	        driver.manage().window().maximize();
//	        driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//	        driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//	        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //�����Ť
//	        System.out.println(driver.getCurrentUrl());
	        driver.navigate().refresh();
	        System.out.println(driver.getCurrentUrl());
	        shebei.time2();
	        
	        //����
	        driver.findElement(By.id("btnCreate")).click();
	        shebei.time1();
	        driver.findElement(By.xpath("//*[@id=\"select2-cutterType_Create-container\"]")).click();
	    
	        shebei.time1();
	        driver.findElement(By.xpath("//a[contains(text(),'"+str2+"')]")).click();
	        shebei.time1();
	        driver.findElement(By.xpath("//a[contains(text(),'ȷ��')]")).click();
	        shebei.time2();
	        List<WebElement> checkboxs = driver.findElements(By.className("select2-selection--single"));
	        checkboxs.get(2).click();
	       //driver.findElement(By.id("select2-cutterModel_Create-container")).click();
	        
	        driver.findElement(By.xpath("//li[contains(text(),'"+str3+"')]")).click();
	        shebei.time1();
	        driver.findElement(By.className("save-button")).click(); 
	        shebei.time1();
	        driver.close();
	   		
	        }catch(Exception e) {
	       	 e.printStackTrace();
	        }
	        }
	        else {
	        
	       
	        
	        //����ά��
	        driver.get("http://"+panel.MDCurl+"/CutterType");//��ָ������վd.mdc.product
//	        driver.manage().window().maximize();
//	        driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//	        driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//	        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //�����Ť
//	        System.out.println(driver.getCurrentUrl());
	        driver.navigate().refresh();
	        System.out.println(driver.getCurrentUrl());
	        shebei.time2();
	        
	        //��������
	        shebei.time1();
         driver.findElement(By.id("btnCreateRootCutterType")).click();
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("Name"))
		      .sendKeys(str2);
	        
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("CutterNoPrefix"))
		      .sendKeys(str3);
	        shebei.time1();
	        driver.findElement(By.className("save-button")).click();
	        
	        //��������
	        shebei.time1();
	        driver.findElement(By.xpath("//span[contains(text(),'"+str2+"')]")).click();
	        driver.findElement(By.id("btnCreateCutterModel")).click();
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("Name"))
		      .sendKeys(str3);
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("OriginalLife"))
		      .sendKeys("8");
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("WarningLife"))
		      .sendKeys("5");
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("Parameter1"))
		      .sendKeys("53");
	        shebei.time1();
	        driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
		      .findElement(By.className("modal-content"))//.findElement(By.className("modal-body"))
		      .findElement(By.className("form-validation"))
		      .findElement(By.name("Parameter2"))
		      .sendKeys("53");
	         shebei.time1();
	         
	        driver.findElement(By.className("save-button")).click();
	        
	        //����״̬
	        driver.get("http://"+panel.MDCurl+"/CutterState");//��ָ������վd.mdc.product
//	        driver.manage().window().maximize();
//	        driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//	        driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//	        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //�����Ť
//	        System.out.println(driver.getCurrentUrl());
	        driver.navigate().refresh();
	        System.out.println(driver.getCurrentUrl());
	        shebei.time2();
	        
	        //����
	        driver.findElement(By.id("btnCreate")).click();
	        shebei.time1();
	        driver.findElement(By.xpath("//*[@id=\"select2-cutterType_Create-container\"]")).click();
	    
	        shebei.time1();
	        driver.findElement(By.xpath("//a[contains(text(),'"+str2+"')]")).click();
	        shebei.time1();
	        driver.findElement(By.xpath("//a[contains(text(),'ȷ��')]")).click();
	        shebei.time2();
	        List<WebElement> checkboxs = driver.findElements(By.className("select2-selection--single"));
	        checkboxs.get(2).click();
	       //driver.findElement(By.id("select2-cutterModel_Create-container")).click();
	        
	        driver.findElement(By.xpath("//li[contains(text(),'"+str3+"')]")).click();
	        shebei.time1();
	        driver.findElement(By.className("save-button")).click(); 
	        
	        shebei.time1();
	        driver.close();
	        
	        }
	        
	 }
}
