package com.mermer.ch5;

public class Van extends Car{

	public Van(String name, String brand) {
		
		super(name, brand);
	}

	@Override
	public void drive() {
		
		System.out.println("Driving a VAN " + name + " from " + brand);
	}
	
	
}
