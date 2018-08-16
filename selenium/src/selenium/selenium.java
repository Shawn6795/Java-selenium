package selenium;

import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium {
	
	
	public static  int i_random;
	public static  String s_random;
	public static String R_random;
	public static String url;
	public static String DMPurl;
	
	
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
	 
    public static void main(String[] args) throws IOException {
    	
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver�����ַ
        WebDriver driver =new ChromeDriver(); //�½�һ��WebDriver �Ķ���
        
//CPS MDC      
//1.����豸 
        //��½
        driver.get("http://"+url+"/MachineSetting");//��ָ������վ
        driver.manage().window().maximize();
        driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
        driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //�����Ť
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        selenium.time2();
        
        
        //�����豸
        WebElement link =driver.findElement(By.xpath("//*[@id='CreateNewMachineButton']/i"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(link).perform();
        actions.release(link).perform();
        System.out.println(driver.getWindowHandle());
        //����
        
        double random=(Math.random()*9+1)*1000000;
        double random2=(Math.random()*9+1)*10000;
        double random3=(Math.random()*9+1)*10000;
       
        int i2_random;
        int i3_random;
         i_random=(int)random;
         s_random=""+i_random;
        i2_random=(int)random2;
        i3_random=(int)random3;
        
        //String E_random= "Abc"+i_random;
        //String C_random="�豸"+i_random;
       // String B_random="���"+i_random;
       // String I_random=""+i_random;
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
   			FileInputStream in = new FileInputStream(fileR); // ��ȡ�ļ�·��
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
        			FileInputStream in = new FileInputStream(fileR); // ��ȡ�ļ�·��
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
        driver.findElement(By.xpath("//*[@id=\"Name\"]")).sendKeys("�豸"+R_random);
        driver.findElement(By.xpath("//*[@id=\"Desc\"]")).sendKeys("�豸"+R_random);
        driver.findElement(By.xpath("//*[@id=\"Create\"]")).click();
        selenium.time1();
      
       driver.findElement(By.name("MachineTypeForm")).findElement(By.name("Name")).sendKeys("�豸"+R_random);
       driver.findElement(By.name("MachineTypeForm")).findElement(By.name("Desc")).sendKeys("�豸"+R_random);
       driver.findElement(By.className("modal")).findElement(By.className("modal-dialog"))
       .findElement(By.className("modal-content")).findElement(By.className("modal-footer"))
       .findElement(By.className("save-button")).click();
       selenium.time1();
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
   			FileInputStream in = new FileInputStream(fileM); // ��ȡ�ļ�·��
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
       
       
       
//2.����豸��
       //��½
       driver.get("http://"+url+"/DeviceGroups");//��ָ������վ
       driver.manage().window().maximize();
      

       

       //�豸��������豸
       selenium.time1();
       
       driver.findElement(By.className("jstree-wholerow")).click();
       selenium.time1();
       driver.findElement(By.xpath("//*[@id=\"AddUserToOuButton\"]")).click();
       selenium.time2();
       driver.findElement(By.xpath("//*[@id=\"lookup-modal-table\"]/thead/tr/th[1]/input")).click();
       driver.findElement(By.className("modal-footer")).findElement(By.className("save-button")).click();
       
     
//3.��η���
      //��½
      driver.get("http://"+url+"/ShiftSetting");//��ָ������վ
      driver.manage().window().maximize();
//      driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//      driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//      driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //�����Ť
      driver.navigate().refresh();
      selenium.time2();
//      driver.findElement(By.xpath("//*[@id=\"AddShiftSolution\"]")).click();//������η������
//      selenium.time1();
//      driver.findElement(By.name("ShiftSolutionForm")).findElement(By.className("form-control")).sendKeys("���"+R_random);
//      selenium.time1();
//      driver.findElement(By.className("modal-footer")).findElement(By.className("save-button")).click();
//      selenium.time1();
//      driver.findElement(By.className("jstree-node")).findElement(By.className("jstree-wholerow")).click();
//      selenium.time1();
//     System.out.println(driver.findElement(By.xpath("//*[@id=\"ShiftSolutionTree\"]")).getAttribute("aria-activedescendant"));
//     String banci=driver.findElement(By.xpath("//*[@id=\"ShiftSolutionTree\"]")).getAttribute("aria-activedescendant");
//     int banci_i=Integer.parseInt(banci);
     //int banci_i1 = Integer.parseInt(banci)+1;
     File file = new File("banci.txt");
     if(!file.exists()) {
    	 driver.findElement(By.xpath("//*[@id=\"AddShiftSolution\"]")).click();//������η������
         selenium.time1();
         driver.findElement(By.name("ShiftSolutionForm")).findElement(By.className("form-control")).sendKeys("���"+R_random);
         selenium.time1();
         driver.findElement(By.className("modal-footer")).findElement(By.className("save-button")).click();
         selenium.time1();
         driver.findElement(By.className("jstree-node")).findElement(By.className("jstree-wholerow")).click();
         selenium.time1();
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
			      selenium.time1();
			      try {
			    	     FileOutputStream out = new FileOutputStream(file);
			    	     int banci_next=Integer.parseInt(readbanci)+1;
			    	     String banci_nexts=String.valueOf(banci_next);
			    			out.write(banci_nexts.getBytes());
			    			out.close();
			    	     }catch(Exception e) {
			    	    	 e.printStackTrace();
			    	     }
			      selenium.time1();
			      driver.findElement(By.xpath("//*[@id=\"AddShiftInfo\"]")).click();//����������
			      driver.findElement(By.xpath("//*[@id=\"AddShiftInfo\"]")).click();
			      //driver.findElement(By.xpath("//*[@id=\"AddShiftInfo\"]")).click();
			      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[0].Name")).sendKeys("���");
			      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[1].Name")).sendKeys("�а�");
			      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[2].Name")).sendKeys("���");
			      
			      //�翪ʼʱ�����8��
			      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[0].StartTime")).click();
			      selenium.time1();
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
			      selenium.time1();
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
			      selenium.time1();
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
			      selenium.time1();
			      //�п���ѡ��
			      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[7]/input")).click();
			      //�����ʱ�����
			      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[2].EndTime")).click();
			      selenium.time1();
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
			      selenium.time1();
			      //����
			      driver.findElement(By.className("modal-footer")).findElement(By.className("save-button")).click();
			    
			
				//System.out.println(q.read());
				//System.out.println("bu");
				
		} catch (Exception e) {
			e.printStackTrace();
		}
     }
 //    else {
//     try {
//			FileInputStream in = new FileInputStream(file); // ��ȡ�ļ�·��
//			byte bs[] = new byte[in.available()];
//			in.read(bs);
//			String readbanci=new String(bs);
//			
//				//System.out.println("kong");
//			   // p.print(banci_i+1);
//			   // readbanci=txtread(file);
//			    System.out.println(readbanci);
//			    driver.findElement(By.xpath("//*[@id=\""+readbanci+"\"]/div")).click();//*[@id="105"]/div
//			      driver.findElement(By.xpath("//*[@id=\"EditShiftInfo\"]")).click();//�༭��η������
//			      selenium.time1();
//			      try {
//			    	     FileOutputStream out = new FileOutputStream(file);
//			    	     int banci_next=Integer.parseInt(readbanci)+1;
//			    	     String banci_nexts=String.valueOf(banci_next);
//			    			out.write(banci_nexts.getBytes());
//			    			out.close();
//			    	     }catch(Exception e) {
//			    	    	 e.printStackTrace();
//			    	     }
//			      
//				//System.out.println(q.read());
//				//System.out.println("bu");
//				
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//     }
//
//		//System.out.println(readbanci);
//
//		
//		//p.print(banci_i);
//     //System.out.println(banci_i);
////      driver.findElement(By.xpath("//*[@id=\""+banci_i+"\"]/div")).click();
////      driver.findElement(By.xpath("//*[@id=\"EditShiftInfo\"]")).click();//�༭��η������
//      selenium.time1();
//      driver.findElement(By.xpath("//*[@id=\"AddShiftInfo\"]")).click();//����������
//      driver.findElement(By.xpath("//*[@id=\"AddShiftInfo\"]")).click();
//      //driver.findElement(By.xpath("//*[@id=\"AddShiftInfo\"]")).click();
//      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[0].Name")).sendKeys("���1");
//      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[1].Name")).sendKeys("�а�2");
//      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[2].Name")).sendKeys("���3");
//      
//      //�翪ʼʱ�����8��
//      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[0].StartTime")).click();
//      selenium.time1();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[3]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      
//      //�����ʱ�����
//      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[0].EndTime")).click();
//      selenium.time1();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[1]/td[4]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      
//      //�п�ʼʱ�����
//      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[1].StartTime")).click();
//      selenium.time1();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[3]/div/div/table/tbody/tr[3]/td[1]/a")).click();
//      
//      //�й���ʱ������
//      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[1].Duration")).clear();
//      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[1].Duration")).sendKeys("7.50");
//      selenium.time1();
//      //�п���ѡ��
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[2]/td[7]/input")).click();
//      //�����ʱ�����
//      driver.findElement(By.name("ShiftInfoForm")).findElement(By.name("ShiftInfo[2].EndTime")).click();
//      selenium.time1();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[4]/div/div/table/tbody/tr[1]/td[1]/a")).click();
//      //�����ѡ��
//      driver.findElement(By.xpath("//*[@id=\"ShiftInfoTableEdit\"]/tbody/tr[3]/td[7]/input")).click();
//      selenium.time1();
//      //����
//      driver.findElement(By.className("modal-footer")).findElement(By.className("save-button")).click();
      
        
//�Ű�
        //��½
     
      driver.navigate().to("http://"+url+"/MachineShiftSetting"); //��ָ������վ
      driver.manage().window().maximize();
//      driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//      driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//      driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //�����Ť
      System.out.println(driver.getCurrentUrl());
      driver.navigate().refresh();
      System.out.println(driver.getCurrentUrl());
      selenium.time2();
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
 			        selenium.time1();
 			    }else {
 			    	driver.findElement(By.xpath("//*[@id=\"MachineShiftTable\"]/tbody/tr["+readshebei_i+"]/td[1]/button[2]")).click();
 			    	selenium.time1();
 			    }
      }catch (Exception e) {
			e.printStackTrace();
		}
  
      driver.findElement(By.xpath("//*[@id=\"MachineShiftSolutionTable\"]/tbody/tr/td[2]/div/select")).click();
      selenium.time1();
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
		          selenium.time1();
		      }else {
		    	  
		    	  driver.findElement(By.cssSelector("#MachineShiftSolutionTable > tbody > tr > td:nth-child(2) > div > select > option:nth-child("+paiban_next+")")).click();
		          selenium.time1();
		      }
				
		} catch (Exception e) {
			e.printStackTrace();
		}
      
      driver.findElement(By.xpath("//*[@id=\"MachineShiftSolutionTable\"]/tbody/tr/td[4]/div/input")).click();
      selenium.time1();
      driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/table/thead/tr[1]/th[4]")).click();
     // driver.findElement(By.className("modal-header")).findElement(By.className("modal-title")).click();
      selenium.time1();
      driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/table/tbody/tr[3]/td[7]")).click();
      driver.findElement(By.className("modal-footer")).findElement(By.className("save-button")).click();

