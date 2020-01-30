package TheValidateThing;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Thing> allThings = new ArrayList<>();
		//Creating the object of class Bike valid and invalid
		allThings.add(new Bike("bike1 :", 1, false, true));
		allThings.add(new Bike("bike2 :", 3, true, false));
		
		//Creating the object of class RiceCooker valid and invalid
		allThings.add(new RiceCooker("riceCooker1 :", 3, 3));
		allThings.add(new RiceCooker("riceCooker2 :", 3, 500));
		
		//Creating the object of class ItTeacher valid and invalid
		allThings.add(new ItTeacher("ItTeacher1 :", 3, true));
		allThings.add(new ItTeacher("ItTeacher2 :", 1, false));
		
		for(int i = 0; i < allThings.size(); i++) {
			System.out.println(allThings.get(i));
		}
	}

}
