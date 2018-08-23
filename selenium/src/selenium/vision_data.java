package selenium;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class vision_data {
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
	
	public static  int MachinesShiftDetailId;
	public static  int MachinesId;
   public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

//CPS MDC      
//1.设备实时状态对比 
    
    	   System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver服务地址
           WebDriver driver =new ChromeDriver(); //新建一个WebDriver 的对象
       driver.get("http://lzwl.project/vision/00000");//打开指定的网站
       driver.manage().window().maximize();
//       driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
//       driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
//       driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
       driver.navigate().refresh();
       selenium.time2();
       
       String Mzhuangtai=driver.findElement(By.xpath("//li[contains(text(),'状态')]")).getText();
       String Mhege=driver.findElement(By.xpath("//li[contains(text(),'合格零件')]")).getText();
       String Mbuhege=driver.findElement(By.xpath("//li[contains(text(),'不合格零件')]")).getText();
       String Mchengxuming=driver.findElement(By.xpath("//li[contains(text(),'程序名')]")).getText();
       String Mzhuzhouzhuansu=driver.findElement(By.xpath("//li[contains(text(),'主轴转速')]")).getText();
       String Mzhuzhoubeilv=driver.findElement(By.xpath("//li[contains(text(),'主轴倍率')]")).getText();
       String Mjinjisudu=driver.findElement(By.xpath("//li[contains(text(),'进给速度')]")).getText();
       String Mjinjibeilv=driver.findElement(By.xpath("//li[contains(text(),'进给倍率')]")).getText();
       String Merweima=driver.findElement(By.xpath("//li[contains(text(),'零件二维码')]")).getText();
       String Mkaishijiagong=driver.findElement(By.xpath("//li[contains(text(),'开始加工信号')]")).getText();
       String Mjieshujiagong=driver.findElement(By.xpath("//li[contains(text(),'结束加工信号')]")).getText();
       String Mxzhou=driver.findElement(By.xpath("//li[contains(text(),'X轴机械')]")).getText();
       String Myzhou=driver.findElement(By.xpath("//li[contains(text(),'Y轴机械')]")).getText();
       String Mzzhou=driver.findElement(By.xpath("//li[contains(text(),'Z轴机械')]")).getText();
       String Mbaojinghao=driver.findElement(By.xpath("//li[contains(text(),'报警号')]")).getText();
       String Mbaojingxinxi=driver.findElement(By.xpath("//li[contains(text(),'报警信息')]")).getText();
       String Mshebei=Mzhuangtai+Mhege+Mbuhege+Mchengxuming+Mzhuzhouzhuansu+Mzhuzhoubeilv+Mjinjisudu+Mjinjibeilv+Merweima+
    		   Mkaishijiagong+Mjieshujiagong+Mxzhou+Myzhou+Mzzhou+Mbaojinghao+Mbaojingxinxi;
       
       System.out.println(Mshebei);
       
       driver.get("http://192.168.1.15:8097/WebAdmin/quickclient.html");
       selenium.time2();
       driver.findElement(By.xpath("//*[@id=\"treeview\"]/ul/li/ul/li/div")).click();
       selenium.time1();
       String Dzhuangtai=driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[1]/td[5]")).getText();
       String Dhege="合格零件计数:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[2]/td[5]")).getText();
       String Dbuhege="不合格零件计数:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[3]/td[5]")).getText();
       String Dchengxuming="程序名:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[6]/td[5]")).getText();
       String Dzhuzhouzhuansu="主轴转速:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[7]/td[5]")).getText();
       String Dzhuzhoubeilv="主轴倍率:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[8]/td[5]")).getText();
       String Djinjisudu="进给速度:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[9]/td[5]")).getText();
       String Djinjibeilv="进给倍率:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[10]/td[5]")).getText();
       String Derweima="零件二维码:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[11]/td[5]")).getText();
       String Dkaishijiagong="开始加工信号:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[12]/td[5]")).getText();
       String Djieshujiagong="结束加工信号:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[13]/td[5]")).getText();
       String Dxzhou="X轴机械座标:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[14]/td[5]")).getText();
       String Dyzhou="Y轴机械座标:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[15]/td[5]")).getText();
       String Dzzhou="Z轴机械座标:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[16]/td[5]")).getText();
       String Dbaojinghao="报警号:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[4]/td[5]")).getText();
       String Dbaojingxinxi="报警信息:"+driver.findElement(By.xpath("//*[@id=\"var-table-body\"]/tr[5]/td[5]")).getText();
       if(Dzhuangtai.equals("2")) {
    	   Dzhuangtai="运行";
       }
        Dzhuangtai="状态:"+Dzhuangtai;
        
        String Dshebei=Dzhuangtai+Dhege+Dbuhege+Dchengxuming+Dzhuzhouzhuansu+Dzhuzhoubeilv+Djinjisudu+Djinjibeilv+Derweima+
        		   Dkaishijiagong+Djieshujiagong+Dxzhou+Dyzhou+Dzzhou+Dbaojinghao+Dbaojingxinxi;
        
           System.out.println(Dshebei);
       if(Mshebei.equals(Dshebei)) {
    	   System.out.println("设备状态相同");
       }else {
    	   System.out.println("设备状态不同");
       }
      
      //状态分布
       driver.get("http://lzwl.project/vision/00000");
       selenium.time1();
       
       String Mname=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[1]")).getText();
       String Moffline=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[2]")).getText();
       String Mfree=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[3]")).getText();
       String Mrun=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[4]")).getText();
       String Mstop=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[5]")).getText();
       String Mdebug=driver.findElement(By.xpath("//div[contains(@id,'inner_tableViewPro')]/div[1]/div/table/tr[2]/td[6]")).getText();
       
       String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName=LZWL;user=sa;password=P@ssw0rd";//sa身份连接    
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
           
           String S2="SELECT TOP 2 * FROM dbo.DailyStatesSummaries where MachineId='"+MachinesId+"' order by MachinesShiftDetailId desc";
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
           System.out.println("设备状态分布：");
           System.out.println(Mzong);
           System.out.println(Dzong);
           System.out.println();
         
       
       
       //产量
       
       selenium.time1();
     String Mchanliang = driver.findElement(By.className("cardMixTop")).getText();
     System.out.println(Mchanliang);

         String SQL="SELECT TOP 1 MachinesShiftDetailId FROM dbo.Capacities order by MachinesShiftDetailId desc";
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
    String Dchanliang=sum+"件";
    
    System.out.println(Dchanliang);
       
       if(Mchanliang.equals(Dchanliang)) {
    	   System.out.println("产量相同");
       }else
       {
    	   System.out.println("产量不同");
       }
       
       
       
       //当前班次
       driver.get("http://lzwl.project/MachineShiftSetting");
     driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
     driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
     driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
     driver.navigate().refresh();

     
       selenium.time1();
       String Mban=driver.findElement(By.xpath("//*[@id=\"MachineShiftTable\"]/tbody/tr/td[4]")).getText();
      
       Calendar c = Calendar.getInstance();
       int hour = c.get(Calendar.HOUR_OF_DAY);
       
       if(hour<16 && hour>=8) {
    	   Mban=Mban+"-早班";
       }else if(hour>=16 && hour<=23) {
    	   Mban=Mban+"-中班";
       }else if(hour>=0 && hour<8) {
    	   Mban=Mban+"-晚班";
       }
       System.out.println();
       System.out.println(Mban);
       driver.get("http://lzwl.project/vision/00000");
       driver.navigate().refresh();
       selenium.time1();
       String Dban=driver.findElement(By.className("card-value")).getText();
       System.out.println(Dban);
       if(Mban.equals(Dban)) {
    	   System.out.println("当前班次相同");
       }else {
    	   System.out.println("当前班次不同");
       }
       
     
   }
}
