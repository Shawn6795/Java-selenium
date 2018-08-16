package autotest;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class gongdan {
public static void main(String[] args)  {
    	
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver服务地址
        WebDriver driver =new ChromeDriver(); //新建一个WebDriver 的对象
        
        String str="";
        String str2="";
        String str3="";
        String str4="";
        String str5="";
        for (int i = 0;i<5;i++){
            str = str+ (char)(Math.random()*26+'A');
            str2=str2+(char)(Math.random()*26+'A');
            str3=str3+(char)(Math.random()*26+'A');
            str4=str4+(char)(Math.random()*26+'A');
            str5=str5+(char)(Math.random()*26+'A');
        }
        int i=(int)(Math.random()*900)+100;
        String sint=""+i;
//CPS MDC      
//1.工单 
       // 登陆
        driver.get("http://"+panel.MDCurl+"/DefectiveReasons");//打开指定的网站
        driver.manage().window().maximize();
        driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
        driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        shebei.time2();
        
        //新建次品原因
        driver.findElement(By.xpath("//*[@id=\"CreateNewReason\"]")).click();
        shebei.time1();
        System.out.println(str);
        List<WebElement> checkboxs1 = driver.findElements(By.className("form-control"));
        checkboxs1.get(2).sendKeys(str);
        shebei.time1();
        checkboxs1.get(3).sendKeys("刀具"+str);
        shebei.time1();
        checkboxs1.get(4).sendKeys(str);
        shebei.time1();
        driver.findElement(By.className("save-button")).click();
        
        //工序
        driver.get("http://"+panel.MDCurl+"/Process");//打开指定的网站
//      driver.manage().window().maximize();
//      driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//      driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//      driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
//      System.out.println(driver.getCurrentUrl());
      driver.navigate().refresh();
      System.out.println(driver.getCurrentUrl());
      shebei.time2();
      
      driver.findElement(By.xpath("//*[@id=\"CreateNewProcess\"]")).click();
      shebei.time1();
    System.out.println(str);
    List<WebElement> checkboxs2 = driver.findElements(By.className("form-control"));
    checkboxs2.get(2).sendKeys(str2);
    shebei.time1();
    checkboxs2.get(3).sendKeys("刀具"+str2);
    shebei.time1();
    checkboxs2.get(4).sendKeys(str2);
    shebei.time1();
    driver.findElement(By.className("save-button")).click();
        
        //产品
      driver.get("http://"+panel.MDCurl+"/Product");//打开指定的网站
//      driver.manage().window().maximize();
//      driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//      driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//      driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
//      System.out.println(driver.getCurrentUrl());
      driver.navigate().refresh();
      System.out.println(driver.getCurrentUrl());
      shebei.time2();
        
        driver.findElement(By.xpath("//*[@id=\"btnCreateProductGroup\"]")).click();
        shebei.time1();
      System.out.println(str);
      List<WebElement> checkboxs3 = driver.findElements(By.className("form-control"));
      checkboxs3.get(1).sendKeys("123"+str3);
      shebei.time1();
      checkboxs3.get(2).sendKeys("刀具"+str3);
      shebei.time1();
      checkboxs3.get(3).sendKeys(str3);
      shebei.time1();
      driver.findElement(By.className("save-button")).click();
      shebei.time1();
      driver.findElement(By.xpath("//span[contains(text(),'"+str3+"')]")).click();
      shebei.time1();
      driver.findElement(By.xpath("//*[@id=\"btnCreateProduct\"]")).click();
      shebei.time1();
      List<WebElement> checkboxs4 = driver.findElements(By.className("form-control"));
      checkboxs4.get(1).sendKeys("123"+str4);
        checkboxs4.get(2).sendKeys("扫码枪"+str4);
        checkboxs4.get(3).sendKeys("30*30");
        checkboxs4.get(4).sendKeys(str4);
        checkboxs4.get(6).sendKeys(str4);
        shebei.time1();
        driver.findElement(By.className("save-button")).click();
              
        //标准用时
      driver.get("http://"+panel.MDCurl+"/StandardTime");//打开指定的网站
//      driver.manage().window().maximize();
//      driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//      driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//      driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
//      System.out.println(driver.getCurrentUrl());
      driver.navigate().refresh();
      System.out.println(driver.getCurrentUrl());
      shebei.time2();
        
      driver.findElement(By.xpath("//*[@id=\"Create\"]")).click();
      shebei.time1();
      List<WebElement> checkboxs5 = driver.findElements(By.className("select2-selection"));
      checkboxs5.get(0).click();
      //driver.findElement(By.xpath("//li[contains(text(),'LZQLH')]")).click();
      driver.findElement(By.xpath("//li[contains(text(),'"+str4+"')]")).click();
      shebei.time1();
      checkboxs5.get(1).click();
      driver.findElement(By.xpath("//li[contains(text(),'"+str2+"')]")).click();
      shebei.time1();
      List<WebElement> checkboxs6 = driver.findElements(By.className("form-control"));
      checkboxs6.get(4).sendKeys("1");
      checkboxs6.get(5).clear();
      checkboxs6.get(5).sendKeys("1");
      checkboxs6.get(6).sendKeys(str4);
      driver.findElement(By.className("save-button")).click();
        
      //工艺
      driver.get("http://"+panel.MDCurl+"/Craft");//打开指定的网站
//      driver.manage().window().maximize();
//      driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//      driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//      driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
//      System.out.println(driver.getCurrentUrl());
      driver.navigate().refresh();
      System.out.println(driver.getCurrentUrl());
      shebei.time2();
      
      driver.findElement(By.xpath("//*[@id=\"btnCreateCraft\"]")).click();
      shebei.time1();
      List<WebElement> checkboxs7 = driver.findElements(By.className("form-control"));
      shebei.time1();
      checkboxs7.get(1).sendKeys(sint);
      checkboxs7.get(2).sendKeys(str5);
      driver.findElement(By.className("save-button")).click();
      shebei.time1();
      driver.findElement(By.xpath("//span[contains(text(),'"+str5+"')]")).click();
      shebei.time1();
      driver.findElement(By.xpath("//*[@id=\"btnSelectProcess\"]")).click();
      shebei.time1();
      driver.findElement(By.xpath("//*[@id=\"lookup-modal-table\"]/thead/tr/th[1]/input")).click();
      driver.findElement(By.className("save-button")).click();
      
      //设备换产
        driver.get("http://"+panel.MDCurl+"/MachineProcess");//打开指定的网站
//      driver.manage().window().maximize();
//      driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//      driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//      driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
//      System.out.println(driver.getCurrentUrl());
      driver.navigate().refresh();
      System.out.println(driver.getCurrentUrl());
      shebei.time2();
      
        driver.findElement(By.xpath("//*[@id=\"btnMachineChange\"]")).click();
        shebei.time1();
        driver.findElement(By.className("save-button")).click();
        
        //生产计划
        driver.get("http://"+panel.MDCurl+"/ProductionPlan");//打开指定的网站
//      driver.manage().window().maximize();
//      driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//      driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//      driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
//      System.out.println(driver.getCurrentUrl());
      driver.navigate().refresh();
      System.out.println(driver.getCurrentUrl());
      shebei.time2();
       
        driver.findElement(By.xpath("//*[@id=\"app-productionplan\"]/section[2]/div[1]/div/div/div[2]/form/div[3]/div/button[1]")).click();
        shebei.time1();
        List<WebElement> checkboxs8 = driver.findElements(By.className("select2-selection"));
        shebei.time1();
        checkboxs8.get(0).click();
        //driver.findElement(By.xpath("//li[contains(text(),'LZQLH')]")).click();
         driver.findElement(By.xpath("//li[contains(text(),'"+str4+"')]")).click();
        checkboxs8.get(1).click();
        //driver.findElement(By.xpath("//li[contains(text(),'OYOYT')]")).click();
        driver.findElement(By.xpath("//li[contains(text(),'"+str5+"')]")).click();
        driver.findElement(By.xpath("//*[@id=\"app-productionPlanForm\"]/div[2]/div[4]/div[1]/input")).sendKeys("10");
        driver.findElement(By.xpath("//*[@id=\"app-productionPlanForm\"]/div[2]/div[4]/div[2]/input")).sendKeys("10");
        driver.findElement(By.className("save-button")).click(); 
        shebei.time1();
        driver.close();
        
    }

}
