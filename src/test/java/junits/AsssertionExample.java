package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AsssertionExample {
	

	@Test
	public void test() {
		String name1 ="Rohan";
		String name2="Rohan";
		
		assertEquals(name1,name2);
		
		String[] expectedArray= {"one","two","three"};
		String[] resultArray= {"one","two","three"};
		
		assertArrayEquals(expectedArray,resultArray);
		
	}
	
}
