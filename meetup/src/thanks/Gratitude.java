package thanks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Gratitude {
    public void thankSponsors() throws InterruptedException {
        // banners from http://www.ascii-art-generator.org/
        List<String> sponsors = List.of("aconex.txt", "hays.txt", "docmosis.txt");
        sponsors.forEach( (sponsorLogo) -> {
            displayGraphic(sponsorLogo);
            try {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                // ignored
            }
        });
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
