package Array;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Stu_Height = {175,167,160,164,183,187,188,179,176,175,169,175,176,178,165};
		
		int aboveavg = 0, belowavg = 0;
		
		int sum = 0;
		for(int i = 0;i<Stu_Height.length;i++) {
			sum += Stu_Height[i];
		}
		
		int avg = sum/Stu_Height.length;
		System.out.println("Total = " + sum);
		System.out.println("Average = " + avg);
		
		for(int i = 0;i<Stu_Height.length;i++) {
			if (Stu_Height[i] > avg)
				aboveavg++;
			else if (Stu_Height[i] < avg)
				belowavg++;
		}
		
		System.out.println("Above average = " + aboveavg);
		System.out.println("Below average = " + belowavg);
		
		int max = Stu_Height[0];
		int min = Stu_Height[0];
		
		for(int i =1; i<Stu_Height.length; i++) {
			if(Stu_Height[i] > max)
				max = Stu_Height[i];
			else if(Stu_Height[i] < min)
				min = Stu_Height[i];
		}
		
		System.out.println("The shortest Height = " + min);
		System.out.println("The highest Height = " + max);

	}

}
