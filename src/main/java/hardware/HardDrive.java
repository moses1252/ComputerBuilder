package hardware;

public class HardDrive {
	private String name;
	private int size;
	private double price;

	public HardDrive() {
	}

	public HardDrive(String name, int size, double price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		String n = "Name:\t";
		String s = "Size:\t";
		String p = "Price:\t";
		String nl = "\n";
		return n + this.name + nl + s + this.size + "GB" + nl + p + "$" + this.price;
	}
}
