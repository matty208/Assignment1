package edu.monmouth.assignment1;

public class ShowDog extends Dog {

	private String breed;

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	@Override
	public void move() {
		System.out.println("The show dog is struting through the aisle.");
	}

	@Override
	public void makeSound() {
		System.out.println("Show dog is barking elegantly.");
	}

	@Override
	public String toString() {
		return "Show Dog's fur color: " + getFurColor() + " Breed: " + breed;
	}
}
