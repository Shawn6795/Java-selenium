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
	
	public static int[] Tarrweek=new int[100];
	public static int[] Rarrweek=new int[100];
	public static int Totalweek=0;
	public static int Runweek=0;
	public static String runrateweek=null;
	
	public static int[] Tarrmonth=new int[100];
	public static int[] Rarrmonth=new int[100];
	public static int Totalmonth=0;
	public static int Runmonth=0;
	public static String runratemonth=null;
	
	public static int[] Tarryear=new int[1100];
	public static int[] Rarryear=new int[1100];
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
		 
		  
		 String[] week=new String [3];
		 cal.set(cal.DAY_OF_WEEK, cal.MONDAY);
		week[0]= simdf.format(cal.getTime());
		 
		
		 cal.set(Calendar.DATE, cal.get(cal.DATE) + 6);
		 week[1]= simdf.format(cal.getTime());
		
		 System.out.println(week[0]);
	   		System.out.println(week[1]);
		
	        String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName="+panel.Databasename+";user=sa;password=P@ssw0rd";//sa身份连接    
	    
	          
	        Connection con = null;    
	        Statement stmt = null;    
	        ResultSet rs = null;    

	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
	            con = DriverManager.getConnection(url);    

	            String SQL = "SELECT Id FROM dbo.Machines where Code='"+result+"'";    
	            stmt = con.createStatement();    
	            rs = stmt.executeQuery(SQL);   
	           
	            while (rs.next()) { 
	            	
	                MachineID= rs.getString(1);
	            }
	               
	                String SQLt="SELECT TotalDuration,RunDuration  FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay between '"+week[0]+"' and '"+week[1]+"'";
	                stmt = con.createStatement();    
	                rs = stmt.executeQuery(SQLt); 
	                int d=0;
	                while (rs.next()) {    
	                    Tarrweek[d]=rs.getInt(1);
	                    Rarrweek[d]=rs.getInt(2);
	                    d++;
	                }
	                
	                
	            for(int j=0;j<100;j++) {
	            	
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
			
	        calM.set(calM.DAY_OF_MONTH, 1);
			String[] month=new String[3];
			month[0]= simdf.format(calM.getTime());
			calM.set(Calendar.DAY_OF_MONTH, calM.getActualMaximum(Calendar.DAY_OF_MONTH));
			month[1]=simdf.format(calM.getTime());
			 System.out.println(month[0]);
			 System.out.println(month[1]);

			  String SQLt2="SELECT TotalDuration,RunDuration  FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay between '"+month[0]+"' and '"+month[1]+"'";
              stmt = con.createStatement();    
              rs = stmt.executeQuery(SQLt2); 
              int m=0;
              while (rs.next()) {    
                  Tarrmonth[m]=rs.getInt(1);
                  Rarrmonth[m]=rs.getInt(2);
                  m++;
              }
			 
			 for(int j=0;j<100;j++) {
	            	
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
           
            
	        calY.set(calY.DAY_OF_YEAR, 1);
			String[] YEAR=new String[3];
			YEAR[0]= simdf.format(calY.getTime());
			calY.set(Calendar.DAY_OF_YEAR, calY.getActualMaximum(Calendar.DAY_OF_YEAR));
			YEAR[1]= simdf.format(calY.getTime());
			System.out.println(YEAR[0]);
			System.out.println(YEAR[1]);

			  String SQL3="SELECT TotalDuration,RunDuration  FROM dbo.DailyStatesSummaries where MachineId='"+MachineID+"' and ShiftDay between '"+YEAR[0]+"' and '"+YEAR[1]+"'";
              stmt = con.createStatement();    
              rs = stmt.executeQuery(SQL3); 
              int y=0;
              while (rs.next()) {    
                  Tarryear[y]=rs.getInt(1);
                  Rarryear[y]=rs.getInt(2);
                  y++;
              }
			 
			 for(int j=0;j<1100;j++) {
	            	
            	 Totalyear+=Tarryear[j];
            	 Runyear+=Rarryear[j];

            }
            System.out.println("总时间："+Totalyear);
            System.out.println("运行时间："+Runyear);
            
            System.out.println("运行率："+df.format((float)Runyear/Totalyear*100)); 
            runrateyear=df.format((float)Runyear/Totalyear*100);
			 
	 }
	 
}
