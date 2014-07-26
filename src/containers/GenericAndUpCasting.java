package containers;

import java.util.*;

class GrannySmith extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Braeburn extends Apple {}

public class GenericAndUpCasting {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList();
		
		apples.add(new Apple());
		apples.add(new Orange());
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());

		for(Apple c : apples)
			System.out.println(c);
	}

}
