package com.javaex.ex05;

public class Rectangle {

	//필드
	private int width;
	private int height;
	//생성자
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}


	
	//메소드 gs

	//메소드 일반

	 
	
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		int area = this.width * this.height;
		int area1 = r.width * r.height;
		
		if(area == area1) {
			return true;
		}else {
			return false;
		}
	
		
	}
	
	
}
