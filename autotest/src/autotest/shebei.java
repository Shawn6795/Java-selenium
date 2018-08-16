package autotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class shebei {
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
	
	public static  int i_random;
	public static  String s_random;
	public static String R_random;
	
public static void main(String[] args) throws IOException {
    	
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver服务地址
        WebDriver driver =new ChromeDriver(); //新建一个WebDriver 的对象
        
//CPS MDC      
//1.添加设备 
        //登陆
        driver.get("http://"+panel.MDCurl+"/MachineSetting");//打开指定的网站
        driver.manage().window().maximize();
        driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
        driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        shebei.time2();
        
        
        //新增设备
        WebElement link =driver.findElement(By.xpath("//*[@id='CreateNewMachineButton']/i"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(link).perform();
        actions.release(link).perform();
        System.out.println(driver.getWindowHandle());
        //命名
        
        double random=(Math.random()*9+1)*1000000;
        double random2=(Math.random()*9+1)*10000;
        double random3=(Math.random()*9+1)*10000;
       
        int i2_random;
        int i3_random;
         i_random=(int)random;
         s_random=""+i_random;
        i2_random=(int)random2;
        i3_random=(int)random3;
        
       
        String I2_random=""+i2_random;
        String I3_random=""+i3_random;
        
        File fileR = new File("random.txt");
        if(!fileR.exists()) {
        try {
        FileOutputStream out = new FileOutputStream(fileR);
   		out.write(s_random.getBytes());
   		out.close();
   		
        }catch(Exception e) {
       	 e.printStackTrace();
        }
        try {
   			FileInputStream in = new FileInputStream(fileR); // 读取文件路径
   			byte bs[] = new byte[in.available()];
   			in.read(bs);
   			 String readrandom=new String(bs);
   			 int rr=Integer.parseInt(readrandom)+1;
   			 String next=String.valueOf(rr);
   			 R_random=readrandom;
   			try {
   		        FileOutputStream out = new FileOutputStream(fileR);
   		   		out.write(next.getBytes());
   		   		out.close();
   		   		
   		        }catch(Exception e) {
   		       	 e.printStackTrace();
   		        }
   			System.out.println(readrandom);
   			
        }catch (Exception e) {
    		e.printStackTrace();
    	}
        }else {
        	 try {
        			FileInputStream in = new FileInputStream(fileR); // 读取文件路径
        			byte bs[] = new byte[in.available()];
        			in.read(bs);
        			 String readrandom=new String(bs);
        			 int rr=Integer.parseInt(readrandom)+1;
        			 String next=String.valueOf(rr);
        			 R_random=readrandom;
        			try {
        		        FileOutputStream out = new FileOutputStream(fileR);
        		   		out.write(next.getBytes());
        		   		out.close();
        		   		
        		        }catch(Exception e) {
        		       	 e.printStackTrace();
        		        }
        			System.out.println(readrandom);
        			
             }catch (Exception e) {
         		e.printStackTrace();
         	}
        }
       System.out.println(R_random);
   		
        //System.out.println(random_nexts);   
        driver.findElement(By.xpath("//*[@id=\"Code\"]")).sendKeys(R_random);
        driver.findElement(By.xpath("//*[@id=\"Name\"]")).sendKeys("设备"+R_random);
        driver.findElement(By.xpath("//*[@id=\"Desc\"]")).sendKeys("设备"+R_random);
        driver.findElement(By.xpath("//*[@id=\"Create\"]")).click();
        shebei.time1();
      
       driver.findElement(By.name("MachineTypeForm")).findElement(By.name("Name")).sendKeys("设备"+R_random);
       driver.findElement(By.name("MachineTypeForm")).findElement(By.name("Desc")).sendKeys("设备"+R_random);
       driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
       .findElement(By.className("modal-content")).findElement(By.className("modal-footer"))
       .findElement(By.className("save-button")).click();
       shebei.time1();
       driver.findElement(By.xpath("//*[@id=\"SaveMachine\"]")).click();
       
       File fileM = new File("shebei.txt");
       if(!fileM.exists()) {
       try {
       FileOutputStream out = new FileOutputStream(fileM);
       String one="1";
  		out.write(one.getBytes());
  		out.close();
       }catch(Exception e) {
      	 e.printStackTrace();
       }
       }else {
    	   try {
   			FileInputStream in = new FileInputStream(fileM); // 读取文件路径
   			byte bs[] = new byte[in.available()];
   			in.read(bs);
   			String readshebei=new String(bs);
   			    System.out.println(readshebei);
   			      try {
   			    	     FileOutputStream out = new FileOutputStream(fileM);
   			    	     int shebei_next=Integer.parseInt(readshebei)+1;
   			    	     String shebei_nexts=String.valueOf(shebei_next);
   			    			out.write(shebei_nexts.getBytes());
   			    			out.close();
   			    	     }catch(Exception e) {
   			    	    	 e.printStackTrace();
   			    	     }
   			      
   				//System.out.println(q.read());
   				//System.out.println("bu");
   				
   		} catch (Exception e) {
   			e.printStackTrace();
   		}
       }
       
       
       
//2.添加设备组
       //登陆
       driver.get("http://"+panel.MDCurl+"/DeviceGroups");//打开指定的网站
       driver.manage().window().maximize();
      

       

       //设备组中添加设备
       shebei.time1();
       
       driver.findElement(By.className("jstree-wholerow")).click();
       shebei.time1();
       driver.findElement(By.xpath("//*[@id=\"AddUserToOuButton\"]")).click();
       shebei.time2();
       driver.findElement(By.xpath("//*[@id=\"lookup-modal-table\"]/thead/tr/th[1]/input")).click();
       shebei.time1();
       driver.findElement(By.className("modal-footer")).findElement(By.className("save-button")).click();
        shebei.time1();
        driver.close();
        
        
}
}
