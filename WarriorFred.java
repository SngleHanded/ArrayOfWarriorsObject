package edu.arapahoe.csc160;

import java.util.Random;

public class WarriorFred {

	private String nickName = ("unknown");
	private int lifeForce = 10;
	private int damage = 0;

	String[] armory = {"Exploding Pumpkin", "Candy Corn", "Paper Bag"};

	public void reSpawn() {
		lifeForce = 10;
		System.out.println(nickName + " has respawned.");
	}

	public void takeDamage(int n) {
		damage += n;
		if (damage >= 10) {
			lifeForce--;
			damage = 0;
		}
	}

	public void reaction() {
		Random r = new Random();
		String[] sound = {"OW!", "Wham!", "POW!", "Boffo!!", "KaPow!", "That one hurt!"};
		System.out.println(sound[r.nextInt(sound.length)]);
	}
	
	public boolean isDead() {
		if (lifeForce <= 0) return true;
		else return false;
	}
	
	public boolean isAlive() {
		if (lifeForce > 0) return true;
		else return false;
	}

	public void setNickName(String name) {
		nickName = name;
	}


	public void printInfo() {
		System.out.println("Nick Name: " + nickName);
		System.out.println("Life Force: " + lifeForce);
		System.out.println("Damage: " + damage);
		for (int i = 0; i < armory.length; i++)
			System.out.println("Armory: " + this.armory[i]);
		System.out.println(nickName + " has " + (lifeForce - damage) + " health left.");
	}
}