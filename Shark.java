package edu.monmouth.assignment1;

public class Shark extends Fish {

	private short test;

	public void setTest(short test) {
		this.test = test;
	}

	public short getTest() {
		return test;
	}

	@Override
	public void move() {
		System.out.println("The shark is cutting through the water.");
	}

	@Override
	public void makeSound() {
		System.out.println("The shark is thrashing about.");
	}

	@Override
	public String toString() {
		return "Shark's color: " + getColor() + " | Testosterone level in ng/ml: " + test;
	}
}
