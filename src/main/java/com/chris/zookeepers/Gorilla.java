package com.chris.zookeepers;

public class Gorilla extends Mammal {
	public Gorilla() {
		super();
	}
	
	public void throwThings() {
		System.out.println("The gorilla threw things");
		this.energyLevel -= 5;

	}
	
	public void eatBananas() {
		System.out.println("The gorilla has ate bananas");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed the tree");
		this.energyLevel -= 10;
	}
}
