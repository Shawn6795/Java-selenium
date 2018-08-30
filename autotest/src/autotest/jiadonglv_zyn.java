package autotest;
import java.math.BigDecimal;
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

import org.apache.commons.lang3.StringUtils;    
    
public class jiadonglv_zyn {    
	
	public static int[] JNarr=new int[100];
	public static int[] JWarr=new int[100];
	public static int JNei=0;
	public static int JWai=0;
	
	public static int[] JNarrmonth=new int[100];
	public static int[] JWarrmonth=new int[100];
	public static int JNeimonth=0;
	public static int JWaimonth=0;
	
	public static int[] JNarryear=new int[100];
	public static int[] JWarryear=new int[100];
	public static int JNeiyear=0;
	public static int JWaiyear=0;
	
	public static String strS=null;
	public static String strS2=null;
	public static String strS3=null;
	public static String strS4=null;
	public static int nowtime=0;

	public static String activation=null;
	public static String activationmonth=null;
	public static String activationyear=null;
	
	public static String MachineID;

	
    public static void main(String args[]) throws ClassNotFoundException, SQLException, ParseException {    
 
        String url = "jdbc:sqlserver://PRODUCTTEAM;databaseName="+panel.Databasename+";user=sa;password=P@ssw0rd";//sa身份连接    

        Connection con = null;    
        Statement stmt = null;    
        ResultSet rs = null;    

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
            con = DriverManager.getConnection(url);    

            SimpleDateFormat simdf = new SimpleDateFormat("yyyy-MM-dd");
   		 SimpleDateFormat day = new SimpleDateFormat("dd");
   		 SimpleDateFormat Year = new SimpleDateFormat("yyyy");
   		 
   		 //按周
   		 Calendar cal = Calendar.getInstance();
   		 Date date=simdf.parse(yunxinglv_zyn.resulttime);
   		 cal.setTime(date);
   		 String nowdate=simdf.format(cal.getTime());
 
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
            String SQL = "SELECT Id FROM dbo.Machines where Code='"+yunxinglv_zyn.result+"'";    
            stmt = con.createStatement();    
            rs = stmt.executeQuery(SQL);   
            //rs = stmt.executeQuery(SQL1);
    
            // Iterate through the data in the result set and display it.    
            while (rs.next()) { 
            	
                MachineID= rs.getString(1);
                String SQLt="SELECT TOP 1 StartTime,EndTime FROM dbo.States where MachineId='"+MachineID+"'and ShiftDetail_ShiftDay='"+nowdate+"' order by Id desc";
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
            	int z1=0;
              for(int i=0;i<7;i++) {
                   String SQL2="SELECT Duration FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"'and IsPlaned='1'and ShiftDetail_ShiftDay='"+week[i]+"'";
                   stmt = con.createStatement();
                   rs = stmt.executeQuery(SQL2);
                   
                   while (rs.next()) {
                	   JNarr[z1]=rs.getInt(1);
                	   z1++;
                   }
              }
              int z2=0;
              for(int i=0;i<7;i++) {
                	   String SQL3="SELECT Duration FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"'and IsPlaned='0'and ShiftDetail_ShiftDay='"+week[i]+"'";
                       stmt = con.createStatement();
                       rs = stmt.executeQuery(SQL3);
                       
                       while (rs.next()) {
                       JWarr[z2]=rs.getInt(1);
                       z2++;
                       }
              }

                       
                       String SQL4="SELECT Top 1 EndTime,StartTime FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"' and IsPlaned='1'and ShiftDetail_ShiftDay='"+nowdate+"' order by EndTime";
                        stmt = con.createStatement();
                        rs = stmt.executeQuery(SQL4);
                        while (rs.next()) {
                     	   strS2=rs.getString(1);
                     	   
                     	   
                     	}
                        String SQL5="SELECT Top 1 EndTime,StartTime FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"' and IsPlaned='0'and ShiftDetail_ShiftDay='"+nowdate+"' order by EndTime";
                        stmt = con.createStatement();
                        rs = stmt.executeQuery(SQL5);
                        while (rs.next()) {
                     	   strS3=rs.getString(1);
                     	  strS4=rs.getString(2);
                     	}
                   
            }   
            
            for(int j=0;j<100;j++) {
            	 JNei+=JNarr[j];
            	 JWai+=JWarr[j];
            }
           
            DecimalFormat df=new DecimalFormat("0.00");
         
    //按月
     		 Calendar calM = Calendar.getInstance();
       		 
       		 cal.setTime(date);
       		
     
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
       		 
       		
       		 for(int i=0;i<lastday;i++) {
       		System.out.println(month[i]);
       		 }

                   //System.out.println(MachineID);  
                	int y1=0;
                  for(int i=0;i<lastday;i++) {
                       String SQL2="SELECT Duration FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"'and IsPlaned='1'and ShiftDetail_ShiftDay='"+month[i]+"'";
                       stmt = con.createStatement();
                       rs = stmt.executeQuery(SQL2);
                       
                       while (rs.next()) {
                    	   JNarrmonth[y1]=rs.getInt(1);
                    	   y1++;
                       }
                  }
                  int y2=0;
                  for(int i=0;i<lastday;i++) {
                    	   String SQL3="SELECT Duration FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"'and IsPlaned='0'and ShiftDetail_ShiftDay='"+month[i]+"'";
                           stmt = con.createStatement();
                           rs = stmt.executeQuery(SQL3);
                           
                           while (rs.next()) {
                           JWarrmonth[y2]=rs.getInt(1);
                           y2++;
                           }
                  }

                for(int j=0;j<100;j++) {
                     JNeimonth+=JNarrmonth[j];
                	 JWaimonth+=JWarrmonth[j];

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
     			 for(int i=0;i<year;i++) {
     	       		System.out.println(YEAR[i]);
     	       		 }
     	               
     	                	int n1=0;
     	                  for(int i=0;i<year;i++) {
     	                       String SQL3="SELECT Duration FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"'and IsPlaned='1'and ShiftDetail_ShiftDay='"+YEAR[i]+"'";
     	                       stmt = con.createStatement();
     	                       rs = stmt.executeQuery(SQL3);
     	                       
     	                       while (rs.next()) {
     	                    	   JNarryear[n1]=rs.getInt(1);
     	                    	   n1++;
     	                       }
     	                  }
     	                  int n2=0;
     	                  for(int i=0;i<year;i++) {
     	                    	   String SQL4="SELECT Duration FROM dbo.States,dbo.StateInfos where dbo.States.Code=dbo.StateInfos.Code and MachineId='"+MachineID+"'and IsPlaned='0'and ShiftDetail_ShiftDay='"+YEAR[i]+"'";
     	                           stmt = con.createStatement();
     	                           rs = stmt.executeQuery(SQL4);
     	                           
     	                           while (rs.next()) {
     	                           JWarryear[n2]=rs.getInt(1);
     	                           n2++;
     	                           }
     	                  }

     	                for(int j=0;j<100;j++) {
     	                	
     	                	 
     	                	 JNeiyear+=JNarryear[j];
     	                	 JWaiyear+=JWarryear[j];
     	                	
     	                	 //sum=sum+sum;
     	                }

     	         		if(strS2==null&&strS3!=null&&strS4!=null) {
     	         			activation=df.format((float)(JNei+nowtime)/(JWai+JNei+nowtime)*100);
     	         			activationmonth=df.format((float)(JNeimonth+nowtime)/(JWaimonth+JNeimonth+nowtime)*100);
     	         			activationyear=df.format((float)(JNeiyear+nowtime)/(JWaiyear+JNeiyear+nowtime)*100);
     	         		}else if(strS2!=null&&strS3==null&&strS4!=null) {
     	         			activation=df.format((float)JNei/(JWai+nowtime+JNei)*100);
     	         			activationmonth=df.format((float)JNeimonth/(JWaimonth+nowtime+JNeimonth)*100);
     	         			activationyear=df.format((float)JNeiyear/(JWaiyear+nowtime+JNeiyear)*100);
     	         			
     	         		}else  {
     	         			activation=df.format((float)JNei/(JWai+JNei)*100);
     	         			activationyear=df.format((float)JNeiyear/(JWaiyear+JNeiyear)*100);
     	         			activationmonth=df.format((float)JNeimonth/(JWaimonth+JNeimonth)*100);
     	         		}
     	         		System.out.println(activationyear);
     	         		System.out.println(activationmonth);
     	         		System.out.println(activation);
    }    
}    