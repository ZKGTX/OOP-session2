package com.geekbrains.lesson2.homework;

public class Cat implements Contestant {
	
	private String name;
	
	private int maxRunDistance;
	
	private int maxJumpHeight;
	
	
	public Cat(String name, int runDistance, int jumpHeight) {
		this.name = name;
		this.maxRunDistance = runDistance;
		this.maxJumpHeight = jumpHeight;
	}
	
	

	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getRunDistance() {
		return maxRunDistance;
	}

	public void setRunDistance(int runDistance) {
		this.maxRunDistance = runDistance;
	}


	public int getJumpHeight() {
		return maxJumpHeight;
	}

	public void setJumpHeight(int jumpHeight) {
		this.maxJumpHeight = jumpHeight;
	}



	@Override
	public boolean run(Treadmill treadmill) {
		boolean result;

		if (treadmill.getLength() <= getRunDistance()) {
			System.out.println(getName() + " succesfully runs " + treadmill.getLength() + " m");
			result = true;

		}
		else {
			System.out.println(getName()  + " failed to run " + treadmill.getLength() + " m");
			result =  false;

		}
		return result;
		
	}
	
	
	@Override
	public boolean jump (Wall wall) {
		boolean result;
		
		
		if (wall.getHeight() <= this.getJumpHeight()) {
			System.out.println(getName() + " succesfully jumps " + wall.getHeight() + " m");
			result = true;
		}
		else {
			System.out.println(getName() + " failed to jump over " + wall.getHeight() + " m");
			result =  false;
		}
		return result;
	}
}
