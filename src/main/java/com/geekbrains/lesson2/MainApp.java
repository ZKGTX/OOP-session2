package com.geekbrains.lesson2;

public class MainApp {
	
	static class Human {
		private Transport currentTransport;
		
		public void drive (Transport transport) {
			transport.start();
			this.currentTransport = transport; 
		}
		
		public void stop () {
			if (currentTransport != null) {
				currentTransport.stop();
				currentTransport = null;
			}
			else {
				System.out.println("I've already stopped");
			}
		}
		
		
	}
	
	static class Car implements Transport {
		@Override
		public void start () {
			System.out.println("Car starts to move");
		}
		
		@Override
		public void stop() {
			System.out.println("Car stops");
		}
		
		
	}
	
	static class Skateboard implements Transport {

		@Override
		public void start() {
			System.out.println("Skateboard starts to move");			
		}

		@Override
		public void stop() {
			System.out.println("Skateboard stops");
		}
		
	}
	
	static class Bicycle implements Transport { 

		@Override
		public void start() {
			System.out.println("Bicyle starts to move");
		}

		@Override
		public void stop() {
			System.out.println("Bicycle stops");
		}
		
	}
	
	static class Motorcycle implements Transport { 

		@Override
		public void start() {
			System.out.println("Motorcyle starts to move");
		}

		@Override
		public void stop() {
			System.out.println("Motorcycle stops");
		}
		
	}
	

	public static void main(String[] args) {
		
		Flyable [] flyables = {
				new Duck(),
				new Airplane()
		};
		
		for (Flyable f: flyables) {
			f.fly();
		}
		
		Flyable somethingFlyable = new Duck();
		somethingFlyable.fly();
		
		Car car = new Car();
		Skateboard skateboard = new Skateboard();
		Bicycle bicycle = new Bicycle();
		Motorcycle motorcycle = new Motorcycle();
		
		Human human = new Human();
		human.stop();
		human.drive(motorcycle);
		human.stop();
		human.drive(car);
		
	}

}
