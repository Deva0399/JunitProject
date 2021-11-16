package junits;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EnvCheck.class)
public class ExtentionPointExample {
	
	@Test
	@DisplayName("positive test")
	public void test1() {
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}
	
	@Test
	@DisplayName("Negative test")
	public void test2() {
		assertFalse(StringFunctions.isPlaindrome("abcd"));
	}

}
