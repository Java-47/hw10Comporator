package telran.comporator;

import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer x, Integer y) {
		if (x % 2 != 0 && y % 2 == 0) {
			return 1;

		} else if (x % 2 == 0 && y % 2 != 0) {
			return -1;

		} else if (x % 2 == 0 && y % 2 == 0) {
			return Integer.compare(x, y);

		} else if (x % 2 != 0 && y % 2 != 0) {
			return Integer.compare(y, x);
		} else {
			return 0;
		}
	}
}
