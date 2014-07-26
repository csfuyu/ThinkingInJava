package containers;

import java.util.*;

class appleSet {
	int id;
	private static HashSet ids = new HashSet();
	@SuppressWarnings("unchecked")
	public appleSet(){
		id = new Random().nextInt(10);
		while(ids.add(id) == false)
			id = new Random().nextInt(10);
	}
	public int id(){
		return id;
	}
}

public class Ex02SimpleCollection {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		for(int i = 0; i < 10; i ++)
			c.add(i);
		System.out.print("ArrayList start: ");
		for(Integer i : c)
			System.out.print(i + ", ");
		
		System.out.println();
		System.out.print("Set start      : ");
		Set c2 = new HashSet();
		for(int i = 0; i< 10; i++)
			c2.add(i);
		for(Integer i : c)
			System.out.print(i + ". ");
		
		System.out.println();
		System.out.print("Set random     : ");
		ArrayList<appleSet> appleset = new ArrayList<appleSet>();
		for(int i = 0; i < 10; i ++)
			appleset.add(new appleSet());
		for(appleSet d: appleset)
			System.out.print(d.id()+"' ");
	}

}
