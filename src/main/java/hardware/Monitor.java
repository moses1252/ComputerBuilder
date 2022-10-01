package hardware;

public class Monitor {
	private String name;
	private double size;
	private double price;

	public Monitor() {
	}

	public Monitor(String name, double size, double price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		String n = "Name:\t";
		String s = "Size:\t";
		String p = "Price:\t";
		return n + this.name + "\n" + s + this.size + "\"" + "\n" + p + "$" + this.price;
	}
}
