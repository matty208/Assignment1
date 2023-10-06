package edu.monmouth.assignment1;

import java.util.Arrays;

public class Assignment1 {

	public static void main(String[] args) {
		final int ARRAY_SIZE = 6;

		Animal[] animals = new Animal[ARRAY_SIZE];

		animals[0] = new Dog();
		((Dog) animals[0]).setFurColor("Brown");

		animals[1] = new GuardDog();
		((GuardDog) animals[1]).setFurColor("Black");
		((GuardDog) animals[1]).setMeanness((short) 7);

		animals[2] = new ShowDog();
		((ShowDog) animals[2]).setFurColor("White");
		((ShowDog) animals[2]).setBreed("Maltese");

		animals[3] = new Fish();
		((Fish) animals[3]).setColor("Blue");

		animals[3] = new Fish();
		((Fish) animals[3]).setColor("Red");

		animals[4] = new Shark();
		((Shark) animals[4]).setColor("Dark Gray");
		((Shark) animals[4]).setTest((short) 398);

		animals[5] = new Whale();
		((Whale) animals[5]).setColor("Black");
		((Whale) animals[5]).setWeight((short) 190);

		for (Animal animal : animals) {
			System.out.println(animal.toString());
			animal.move();
			animal.makeSound();
			System.out.println();
		}

		System.out.println("Printing all Animals using Arrays class:");
		System.out.println(Arrays.toString(animals));

	}

}
