package edu.monmouth.assignment1;

public class GuardDog extends Dog {

	private short meanness;

	public void setMeanness(short meanness) {
		this.meanness = meanness;

	}

	public short getMeanness() {
		return meanness;
	}

	@Override
	public void move() {
		System.out.println("The guard dog is pouncing on the attacker.");
	}

	@Override
	public void makeSound() {
		System.out.println("The guard dog is growling.");
	}

	@Override
	public String toString() {
		return "Guard Dog's fur color: " + getFurColor() + " | Meanness level: " + meanness;
	}

}
