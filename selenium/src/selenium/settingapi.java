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
	    	
	        System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver�����ַ
	        WebDriver driver =new ChromeDriver(); //�½�һ��WebDriver �Ķ���
	        driver.get("http://LZWL.project/vision/setting/api");//��ָ������վ
	        driver.manage().window().maximize();
//	        driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//	        driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//	        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //�����Ť
	        System.out.println(driver.getCurrentUrl());
	        driver.navigate().refresh();
	        System.out.println(driver.getCurrentUrl());
	        selenium.time2();
	        //
	      
//	        driver.findElement(By.xpath("//div[contains(text(),'��ǰ���')]")) .click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='��ͨ��Ƭ']")).click();
//	        driver.findElement(By.xpath("//span[text()='��ֱ��Ƭ']")).click();
//	        driver.findElement(By.xpath("//span[text()='������ʾ��Ƭ']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'��ǰ���')]")) .click();
//	        selenium.time1();
	        //
	      //  driver.findElement(By.className("ivu-collapse-item")).findElement(By.className("ivu-collapse-header"))
//	        driver.findElement(By.xpath("//div[contains(text(),'�豸ÿСʱ����')]")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'��ǰ���')]")) .click();
//	        settingapi.time1();
//	        driver.findElement(By.xpath("//span[text()='��ͨ��״ͼ']")).click();
//	        driver.findElement(By.xpath("//span[text()='������״ͼ']")).click();
//	        driver.findElement(By.xpath("//span[text()='��ҳ��״ͼ']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'�豸ÿСʱ����')]")).click();
//	        selenium.time1();
	        //
	        driver.findElement(By.xpath("//div[contains(text(),'�豸�ڶ���')]")).click();
	        driver.findElement(By.xpath("//div[contains(text(),'��ǰ���')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='��ͨ��״ͼ']")).click();
//	        driver.findElement(By.xpath("//span[text()='������״ͼ']")).click();
//	        driver.findElement(By.xpath("//span[text()='��ҳ��״ͼ']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'�豸�ڶ���')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'�豸��ÿСʱ����')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='��ͨ��״ͼ']")).click();
//	        driver.findElement(By.xpath("//span[text()='������״ͼ']")).click();
//	        driver.findElement(By.xpath("//span[text()='��ҳ��״ͼ']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'�豸��ÿСʱ����')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'����Ԥ��')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='��ͷб�߱��']")).click();
//	        driver.findElement(By.xpath("//span[text()='��ͨ���']")).click();
//	        driver.findElement(By.xpath("//span[text()='�ޱ߿���']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'����Ԥ��')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'���������')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='��ͷб�߱��']")).click();
//	        driver.findElement(By.xpath("//span[text()='��ͨ���']")).click();
//	        driver.findElement(By.xpath("//span[text()='�ޱ߿���']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'���������')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'�豸������Ϣ')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='������']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'�豸������Ϣ')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'�豸״̬�ֲ�')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='��ͨ��״ͼ']")).click();
//	        driver.findElement(By.xpath("//span[text()='������״ͼ']")).click();
//	        driver.findElement(By.xpath("//span[text()='��ҳ��״ͼ']")).click();
//	        driver.findElement(By.xpath("//span[text()='��ͨ��ͼ']")).click();
//	        driver.findElement(By.xpath("//span[text()='�������м�ı�ͼ']")).click();
//	        driver.findElement(By.xpath("//span[text()='��ҳ��ͼ']")).click();
//	        driver.findElement(By.xpath("//span[text()='��ͷб�߱��']")).click();
//	        driver.findElement(By.xpath("//span[text()='��ͨ���']")).click();
//	        driver.findElement(By.xpath("//span[text()='�ޱ߿���']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'�豸״̬�ֲ�')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'�豸״̬')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='����ͼ']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'�豸״̬')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'ÿСʱ����(��)')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='��ͨ��״ͼ']")).click();
//	        driver.findElement(By.xpath("//span[text()='��ҳ��״ͼ']")).click();
//	        driver.findElement(By.xpath("//span[text()='������״���ͼ']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'ÿСʱ����(��)')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'�豸ʵʱ״̬')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='�豸']")).click();
//	        driver.findElement(By.xpath("//span[text()='�豸��']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'�豸ʵʱ״̬')]")).click();
//	        //
//	        driver.findElement(By.xpath("//div[contains(text(),'��ǰ��β���')]")).click();
//	        selenium.time1();
//	        driver.findElement(By.xpath("//span[text()='��ͨ��Ƭ']")).click();
//	        driver.findElement(By.xpath("//span[text()='��ֱ��Ƭ']")).click();
//	        driver.findElement(By.xpath("//span[text()='������ʾ��Ƭ']")).click();
//	        driver.findElement(By.xpath("//div[contains(text(),'��ǰ��β���')]")).click();
	        
	        
}
}
