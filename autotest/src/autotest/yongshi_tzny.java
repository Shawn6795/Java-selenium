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
	
	public static int[] Offlinezhou=new int[8];
	public static int[] Freezhou=new int[8];
	public static int[] Debugzhou=new int[8];
	public static int[] RunTimezhou=new int[8];
	public static int[] Stopzhou=new int[8];
	public static int[] Totaltimezhou=new int[8];
	
	public static int[] Offlineyue=new int[32];
	public static int[] Freeyue=new int[32];
	public static int[] Debugyue=new int[32];
	public static int[] RunTimeyue=new int[32];
	public static int[] Stopyue=new int[32];
	public static int[] Totaltimeyue=new int[32];
	
	public static int[] Offlinenian=new int[367];
	public static int[] Freenian=new int[367];
	public static int[] Debugnian=new int[367];
	public static int[] RunTimenian=new int[367];
	public static int[] Stopnian=new int[367];
	public static int[] Totaltimenian=new int[367];
	
	public static int Offlinesum;
	public static int Freesum;
	public static int Debugsum;
	public static int RunTimesum;
	public static int Stopsum;
	public static int Totaltimesum;
	
	public static int Offlinezhousum;
	public static int Freezhousum;
	public static int Debugzhousum;
	public static int RunTimezhousum;
	public static int Stopzhousum;
	public static int Totaltimezhousum;
	
	public static int Offlineyuesum;
	public static int Freeyuesum;
	public static int Debugyuesum;
	public static int RunTimeyuesum;
	public static int Stopyuesum;
	public static int Totaltimeyuesum;
	
	public static int Offlineniansum;
	public static int Freeniansum;
	public static int Debugniansum;
	public static int RunTimeniansum;
	public static int Stopniansum;
	public static int Totaltimeniansum;
	
	
	
	public static String Offlineday;
	public static String Freeday;
	public static String Debugday;
	public static String RunTimeday;
	public static String Stopday;
	
	public static String Offlineweek;
	public static String Freeweek;
	public static String Debugweek;
	public static String RunTimeweek;
	public static String Stopweek;
	
	public static String Offlinemonth;
	public static String Freemonth;
	public static String Debugmonth;
	public static String RunTimemonth;
	public static String Stopmonth;
	
	public static String Offlineyear;
	public static String Freeyear;
	public static String Debugyear;
	public static String RunTimeyear;
	public static String Stopyear;
	

	
	
	public static String shebeihao=null;
	public static String riqi=null;
	public static String MachineID;
	
	
	 public static void main(String args[]) throws ClassNotFoundException, SQLException, ParseException  {    
		 String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName="+panel.Databasename+";user=sa;password=P@ssw0rd";//sa身份连接    
		    
         
	        Connection con = null;    
	        Statement stmt = null;    
	        ResultSet rs = null;    
	        
	        
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
            con = DriverManager.getConnection(url);    
            //System.out.println("end.");  
           
    		
    		
    		 String SQL = "SELECT Id FROM dbo.Machines where Code='"+shebeihao+"'";    
             stmt = con.createStatement();    
             rs = stmt.executeQuery(SQL);   
             //rs = stmt.executeQuery(SQL1);
     
             // Iterate through the data in the result set and display it.    
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
   		
   		 String[] week=new String [7];
   		 cal.set(cal.DAY_OF_WEEK, cal.MONDAY);
   		week[0]= simdf.format(cal.getTime());
   		 
   		 for(int i=1;i<7;i++) {
   			int j=1;
   		 cal.set(Calendar.DATE, cal.get(cal.DATE) + j);
   		 week[i]= simdf.format(cal.getTime());
   		 //System.out.println("当前时间所在周周日日期："+weeklast);
   		 }
   		 for(int i=0;i<7;i++) {
   		System.out.println(week[i]);
   		 }
   		 int z=0;
   		 for(int i=0;i<7;i++) {
      		 String SQL1="SELECT OfflineDuration,FreeDuration,TotalDuration,DebugDuration,RunDuration,StopDuration FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay='"+week[i]+"'";
             stmt = con.createStatement();    
             rs = stmt.executeQuery(SQL1); 
            
             while (rs.next()) { 
             	 Offlinezhou[z]=rs.getInt(1);
             	 Freezhou[z]=rs.getInt(2);
             	 Totaltimezhou[z]=rs.getInt(3);
             	 Debugzhou[z]=rs.getInt(4);
             	 RunTimezhou[z]=rs.getInt(5);
             	 Stopzhou[z]=rs.getInt(6);
             	 z++;
             }
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
			calM.add(Calendar.MONTH, 1);
	        calM.set(Calendar.DAY_OF_MONTH, 0);
	        int lastday =Integer.parseInt(day.format(calM.getTime()));
	        calM.set(calM.DAY_OF_MONTH, 1);
			String[] month=new String[lastday];
			month[0]= simdf.format(calM.getTime());
			
			 for(int i=1;i<lastday;i++) {
				int j=1;
			 calM.set(Calendar.DATE, calM.get(calM.DATE) + j);
			 month[i]= simdf.format(calM.getTime());
			 //System.out.println("当前时间所在周周日日期："+weeklast);
			 }
			 int m=0;
			 for(int i=0;i<lastday;i++) {
				 String SQL2="SELECT OfflineDuration,FreeDuration,TotalDuration,DebugDuration,RunDuration,StopDuration FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay='"+month[i]+"'";
	             stmt = con.createStatement();    
	             rs = stmt.executeQuery(SQL2); 
	            
	             while (rs.next()) { 
	             	 Offlineyue[m]=rs.getInt(1);
	             	 Freeyue[m]=rs.getInt(2);
	             	 Totaltimeyue[m]=rs.getInt(3);
	             	 Debugyue[m]=rs.getInt(4);
	             	 RunTimeyue[m]=rs.getInt(5);
	             	 Stopyue[m]=rs.getInt(6);
	             	 m++;
	             }
			 }
			 for(int i=0;i<lastday;i++) {
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
		            int year = calY.get(Calendar.YEAR);
		            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
		            	year=366;
		            	}else{
		            	year=365;
		            	}
		            
			        calY.set(calY.DAY_OF_YEAR, 1);
					String[] YEAR=new String[year];
					YEAR[0]= simdf.format(calY.getTime());
					
					 for(int i=1;i<year;i++) {
						int j=1;
					 calY.set(Calendar.DATE, calY.get(calY.DATE) + j);
					 YEAR[i]= simdf.format(calY.getTime());
					 //System.out.println("当前时间所在周周日日期："+weeklast);
					 }
					 int y=0;
					 for(int i=0;i<year;i++) {
						 String SQL3="SELECT OfflineDuration,FreeDuration,TotalDuration,DebugDuration,RunDuration,StopDuration FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay='"+YEAR[i]+"'";
			             stmt = con.createStatement();    
			             rs = stmt.executeQuery(SQL3); 
			            
			             while (rs.next()) { 
			             	 Offlinenian[y]=rs.getInt(1);
			             	 Freenian[y]=rs.getInt(2);
			             	 Totaltimenian[y]=rs.getInt(3);
			             	 Debugnian[y]=rs.getInt(4);
			             	 RunTimenian[y]=rs.getInt(5);
			             	 Stopnian[y]=rs.getInt(6);
			             	 y++;
			             }
					 }
					 for(int i=0;i<year;i++) {
				   			Offlineniansum+=Offlinenian[i];
				   			Freeniansum+=Freenian[i];
				   			Totaltimeniansum+=Totaltimenian[i];
				   			Debugniansum+=Debugnian[i];
				   			RunTimeniansum+=RunTimenian[i];
				   			Stopniansum+=Stopnian[i];
				   			//System.out.println(Offlinenian[i]);
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

