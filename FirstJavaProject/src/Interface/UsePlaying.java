package Interface;

public class UsePlaying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		System.out.println(c.play());
		
		Musician m = new Musician();
		System.out.println(m.play());
		
		Actor a = new Actor();
		System.out.println(a.play());

	}

}
