package com.geekbrains.lesson2;

public class Duck implements Flyable, Swimmable {

	public void swim() {
		System.out.println("Swims");
	}
	
	

	public void supaDupaFly() {
		System.out.println("SupaDupaFlies");
		
	}

 
	@Override
	public void fly() {
		System.out.println("Duck flies");
	}

}
