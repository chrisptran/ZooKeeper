package com.chris.zookeepers;

public class Mammal {
	public int energyLevel;

	public Mammal() {
		this.energyLevel = 100;
	}
	
	public int displayEnergy() {
		System.out.println("Energy level: " + this.energyLevel);
		return this.energyLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

}
