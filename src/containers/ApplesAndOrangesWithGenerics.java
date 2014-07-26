package containers;

import java.util.*;

class Apple2 {
	private static long counter;
	private final long id = counter++;
	public long id() { return id; }
}

class Orange2{
	public long id() { return 100; }
}

public class ApplesAndOrangesWithGenerics {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Apple2> apples = new ArrayList<Apple2>();
		for(int i = 0; i < 3; i++)
			apples.add(new Apple2());
		
			// Orange cannot be added to the Apple arrayList
			apples.add(new Orange2());
			
			for(int i = 0; i < apples.size(); i++)
				System.out.println((apples.get(i)).id());
			
			for(Apple2 c : apples)
				System.out.println(c.id());

	}

}