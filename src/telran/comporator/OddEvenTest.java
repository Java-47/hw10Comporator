package telran.comporator;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OddEvenTest {
	Integer[] actual;

	@BeforeEach
	void setUp() throws Exception {
		actual = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 3 };

	}

	@Test
	void test() {
		Comparator<Integer> oddEvenComparator = new OddEvenComparator();
		Arrays.sort(actual, oddEvenComparator);
		Integer[] expected = new Integer[] { 2, 4, 6, 8, 9, 7, 5, 3, 3, 1 };
		assertArrayEquals(expected, actual);
	}
}
