package com.geekbrains.lesson2.homework;

public class Human implements Contestant {
	
	private String name;
	
	private int runDistance;
	
	private int jumpHeight;
	
	
	
	public Human(String name, int runDistance, int jumpHeight) {
		this.name = name;
		this.runDistance = runDistance;
		this.jumpHeight = jumpHeight;
	}
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getRunDistance() {
		return runDistance;
	}


	public void setRunDistance(int runDistance) {
		this.runDistance = runDistance;
	}


	public int getJumpHeight() {
		return jumpHeight;
	}


	public void setJumpHeight(int jumpHeight) {
		this.jumpHeight = jumpHeight;
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

