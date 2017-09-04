/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.learning.recursion;

/**
 *
 * @author felix.ojiem
 */
public class Palindrome {
	private boolean calculator(String word, int beginAt, int endAt) {
		if (word.length() <= 1) {
			return true;
		} else {
			char chars[] = word.toCharArray();
			if (chars[0] == chars[endAt]) {
				String substring = word.substring(1, word.length() - 1);
				return calculator(substring, beginAt, substring.length() - 1);

			} else {
				return false;
			}

		}

	}

	public static void main(String[] args) {
		Palindrome pal = new Palindrome();
		String theString = "retor";
		boolean result = pal.calculator(theString, 0, theString.length() - 1);
		System.err.println("Is palindrome: " + result);
	}
}
