package com.geekbrains.lesson2;

public interface Flyable {
	default void fly() {  //public abstract
		System.out.println("Flies by default");
	} 

}
 