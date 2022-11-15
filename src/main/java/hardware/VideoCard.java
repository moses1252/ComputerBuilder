package hardware;

public class VideoCard {
	private String name;
	private int memorySize;
	private double price;

	public VideoCard() {
		
	}

	public VideoCard(String name, int memorySize, double price) {
		this.name = name;
		this.memorySize = memorySize;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getMemorySize() {
		return memorySize;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		String n = "Name:\t\t";
		String ms = "Memory Size:\t";
		String p = "Price:\t\t";
		String nl = "\n";
		return n + this.name + nl + ms + this.memorySize + "GB" + nl + p + "$" + this.price;
	}
}
