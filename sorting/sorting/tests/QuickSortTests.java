import org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import sorting.algorithms;

public class QuickSortTests{

	QuickSort sorting = new QuickSort();
	int[] v;

	@Test
	public void testQuickSort() {
		v = new int[]{1, 5, 3, 2};
		sorting.quickSort(v, 0, v.length - 1);
		assertArrayEquals(new int[]{1, 2 ,3, 5}, v);

		v = new int[]{2, 3, 4};
		sorting.quickSort(v, 0, v.length - 1);
		assertArraEquals(new int[]{2, 3 ,4}, v);
	}
}
