package com.abby.zookeeperpart2;

import com.abby.zookeeperpart2.models.Gorilla;
import com.abby.zookeeperpart2.models.Bat;

public class ZooKeeperApplication {

	public static void main(String[] args) {
		Gorilla gorilla1 = new Gorilla();
		Bat bat1 = new Bat();
		

		
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.displayEnergy();
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		gorilla1.displayEnergy();
		gorilla1.climb();
		gorilla1.displayEnergy();
		
		bat1.displayEnergy();
		bat1.eatHumans();
		bat1.eatHumans();
		bat1.displayEnergy();
		
		bat1.fly();
		bat1.fly();
		bat1.displayEnergy();
		
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		bat1.displayEnergy();
	}

}

	