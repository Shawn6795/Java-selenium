package autotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class banci {
public static void main(String[] args) throws IOException {
    	
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver�����ַ
        WebDriver driver =new ChromeDriver(); //�½�һ��WebDriver �Ķ���
	//3.��η���
	
    //��½
    driver.get("http://"+panel.MDCurl+"/ShiftSetting");//��ָ������վ
    driver.manage().window().maximize();
    driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
    driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //�����Ť
    driver.navigate().refresh();
    shebei.time2();
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
			FileInputStream in = new FileInputStream(fileR); // ��ȡ�ļ�·��
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
    			FileInputStream in = new FileInputStream(fileR); // ��ȡ�ļ�·��
    			byte bs[] = new byte[in.available()];
    			in.read(bs);
    			 String readrandom=new String(bs);
    			
    			 
    			 shebei.R_random=readrandom;
    			
    			System.out.println(readrandom);
    			
         }catch (Exception e) {
     		e.printStackTrace();
     	}
    }
   File file = new File("banci.txt");
   if(!file.exists()) {
  	 driver.findElement(By.xpath("//*[@id=\"AddShiftSolution\"]")).click();//������η������
       shebei.time1();
       driver.findElement(By.name("ShiftSolutionForm")).findElement(By.className("form-control")).sendKeys("���"+shebei.R_random);
       shebei.time1();
       driver.findElement(By.className("modal-footer")).findElement(By.className("save-button")).click();
       shebei.time1();
       driver.findElement(By.className("jstree-node")).findElement(By.className("jstree-wholerow")).click();
       shebei.time1();
      System.out.println(driver.findElement(By.xpath("//*[@id=\"ShiftSolutionTree\"]")).getAttribute("aria-activedescendant"));
      String banci=driver.findElement(By.xpath("//*[@id=\"ShiftSolutionTree\"]")).getAttribute("aria-activedescendant");
      int banci_i=Integer.parseInt(banci);
   try {
   FileOutputStream out = new FileOutputStream(file);
		out.write(banci.getBytes());
		out.close();
   }catch(Exception e) {
  	 e.printStackTrace();
   }
   try {
			FileInputStream in = new FileInputStream(file); // ��ȡ�ļ�·��
			byte bs[] = new byte[in.available()];
			in.read(bs);
			String readbanci=new String(bs);
			
				//System.out.println("kong");
			   // p.print(banci_i+1);
			   // readbanci=txtread(file);
			    System.out.println(readbanci);
			    driver.findElement(By.xpath("//*[@id=\""+readbanci+"\"]/div")).click();//*[@id="105"]/div
			      driver.findElement(By.xpath("//*[@id=\"EditShiftInfo\"]")).click();//�༭��η������
			      shebei.time1();
			      try {
			    	     FileOutputStream out = new FileOutputStream(file);
			    	     int banci_next=Integer.parseInt(readbanci)+1;
			    	     String banci_nexts=String.valueOf(banci_next);
			    			out.write(banci_nexts.getBytes());
			    			out.close();
			    	     }catch(Exception e) {
			    	    	 e.printStackTrace();
			    	     }
			      shebei.time1();
			      driver.findElement(By.xpath("//*[@id=\"AddShiftInfo\"]")).click();//����������
			      driver.findElement(By.xpath("//*[@id=\"AddShiftInfo\"]")).click();
			      //driver.findElement(By.xpath("//*[@id=\"AddShiftInfo\"]")).click();
			      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[0].Name")).sendKeys("���");
			      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[1].Name")).sendKeys("�а�");
			      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[2].Name")).sendKeys("���");
			      
			      //�翪ʼʱ�����8��
			      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[0].StartTime")).click();
			      shebei.time1();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      
			      //�����ʱ�����
			      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[0].EndTime")).click();
			      shebei.time1();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      
			      //�п�ʼʱ�����
			      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[1].StartTime")).click();
			      shebei.time1();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
			      
			      //�й���ʱ������
			      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[1].Duration")).clear();
			      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[1].Duration")).sendKeys("7.50");
			      shebei.time1();
			      //�п���ѡ��
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[7]/input")).click();
			      //�����ʱ�����
			      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[2].EndTime")).click();
			      shebei.time1();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
			      //�����ѡ��
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[7]/input")).click();
			      shebei.time1();
			      //����
			      driver.findElement(By.className("modal-footer")).findElement(By.className("save-button")).click();
			    
			
				//System.out.println(q.read());
				//System.out.println("bu");
				
		} catch (Exception e) {
			e.printStackTrace();
		}
   }

    
      
