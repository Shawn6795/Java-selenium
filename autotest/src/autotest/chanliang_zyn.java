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
import java.util.Scanner;

public class chanliang_zyn {
	public static int[] Yarrweek=new int[100];
	public static int[] Yarrmonth=new int[100];
	public static int[] Yarryear=new int[100];
	
	
	//public static  String Yield =null;
	
	
	public static int Ysumweek=0;
	public static int Ysummonth=0;
	public static int Ysumyear=0;
	
	
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException, ParseException {    
 
        String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName="+panel.Databasename+";user=sa;password=P@ssw0rd";//sa身份连接    
    
        Connection con = null;    
        Statement stmt = null;    
        ResultSet rs = null;    

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
            con = DriverManager.getConnection(url);    
            
            //按周
   		 SimpleDateFormat simdf = new SimpleDateFormat("yyyy-MM-dd");
   		 SimpleDateFormat day = new SimpleDateFormat("dd");
   		 SimpleDateFormat Year = new SimpleDateFormat("yyyy");
   		 Calendar cal = Calendar.getInstance();
   		 Date date=simdf.parse(chanliang_algorithm.time);
   		 cal.setTime(date);
   		 System.out.println("现在时间："+simdf.format(cal.getTime()));
   		 //分别获取年、月、日
   		
   		 String[] week=new String [7];
   		 cal.set(cal.DAY_OF_WEEK, cal.MONDAY);
   		week[0]= simdf.format(cal.getTime());
   		 
   		 for(int i=1;i<7;i++) {
   			int j=1;
   		 cal.set(Calendar.DATE, cal.get(cal.DATE) + j);
   		 week[i]= simdf.format(cal.getTime());
   		
   		 }
   		
   		 int z=0;
   		 for(int i=0;i<7;i++) {
            String SQL="SELECT Yield FROM dbo.Capacities where MachineCode='"+chanliang_algorithm.MachineCode+"' and ProgramName='"+chanliang_algorithm.programname+"' and ShiftDetail_ShiftDay='"+week[i]+"'";
            stmt = con.createStatement();    
            rs = stmt.executeQuery(SQL); 
           
            while (rs.next()) { 
            	Yarrweek[z]=rs.getInt(1);
            	z++;
 
            }
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
			 }
			 int y=0;
	   		 for(int i=0;i<lastday;i++) {
	   			// System.out.println(month[i]);
	            String SQL="SELECT Yield FROM dbo.Capacities where MachineCode='"+chanliang_algorithm.MachineCode+"' and ProgramName='"+chanliang_algorithm.programname+"' and ShiftDetail_ShiftDay='"+month[i]+"'";
	            stmt = con.createStatement();    
	            rs = stmt.executeQuery(SQL); 
	           
	            while (rs.next()) { 
	            	Yarrmonth[y]=rs.getInt(1);
	            	y++;
	 
	            }
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
			 int n=0;
			 for(int i=0;i<year;i++) {
				 //System.out.println(YEAR[i]);
		            String SQL="SELECT Yield FROM dbo.Capacities where MachineCode='"+chanliang_algorithm.MachineCode+"' and ProgramName='"+chanliang_algorithm.programname+"' and ShiftDetail_ShiftDay='"+YEAR[i]+"'";
		            stmt = con.createStatement();    
		            rs = stmt.executeQuery(SQL); 
		           
		            while (rs.next()) { 
		            	Yarryear[n]=rs.getInt(1);
		            	n++;
		 
		            }
		   		 }
       for(int i=0;i<100;i++) {
    	   Ysumweek+=Yarrweek[i]; 
       }
       for(int i=0;i<100;i++) {
       Ysummonth+=Yarrmonth[i]; 
       }
       for(int i=0;i<100;i++) {
	   Ysumyear+=Yarryear[i];
       }
       
       System.out.println(Ysumweek);
       System.out.println(Ysummonth);
       System.out.println(Ysumyear);
	}

}
