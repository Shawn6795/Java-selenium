package autotest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class time {
	public static long second;
	
	 public static long getDistanceTime(String str1, String str2, String pattern) {  
	        DateFormat df = new SimpleDateFormat(pattern);  
	        Date one;  
	        Date two;  
	        long day = 0;  
	        long hour = 0;  
	        long min = 0;  
	        long sec = 0;  
	        long ms = 0;  
	        try {  
	            one = df.parse(str1);  
	            two = df.parse(str2);  
	            long time1 = one.getTime();  
	            long time2 = two.getTime();  
	            long diff ;  
	            if(time1 < time2) {  
	                diff = time2 - time1;
	                second=diff/1000;
	                System.out.println(second);
	            } else {  
	                diff = time1 - time2;
	                second=diff/1000;
	                //System.out.println(second);
	            }  
//	            day = diff / (24 * 60 * 60 * 1000);  
//	            hour = (diff / (60 * 60 * 1000) - day * 24);  
//	            min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);  
//	            sec = (diff/1000-day*24*60*60-hour*60*60-min*60);  
	            //ms = (diff - day * 24 * 60 * 60 * 1000 - hour * 60 * 60 * 1000 - min * 60 * 1000 - sec * 1000);  
	        } catch (ParseException e) {  
	            e.printStackTrace();  
	        } 
	        return  second;
	        // return day + "天" + hour + "小时" + min + "分" + sec + "秒";  
	        //return day + "天" + hour + "小时" + min + "分" + sec + "秒" + ms + "毫秒";  
	    }  

}
