package autotest;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class zhibiao {
	 public static void main(String[] args) throws FileNotFoundException {
	    	
	    	System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")),true));
	    	
	    	File fileR = new File("random.txt");

	    	try {

 			FileInputStream in = new FileInputStream(fileR); // ��ȡ�ļ�·��
 			byte bs[] = new byte[in.available()];
 			in.read(bs);
 			 String readrandom=new String(bs);
 			 int rr=Integer.parseInt(readrandom)-1;
 			 String next=String.valueOf(rr);

	        System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver�����ַ
	        WebDriver driver =new ChromeDriver(); //�½�һ��WebDriver �Ķ���

	        String E_id=next;
	        System.out.println();
	        System.out.println("�豸����");
	        System.out.println(E_id);
	        System.out.println();
	        shebei.time1();
	        driver.get("http://"+panel.MDCurl+"/MachineStates");
	        driver.manage().window().maximize();
	        driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
	        driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
	        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //�����Ť
	        driver.navigate().refresh();
	        shebei.time2();
	        System.out.println("MDC�Ĳɼ����ݣ�");
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[1]/div/h5")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[2]/div/h5")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[3]/div/h5")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[4]/div/h5")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[5]/div/h5")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[6]/div/h5")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[7]/div/h5")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[8]/div/h5")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[9]/div/h5")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[10]/div/h5")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[11]/div/h5")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[12]/div/h5")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[13]/div/h5")).getText());
	        System.out.println();
	        //MDC�豸���ݲɼ�
	        String MDC_state=driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[1]/div/h5")).getText();
	        String MDC_unqualified=driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[2]/div/h5")).getText();
	        String MDC_program=driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[3]/div/h5")).getText();
	        String MDC_pspeed=driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[4]/div/h5")).getText();
	        String MDC_prate=driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[5]/div/h5")).getText();
	        String MDC_fspeed=driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[6]/div/h5")).getText();
	        String MDC_frate=driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[7]/div/h5")).getText();
	        String MDC_code=driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[8]/div/h5")).getText();
	        String MDC_smachining=driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[9]/div/h5")).getText();
	        String MDC_emachining=driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[10]/div/h5")).getText();
	        String MDC_xaxis=driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[11]/div/h5")).getText();
	        String MDC_yaxis=driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[12]/div/h5")).getText();
	        String MDC_zaxis=driver.findElement(By.xpath("//*[@id=\"machine-"+E_id+"\"]/form/div/div[3]/div/div[13]/div/h5")).getText();
	        
	        //DMP���ݲɼ�
	        
	        try {
	        FileInputStream inm = new FileInputStream(fileR); // ��ȡ�ļ�·��
			byte bsm[] = new byte[inm.available()];
			inm.read(bsm);
			String readshebeiD=new String(bsm);
			//System.out.println(readshebeiD);
			
			int readshebei_D=Integer.parseInt(readshebeiD);
			readshebei_D=readshebei_D-1;
			    //System.out.println(readshebei_D);
	        driver.get("http://"+panel.DMPurl+"/WebAdmin/quickclient.html");
	        driver.manage().window().maximize();
	        
	       
	        	shebei.time1();
	        	driver.findElement(By.xpath("//span[contains(text(),'"+readshebei_D+"')]")).click();
	        	shebei.time1();
	        
	        shebei.time1();
	        System.out.println("DMP�Ĳɼ����ݣ�");
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[1]/td[5]")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[3]/td[5]")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[6]/td[5]")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[7]/td[5]")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[8]/td[5]")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[9]/td[5]")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[10]/td[5]")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[11]/td[5]")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[12]/td[5]")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[13]/td[5]")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[14]/td[5]")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[15]/td[5]")).getText());
	        System.out.println(driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[16]/td[5]")).getText());

	        String DMP_state=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[1]/td[5]")).getText();
	        String DMP_unqualified=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[3]/td[5]")).getText();
	        String DMP_program=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[6]/td[5]")).getText();
	        String DMP_pspeed=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[7]/td[5]")).getText();
	        String DMP_prate=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[8]/td[5]")).getText();
	        String DMP_fspeed=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[9]/td[5]")).getText();
	        String DMP_frate=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[10]/td[5]")).getText();
	        String DMP_code=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[11]/td[5]")).getText();
	        String DMP_smachining=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[12]/td[5]")).getText();
	        String DMP_emachining=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[13]/td[5]")).getText();
	        String DMP_xaxis=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[14]/td[5]")).getText();
	        String DMP_yaxis=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[15]/td[5]")).getText();
	        String DMP_zaxis=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[16]/td[5]")).getText();
	        
	        //����ͳһ��
	       
	        	if(MDC_state.equals("Run")) {
	        	MDC_state="2";
	            }
	        	
	        	if(MDC_state.equals("Stop")) {
	        		MDC_state="1";
	        	}
	        	
	        	if(MDC_state.equals("Free")) {
	        		MDC_state="3";
	        	}
	        	
	        	if(MDC_state.equals("Debug")) {
	        		MDC_state="5";
	        	}
	      
	        int DMP_state_i=Integer.parseInt(DMP_state);
	        if(DMP_state_i==0||DMP_state_i==4||DMP_state_i>=6) {
	        	DMP_state="0";
	        }
//	        System.out.println(MDC_state);
//	        System.out.println(DMP_state);
	        
	        //���ݶԱ�
	        System.out.println();
	        System.out.println("MDC��DMP�ɼ����ݶԱȣ�");
	        if(MDC_state.equals(DMP_state)) {
	        	System.out.println("״̬��ͬ");
         }
	        else {
	        	System.out.println("״̬��ͬ");
	        }
	        if(MDC_unqualified.equals(DMP_unqualified)) {
	        	System.out.println("���ϸ����������ͬ");
         }
	        else {
	        	System.out.println("���ϸ����������ͬ");
	        }
	        if(MDC_program.equals(DMP_program)) {
	        	System.out.println("��������ͬ");
         }
	        else {
	        	System.out.println("��������ͬ");
	        }
	        if(MDC_pspeed.equals(DMP_pspeed)) {
	        	System.out.println("����ת����ͬ");
         }
	        else {
	        	System.out.println("����ת�ٲ�ͬ");
	        }
	        if(MDC_prate.equals(DMP_prate)) {
	        	System.out.println("���ᱶ����ͬ");
         }
	        else {
	        	System.out.println("���ᱶ�ʲ�ͬ");
	        }
	        if(MDC_fspeed.equals(DMP_fspeed)) {
	        	System.out.println("�����ٶ���ͬ");
         }
	        else {
	        	System.out.println("�����ٶȲ�ͬ");
	        }
	        if(MDC_frate.equals(DMP_frate)) {
	        	System.out.println("����������ͬ");
         }
	        else {
	        	System.out.println("�������ʲ�ͬ");
	        }
	        if(MDC_code.equals(DMP_code)) {
	        	System.out.println("�����ά����ͬ");
         }
	        else {
	        	System.out.println("�����ά�벻ͬ");
	        }
	        if(MDC_smachining.equals(DMP_smachining)) {
	        	System.out.println("�����ά����ͬ");
         }
	        else {
	        	System.out.println("�����ά�벻ͬ");
	        }
	        if(MDC_emachining.equals(DMP_emachining)) {
	        	System.out.println("�����ӹ��ź���ͬ");
         }
	        else {
	        	System.out.println("�����ӹ��źŲ�ͬ");
	        }
	        if(MDC_xaxis.equals(DMP_xaxis)) {
	        	System.out.println("X���е������ͬ");
         }
	        else {
	        	System.out.println("X���е���겻ͬ");
	        }
	        if(MDC_yaxis.equals(DMP_yaxis)) {
	        	System.out.println("Y���е������ͬ");
         }
	        else {
	        	System.out.println("Y���е���겻ͬ");
	        }
	        if(MDC_zaxis.equals(DMP_zaxis)) {
	        	System.out.println("Z���е������ͬ");
         }
	        else {
	        	System.out.println("Z���е���겻ͬ");
	        }
	        
	        driver.close();
	        }catch (Exception e) {
      		e.printStackTrace();
      	}
	    	}catch (Exception e) {
      		e.printStackTrace();
      	}
	        
	    	try {
	    		Process process = Runtime.getRuntime().exec(
	    		"cmd.exe /c notepad print.txt");
	    		} catch (Exception e) {
	    		e.printStackTrace();
	    		}  
	    }

}
