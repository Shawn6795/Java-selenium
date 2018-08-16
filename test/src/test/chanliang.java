package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Scanner;

public class chanliang {
	public static int[] Yarr=new int[100];
	public static int[] BYarr=new int[100];
	//public static  String Yield =null;
	public static String time=null;
	public static String MachineCode=null;
	public static String programname=null;
	public static String banciname=null;
	public static int Ysum=0;
	public static int BYsum=0;
	
	
	
	public static void main(String args[]) {    
 
        String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName="+test.database+";user=sa;password=P@ssw0rd";//sa身份连接    
    
        Connection con = null;    
        Statement stmt = null;    
        ResultSet rs = null;    
    
        try { 
        	
        	Scanner scanner = new Scanner(System.in); //声明Scanner对象   
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
            con = DriverManager.getConnection(url);    
            
            String SQL="SELECT Yield FROM dbo.Capacities where MachineCode='"+MachineCode+"' and ProgramName='"+programname+"' and ShiftDetail_ShiftDay='"+time+"'";
            stmt = con.createStatement();    
            rs = stmt.executeQuery(SQL); 
            int i=0;
            while (rs.next()) { 
            	Yarr[i]=rs.getInt(1);
            	i++;
 
            }
            
        }    
        
        // Handle any errors that may have occurred.    
        catch (Exception e) {    
            e.printStackTrace();    
        }
        try {
        	Scanner scanner = new Scanner(System.in); //声明Scanner对象   
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
            con = DriverManager.getConnection(url);    
            
            String SQL1="SELECT Yield FROM dbo.Capacities where MachineCode='"+MachineCode+"'and ProgramName='"+programname+"' and ShiftDetail_ShiftDay='"+time+"' and ShiftDetail_MachineShiftName='"+banciname+"'";
            stmt = con.createStatement();    
            rs = stmt.executeQuery(SQL1); 
            int i=0;
            while (rs.next()) { 
            	BYarr[i]=rs.getInt(1);
            	i++;
 
            }
        	
        }catch (Exception e) {    
            e.printStackTrace();    
        }
       for(int i=0;i<100;i++) {
    	   Ysum+=Yarr[i];
    	   BYsum+=BYarr[i];
       }
       
       System.out.println(Ysum);
	}

}
