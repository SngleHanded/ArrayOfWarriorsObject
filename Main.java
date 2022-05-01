/////////////////////////////////////////////////////////////////////////////////////
// Dylan Conley
// CSC 160 Computer Science I, section 680
// April 16, 2022
// Homework 10 Array of Warrior Objects - This program was written to play out a damage taken sequence against warriors, and print out the play by play.
/////////////////////////////////////////////////////////////////////////////////////

package edu.arapahoe.csc160;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		for (int p = 0; p < 10; p++) {
			WarriorFred[] doug = new WarriorFred[5];

			for (int l = 0; l < doug.length; l++) {
				doug[l] = new WarriorFred();
			}

			doug[0].setNickName("John");
			doug[1].setNickName("Larry");
			doug[2].setNickName("Marco");
			doug[3].setNickName("Fred");
			doug[4].setNickName("Cornelious");

			Random r2 = new Random();

			int damage = 0;
			for (int l = 0; l < doug.length; l++) {
				damage = r2.nextInt(10) + 1;
				doug[l].takeDamage(damage);
			}

			for (int l = 0; l < doug.length; l++) {
				System.out.println();
				doug[l].reaction();
				doug[l].printInfo();

				System.out.println("Warrior is alive:" + doug[l].isAlive());

				doug[l].takeDamage(5);

				doug[l].reaction();

				doug[l].takeDamage(5);

				doug[l].reaction();

				doug[l].reSpawn();

				doug[l].takeDamage(15);

				doug[l].reaction();

				doug[l].reSpawn();

				System.out.println("Warrior is alive: " + doug[l].isAlive());
			}
		}
	}
}