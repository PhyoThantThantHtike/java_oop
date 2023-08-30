package Method;

import java.util.Scanner;

public class MethodEx1 {
	
	static  Long hr;
	static  Long min;
	static  Long sec;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Long totalsec = hms_to_sec(hr, min, sec);
			System.out.println(totalsec + " sec");
		}
		
	}
	
	public static Long hms_to_sec(Long hour, Long minute, Long second) {
		
		System.out.println("Enter hour: ");
		hour = sc.nextLong();
		if(hour > 12) {
			hour = hour - 12;
		}
		
		System.out.println("Enter minute: ");
		minute = sc.nextLong();
		if(minute > 59) {
			hour ++;
			minute -= 60;
		}
		
		System.out.println("Enter second: ");
		second = sc.nextLong();
		if(second > 59) {
			minute ++;
			second -= 60;
		}
		
		Long tsec = hour * 3600 + minute * 60 + second;
		return tsec;
	}

}
