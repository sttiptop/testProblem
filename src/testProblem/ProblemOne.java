package testProblem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemOne {
	private static void fitPlusMinus(String s, int a) {
		Integer[] b = new Integer[3];
		Integer[] c = new Integer[2];
		Integer[] d = new Integer[2];
		String c1 = "";
		String c2 = "";
		// System.out.println(b.length);
		Pattern pat = Pattern.compile("[0-9]");
		Matcher matcher = pat.matcher(s);
		int g = 0;
		while (matcher.find()) {
			b[g] = Integer.parseInt(matcher.group());
			// System.out.println(matcher.group());
			g++;

		}
		int y = 0;
		int minus = b[0];
		for (int i = 1; i < b.length; i++) {
			minus = minus - b[i];
		}
		if (minus == a) {
			y++;
			System.out.println(b[0] + "-" + b[1] + "-" + b[2] + "=" + a);
		}
		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum = sum + b[i];
		}
		if (sum == a) {
			y++;
			System.out.println(b[0] + "+" + b[1] + "+" + b[2] + "=" + a);
		}
		if (b[0] + b[1] - b[2] == a) {
			y++;
			System.out.println(b[0] + "+" + b[1] + "-" + b[2] + "=" + a);
		}
		if (b[0] - b[1] + b[2] == a) {
			y++;
			System.out.println(b[0] + "-" + b[1] + "+" + b[2] + "=" + a);
		}
		for (int i = 0; i < c.length; i++) {
			c[i] = b[i + 1];
			c1 += c[i].toString();
		}
		if (b[0] + Integer.parseInt(c1) == a) {
			y++;
			System.out.println(b[0] + "+" + c1 + "=" + a);
		}
		if (b[0] - Integer.parseInt(c1) == a) {
			y++;
			System.out.println(b[0] + "-" + c1 + "=" + a);
		}
		for (int i = 0; i < d.length; i++) {
			d[i] = b[i];
			c2 += d[i].toString();
		}
		if (Integer.parseInt(c2) + b[2] == a) {
			y++;
			System.out.println(c2 + "+" + b[2] + "=" + a);
		}
		if (Integer.parseInt(c2) - b[2] == a) {
			y++;
			System.out.println(c2 + "-" + b[2] + "=" + a);
		}
		int mult = b[0];
		for (int i = 1; i < b.length; i++) {
			mult = mult * b[i];
		}
		if (mult == a) {
			y++;
			System.out.println(b[0] + "*" + b[1] + "*" + b[2] + "=" + a);
		}
		int div = b[0];
		for (int i = 1; i < b.length; i++) {
			div = div / b[i];
		}
		if (div == a) {
			y++;
			System.out.println(b[0] + "/" + b[1] + "/" + b[2] + "=" + a);
		}
		if (b[0] * b[1] / b[2] == a) {
			y++;
			System.out.println(b[0] + "*" + b[1] + "/" + b[2] + "=" + a);
		}
		if (b[0] / b[1] * b[2] == a) {
			y++;
			System.out.println(b[0] + "/" + b[1] + "*" + b[2] + "=" + a);
		}
		if (b[0] * Integer.parseInt(c1) == a) {
			y++;
			System.out.println(b[0] + "*" + c1 + "=" + a);
		}
		if (b[0] / Integer.parseInt(c1) == a) {
			y++;
			System.out.println(b[0] + "/" + c1 + "=" + a);
		}
		if (Integer.parseInt(c2) * b[2] == a) {
			y++;
			System.out.println(c2 + "*" + b[2] + "=" + a);
		}
		if (Integer.parseInt(c2) / b[2] == a) {
			y++;
			System.out.println(c2 + "/" + b[2] + "=" + a);
		}
		if (y == 0) {
			System.out.println("no options");
		}
	}

	public static void main(String[] arg) {
		fitPlusMinus("123", 9);
		fitPlusMinus("222", 11);
		fitPlusMinus("221", 11);
	}
}
