package com.geekbrains.lesson2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AnotherMainApp {
	
	//class Inner {
		
		//int innerValue;

		//public Inner(int innerValue) {
			//this.innerValue = innerValue;
		//}
		
		//public void innerMethod() {
			//System.out.println(innerValue);
			//System.out.println(outerValue); // может обратиться к переменной внешнего класса
			//outerMethod();					// может вызвать метод внешнего класса
		//}
		
	//}
	
	//int outerValue;
	
	//public void outerMethod() {
		//System.out.println(outerValue);
		//System.out.println(innerValue); // НЕ может обратиться к переменной внутреннего класса
		//innerMethod(); 					// НЕ может вызвыть метод внутреннего класса
		//Inner inner = new Inner(10);
	//}
	
	
	
	public static void main(String[] args) {
		JButton button1 = new JButton ("Button1");
		button1.addActionListener(new Button1Action());
		JButton button2 = new JButton ("Button2");
		button2.addActionListener(new ActionListener() { // добавляем объект анонимного внутреннего класса и сразу прописываем функционал, 
			@Override                                    // нет необходимости создавать класс отдельно если он нигде больше не будет использоваться.
			public void actionPerformed(ActionEvent e) {
				System.out.println(2);
			}
		});
		
		//Inner inner = new AnotherMainApp().new Inner(20); 
		
		//class Point {
			//int x;

			//public Point(int x) {
				//this.x = x;
			//}
			
			//public void info() {
				//System.out.println(x); 
			//}
		
		//анонимный внутренний класс:
		
		Flyable flyable = new Flyable() {
			@Override
			public void fly() {
				
			}
		};
		
		Animal animal = new Animal() {

			@Override
			void run() {
				
			}

			@Override
			void swim() {
				
			}
			
		};
		
		//public class AnotherMainApp$1 implements Flyable {
		//@Override
		//public void fly() {
		//}
		//}
		//AnotherMainApp flyable = new AnotherMainApp(); 
		
		System.out.println(flyable.getClass().getName()); //com.geekbrains.lesson2.AnotherMainApp$1

			
		}
	}

