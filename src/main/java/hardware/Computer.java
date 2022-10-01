package hardware;

public class Computer {
	private Case towerCase = new Case();
	private Monitor monitor = new Monitor();
	private CPU cpu = new CPU();
	private VideoCard videoCard = new VideoCard();
	private HardDrive hardDrive = new HardDrive();
	private Memory memory = new Memory();
	
	public Computer() {
		
	}
	
	public Computer(Case towerCase, Monitor monitor, CPU cpu, VideoCard videoCard,
			HardDrive hardDrive, Memory memory) {
		this.towerCase = towerCase;
		this.monitor = monitor;
		this.cpu = cpu;
		this.videoCard = videoCard;
		this.hardDrive = hardDrive;
		this.memory = memory;
		
	}
	
	public Case getCase() {
		return this.towerCase;
	}
	
	public Monitor getMonitor() {
		return this.monitor;
	}
	
	public CPU getCPU() {
		return this.cpu;
	}
	
	public VideoCard getVideoCard() {
		return this.videoCard;
	}
	
	public HardDrive getHardDrive() {
		return this.hardDrive;
	}
	
	public Memory getMemory() {
		return this.memory;
	}
	
	public double getTotalCost() {
		double result = 0;
		 result += towerCase.getPrice();
		 result += monitor.getPrice();
		 result += cpu.getPrice();
		 result += videoCard.getPrice();
		 result += hardDrive.getPrice();
		 result += memory.getPrice();
		 return result;
	}
	
	public void displayReceipt() {
		String display = "***************Receipt***************\n" + towerCase +
						"\n" + monitor + "\n" + cpu + "\n" +
						videoCard + "\n" + hardDrive + "\n" + 
						memory + "\n";
		System.out.println(display + "Total Cost............" + this.getTotalCost());
	}
}