//DMP
      //��½
      
      WebDriver driver2 =new ChromeDriver();
      driver2.get("http://"+DMPurl+"/WebAdmin/devices.html");//��ָ������վ
      driver2.manage().window().maximize();
      
    //*[@id="treeview"]/ul/li/ul/li[1]/div
    //*[@id="treeview"]/ul/li/ul/li[2]/div
      
      try {
			FileInputStream in = new FileInputStream(fileM); // ��ȡ�ļ�·��
			byte bs[] = new byte[in.available()];
			in.read(bs);
			String readshebei=new String(bs);
			int readshebei_i=Integer.parseInt(readshebei);
			int rs=readshebei_i-1;
			
			    System.out.println(rs);
			    if(readshebei_i==1) {
			    	driver2.findElement(By.xpath("//*[@id=\"treeview\"]/ul/li/ul/li/div/span")).click();
			        selenium.time1();
			        driver2.findElement(By.xpath("/html/body/div/section/section[2]/header/ul/li[2]/a")).click();
			        driver2.findElement(By.cssSelector("#driver-name > option:nth-child(2)")).click();
			        driver2.findElement(By.xpath("//*[@id=\"driver-config-panel\"]/div[2]/button[1]")).click();
			        
			    }else {
			    	selenium.time1();
			    	driver2.findElement(By.xpath("//*[@id=\"treeview\"]/ul/li/ul/li["+readshebei+"]/div")).click();
			    	selenium.time1();
			    	driver2.findElement(By.xpath("/html/body/div/section/section[2]/header/ul/li[2]/a")).click();
			        driver2.findElement(By.cssSelector("#driver-name > option:nth-child(2)")).click();
			        selenium.time1();
			      //*[@id="treeview"]/ul/li/ul/li[2]/div/span
			       // driver2.findElement(By.xpath("//*[@id=\"driver-config-controls\"]/div[4]/div/input")).click();
			        driver2.findElement(By.xpath("//*[@id=\"driver-config-controls\"]/div[4]/div/input")).clear();
			        driver2.findElement(By.xpath("//*[@id=\"driver-config-controls\"]/div[4]/div/input")).sendKeys("Device"+rs);
			        selenium.time1();
			        driver2.findElement(By.xpath("//*[@id=\"driver-config-panel\"]/div[2]/button[1]")).click();
			      
			    }
    }catch (Exception e) {
			e.printStackTrace();
		}
      
    
      driver2.findElement(By.xpath("/html/body/div/section/section[2]/header/ul/li[1]/a")).click();
      driver2.findElement(By.xpath("//*[@id=\"var-tabpage\"]/div/div[1]/div[2]/button")).click();
      driver2.findElement(By.xpath("//*[@id=\"device-template-load-list\"]/li/a")).click();
      selenium.time1();
      driver2.findElement(By.className("alert-dialog-ok")).click();
      selenium.time1();
      driver2.findElement(By.className("fa-play")).click();
        
        //���ٿͻ���
      driver2.findElement(By.xpath("//*[@id=\"main-navigation-list\"]/li[4]/a")).click();
      driver2.findElement(By.xpath("//*[@id=\"main-navigation-list\"]/li[4]/ul/li[1]/a")).click();
      driver2.navigate().refresh();
      
      try {
			FileInputStream in = new FileInputStream(fileR); // ��ȡ�ļ�·��
			byte bs[] = new byte[in.available()];
			in.read(bs);
			String readshebei=new String(bs);
			int readshebei_i=Integer.parseInt(readshebei);
			readshebei_i=readshebei_i-1;
			    System.out.println(readshebei);		    
			    	selenium.time1();
			    	// driver.findElement(By.xpath("//div[contains(text(),'�豸�ڶ���')]")).click();
			    	driver2.findElement(By.xpath("//span[contains(text(),'"+readshebei_i+"')]")).click();//*[@id="treeview"]/ul/li/ul/li[1]/div
			    	selenium.time1();
			    
  }catch (Exception e) {
			e.printStackTrace();
		}
    
      driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[1]/td[5]")).click();
      selenium.time1();
      driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[1]/td[5]/input")).sendKeys("2");
      driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[3]/td[5]")).click();
      selenium.time1();
      driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[3]/td[5]/input")).sendKeys(""+R_random);
      driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[6]/td[5]")).click();
      selenium.time1();
      driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[6]/td[5]/input")).sendKeys(I2_random);
      driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[11]/td[5]")).click();
      selenium.time1();
      driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[11]/td[5]/input")).sendKeys(I3_random);
      driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[12]/td[5]")).click();
      selenium.time1();
      driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[12]/td[5]/input")).sendKeys("Ture");
      driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[13]/td[5]")).click();
      selenium.time1();
      driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[13]/td[5]/input")).sendKeys("Ture");
      selenium.time1();
      driver2.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[15]/td[5]")).click();
      selenium.time1();
      driver2.navigate().refresh();
      driver.close();
      driver2.close();
      data d=new data();
      d.main(args);
      
      
      
       
       
        /**
         * dr.quit()��dr.close()�������˳������,�򵥵�˵һ�����ߵ����𣺵�һ��close��
         * ������˶��ҳ���ǹز��ɾ��ģ���ֻ�رյ�ǰ��һ��ҳ�档�ڶ���quit��
         * ���˳�������Webdriver���еĴ��ڣ��˵ķǳ��ɾ��������Ƽ�ʹ��quit��Ϊһ��case�˳��ķ�����
         */
       // driver.quit();//�˳������
    }

      
    
}

