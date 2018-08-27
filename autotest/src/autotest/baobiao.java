package autotest;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
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

public class baobiao {
	public static int[] Tarr=new int[100];
	public static int[] Rarr=new int[100];
	public static int[] JNarr=new int[100];
	public static int[] JWarr=new int[100];
	public static int JNei=0;
	public static int JWai=0;
	public static int Total=0;
	public static int Run=0;
	public static String strS=null;
	public static String strS2=null;
	public static String strS3=null;
	public static String strS4=null;
	public static int nowtime=0;
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
	public static int RunTime;
	public static int Stop;
    
    public static void main(String args[]) throws FileNotFoundException {    
    	 System.setProperty("webdriver.chrome.driver","chromedriver.exe");//chromedriver服务地址
         WebDriver driver =new ChromeDriver(); //新建一个WebDriver 的对象
         
 //CPS MDC      
 //1.打开报表
         //登陆
         driver.get("http://"+panel.MDCurl+"/RDLCReport/StateConsumeTimeReport");//打开指定的网站
         driver.manage().window().maximize();
         driver.findElement(By.name("usernameOrEmailAddress")).sendKeys(new  String[] {"admin"});
         driver.findElement(By.name("password")).sendKeys(new  String[] {"123qwe"});
         driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[4]/div[2]/button")).click(); //点击按扭
         System.out.println(driver.getCurrentUrl());
         driver.navigate().refresh();
         System.out.println(driver.getCurrentUrl());
         shebei.time2();
 
         driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
        String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName="+panel.Databasename+";user=sa;password=P@ssw0rd";//sa身份连接    
    
          
        Connection con = null;    
        Statement stmt = null;    
        ResultSet rs = null;    
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("baobiao.txt")),true));
        
        //稼动率报表
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
            
            String SQL = "SELECT  TOP 1 dbo.States.MachineId,dbo.Machines.Name,dbo.States.ShiftDetail_MachineShiftName FROM dbo.States,dbo.Machines where dbo.States.MachineCode=dbo.Machines.Code order by dbo.States.Id desc";    
            stmt = con.createStatement();    
            rs = stmt.executeQuery(SQL);   
            //rs = stmt.executeQuery(SQL1);
    
            // Iterate through the data in the result set and display it.    
            while (rs.next()) { 
            	
                MachineID= rs.getString(1);
                MachineCode=rs.getString(2);
                ShiftDetail=rs.getString(3);
                String SQLt="SELECT TOP 1 StartTime,EndTime FROM dbo.States where MachineId='"+MachineID+"'and ShiftDetail_ShiftDay='"+date+"' order by Id desc";
                stmt = con.createStatement();    
                rs = stmt.executeQuery(SQLt); 
               
                while (rs.next()) { 
                	String str=rs.getString(1);
                	strS=str;
                	
                }
               
                //System.out.println(strS2);
                SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            	String strE=df1.format(new Date());
            	//String str2="2018-07-31 16:00:00";
            	String pattern="yyyy-MM-dd HH:mm:ss";
            	long now=time.getDistanceTime(strE, strS, pattern);
            	 nowtime=(int)now;
            	
            	
               //System.out.println(MachineID);  
               String SQL1="SELECT TotalDuration,RunDuration  FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay='"+date+"'";
               stmt = con.createStatement();
               rs = stmt.executeQuery(SQL1);
               int i=0;
               while (rs.next()) {    
                   Tarr[i]=rs.getInt(1);
                   Rarr[i]=rs.getInt(2);
                   i++;
               }
                   String SQL2="SELECT Duration FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"'and IsPlaned='1'and ShiftDetail_ShiftDay='"+date+"'";
                   stmt = con.createStatement();
                   rs = stmt.executeQuery(SQL2);
                   int a=0;
                   while (rs.next()) {
                	   JNarr[a]=rs.getInt(1);
                	   a++;
                   }
                	   String SQL3="SELECT Duration FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"'and IsPlaned='0'and ShiftDetail_ShiftDay='"+date+"'";
                       stmt = con.createStatement();
                       rs = stmt.executeQuery(SQL3);
                       int b=0;
                       while (rs.next()) {
                       JWarr[b]=rs.getInt(1);
                       b++;
                       }
                   

                       
                       String SQL4="SELECT Top 1 EndTime,StartTime FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"' and IsPlaned='1'and ShiftDetail_ShiftDay='"+date+"' order by EndTime";
                        stmt = con.createStatement();
                        rs = stmt.executeQuery(SQL4);
                        while (rs.next()) {
                     	   strS2=rs.getString(1);
                     	   
                     	   
                     	}
                        String SQL5="SELECT Top 1 EndTime,StartTime FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"' and IsPlaned='0'and ShiftDetail_ShiftDay='"+date+"' order by EndTime";
                        stmt = con.createStatement();
                        rs = stmt.executeQuery(SQL5);
                        while (rs.next()) {
                     	   strS3=rs.getString(1);
                     	  strS4=rs.getString(2);
                     	}
                   
               
            
            String SQLz="SELECT TOP 1 OfflineDuration,FreeDuration,TotalDuration,DebugDuration,RunDuration,StopDuration FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' order by MachinesShiftDetailId desc";
            stmt = con.createStatement();    
            rs = stmt.executeQuery(SQLz); 
           
            while (rs.next()) { 
            	 Offline=rs.getInt(1);
            	 Free=rs.getInt(2);
            	 Totaltime=rs.getFloat(3);
            	 Debug=rs.getInt(4);
            	 RunTime=rs.getInt(5);
            	 Stop=rs.getInt(6);
            }
            }
            
            DecimalFormat df1=new DecimalFormat("0");
            DecimalFormat df2=new DecimalFormat("0.00");
            System.out.println("设备综合分析：");
            System.out.println();
            System.out.println(MachineCode+"   "+Day+"  "+ShiftDetail);
     		System.out.println("运行："+df2.format((float)RunTime/3600)+"   "+df1.format((float)RunTime/Totaltime*100)+"%");
     		System.out.println("停机："+df2.format((float)Stop/3600)+"   "+df1.format((float)Stop/Totaltime*100)+"%");
     		System.out.println("空闲："+df2.format((float)Free/3600)+"   "+df1.format((float)Free/Totaltime*100)+"%");
     		System.out.println("设定："+df2.format((float)Debug/3600)+"   "+df1.format((float)Debug/Totaltime*100)+"%");
     		System.out.println("离线："+df2.format((float)Offline/3600)+"   "+df1.format((float)Offline/Totaltime*100)+"%");
     		System.out.println();
       
                for(int j=0;j<100;j++) {
                	
                	 Total+=Tarr[j];
                	 Run+=Rarr[j];
                	 JNei+=JNarr[j];
                	 JWai+=JWarr[j];
                	
                	 //sum=sum+sum;
                }
               
               
                //double Runrate = new BigDecimal((float)Run/Total).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
               
//         		System.out.println("运行率："+df.format((float)Run/Total*100)); 
         		
         		
         		
         		if(strS2==null&&strS3!=null&&strS4!=null) {

         			activation=df2.format((float)(JNei+nowtime)/(JWai+JNei+nowtime)*100);
         			System.out.println("设备"+MachineCode+"  "+"稼动率："+activation);
         		}else if(strS2!=null&&strS3==null&&strS4!=null) {
         	
         			activation=df2.format((float)JNei/(JWai+nowtime+JNei)*100);
         			System.out.println("设备"+MachineCode+"  "+"稼动率："+activation);
         			
         		}else  {
         			activation=df2.format((float)JNei/(JWai+JNei)*100);
         			System.out.println("设备"+MachineCode+"  "+"稼动率："+activation);
         		}
            
        
        }
        catch (Exception e) {    
            e.printStackTrace();    
        }  
        
        
    
        // Handle any errors that may have occurred.    
       
    
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
        try {
    		Process process = Runtime.getRuntime().exec(
    		"cmd.exe /c notepad baobiao.txt");
    		} catch (Exception e) {
    		e.printStackTrace();}
    }    
}
