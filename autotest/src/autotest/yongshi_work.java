package autotest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class yongshi_work {
	
	public static int Offline;
	public static int Free;
	public static float Totaltime;
	public static int Debug;
	public static int RunTime;
	public static int Stop;

	public static String Offlineday;
	public static String Freeday;
	public static String Debugday;
	public static String RunTimeday;
	public static String Stopday;
	

	public static String shebeihao;
	public static String riqi;
	public static String banciming;
	public static String MachineID;
	public static String ShiftDetailId;
	
	 public static void main(String args[]) throws ClassNotFoundException, SQLException, ParseException {
		 String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName="+panel.Databasename+";user=sa;password=P@ssw0rd";//sa身份连接    

	        Connection con = null;    
	        Statement stmt = null;    
	        ResultSet rs = null;    

	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
	            con = DriverManager.getConnection(url);    
	            
	            String SQL = "SELECT Id FROM dbo.Machines where Code='"+shebeihao+"'";    
	             stmt = con.createStatement();    
	             rs = stmt.executeQuery(SQL);   
	             //rs = stmt.executeQuery(SQL1);
	     
	             // Iterate through the data in the result set and display it.    
	             while (rs.next()) { 
	             	
	                 MachineID= rs.getString(1);
	             }
	             
	            String SQL1 = "SELECT TOP 1 MachinesShiftDetailId  FROM dbo.States where MachineId='"+MachineID+"' and ShiftDetail_ShiftDay='"+riqi+"' and ShiftDetail_MachineShiftName='"+banciming+"'";    
	            stmt = con.createStatement();    
	            rs = stmt.executeQuery(SQL1);   
	           
	            while (rs.next()) { 
	            	ShiftDetailId=rs.getString(1);
	            }
	            String SQL2="SELECT OfflineDuration,FreeDuration,TotalDuration,DebugDuration,RunDuration,StopDuration FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay='"+riqi+"' and MachinesShiftDetailId='"+ShiftDetailId+"'";
	            stmt = con.createStatement();    
	            rs = stmt.executeQuery(SQL2);   
	           
	            while (rs.next()) { 
	            	 Offline=rs.getInt(1);
	             	 Free=rs.getInt(2);
	             	 Totaltime=rs.getFloat(3);
	             	 Debug=rs.getInt(4);
	             	 RunTime=rs.getInt(5);
	             	 Stop=rs.getInt(6);
	            }
	            DecimalFormat df=new DecimalFormat("0.00");
	             
	             RunTimeday=df.format((float)RunTime/Totaltime*100)+"%";
	             Freeday=df.format((float)Free/Totaltime*100)+"%";
	         	 Debugday=df.format((float)Debug/Totaltime*100)+"%";
	         	 Offlineday=df.format((float)Offline/Totaltime*100)+"%";
	         	 Stopday=df.format((float)Stop/Totaltime*100)+"%";
	         	 
	             System.out.println("设备综合分析：");
	             System.out.println();
	             
	      		System.out.println("运行："+df.format((float)RunTime/Totaltime*100)+"%");
	      		System.out.println("停机："+df.format((float)Stop/Totaltime*100)+"%");
	      		System.out.println("空闲："+df.format((float)Free/Totaltime*100)+"%");
	      		System.out.println("设定："+df.format((float)Debug/Totaltime*100)+"%");
	      		System.out.println("离线："+df.format((float)Offline/Totaltime*100)+"%");
	      		
	      		System.out.println();
	      		         
	 }
}
