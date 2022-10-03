package com.abby.zookeeperpart2.models;

public class Mammal {

//	attributes
	public int energyLevel = 100;
	
	
//	constructors
	public Mammal() {
		
	}
	
	
//	overloaded constructor
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
//	methods
	public int displayEnergy() {
		System.out.println("Total Energy: " + energyLevel + "\n");
		return energyLevel;
		
	}


	public int getEnergyLevel() {
		return energyLevel;
	}


	public int setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
		return energyLevel;
	}
	
	
	
}
