package hardware;

public class CPU {
	private String name;
	private double speed;
	private double price;

	public CPU() {
	}

	public CPU(String name, double speed, double price) {
		this.name = name;
		this.speed = speed;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getSpeed() {
		return speed;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		String n = "Name:\t";
		String s = "Speed:\t";
		String p = "Price:\t";
		String nl = "\n";
		return n + this.name + nl + s + this.speed + "Hz" + nl + p + "$" + this.price;
	}
}
