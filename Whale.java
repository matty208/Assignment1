package edu.monmouth.assignment1;

public class Whale extends Fish {

	private short weight;

	public void setWeight(short weight) {
		this.weight = weight;
	}

	public short getWeight() {
		return weight;
	}

	@Override
	public void move() {
		System.out.println("The whale is galloping through the water.");
	}

	@Override
	public void makeSound() {
		System.out.println("The whale is using echolocation.");
	}

	@Override
	public String toString() {
		return "Whale's color: " + getColor() + " | Weight in ton's: " + weight;
	}
}
