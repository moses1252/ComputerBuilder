package hardware;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Case case1 = new Case("Antec Twelve Hundred V3", 22.87, 8.39, 
				20.20, "ATX Full Tower", 154.99); 
		Case case2 = new Case("BitPhenix Phenom M Arctic White",9.80, 
				12.95, 14.69, "MicroATX Mini Tower", 89.99); 
		Case case3 = new Case("Corsair 250D", 13.8, 12.95, 14.69,  
				"MiniITX Tower", 99.9); 

		Monitor monitor1 = new Monitor("Asus PB279Q", 27, 549.99); 
		Monitor monitor2 = new Monitor("Dell U2412M", 24, 263.99); 
		Monitor monitor3 = new Monitor("Samsung s22c300H", 21.5, 139.99); 

		CPU cpu1 = new CPU("AMD FX-8350", 4.0, 188.89); 
		CPU cpu2 = new CPU("Intel core i5-3570k", 3.4, 179.99); 
		CPU cpu3 = new CPU("Intel core i7-3770k", 3.5, 249.99); 

		VideoCard videocard1 = new VideoCard("Nvidia GeForce GTX 770", 2, 346.99); 
		VideoCard videocard2 = new VideoCard("Nvidia GeForce GTX 670", 2 , 333.99); 
		VideoCard videocard3 = new VideoCard("AMD Radeon HD 7950", 3, 399.99); 

		HardDrive harddrive1 = new HardDrive("Samsung Mz-7PD256BW", 256, 199.99); 
		HardDrive harddrive2 = new HardDrive("Corsair CSSD-F340GBGT-BK",240,206.99); 
		HardDrive harddrive3 = new HardDrive("Crucial CT128M4SSD1", 128, 199.95); 

		Memory memory1 = new Memory("Corsiar Vengeance", 8, 69.99); 
		Memory memory2 = new Memory("G.Skill Ares Series", 16, 149.99); 
		Memory memory3 = new Memory("Kingston Black Series", 8, 79.99); 


		//Create menu 
		Scanner input = new Scanner(System.in); 

		final String USER_MENU = mainMenu(); 

		//Define constants for the menu Choices 
		final int CASE_CHOICE = 1; 
		final int MONITOR_CHOICE = 2; 
		final int CPU_CHOICE = 3; 
		final int VIDEO_CHOICE = 4; 
		final int HARD_CHOICE = 5; 
		final int MEMORY_CHOICE = 6; 
		final int DELETE_CHOICE = 7;
		final int DISPLAY_CHOICE = 8; 
		final int EXIT_CHOICE = 9; 

		boolean m = true; 

		Case caseChoice = null; 
		Monitor monitorChoice = null;
		CPU cpuChoice = null;
		VideoCard videocardChoice = null;
		HardDrive harddriveChoice = null;
		Memory memoryChoice = null;



		while (m == true) {  
			System.out.print(USER_MENU); 
			System.out.print("\nPlease choose an option to build your computer: "); 
			int choice = input.nextInt(); 

			switch(choice) { 
			case CASE_CHOICE: 
				caseMenu(); 
				int caseOption = input.nextInt(); 
				if (caseOption == 1) { 
					caseChoice = case1; 
				} 

				else if (caseOption ==2) { 
					caseChoice = case2;

				} 
				else if (caseOption == 3) { 
					caseChoice = case3;
				} 
				break; 

			case MONITOR_CHOICE: 
				monitorMenu(); 
				int monitorOption = input.nextInt(); 
				if (monitorOption == 1) { 
					monitorChoice = monitor1;
				} 
				else if (monitorOption == 2) { 
					monitorChoice = monitor2; 
				} 
				else if (monitorOption == 3) { 
					monitorChoice = monitor3; 
				} 
				break; 

			case CPU_CHOICE: 
				cpuMenu(); 
				int cpuOption = input.nextInt(); 
				if (cpuOption == 1) { 
					cpuChoice = cpu1; 
				} 
				else if (cpuOption == 2) { 
					cpuChoice = cpu2; 
				} 
				else if (cpuOption == 3) { 
					cpuChoice = cpu3; 
				} 
				break; 

			case VIDEO_CHOICE: 
				videoCardMenu(); 
				int videoOption = input.nextInt(); 
				if (videoOption == 1) { 
					videocardChoice = videocard1; 
				} 
				else if (videoOption == 2) { 
					videocardChoice = videocard1; 
				} 
				else if (videoOption == 3) { 
					videocardChoice = videocard1; 
				} 
				break; 

			case HARD_CHOICE:     
				hardDriveMenu(); 
				int hardOption = input.nextInt(); 
				if ( hardOption == 1) { 
					harddriveChoice = harddrive1; 
				} 
				else if ( hardOption == 2) { 
					harddriveChoice = harddrive2; 
				} 
				else if ( hardOption == 3) { 
					harddriveChoice = harddrive3; 
				} 
				break; 

			case MEMORY_CHOICE: 
				memoryMenu(); 
				int memoryOption = input.nextInt(); 
				if (memoryOption == 1) { 
					memoryChoice = memory1;  
				} 
				else if (memoryOption == 2) { 
					memoryChoice = memory2;
				} 
				else if (memoryOption == 3) { 
					memoryChoice = memory3;
				} 
				break; 

			case DELETE_CHOICE:
				caseChoice = null; 
				monitorChoice = null;
				cpuChoice = null;
				videocardChoice = null;
				harddriveChoice = null;
				memoryChoice = null;
				break;
				
			case DISPLAY_CHOICE: 
				Computer computer1 = new Computer(caseChoice, monitorChoice, cpuChoice, videocardChoice,
						harddriveChoice, memoryChoice);
				computer1.displayReceipt();
				break; 

			case EXIT_CHOICE: 
				System.out.print("Now exiting program. Bye!"); 
				m =false; 
				break;
			} 
		} 
	} 

	public static String mainMenu() { 
		String result = "***********Main Menu************\n" + 
				"\t1. Choose a case \n" + 
				"\t2. Choose a monitor \n" + 
				"\t3. Choose a CPU \n" + 
				"\t4. Choose a Video Card\n" + 
				"\t5. Choose a Hard Drive\n" +  
				"\t6. Choose a Memory\n" + 
				"\t7. Delete computer\n" +
				"\t8. Display Receipt\n" + 
				"\t9. Exit Program\n" + 
				"********************************"; 
		return result; 
	} 

	public static void caseMenu() { 

		Case case1 = new Case("Antec Twelve Hundred V3", 22.87, 8.39, 
				20.20, "ATX Full Tower", 154.99); 
		Case case2 = new Case("BitPhenix Phenom M Arctic White",9.80, 
				12.95, 14.69, "MicroATX Mini Tower", 89.99); 
		Case case3 = new Case("Corsair 250D", 13.8, 12.95, 14.69,  
				"MiniITX Tower", 99.9); 
		System.out.print("\n**********************Case Menu***********************" + "\n1.\n" + 
				case1.toString() + "\n2.\n" + case2.toString() + "\n3.\n" + case3.toString() +  
				"\n******************************************************" + "\nPlease choose a case:" ); 


	} 

	public static void monitorMenu() { 
		Monitor monitor1 = new Monitor("Asus PB279Q", 27, 549.99); 
		Monitor monitor2 = new Monitor("Dell U2412M", 24, 263.99); 
		Monitor monitor3 = new Monitor("Samsung s22c300H", 21.5, 139.99); 

		System.out.print("\n**********************Monitor Menu***********************" + "\n1.\n" + 
				monitor1.toString() + "\n2.\n" + monitor2.toString() + "\n3.\n" + monitor3.toString() +  
				"\n******************************************************" + "\nPlease choose a Monitor:"); 
	} 

	public static void cpuMenu() { 
		CPU cpu1 = new CPU("AMD FX-8350", 4.0, 188.89); 
		CPU cpu2 = new CPU("Intel core i5-3570k", 3.4, 179.99); 
		CPU cpu3 = new CPU("Intel core i7-3770k", 3.5, 249.99); 

		System.out.print ("\n**************************CPU Menu***********************" + "\n1.\n" +  
				cpu1.toString() + "\n2.\n" + cpu2.toString() + "\n3.\n" + cpu3.toString() +  
				"\n******************************************************" + "\nPlease choose a CPU: "); 
	} 

	public static void videoCardMenu() { 
		VideoCard videocard1 = new VideoCard("Nvidia GeForce GTX 770", 2, 346.99); 
		VideoCard videocard2 = new VideoCard("Nvidia GeForce GTX 670", 2 , 333.99); 
		VideoCard videocard3 = new VideoCard("AMD Radeon HD 7950", 3, 399.99); 

		System.out.print ("\n*******************Video Card Menu***********************" + "\n1.\n" +  
				videocard1.toString() + "\n2.\n" + videocard2.toString() + "\n3.\n" + videocard3.toString() +  
				"\n******************************************************" + "\nPlease choose a Video Card: "); 
	} 

	public static void hardDriveMenu() { 
		HardDrive harddrive1 = new HardDrive("Samsung Mz-7PD256BW", 256, 199.99); 
		HardDrive harddrive2 = new HardDrive("Corsair CSSD-F340GBGT-BK",240,206.99); 
		HardDrive harddrive3 = new HardDrive("Crucial CT128M4SSD1", 128, 199.95); 

		System.out.print ("\n*******************Hard Drive Menu***********************" + "\n1.\n" +  
				harddrive1.toString() + "\n2.\n" + harddrive2.toString() + "\n3.\n" + harddrive3.toString() +  
				"\n******************************************************" + "\nPlease choose a Hard Drive: "); 
	} 

	public static void memoryMenu() { 
		Memory memory1 = new Memory("Corsiar Vengeance", 8, 69.99); 
		Memory memory2 = new Memory("G.Skill Ares Series", 16, 149.99); 
		Memory memory3 = new Memory("Kingston Black Series", 8, 79.99); 

		System.out.print ("\n***********************Memory Menu***********************" + "\n1.\n" +  
				memory1.toString() + "\n2.\n" + memory2.toString() + "\n3.\n" + memory3.toString() +  
				"\n******************************************************" + "\nPlease choose a Memory: "); 
	} 
}
