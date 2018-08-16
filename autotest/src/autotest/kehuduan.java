package autotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class kehuduan {
	
	 public static void main(String[] args) throws IOException {
	    	
	        System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver服务地址
	       
	//DMP
    //登陆
    
    WebDriver driver2 =new ChromeDriver();
    driver2.get("http://"+panel.DMPurl+"/WebAdmin/devices.html");//打开指定的网站
    driver2.manage().window().maximize();
    
  //*[@id="treeview"]/ul/li/ul/li[1]/div
  //*[@id="treeview"]/ul/li/ul/li[2]/div
    File fileM = new File("shebei.txt");
    try {
			FileInputStream in = new FileInputStream(fileM); // 读取文件路径
			byte bs[] = new byte[in.available()];
			in.read(bs);
			String readshebei=new String(bs);
			int readshebei_i=Integer.parseInt(readshebei);
			int rs=readshebei_i-1;
			
			    System.out.println(rs);
			    if(readshebei_i==1) {
			    	driver2.findElement(By.xpath("//*[@id=\"treeview\"]/ul/li/ul/li/div/span")).click();
			        shebei.time1();
			        driver2.findElement(By.xpath("/html/body/div/section/section[2]/header/ul/li[2]/a")).click();
			        driver2.findElement(By.cssSelector("#driver-name > option:nth-child(2)")).click();
			        driver2.findElement(By.xpath("//*[@id=\"driver-config-panel\"]/div[2]/button[1]")).click();
			        
			    }else {
			    	shebei.time1();
			    	driver2.findElement(By.xpath("//*[@id=\"treeview\"]/ul/li/ul/li["+readshebei+"]/div")).click();
			    	shebei.time1();
			    	driver2.findElement(By.xpath("/html/body/div/section/section[2]/header/ul/li[2]/a")).click();
			        driver2.findElement(By.cssSelector("#driver-name > option:nth-child(2)")).click();
			        shebei.time1();
			      //*[@id="treeview"]/ul/li/ul/li[2]/div/span
			       // driver2.findElement(By.xpath("//*[@id=\"driver-config-controls\"]/div[4]/div/input")).click();
			        driver2.findElement(By.xpath("//*[@id=\"driver-config-controls\"]/div[4]/div/input")).clear();
			        driver2.findElement(By.xpath("//*[@id=\"driver-config-controls\"]/div[4]/div/input")).sendKeys("Device"+rs);
			        shebei.time1();
			        driver2.findElement(By.xpath("//*[@id=\"driver-config-panel\"]/div[2]/button[1]")).click();
			      
			    }
  }catch (Exception e) {
			e.printStackTrace();
		}
    
    File fileR = new File("random.txt");
    if(!fileR.exists()) {
        try {
        FileOutputStream out = new FileOutputStream(fileR);
   		out.write(shebei.s_random.getBytes());
   		out.close();
   		
        }catch(Exception e) {
       	 e.printStackTrace();
        }
        try {
   			FileInputStream in = new FileInputStream(fileR); // 读取文件路径
   			byte bs[] = new byte[in.available()];
   			in.read(bs);
   			 String readrandom=new String(bs);
   			
   			 shebei.R_random=readrandom;
   			
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
        			 
        			 shebei.R_random=readrandom;
        			
        			System.out.println(readrandom);
        			
             }catch (Exception e) {
         		e.printStackTrace();
         	}
        }
    driver2.findElement(By.xpath("/html/body/div/section/section[2]/header/ul/li[1]/a")).click();
    driver2.findElement(By.xpath("//*[@id=\"var-tabpage\"]/div/div[1]/div[2]/button")).click();
    driver2.findElement(By.xpath("//*[@id=\"device-template-load-list\"]/li/a")).click();
    shebei.time1();
    driver2.findElement(By.className("alert-dialog-ok")).click();
    shebei.time1();
    driver2.findElement(By.className("fa-play")).click();
      
      //快速客户端
    driver2.findElement(By.xpath("//*[@id=\"main-navigation-list\"]/li[4]/a")).click();
    driver2.findElement(By.xpath("//*[@id=\"main-navigation-list\"]/li[4]/ul/li[1]/a")).click();
    driver2.navigate().refresh();
    
    try {
			FileInputStream in = new FileInputStream(fileR); // 读取文件路径
			byte bs[] = new byte[in.available()];
			in.read(bs);
			String readshebei=new String(bs);
			int readshebei_i=Integer.parseInt(readshebei);
			readshebei_i=readshebei_i-1;
			    System.out.println(readshebei);		    
			    	shebei.time1();
			    	// driver.findElement(By.xpath("//div[contains(text(),'设备稼动率')]")).click();
			    	driver2.findElement(By.xpath("//span[contains(text(),'"+readshebei_i+"')]")).click();
			    	shebei.time1();
			    	
			    
}catch (Exception e) {
			e.printStackTrace();
		}
    
    double random2=(Math.random()*9+1)*10000;
    double random3=(Math.random()*9+1)*10000;
   
    int i2_random;
    int i3_random;
    
    i2_random=(int)random2;
    i3_random=(int)random3;
    
    String I2_random=""+i2_random;
    String I3_random=""+i3_random;
    
    driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[1]/td[5]")).click();
    shebei.time1();
    driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[1]/td[5]/input")).sendKeys("2");
    driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[3]/td[5]")).click();
    shebei.time1();
    driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[3]/td[5]/input")).sendKeys(""+shebei.R_random);
    driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[6]/td[5]")).click();
    shebei.time1();
    driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[6]/td[5]/input")).sendKeys(I2_random);
    driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[11]/td[5]")).click();
    shebei.time1();
    driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[11]/td[5]/input")).sendKeys(I3_random);
    driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[12]/td[5]")).click();
    shebei.time1();
    driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[12]/td[5]/input")).sendKeys("Ture");
    driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[13]/td[5]")).click();
    shebei.time1();
    driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[13]/td[5]/input")).sendKeys("Ture");
    shebei.time1();
    driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[15]/td[5]")).click();
    shebei.time1();
    driver2.navigate().refresh();
    
    driver2.close();
	 }
}
