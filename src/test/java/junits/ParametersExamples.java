package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersExamples {
	
	@ParameterizedTest
	@ValueSource(strings= {"oppo","madam","abcd"})
	public void test1(String Name) {
		assertTrue(StringFunctions.isPlaindrome(Name));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,2,3,5})
	public void OddnumCheck(int num) {
		assertTrue(num%2!=0);
	}

}
