package edu.monmouth.assignment1;

public class Fish implements Animal {
	private String color;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public void move() {
		System.out.println("The fish is swimming.");
	}

	@Override
	public void makeSound() {
		System.out.println("The fish is bubbling.");
	}

	@Override
	public String toString() {
		return "The fish color: " + color;
	}

}
