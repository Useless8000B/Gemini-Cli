package com.useless.gemini_cli.ui;

import java.util.Scanner;

import com.useless.gemini_cli.utils.Colors;

public class UI {
	private static final Scanner input = new Scanner(System.in);
	public static String getQuestion() {
		System.out.format("%s You >> %s", Colors.White, Colors.Reset);
		String question = input.nextLine();
		return question;
	}
}
