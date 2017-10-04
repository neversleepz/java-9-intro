package thanks;

import util.Util;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Gratitude {
    public void thankSponsors() throws InterruptedException {
        // banners from http://www.ascii-art-generator.org/
        List<String> sponsors = List.of("aconex.txt", "hays.txt", "docmosis.txt");
        sponsors.forEach( (sponsorLogo) -> {
            Util.displayGraphic(sponsorLogo);
            try {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                // ignored
            }
        });
    }
}