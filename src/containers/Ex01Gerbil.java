package containers;

import java.util.ArrayList;
import java.util.Random;

class Gerbil{
	private int id;
	static ArrayList idList = new ArrayList();
	public Gerbil() {
		id = new Random().nextInt(10);
		while(idList.contains(id) == true)
			id = new Random().nextInt(10);
		idList.add(id);
	}
	public int hop(){
		return id;
	}
}

public class Ex01Gerbil {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
				
		for(int i = 0 ; i < 10; i ++)
			gerbils.add(new Gerbil());
		
		for(int i = 0; i < gerbils.size(); i ++)
			System.out.println((gerbils.get(i)).hop());

	}

}
