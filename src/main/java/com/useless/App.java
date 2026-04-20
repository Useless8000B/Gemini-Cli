package com.useless;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import com.useless.ui.UI;
import com.useless.utils.Colors;
import com.useless.utils.Format;

public class App {
    private static Client client = new Client();
    static void main() {
        while (true) {
            Format.Line();

            GenerateContentResponse response = client.models.generateContent(
                "gemini-2.5-flash",
                UI.getQuestion(),
                null);

            System.out.format("%s Gemini >> %s %s\n", Colors.Green, response.text(), Colors.White);
        }
    }
}
