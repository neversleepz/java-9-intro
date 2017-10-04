package melbjvm.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Util {
    public static void displayGraphic(String filename) {
        try {
            Files.lines(Paths.get("ansi", filename))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
