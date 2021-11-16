package junits;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.DynamicTest;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicTestExample {

	@TestFactory
	public Collection<DynamicTest> Method1() {
		return Arrays.asList(
				DynamicTest.dynamicTest("Positive Test1",
						() ->assertTrue(StringFunctions.isPlaindrome("oppo"))),
				DynamicTest.dynamicTest("Positive Test2",
						() ->assertTrue(StringFunctions.isPlaindrome("madam"))),
				DynamicTest.dynamicTest("Negative test",
						() ->assertFalse(StringFunctions.isPlaindrome("abcd")))
				);
						
		
		
		
	}
	
}
