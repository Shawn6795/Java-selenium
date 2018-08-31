package autotest;

import java.io.FileNotFoundException;
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

public class yongshi_tzny {
	public static int[] Offline=new int[5];
	public static int[] Free=new int[5];
	public static int[] Totaltime=new int[5];
	public static int[] Debug=new int[5];
	public static int[] RunTime=new int[5];
	public static int[] Stop=new int[5];
	
	public static int[] Offlinezhou=new int[100];
	public static int[] Freezhou=new int[100];
	public static int[] Debugzhou=new int[100];
	public static int[] RunTimezhou=new int[100];
	public static int[] Stopzhou=new int[100];
	public static int[] Totaltimezhou=new int[100];
	
	public static int[] Offlineyue=new int[100];
	public static int[] Freeyue=new int[100];
	public static int[] Debugyue=new int[100];
	public static int[] RunTimeyue=new int[100];
	public static int[] Stopyue=new int[100];
	public static int[] Totaltimeyue=new int[100];
	
	public static int[] Offlinenian=new int[1100];
	public static int[] Freenian=new int[1100];
	public static int[] Debugnian=new int[1100];
	public static int[] RunTimenian=new int[1100];
	public static int[] Stopnian=new int[1100];
	public static int[] Totaltimenian=new int[1100];
	
	public static int Offlinesum=0;
	public static int Freesum=0;
	public static int Debugsum=0;
	public static int RunTimesum=0;
	public static int Stopsum=0;
	public static int Totaltimesum=0;
	
	public static int Offlinezhousum=0;
	public static int Freezhousum=0;
	public static int Debugzhousum=0;
	public static int RunTimezhousum=0;
	public static int Stopzhousum=0;
	public static int Totaltimezhousum=0;
	
	public static int Offlineyuesum=0;
	public static int Freeyuesum=0;
	public static int Debugyuesum=0;
	public static int RunTimeyuesum=0;
	public static int Stopyuesum=0;
	public static int Totaltimeyuesum=0;
	
	public static int Offlineniansum=0;
	public static int Freeniansum=0;
	public static int Debugniansum=0;
	public static int RunTimeniansum=0;
	public static int Stopniansum=0;
	public static int Totaltimeniansum=0;
	
	
	
	public static String Offlineday=null;
	public static String Freeday=null;
	public static String Debugday=null;
	public static String RunTimeday=null;
	public static String Stopday=null;
	
	public static String Offlineweek=null;
	public static String Freeweek=null;
	public static String Debugweek=null;
	public static String RunTimeweek=null;
	public static String Stopweek=null;
	
	public static String Offlinemonth=null;
	public static String Freemonth=null;
	public static String Debugmonth=null;
	public static String RunTimemonth=null;
	public static String Stopmonth=null;
	
