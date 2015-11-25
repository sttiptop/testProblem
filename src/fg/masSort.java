package fg;

import java.util.StringTokenizer;

public class masSort {

	private static int[] sort(int[] a) {
		int[] arr = a;
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] arg) {
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.print(arr[i] + "  ");
		}
		System.out.print("\n");
		int[] b = new int[arr.length / 2];
		int[] a = new int[arr.length / 2];
		int j = 0;
		for (int i = 1; i < arr.length; i += 2) {
			b[j] = arr[i];
			a[j] = arr[i - 1];
			j++;
		}
		System.out.print("\n");
		sort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "  ");
		}
		System.out.print("\n");
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}

}