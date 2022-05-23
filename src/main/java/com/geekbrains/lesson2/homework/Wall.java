package com.geekbrains.lesson2.homework;

public class Wall implements Obstacle {
	
	private int height;

	public Wall(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
		
	
}
