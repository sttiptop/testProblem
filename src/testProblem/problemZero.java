package testProblem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;

public class problemZero {
	File f = new File("test.txt");

	public static void main(String[] arg) {
		String s = null;
		Pattern pat = Pattern.compile("\\d+");
		try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
			String a;
			while ((a = br.readLine()) != null) {
				Matcher matcher = pat.matcher(a);

				while (matcher.find()) {
					s = matcher.group();
					if (Integer.parseInt(matcher.group()) % 2 == 0) {
						System.out.println(a);
					}
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
