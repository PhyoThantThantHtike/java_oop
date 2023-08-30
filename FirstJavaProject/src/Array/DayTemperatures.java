package Array;

import java.util.Arrays;
import java.util.Scanner;

public class DayTemperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int below = 0, above = 0;
		System.out.println("How many days' temperatures?");
		int day = sc.nextInt();
		int [] tem = new int[day];
		for(int i = 0; i < day; i++) {
			System.out.println("Enter temperature");
			tem[i] = sc.nextInt();
			total += tem[i];
		}
		System.out.println("Total temperature = " + total);
		double avg = total/day;
		System.out.println("Average temperature = " + avg);
		for(int j = 0; j < tem.length; j++) {
			if( tem[j] > avg) 
			{
				above++;
			}
			else if(tem[j] < avg) 
			{
				below++;
			}
		}
		System.out.println(above + " days were above average.");
		System.out.println(below + " days were below average.");
		System.out.println("Temperatures: " + Arrays.toString(tem));
		Arrays.sort(tem);
		System.out.println("Sorted Array: " + Arrays.toString(tem));
		System.out.println("Two coldest days: " + tem[0] + "," + tem[1]);
		System.out.println("Two hottest days: " + tem[5] + "," + tem[6]);
		int tem2 [] = Arrays.copyOf(tem, tem.length);
		boolean con = Arrays.equals(tem, tem2);
		if(con)
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		Arrays.fill(tem2, 34);
		System.out.println("Another days' temperatures: " + Arrays.toString(tem2));
		

	}

}
