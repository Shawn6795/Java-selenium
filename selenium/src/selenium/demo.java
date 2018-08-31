package selenium;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo {
	
	
	public static String result=null;
	public static String resulttime=null;
	public static String runrate=null;
	public static String activation=null;
	public static String database;
	public static String MachineCode;
	public static String ShiftDetail;
	public static int Offline;
	public static int Free;
	public static float Totaltime;
	public static int Debug;
	public static int Runtime;
	public static int Stop;
    
    public static void main(String args[]) { 
    	
    	
    	 System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver服务地址
         WebDriver driver =new ChromeDriver(); //新建一个WebDriver 的对象
         
 //CPS MDC      
 //1.打开报表
         //登陆
         driver.get("http://lzwl.project/RDLCReport/StateConsumeTimeReport");//打开指定的网站
         driver.manage().window().maximize();
         driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
         driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
         driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
         System.out.println(driver.getCurrentUrl());
         driver.navigate().refresh();
         System.out.println(driver.getCurrentUrl());
         selenium.time2();
 
         driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
         selenium.time2();
         
 
        String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName=LZWL;user=sa;password=P@ssw0rd";//sa身份连接    
    
          
        Connection con = null;    
        Statement stmt = null;    
        ResultSet rs = null;    
    
        try { 
        	
        	 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
            con = DriverManager.getConnection(url);    
            //System.out.println("end.");  
            Date day=new Date();    
    		SimpleDateFormat dfd = new SimpleDateFormat("yyyy-MM-dd"); 
    		String Day=dfd.format(day); 
    		
            
            
            
            String MachineID;
           
            String date=Day+" "+"00:00:00.000";
            // Create and execute an SQL statement that returns some data.  
            
            String SQL = "SELECT TOP 1 MachineId,MachineCode,ShiftDetail_MachineShiftName FROM dbo.States order by Id desc";    
            stmt = con.createStatement();    
            rs = stmt.executeQuery(SQL);   
            //rs = stmt.executeQuery(SQL1);
    
            // Iterate through the data in the result set and display it.    
            while (rs.next()) { 
            	
                MachineID= rs.getString(1);
                MachineCode=rs.getString(2);
                ShiftDetail=rs.getString(3);
                String SQLt="SELECT TOP 1 OfflineDuration,FreeDuration,TotalDuration,DebugDuration,RunDuration,StopDuration FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' order by Id desc";
                stmt = con.createStatement();    
                rs = stmt.executeQuery(SQLt); 
               
                while (rs.next()) { 
                	 Offline=rs.getInt(1);
                	 Free=rs.getInt(2);
                	 Totaltime=rs.getFloat(3);
                	 Debug=rs.getInt(4);
                	 Runtime=rs.getInt(5);
                	 Stop=rs.getInt(6);
                }
            DecimalFormat df=new DecimalFormat("0.00");
            System.out.println("设备综合分析：");
            System.out.println("设备"+MachineCode+"   "+ShiftDetail);
     		System.out.println("运行："+df.format((float)Runtime/3600)+"   "+df.format((float)Runtime/Totaltime*100)+"%");
     		System.out.println("停机："+df.format((float)Stop/3600)+"   "+df.format((float)Stop/Totaltime*100)+"%");
     		System.out.println("空闲："+df.format((float)Free/3600)+"   "+df.format((float)Free/Totaltime*100)+"%");
     		System.out.println("设定："+df.format((float)Debug/3600)+"   "+df.format((float)Debug/Totaltime*100)+"%");
     		System.out.println("离线："+df.format((float)Offline/3600)+"   "+df.format((float)Offline/Totaltime*100)+"%");
            }
            } 
    
        // Handle any errors that may have occurred.    
        catch (Exception e) {    
            e.printStackTrace();    
        }    
    
        finally {    
            if (rs != null)    
                try {    
                    rs.close();    
                } catch (Exception e) {    
                }    
            if (stmt != null)    
                try {    
                    stmt.close();    
                } catch (Exception e) {    
                }    
            if (con != null)    
                try {    
                    con.close();    
                } catch (Exception e) {    
                }    
        }    
    }    
}
