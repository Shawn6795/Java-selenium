package test;
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
    
public class banci {    
	public static int[] BTarr=new int[100];
	public static int[] BRarr=new int[100];
	public static int[] BJNarr=new int[100];
	public static int[] BJWarr=new int[100];
	public static int BJNei=0;
	public static int BJWai=0;
	public static int BTotal=0;
	public static int BRun=0;
	public static String BstrS=null;
	public static String BstrS2=null;
	public static String BstrS3=null;
	public static String BstrS4=null;
	public static int Bnowtime=0;
	public static String Bresult=null;
	public static String Bresulttime=null;
	public static String Brunrate=null;
	public static String Bactivation=null;
	public static String Bbanciname=null;
	
    
    public static void main(String args[]) {    
 
        String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName="+test.database+";user=sa;password=P@ssw0rd";//sa身份连接    
    
        Connection con = null;    
        Statement stmt = null;    
        ResultSet rs = null;    
    
        try { 

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
            con = DriverManager.getConnection(url);    
           
            
            String MachineID;
            String date=Bresulttime+" "+"00:00:00.000";
            
            
            String SQL = "SELECT Id FROM dbo.Machines where Code='"+Bresult+"'";    
            stmt = con.createStatement();    
            rs = stmt.executeQuery(SQL);   
           
            while (rs.next()) { 
            	
                MachineID= rs.getString(1);
                String SQLt="SELECT Top 1 StartTime,EndTime FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"' and ShiftDetail_MachineShiftName='"+Bbanciname+"' and ShiftDetail_ShiftDay='"+date+"' order by dbo.States.Id desc";
                stmt = con.createStatement();    
                rs = stmt.executeQuery(SQLt); 
               
                while (rs.next()) { 
                	String str=rs.getString(1);
                	BstrS=str;
                	
                }
                System.out.println(BstrS);
                //System.out.println(strS2);
                SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            	String strE=df1.format(new Date());;
            	//String str2="2018-07-31 16:00:00";
            	String pattern="yyyy-MM-dd HH:mm:ss";
            	long now=time.getDistanceTime(strE, BstrS, pattern);
            	 Bnowtime=(int)now;
            	System.out.println(now);
            	
               //System.out.println(MachineID);  
               String SQL1="SELECT  Top 1 RunDuration,TotalDuration FROM dbo.DailyStatesSummaries,dbo.States where dbo.States.MachinesShiftDetailId=dbo.DailyStatesSummaries.MachinesShiftDetailId and dbo.States.MachineId='"+MachineID+"' and  dbo.States.ShiftDetail_MachineShiftName='"+Bbanciname+"' and  dbo.States.ShiftDetail_ShiftDay='"+Bresulttime+"'";
               stmt = con.createStatement();
               rs = stmt.executeQuery(SQL1);
               int i=0;
               while (rs.next()) {    
                   BTarr[i]=rs.getInt(2);
                   BRarr[i]=rs.getInt(1);
                   i++;
               }
                   String SQL2="SELECT Duration FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"'and IsPlaned='1'and ShiftDetail_ShiftDay='"+date+"' and ShiftDetail_MachineShiftName='"+Bbanciname+"'";
                   stmt = con.createStatement();
                   rs = stmt.executeQuery(SQL2);
                   int a=0;
                   while (rs.next()) {
                	   BJNarr[a]=rs.getInt(1);
                	   a++;
                   }
                	   String SQL3="SELECT Duration FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"'and IsPlaned='0'and ShiftDetail_ShiftDay='"+date+"' and ShiftDetail_MachineShiftName='"+Bbanciname+"'";
                       stmt = con.createStatement();
                       rs = stmt.executeQuery(SQL3);
                       int b=0;
                       while (rs.next()) {
                       BJWarr[b]=rs.getInt(1);
                       b++;
                       }
                   
//                   double Runrate = new BigDecimal((float)Runtime/Totaltime).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
//           		System.out.println(Runrate*100); 
                       
                       String SQL4="SELECT Top 1 EndTime,StartTime FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"' and IsPlaned='1'and ShiftDetail_ShiftDay='"+date+"' and ShiftDetail_MachineShiftName='"+Bbanciname+"' order by EndTime";
                        stmt = con.createStatement();
                        rs = stmt.executeQuery(SQL4);
                        while (rs.next()) {
                     	   BstrS2=rs.getString(1);
                     	 
                     	   
                     	}
                        String SQL5="SELECT Top 1 EndTime,StartTime FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"' and IsPlaned='0'and ShiftDetail_ShiftDay='"+date+"' and ShiftDetail_MachineShiftName='"+Bbanciname+"' order by EndTime";
                        stmt = con.createStatement();
                        rs = stmt.executeQuery(SQL5);
                        while (rs.next()) {
                     	   BstrS3=rs.getString(1);
                     	  BstrS4=rs.getString(2);
//                     	}
                   
            }   
            
            for(int j=0;j<100;j++) {
            	
            	 BTotal+=BTarr[j];
            	 BRun+=BRarr[j];
            	 BJNei+=BJNarr[j];
            	 BJWai+=BJWarr[j];
            	 
            	 //sum=sum+sum;
            }
            System.out.println("总时间："+BTotal);
            System.out.println("运行时间："+BRun);
            DecimalFormat df=new DecimalFormat("0.00");
           // double Runrate = new BigDecimal((float)Run/Total).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.println(BJNei);
            System.out.println(BJWai);
     		System.out.println("运行率："+df.format((float)BRun/BTotal*100)); 
     		Brunrate=df.format((float)BRun/BTotal*100);
     		
     		System.out.println(BstrS2);
     		System.out.println(BstrS3);
     		System.out.println(BstrS4);
     		if(BstrS2==null&&BstrS3!=null&&BstrS4!=null) {
     			//System.out.println("稼动率："+df.format((float)(JRun+nowtime)/(JTotal+nowtime)*100));
     			
     			Bactivation=df.format((float)(BJNei+Bnowtime)/(BJWai+BJNei+Bnowtime)*100);
     		}else if(BstrS2!=null&&BstrS3==null&&BstrS4!=null) {
     			//System.out.println("稼动率："+df.format((float)JRun/JTotal*100));
     			Bactivation=df.format((float)BJNei/(BJWai+Bnowtime+BJNei)*100);
     			
     		}else  {
     			Bactivation=df.format((float)BJNei/(BJWai+BJNei)*100);
     		}
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