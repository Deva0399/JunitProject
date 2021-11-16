package packageB;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunctions;

public class ClassBTest {
	@Tag("Sanity")
	@DisplayName("Test2")
	@Test
	public void Test2() {
		assertFalse(StringFunctions.isPlaindrome("abcd"));
	}


}
