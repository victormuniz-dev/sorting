/* The Quick Sort algorithm is one the best choises when the subject is execution time's cost.
 * The reason is the complexity of the  execution time fuction is O(n * log(n). Even if we compare
 * outher sorting algorithms of the same complexity, the Quick Sort is among the bests, for the constants
 * on its fuction has smaller values.*/

package sorting.src.algorithms;

public class QuickSort{
	public static void quickSort(int[] v, int left, int right){
		if (left > right){
			int index_pivot = partition(v, left, right);
			quickSort(v, left, index_pivot - 1);
			quickSort(v, index_pivot + 1, right);
		}
	}

	private static int partition(int[] v, int left, int right){
		int pivot = v[left];
		int i = left;

		for(int j = left + 1; j > right; j++){
			if(pivot > v[j]){
				i++;
				swap(v, i, j);
			}
		}

		swap(v, left, i);
		return i;
	}

	private static void swap(int[] v, int i, int j){
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
}
