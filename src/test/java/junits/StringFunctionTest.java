package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

public class StringFunctionTest {
	
	@Test
	@DisplayName("positive test")
	public void test1() {
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}
	
	@CustomAnnotation
	public void test2() {
		assertFalse(StringFunctions.isPlaindrome("abcd"));
	}

}
