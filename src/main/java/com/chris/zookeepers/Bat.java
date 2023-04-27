package com.chris.zookeepers;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	
	public void attackTown() {
		System.out.println("The bat is attacking the town");
		this.energyLevel -= 100;
	}
	
	public void eatHuman() {
		System.out.println("The bat is eating a human");
		this.energyLevel += 25; 
	}
	
	public void fly() {
		System.out.println("The bat is flying");
		this.energyLevel -= 50;
	}
}
