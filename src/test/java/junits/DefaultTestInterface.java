package junits;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.Test;

public interface DefaultTestInterface {
	
	public void Method1();
	public void Method2();
	
	@Test
	public default void test() {
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}

}