	public static String Offlineyear=null;
	public static String Freeyear=null;
	public static String Debugyear=null;
	public static String RunTimeyear=null;
	public static String Stopyear=null;

	
	public static String shebeihao=null;
	public static String riqi=null;
	public static String MachineID=null;
	
	
	 public static void main(String args[]) throws ClassNotFoundException, SQLException, ParseException  {    
		 String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName="+panel.Databasename+";user=sa;password=P@ssw0rd";//sa身份连接    
		    
         
	        Connection con = null;    
	        Statement stmt = null;    
	        ResultSet rs = null;    
	        
	        
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
            con = DriverManager.getConnection(url);    

    		 String SQL = "SELECT Id FROM dbo.Machines where Code='"+shebeihao+"'";    
             stmt = con.createStatement();    
             rs = stmt.executeQuery(SQL);   
  
             while (rs.next()) { 
             	
                 MachineID= rs.getString(1);
             }
             //按天

    		 String SQLz="SELECT OfflineDuration,FreeDuration,TotalDuration,DebugDuration,RunDuration,StopDuration FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay='"+riqi+"'";
             stmt = con.createStatement();    
             rs = stmt.executeQuery(SQLz); 
            int d=0;
             while (rs.next()) { 
             	 Offline[d]=rs.getInt(1);
             	 Free[d]=rs.getInt(2);
             	 Totaltime[d]=rs.getInt(3);
             	 Debug[d]=rs.getInt(4);
             	 RunTime[d]=rs.getInt(5);
             	 Stop[d]=rs.getInt(6);
             	 d++;
             }
             
              for(int i=0;i<5;i++) {
            	  Offlinesum+=Offline[i];
            	  Freesum+=Free[i];
            	  Totaltimesum+=Totaltime[i];
            	  Debugsum+=Debug[i];
            	  RunTimesum+=RunTime[i];
            	  Stopsum+=Stop[i];
              }
            
             DecimalFormat df=new DecimalFormat("0.00");
             
             RunTimeday=df.format((float)RunTimesum/Totaltimesum*100)+"%";
             Freeday=df.format((float)Freesum/Totaltimesum*100)+"%";
         	 Debugday=df.format((float)Debugsum/Totaltimesum*100)+"%";
         	 Offlineday=df.format((float)Offlinesum/Totaltimesum*100)+"%";
         	 Stopday=df.format((float)Stopsum/Totaltimesum*100)+"%";
         	 
             System.out.println("设备综合分析：");
             System.out.println();
             
      		System.out.println(RunTimeday);
      		System.out.println(Freeday);
      		System.out.println(Debugday);
      		System.out.println(Offlineday);
      		System.out.println(Stopday);
      		
      		System.out.println();
      		
      		//按周
      		SimpleDateFormat simdf = new SimpleDateFormat("yyyy-MM-dd");
   		 SimpleDateFormat day = new SimpleDateFormat("dd");
   		 SimpleDateFormat Year = new SimpleDateFormat("yyyy");
   		 Calendar cal = Calendar.getInstance();
   		 Date date=simdf.parse(riqi);
   		 cal.setTime(date);
   		 System.out.println("现在时间："+simdf.format(cal.getTime()));
   		
   		 String[] week=new String [3];
   		 cal.set(cal.DAY_OF_WEEK, cal.MONDAY);
   		week[0]= simdf.format(cal.getTime());
   		 
   		
   		 cal.set(Calendar.DATE, cal.get(cal.DATE) + 6);
   		 week[1]= simdf.format(cal.getTime());

      		 String SQL1="SELECT OfflineDuration,FreeDuration,TotalDuration,DebugDuration,RunDuration,StopDuration FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay between '"+week[0]+"' and '"+week[1]+"'";
             stmt = con.createStatement();    
             rs = stmt.executeQuery(SQL1); 
             int z=0;
             while (rs.next()) { 
             	 Offlinezhou[z]=rs.getInt(1);
             	 Freezhou[z]=rs.getInt(2);
             	 Totaltimezhou[z]=rs.getInt(3);
             	 Debugzhou[z]=rs.getInt(4);
             	 RunTimezhou[z]=rs.getInt(5);
             	 Stopzhou[z]=rs.getInt(6);
             	 z++;
             }
   		 
   		 for(int i=0;i<8;i++) {
   			Offlinezhousum+=Offlinezhou[i];
   			Freezhousum+=Freezhou[i];
   			Totaltimezhousum+=Totaltimezhou[i];
   			Debugzhousum+=Debugzhou[i];
   			RunTimezhousum+=RunTimezhou[i];
   			Stopzhousum+=Stopzhou[i];
   		 }
   		RunTimeweek=df.format((float)RunTimezhousum/Totaltimezhousum*100)+"%";
        Freeweek=df.format((float)Freezhousum/Totaltimezhousum*100)+"%";
    	 Debugweek=df.format((float)Debugzhousum/Totaltimezhousum*100)+"%";
    	 Offlineweek=df.format((float)Offlinezhousum/Totaltimezhousum*100)+"%";
    	 Stopweek=df.format((float)Stopzhousum/Totaltimezhousum*100)+"%";
      		
    	 System.out.println(RunTimeweek);
    	 System.out.println(Freeweek);
    	 System.out.println(Debugweek);
    	 System.out.println(Offlineweek);
    	 System.out.println(Stopweek);
    	 System.out.println();
    	 
    	 //按月
    	  Calendar calM = Calendar.getInstance();
	        calM.setTime(date);
			
	        calM.set(calM.DAY_OF_MONTH, 1);
			String[] month=new String[3];
			month[0]= simdf.format(calM.getTime());
			calM.set(Calendar.DAY_OF_MONTH, calM.getActualMaximum(Calendar.DAY_OF_MONTH));
			month[1]=simdf.format(calM.getTime());
			 System.out.println(month[0]);
			 System.out.println(month[1]);
			 
			 
				 String SQL2="SELECT OfflineDuration,FreeDuration,TotalDuration,DebugDuration,RunDuration,StopDuration FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay between '"+month[0]+"' and '"+month[1]+"'";
	             stmt = con.createStatement();    
	             rs = stmt.executeQuery(SQL2); 
	             int m=0;
	             while (rs.next()) { 
	             	 Offlineyue[m]=rs.getInt(1);
	             	 Freeyue[m]=rs.getInt(2);
	             	 Totaltimeyue[m]=rs.getInt(3);
	             	 Debugyue[m]=rs.getInt(4);
	             	 RunTimeyue[m]=rs.getInt(5);
	             	 Stopyue[m]=rs.getInt(6);
	             	 m++;
	             }
			 
			 for(int i=0;i<100;i++) {
		   			Offlineyuesum+=Offlineyue[i];
		   			Freeyuesum+=Freeyue[i];
		   			Totaltimeyuesum+=Totaltimeyue[i];
		   			Debugyuesum+=Debugyue[i];
		   			RunTimeyuesum+=RunTimeyue[i];
		   			Stopyuesum+=Stopyue[i];
		   		 }
		   		RunTimemonth=df.format((float)RunTimeyuesum/Totaltimeyuesum*100)+"%";
		        Freemonth=df.format((float)Freeyuesum/Totaltimeyuesum*100)+"%";
		    	 Debugmonth=df.format((float)Debugyuesum/Totaltimeyuesum*100)+"%";
		    	 Offlinemonth=df.format((float)Offlineyuesum/Totaltimeyuesum*100)+"%";
		    	 Stopmonth=df.format((float)Stopyuesum/Totaltimeyuesum*100)+"%";
		      		
		    	 System.out.println(RunTimemonth);
		    	 System.out.println(Freemonth);
		    	 System.out.println(Debugmonth);
		    	 System.out.println(Offlinemonth);
		    	 System.out.println(Stopmonth);
		    	 System.out.println();
		    	 
		    	 //按年
		    	  Calendar calY = Calendar.getInstance();
		            calY.setTime(date);
		           
		            
			        calY.set(calY.DAY_OF_YEAR, 1);
					String[] YEAR=new String[3];
					YEAR[0]= simdf.format(calY.getTime());
					
					calY.set(Calendar.DAY_OF_YEAR, calY.getActualMaximum(Calendar.DAY_OF_YEAR));
					YEAR[1]= simdf.format(calY.getTime());
					System.out.println(YEAR[0]);
					System.out.println(YEAR[1]);
					 
					
						 String SQL3="SELECT OfflineDuration,FreeDuration,TotalDuration,DebugDuration,RunDuration,StopDuration FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay between '"+YEAR[0]+"' and '"+YEAR[1]+"'";
			             stmt = con.createStatement();    
			             rs = stmt.executeQuery(SQL3); 
			             int y=0;
			             while (rs.next()) { 
			             	 Offlinenian[y]=rs.getInt(1);
			             	 Freenian[y]=rs.getInt(2);
			             	 Totaltimenian[y]=rs.getInt(3);
			             	 Debugnian[y]=rs.getInt(4);
			             	 RunTimenian[y]=rs.getInt(5);
			             	 Stopnian[y]=rs.getInt(6);
			             	 y++;
			             }
					 
					 for(int i=0;i<1100;i++) {
				   			Offlineniansum+=Offlinenian[i];
				   			Freeniansum+=Freenian[i];
				   			Totaltimeniansum+=Totaltimenian[i];
				   			Debugniansum+=Debugnian[i];
				   			RunTimeniansum+=RunTimenian[i];
				   			Stopniansum+=Stopnian[i];
				   		 }
				   		RunTimeyear=df.format((float)RunTimeniansum/Totaltimeniansum*100)+"%";
				        Freeyear=df.format((float)Freeniansum/Totaltimeniansum*100)+"%";
				    	 Debugyear=df.format((float)Debugniansum/Totaltimeniansum*100)+"%";
				    	 Offlineyear=df.format((float)Offlineniansum/Totaltimeniansum*100)+"%";
				    	 Stopyear=df.format((float)Stopniansum/Totaltimeniansum*100)+"%";
				      		
				    	 System.out.println(RunTimeyear);
				    	 System.out.println(Freeyear);
				    	 System.out.println(Debugyear);
				    	 System.out.println(Offlineyear);
				    	 System.out.println(Stopyear);
				    	 System.out.println();
					 }
    	 
	 }

