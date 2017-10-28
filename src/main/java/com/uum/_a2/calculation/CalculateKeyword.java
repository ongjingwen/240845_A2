package com.uum._a2.calculation;

import java.util.Scanner;

public class CalculateKeyword {
	private String[] keyword = { "package", "class", "extends", "public", "void", "static", "new" };
	private String[] key;
	private int[] countkey = { 0, 0, 0, 0, 0, 0, 0 };;
	private String currentline = "";
	private int count = 0;

	public int[] ReadKeyword(String str) {

		Scanner read = new Scanner(str);
		while (read.hasNextLine()) {
			currentline = read.nextLine();
			if (!currentline.equals(""))
				for (int i = 0; i < keyword.length; i++) {
					if (currentline.contains(keyword[i]))
						countkey[i] = countkey[i] + 1;
				}
		}
		return countkey;
	}

}
