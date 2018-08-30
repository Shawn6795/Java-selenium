package autotest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class yunxinglv_zyn {
	public static String MachineID;
	
	public static String result;
	public static String resulttime;
	
	public static int[] Tarrweek=new int[8];
	public static int[] Rarrweek=new int[8];
	public static int Totalweek=0;
	public static int Runweek=0;
	public static String runrateweek=null;
	
	public static int[] Tarrmonth=new int[32];
	public static int[] Rarrmonth=new int[32];
	public static int Totalmonth=0;
	public static int Runmonth=0;
	public static String runratemonth=null;
	
	public static int[] Tarryear=new int[367];
	public static int[] Rarryear=new int[367];
	public static int Totalyear=0;
	public static int Runyear=0;
	public static String runrateyear=null;
	
	 public static void main(String args[]) throws ClassNotFoundException, SQLException, ParseException {  
		 
		 //按周
		 SimpleDateFormat simdf = new SimpleDateFormat("yyyy-MM-dd");
		 SimpleDateFormat day = new SimpleDateFormat("dd");
		 SimpleDateFormat Year = new SimpleDateFormat("yyyy");
		 Calendar cal = Calendar.getInstance();
		 Date date=simdf.parse(resulttime);
		 cal.setTime(date);
		 System.out.println("现在时间："+simdf.format(cal.getTime()));
		 //分别获取年、月、日
		 System.out.println("年："+cal.get(cal.YEAR));
		 System.out.println("月："+(cal.get(cal.MONTH)+1));//老外把一月份整成了0，翻译成中国月份要加1
		 System.out.println("日："+cal.get(cal.DATE));
		  
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
	        String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName="+panel.Databasename+";user=sa;password=P@ssw0rd";//sa身份连接    
	    
	          
	        Connection con = null;    
	        Statement stmt = null;    
	        ResultSet rs = null;    
	    
	        
	        	
	        	 
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
	            con = DriverManager.getConnection(url);    
	            //System.out.println("end.");  
	            
	            
	           // String date=resulttime+" "+"00:00:00.000";
	            // Create and execute an SQL statement that returns some data.  
	            
	            
	            String SQL = "SELECT Id FROM dbo.Machines where Code='"+result+"'";    
	            stmt = con.createStatement();    
	            rs = stmt.executeQuery(SQL);   
	           
	            while (rs.next()) { 
	            	
	                MachineID= rs.getString(1);
	                int d=0;
	                for(int i=0;i<7;i++) {
	                String SQLt="SELECT TotalDuration,RunDuration  FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay='"+week[i]+"'";
	                stmt = con.createStatement();    
	                rs = stmt.executeQuery(SQLt); 
	                
	                while (rs.next()) {    
	                    Tarrweek[d]=rs.getInt(1);
	                    Rarrweek[d]=rs.getInt(2);
	                    d++;
	                }
	                }
	                }
	            for(int j=0;j<8;j++) {
	            	
	            	 Totalweek+=Tarrweek[j];
	            	 Runweek+=Rarrweek[j];

	            }
	            System.out.println("总时间："+Totalweek);
	            System.out.println("运行时间："+Runweek);
	            DecimalFormat df=new DecimalFormat("0.00");
	            System.out.println("运行率："+df.format((float)Runweek/Totalweek*100)); 
	           
	            if(Totalweek==0) {
	            	runrateweek="0";
	            }else {
	            	 runrateweek=df.format((float)Runweek/Totalweek*100);
	            }
	      
	        
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
			  //System.out.println(month[i]);
			  String SQLt2="SELECT TotalDuration,RunDuration  FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay='"+month[i]+"'";
              stmt = con.createStatement();    
              rs = stmt.executeQuery(SQLt2); 
              
              while (rs.next()) {    
                  Tarrmonth[m]=rs.getInt(1);
                  Rarrmonth[m]=rs.getInt(2);
                  m++;
              }
			 }
			 for(int j=0;j<lastday;j++) {
	            	
            	 Totalmonth+=Tarrmonth[j];
            	 Runmonth+=Rarrmonth[j];

            }
            System.out.println("总时间："+Totalmonth);
            System.out.println("运行时间："+Runmonth);
            
            System.out.println("运行率："+df.format((float)Runmonth/Totalmonth*100)); 
            if(Totalmonth==0) {
            	runratemonth="0";
            }else {
            runratemonth=df.format((float)Runmonth/Totalmonth*100);
            }
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
			 // System.out.println(YEAR[i]);
			  String SQLt="SELECT TotalDuration,RunDuration  FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay='"+YEAR[i]+"'";
              stmt = con.createStatement();    
              rs = stmt.executeQuery(SQLt); 
             
              while (rs.next()) {    
                  Tarryear[y]=rs.getInt(1);
                  Rarryear[y]=rs.getInt(2);
                  y++;
              }
			 }
			 for(int j=0;j<year;j++) {
	            	
            	 Totalyear+=Tarryear[j];
            	 Runyear+=Rarryear[j];

            }
            System.out.println("总时间："+Totalyear);
            System.out.println("运行时间："+Runyear);
            
            System.out.println("运行率："+df.format((float)Runyear/Totalyear*100)); 
            runrateyear=df.format((float)Runyear/Totalyear*100);
			 
	 }
	 
}
