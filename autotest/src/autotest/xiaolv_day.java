package autotest;
import java.math.BigDecimal;
import java.sql.Connection;    
import java.sql.DriverManager;    
import java.sql.ResultSet;    
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;    
    
public class xiaolv_day {    
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
    
    public static void main(String args[]) {    
        // Create a variable for the connection string.  
//    	SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//    	String str1=df1.format(new Date());;
//    	//String str2="2018-07-31 16:00:00";
//    	String pattern="yyyy-MM-dd HH:mm:ss";
//    	System.out.println(time.getDistanceTime(str1, str2, pattern));
        String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName="+panel.Databasename+";user=sa;password=P@ssw0rd";//sa身份连接    
    
        //String url2 = "jdbc:sqlserver://127.0.0.1:1368;databaseName=mydb;integratedSecurity=true;";//windows集成模式连接    
    
        // Declare the JDBC objects.    
        Connection con = null;    
        Statement stmt = null;    
        ResultSet rs = null;    
    
        try { 
        	
        	Scanner scanner = new Scanner(System.in); //声明Scanner对象
//        	System.out.println("请输设备编号"); //提示用户输入字符串
//        	 result = scanner.next(); //定义一个result接受输入的语句
//        	System.out.println("请输入日期");
//        	 resulttime=scanner.next();
            // Establish the connection.    
            //System.out.println("begin.");    
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
            con = DriverManager.getConnection(url);    
            //System.out.println("end.");  
            
            String MachineID;
            String date=resulttime+" "+"00:00:00.000";
            // Create and execute an SQL statement that returns some data.  
            
            String SQL = "SELECT Id FROM dbo.Machines where Code='"+result+"'";    
            stmt = con.createStatement();    
            rs = stmt.executeQuery(SQL);   
            //rs = stmt.executeQuery(SQL1);
    
            // Iterate through the data in the result set and display it.    
            while (rs.next()) { 
            	
                MachineID= rs.getString(1);
                String SQLt="SELECT TOP 1 StartTime,EndTime FROM dbo.States where MachineId='"+MachineID+"'and ShiftDetail_ShiftDay='"+date+"' order by Id desc";
                stmt = con.createStatement();    
                rs = stmt.executeQuery(SQLt); 
               
                while (rs.next()) { 
                	String str=rs.getString(1);
                	strS=str;
                	
                }
                System.out.println(strS);
                //System.out.println(strS2);
                SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            	String strE=df1.format(new Date());;
            	//String str2="2018-07-31 16:00:00";
            	String pattern="yyyy-MM-dd HH:mm:ss";
            	long now=time.getDistanceTime(strE, strS, pattern);
            	 nowtime=(int)now;
            	System.out.println(now);
            	
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
                   
//                   double Runrate = new BigDecimal((float)Runtime/Totaltime).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
//           		System.out.println(Runrate*100); 
                       
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
                   
            }   
            
            for(int j=0;j<100;j++) {
            	
            	 Total+=Tarr[j];
            	 Run+=Rarr[j];
            	 JNei+=JNarr[j];
            	 JWai+=JWarr[j];
            	
            	 //sum=sum+sum;
            }
            System.out.println("总时间："+Total);
            System.out.println("运行时间："+Run);
            DecimalFormat df=new DecimalFormat("0.00");
           // double Runrate = new BigDecimal((float)Run/Total).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.println(JNei);
            System.out.println(JWai);
     		System.out.println("运行率："+df.format((float)Run/Total*100)); 
     		runrate=df.format((float)Run/Total*100);
     		
     		System.out.println(strS2);
     		if(strS2==null&&strS3!=null&&strS4!=null) {
     			//System.out.println("稼动率："+df.format((float)(JRun+nowtime)/(JTotal+nowtime)*100));
     			
     			activation=df.format((float)(JNei+nowtime)/(JWai+JNei+nowtime)*100);
     		}else if(strS2!=null&&strS3==null&&strS4!=null) {
     			//System.out.println("稼动率："+df.format((float)JRun/JTotal*100));
     			activation=df.format((float)JNei/(JWai+nowtime+JNei)*100);
     			
     		}else  {
     			activation=df.format((float)JNei/(JWai+JNei)*100);
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