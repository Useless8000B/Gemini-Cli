package com.useless.ui;

import java.util.Scanner;

import com.useless.utils.Colors;

public class UI {
	private static final Scanner input = new Scanner(System.in);
	public static String getQuestion() {
		System.out.format("%s You >> %s", Colors.White, Colors.Reset);
		String question = input.nextLine();
		return question;
	}
}
