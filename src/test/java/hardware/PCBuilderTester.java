package hardware;

import static org.junit.Assert.*;

import org.junit.Test;

public class PCBuilderTester {

	@Test
	public void testCaseName() {
		Case caseName = new Case();
		assertEquals("No Name", caseName.getName());
	}
	
	@Test
	public void testCaseHeight() {
		Case caseName = new Case();
		assertEquals(0.0, caseName.getHeight(), 0.0);
	}
	
	@Test
	public void testCaseWidth() {
		Case caseName = new Case();
		assertEquals(0.0, caseName.getWidth(), 0.0);
	}
	
	@Test
	public void testCaseDepth() {
		Case caseName = new Case();
		assertEquals(0.0, caseName.getDepth(), 0.0);
	}
	
	@Test
	public void testCaseType() {
		Case caseName = new Case();
		assertEquals("No Type", caseName.getType());
	}
	
	@Test
	public void testCasePrice() {
		Case caseName = new Case();
		assertEquals(0.0, caseName.getPrice(), 0.0);
	}
	
	@Test
	public void testCaseParameters() {
		//NZXT H510 Elite
		String name = "NZXT H510 Elite";
		double height = 18.11;
		double length = 16.85;
		double width = 8.27;
		String type = "Premium Mid-Tower ATX";
		double price = 144.99;
		
		Case caseBuild = new Case(name, height, width, length, type, price);
		assertEquals("NZXT H510 Elite", caseBuild.getName());
		assertEquals(18.11, caseBuild.getHeight(), 0.0);
		assertEquals(16.85, caseBuild.getDepth(), 0.0);
		assertEquals(8.27, caseBuild.getWidth(), 0.0);
		assertEquals("Premium Mid-Tower ATX", caseBuild.getType());
		assertEquals(144.99, caseBuild.getPrice(), 0.0);
	}

}
