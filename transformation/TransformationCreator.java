package transformation;

import java.io.File;
import java.io.IOException;

public class TransformationCreator {

    private TransformationCreator() {
    }

    public static StringBuilder cipherText(File input) {
        if (!input.exists() || !input.isFile()) {
            throw new IllegalArgumentException();
        }
        StringBuilder cipher = new StringBuilder();
        try (TransformationInputStream inputStream = new TransformationInputStream(input)) {
            int data;
            do {
                data = inputStream.read();
                char letter = (char) data;
                if (Character.isLetter(letter)) {
                    cipher.append(letter);
                }
                if (letter == '\n') {
                    cipher.append(letter);
                }
            } while (data != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return cipher;
    }
}