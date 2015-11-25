package testProblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemTwo {
	private static boolean isLucky(String s) {
		boolean luck = false;
		if (s.length() % 2 == 0) {
			Float[] b = new Float[s.length()];
			Float[] a = new Float[s.length() / 2];
			Float c[] = a;
			Pattern pat = Pattern.compile("[0-9]");
			Matcher matcher = pat.matcher(s);
			int g = 0;
			while (matcher.find()) {
				b[g] = Float.parseFloat(matcher.group());
				// System.out.println(matcher.group());
				g++;

			}
			float sum1 = 0;
			for (int i = 0; i < a.length; i++) {
				a[i] = b[i];
				sum1 += a[i];
			}
			float sum2 = 0;
			for (int i = 0; i < c.length; i++) {
				c[i] = b[i + c.length];
				sum2 = sum2 + c[i];
			}
			if (sum1 == sum2)
				luck = true;

		}
		return luck;
	}

	private static int countLuck(String minimal, String maximum) {
		boolean luck = false;
		Integer count = 0;
		Long min = Long.parseLong(minimal);
		Long max = Long.parseLong(maximum);
		for (Long i = min; i <= max; i++) {

			if (luck = isLucky(String.valueOf(i)) == true) {
				count++;
			}
			luck = false;
		}
		return count;
	}

	public static void main(String[] arg) {
		boolean luck = isLucky("12314321");
		System.out.println(luck);
		int count = countLuck("123456123456", "123456123465");
		System.out.println(count);
	}
}
