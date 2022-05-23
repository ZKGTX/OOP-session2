package com.geekbrains.lesson2.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		
		Contestant[] contestants = {
				new Cat("Barsik", 150, 9),
				new Human("Stepan", 1000, 2),
				new Robot("Bender", 10000, 12),
				new Cat("Vasiliy", 120, 10),
				new Human("Oleg", 900, 1),
				new Robot("Cyrax", 15000, 10)
		};
		
		
		
		Obstacle[] obstacles = {
				new Wall (7),
				new Treadmill (200),
				new Wall (9),
				new Treadmill (150)
		};
		
		List<Contestant> contestantsList = new ArrayList<>(Arrays.asList(contestants));
		
		for (Obstacle o: obstacles) {			
			contestantsList.removeIf(contestant -> action (contestant, o) == false);		
		}
		
	}
		
	public static boolean action (Contestant c, Obstacle o) {
		if (o instanceof Treadmill) {
			return c.run((Treadmill) o);
		}
		
		return c.jump((Wall) o);
		
	}
	
	
	}
	
	


