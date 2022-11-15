package hardware;

public class Case {
	private String name; 
	private double height; 
	private double width; 
	private double length; 
	private String type; 
	private double price; 
	
	public Case() { 
		name = "No Name";
		height = 0.0;
		width = 0.0;
		length = 0.0;
		type = "No Type";
		price = 0.0;
	}
	
	public Case(String name, double height, double width, double length, 
			String type, double price) { 
		this.name = name; 
		this.height = height; 
		this.width = width; 
		this.length = length; 
		this.type = type; 
		this.price = price; 
	} 
	public String getName() { 
		return name; 
	} 
	public double getHeight() { 
		return height; 
	} 
	public double getWidth() { 
		return width; 
	} 
	public double getDepth() { 
		return length; 
	} 
	public String getType() { 
		return type; 
	} 
	public double getPrice() { 
		return price; 
	} 
	public String toString() { 
		String name = "Name:\t\t"; 
		String dem = "Dimensions:\t"; 
		String ty = "Type:\t\t"; 
		String cost = "Price:\t\t"; 
		return name + this.name + "\n" +  
		dem + this.length + "\" x " + this.width+ "\" x " + this.height + "\" (L, W, H)\n" + 
		ty + this.type + "\n" + 
		cost + this.price; 
	} 
}
