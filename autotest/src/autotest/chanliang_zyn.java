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
	public static int[] Yarryear=new int[1100];
	
	

	
	
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
   		// Date date=simdf.parse(chanliang_algorithm.time);
   		Date date=simdf.parse("2018-08-30");
   		 cal.setTime(date);
   		 System.out.println("现在时间："+simdf.format(cal.getTime()));
   		 //分别获取年、月、日
   		
   		 String[] week=new String [3];
   		 cal.set(cal.DAY_OF_WEEK, cal.MONDAY);
   		week[0]= simdf.format(cal.getTime());
   		 
   	    cal.set(Calendar.DATE, cal.get(cal.DATE) + 6);
		week[1]= simdf.format(cal.getTime());
   		System.out.println(week[0]);
   		System.out.println(week[1]);
   		 
   		
            String SQL="SELECT Yield FROM dbo.Capacities where MachineCode='"+chanliang_algorithm.MachineCode+"' and ProgramName='"+chanliang_algorithm.programname+"' and ShiftDetail_ShiftDay between '"+week[0]+"' and '"+week[1]+"'";
            stmt = con.createStatement();    
            rs = stmt.executeQuery(SQL); 
            int z=0;
            while (rs.next()) { 
            	Yarrweek[z]=rs.getInt(1);
            	z++;
 
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
			 int y=0;
	   		 
	   			// System.out.println(month[i]);
	            String SQL2="SELECT Yield FROM dbo.Capacities where MachineCode='"+chanliang_algorithm.MachineCode+"' and ProgramName='"+chanliang_algorithm.programname+"' and ShiftDetail_ShiftDay between '"+month[0]+"' and '"+month[1]+"'";
	            stmt = con.createStatement();    
	            rs = stmt.executeQuery(SQL2); 
	           
	            while (rs.next()) { 
	            	Yarrmonth[y]=rs.getInt(1);
	            	y++;
	 
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
			
			 int n=0;
			
				 //System.out.println(YEAR[i]);
		            String SQL3="SELECT Yield FROM dbo.Capacities where MachineCode='"+chanliang_algorithm.MachineCode+"' and ProgramName='"+chanliang_algorithm.programname+"' and ShiftDetail_ShiftDay between '"+YEAR[0]+"' and '"+YEAR[1]+"'";
		            stmt = con.createStatement();    
		            rs = stmt.executeQuery(SQL3); 
		           
		            while (rs.next()) { 
		            	Yarryear[n]=rs.getInt(1);
		            	n++;
		 
		            }
		   		 
       for(int i=0;i<100;i++) {
    	   Ysumweek+=Yarrweek[i];
    	   Ysummonth+=Yarrmonth[i]; 
       }
      
       for(int i=0;i<1100;i++) {
	   Ysumyear+=Yarryear[i];
       }
       
       System.out.println(Ysumweek);
       System.out.println(Ysummonth);
       System.out.println(Ysumyear);
	}

}
