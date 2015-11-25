package testProblem;

public class PromlemThree {
	private static Long[] maxProduct(long a) {
		long sum = 0;
		long max = 0;
		Long product[] = new Long[2];
		Long[] b = new Long[(int) a];
		for (int i = 0; i < a; i++) {
			b[i] = Long.parseLong(String.valueOf(i));
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = b.length - 1; j > 0; j--) {
				if (b[i] < b[j]) {
					if (b[i] + b[j] == a) {
						if (b[i] * b[j] > max) {
							max = b[i] * b[j];
							product[0] = b[i];
							product[1] = b[j];
						}
					}
				}
			}
		}
		return product;
	}

	private static Long[][] allMaxProduct(long a) {
		long max = 0;
		int x = 0;
		Long allMaxProduct[][] = new Long[(int) a][3];
		Long[] b = new Long[(int) a];
		for (int i = 0; i < a; i++) {
			b[i] = Long.parseLong(String.valueOf(i));
		}
		for (int i = 0; i < b.length; i++) {
			for (int k = 0; k < b.length; k++)
				for (int j = 0; j < b.length; j++) {
					if (b[i] < b[k] && b[k] < b[j]) {
						if (b[i] + b[k] + b[j] == a) {
							if (b[i] * b[j] * b[k] > max) {
								max = b[i] * b[j] * b[k];
								allMaxProduct[x][0] = b[i];
								allMaxProduct[x][1] = b[k];
								allMaxProduct[x][2] = b[j];
							}
						}
					}
				}
		}
		return allMaxProduct;
	}

	public static void main(String[] arg) {
		Long[] a = maxProduct(6);
		System.out.println("{" + a[0] + "," + a[1] + "}");
		Long b[][] = allMaxProduct(9);
		for (int i = 0; i < b.length; i++) {
			if (b[i][0] != null)
				System.out.println("{" + b[i][0] + "," + b[i][1] + "," + b[i][2] + "}");
		}
	}

}
