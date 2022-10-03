package com.abby.zookeeperpart2.models;

public class Bat extends Mammal{
//	attributes

	
	public Bat() {
		super(300);
	}
		
	
//	methods
	public int fly() {
		int currentEnergy = this.getEnergyLevel() -50;
		setEnergyLevel(currentEnergy);
		System.out.println("**Wings flapping, flying away**");
		return currentEnergy;
		
	}
	
	public int eatHumans() {
		int currentEnergy = this.getEnergyLevel() +25;
		setEnergyLevel(currentEnergy);
		System.out.println("Yummm");
		return currentEnergy;
	}
	
	public int attackTown() {
		int currentEnergy = this.getEnergyLevel() -100;
		setEnergyLevel(currentEnergy);
		System.out.println("**Setting the town to flames**");
		return currentEnergy;
	}



}
