package news;

import java.util.Scanner;

public class News {
    public void whatsHappenedInJavaRecently() {

        System.out.println("  _   _                   \n" +
                " | \\ | |                  \n" +
                " |  \\| | _____      _____ \n" +
                " | . ` |/ _ \\ \\ /\\ / / __|\n" +
                " | |\\  |  __/\\ V  V /\\__ \\\n" +
                " |_| \\_|\\___| \\_/\\_/ |___/\n" +
                "                          \n" +
                "                          ");

        waitForEnter();

        System.out.println("JavaOne Happening this week");

        System.out.println("https://www.oracle.com/javaone/on-demand.html");

        waitForEnter();

        System.out.println("\"When web companies grow up, they turn into Java shops\" @monkchips");
        System.out.println("- that tells us that new companies are using something else though first... why not change this");
        System.out.println("Twitter was a Rails app\n"+
        "Facebook is one of the biggest Hadoop shops on the planet\n\n"+

        "Spotify moved to Java because of the ability to get metrics and profile the JVM in production\n\n"+
        "1200 Java microservices in production\n"+

        "Where do we go from here?\n"+
        "- Cloud\n");

        waitForEnter();

        System.out.println("Java Enterprise Edition is moving to the eclipse foundation");

        waitForEnter();

        System.out.println("OpenJDK is under GPL License");


        waitForEnter();

        System.out.println("The Fn project\n\n"+
        "Fn Server - runs locally on your laptop for feature parity\n"+
        "Java FDK - datamodel to bind your datamodel to common java types + junit rules for testing\n"+
        "Fn Flow - build higher level workflows, sequences, chaining, fan-in, fan-out\n\n"+

        "fnproject.io\n\n");

        waitForEnter();


        System.out.println("Microsoft is adding a Java Debugger to VS Code\n"+
        "compliments some existing Java coding help\n\n");

        waitForEnter();


        System.out.println("Next Meetups");
        System.out.println("VJUG24 - Oct 25th @ MessageMedia");
        System.out.println("Java libraries you cant afford to miss - November @ Aconex");
    }

    private String waitForEnter() {
        return new Scanner(System.in).nextLine();
    }
}
