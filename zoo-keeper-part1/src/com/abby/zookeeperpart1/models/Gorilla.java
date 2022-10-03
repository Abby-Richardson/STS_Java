package com.abby.zookeeperpart1.models;

public class Gorilla extends Mammal{

	public Gorilla() {
		super();
	}
	
	
//	methods
	public int throwSomething() {
		this.energyLevel -=5;
		System.out.println("Duck and cover, Gorilla just threw a coconut!");
		return energyLevel;
	}
	
	public int eatBananas() {
		this.energyLevel +=10;
		System.out.println("Nom nom nom, Bananaaaaaaa");
		return energyLevel;
		
	}
	
	public int climb() {
		this.energyLevel -=10;
		System.out.println("Finally, I made it to the top of the tree! I wish I had another banana.");
		return energyLevel;
		
	}

}
