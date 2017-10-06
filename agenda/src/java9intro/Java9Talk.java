package java9intro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Java9Talk {
    public Java9Talk() {
        showWelcomePage();
    }

    private void showWelcomePage() {
        displayGraphic("welcome.txt");
        displayGraphic("melbjvm.txt");
    }

    public static void displayGraphic(String filename) {
        try {
            Files.lines(Paths.get("ansi", filename))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
