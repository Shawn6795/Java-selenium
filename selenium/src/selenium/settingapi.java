package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class settingapi {
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
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	 public static void main(String[] args) throws IOException {
	    	
	        System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver服务地址
	        WebDriver driver =new ChromeDriver(); //新建一个WebDriver 的对象
	        driver.get("http://LZWL.project/vision/setting/api");//打开指定的网站
	        driver.manage().window().maximize();
//	        driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//	        driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//	        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
	        System.out.println(driver.getCurrentUrl());
	        driver.navigate().refresh();
	        System.out.println(driver.getCurrentUrl());
	        selenium.time2();
	        //
	      
//	        driver.findElement(By.xpath("//div[contains(text(),'当前班次')]")) .click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='普通卡片']")).click();
//	        driver.findElement(By.xpath("//span[text()='垂直卡片']")).click();
//	        driver.findElement(By.xpath("//span[text()='左右显示卡片']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'当前班次')]")) .click();
//	        selenium.time1();
	        //
	      //  driver.findElement(By.className("ivu-collapse-item")).findElement(By.className("ivu-collapse-header"))
//	        driver.findElement(By.xpath("//div[contains(text(),'设备每小时产量')]")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'当前班次')]")) .click();
//	        settingapi.time1();
//	        driver.findElement(By.xpath("//span[text()='普通柱状图']")).click();
//	        driver.findElement(By.xpath("//span[text()='横向柱状图']")).click();
//	        driver.findElement(By.xpath("//span[text()='分页柱状图']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'设备每小时产量')]")).click();
//	        selenium.time1();
	        //
	        driver.findElement(By.xpath("//div[contains(text(),'设备稼动率')]")).click();
	        driver.findElement(By.xpath("//div[contains(text(),'当前班次')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='普通柱状图']")).click();
//	        driver.findElement(By.xpath("//span[text()='横向柱状图']")).click();
//	        driver.findElement(By.xpath("//span[text()='分页柱状图']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'设备稼动率')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'设备组每小时产量')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='普通柱状图']")).click();
//	        driver.findElement(By.xpath("//span[text()='横向柱状图']")).click();
//	        driver.findElement(By.xpath("//span[text()='分页柱状图']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'设备组每小时产量')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'刀具预警')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='表头斜线表格']")).click();
//	        driver.findElement(By.xpath("//span[text()='普通表格']")).click();
//	        driver.findElement(By.xpath("//span[text()='无边框表格']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'刀具预警')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'工单达成率')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='表头斜线表格']")).click();
//	        driver.findElement(By.xpath("//span[text()='普通表格']")).click();
//	        driver.findElement(By.xpath("//span[text()='无边框表格']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'工单达成率')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'设备报警信息')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='报警框']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'设备报警信息')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'设备状态分布')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='普通柱状图']")).click();
//	        driver.findElement(By.xpath("//span[text()='横向柱状图']")).click();
//	        driver.findElement(By.xpath("//span[text()='分页柱状图']")).click();
//	        driver.findElement(By.xpath("//span[text()='普通饼图']")).click();
//	        driver.findElement(By.xpath("//span[text()='数据在中间的饼图']")).click();
//	        driver.findElement(By.xpath("//span[text()='分页饼图']")).click();
//	        driver.findElement(By.xpath("//span[text()='表头斜线表格']")).click();
//	        driver.findElement(By.xpath("//span[text()='普通表格']")).click();
//	        driver.findElement(By.xpath("//span[text()='无边框表格']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'设备状态分布')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'设备状态')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='甘特图']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'设备状态')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'每小时产量(总)')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='普通柱状图']")).click();
//	        driver.findElement(By.xpath("//span[text()='分页柱状图']")).click();
//	        driver.findElement(By.xpath("//span[text()='折线柱状混合图']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'每小时产量(总)')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'设备实时状态')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='设备']")).click();
//	        driver.findElement(By.xpath("//span[text()='设备框']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'设备实时状态')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'当前班次产量')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='普通卡片']")).click();
//	        driver.findElement(By.xpath("//span[text()='垂直卡片']")).click();
//	        driver.findElement(By.xpath("//span[text()='左右显示卡片']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'当前班次产量')]")).click();
	        
	        
}
}
