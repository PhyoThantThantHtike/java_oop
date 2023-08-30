package Array;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Su Su","Aung Aung","Zin Zin","Min Min","Khin Thu"};
		int[] marks = {89,99,48,51,27};
		for(int i = 0; i< name.length; i++) {
			if(marks[i]>=50) {
				System.out.println(name[i]+ ": pass");
			}
			else
				System.out.println(name[i]+ ": fail");
		}

	}

}