//�Ű�
      //��½
   
    driver.navigate().to("http://"+panel.MDCurl+"/MachineShiftSetting"); //��ָ������վ
    driver.manage().window().maximize();
//    driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//    driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //�����Ť
    System.out.println(driver.getCurrentUrl());
    driver.navigate().refresh();
    System.out.println(driver.getCurrentUrl());
    shebei.time2();
    File fileM = new File("shebei.txt");
    try {
			FileInputStream in = new FileInputStream(fileM); // ��ȡ�ļ�·��
			byte bs[] = new byte[in.available()];
			in.read(bs);
			String readshebei=new String(bs);
			int readshebei_i=Integer.parseInt(readshebei);
			    System.out.println(readshebei);
			    System.out.println(readshebei_i);
			    if(readshebei_i==1) {
			    	driver.findElement(By.xpath("//*[@id=\"MachineShiftTable\"]/tbody/tr/td[1]/button[2]")).click();
			        shebei.time1();
			    }else {
			    	driver.findElement(By.xpath("//*[@id=\"MachineShiftTable\"]/tbody/tr["+readshebei_i+"]/td[1]/button[2]")).click();
			    	shebei.time1();
			    }
    }catch (Exception e) {
			e.printStackTrace();
		}

    driver.findElement(By.xpath("//*[@id=\"MachineShiftSolutionTable\"]/tbody/tr/td[2]/div/select")).click();
    shebei.time1();
    System.out.println(driver.findElement(By.cssSelector("#MachineShiftSolutionTable > tbody > tr > td:nth-child(2) > div > select > option")).getAttribute("value"));
    String paiban=driver.findElement(By.cssSelector("#MachineShiftSolutionTable > tbody > tr > td:nth-child(2) > div > select > option")).getAttribute("value");
    int paiban_i=Integer.parseInt(paiban);
    try {
			FileInputStream in = new FileInputStream(file); // ��ȡ�ļ�·��
			byte bs[] = new byte[in.available()];
			in.read(bs);
			String readbanci=new String(bs);
			    System.out.println(readbanci);
			int paiban_r=Integer.parseInt(readbanci);
			int paiban_next=paiban_r-paiban_i;
			System.out.println(paiban_next);
			if(paiban_r==paiban_i) {
		    	  driver.findElement(By.cssSelector("#MachineShiftSolutionTable > tbody > tr > td:nth-child(2) > div > select > option")).click();
		          shebei.time1();
		      }else {
		    	  
		    	  driver.findElement(By.cssSelector("#MachineShiftSolutionTable > tbody > tr > td:nth-child(2) > div > select > option:nth-child("+paiban_next+")")).click();
		          shebei.time1();
		      }
				
		} catch (Exception e) {
			e.printStackTrace();
		}
    
    driver.findElement(By.xpath("//*[@id=\"MachineShiftSolutionTable\"]/tbody/tr/td[4]/div/input")).click();
    shebei.time1();
    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/table/thead/tr[1]/th[4]")).click();
   // driver.findElement(By.className("modal-header")).findElement(By.className("modal-title")).click();
    shebei.time1();
    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/table/tbody/tr[3]/td[7]")).click();
    shebei.time1();
    driver.findElement(By.className("modal-footer")).findElement(By.className("save-button")).click();
    shebei.time1();
    driver.close();
    
    
}
}
