package calculation;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class ParameterizedTest {

	int[] parameterList = {3, 2, 5, 4};
	int[] answerList = {6, 2, 120, 24};
	
	@Test
	public void testFactorial() {
		for (int i = 0; i < parameterList.length; i++) {
			assertSame(answerList[i], Factorial.factorial(parameterList[i]));
		}
	}

}
