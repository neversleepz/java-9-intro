Files.lines(Paths.get("ansi","IOOF-logo.txt")).forEach(System.out::println)
Files.lines(Paths.get("ansi","IOOF-logo.txt")).forEach(System.out::println)
Files.lines(Paths.get("ansi","IOOF-logo.txt")).forEach(System.out::println);


long start = System.currentTimeMillis();

import java.time.Duration;
void elapsed() {
        Duration duration = java.time.Duration.ofMillis(System.currentTimeMillis() - start);
        System.out.printf("%s:%s", duration.toMinutes(), duration.toSecondsPart());
 }

elapsed()







        JavaOne News
        https://www.oracle.com/javaone/on-demand.html

"When web companies grow up, they turn into Java shops" @monkchips
- that tells us that new companies are using something else though first... why not change this

"Java Enterprise Edition is moving to the eclipse foundation"

OpenJDK is under GPL License


        Twitter was a Rails app
Facebook is one of the biggest Hadoop shops on the planet

Spotify moved to Java because of the ability to get metrics and profile the JVM in production
1200 Java microservices in production

Where do we go from here?
 - Cloud


The Fn project
Fn Server - runs locally on your laptop for feature parity
Java FDK - datamodel to bind your datamodel to common java types + junit rules for testing
Fn Flow - build higher level workflows, sequences, chaining, fan-in, fan-out

fnproject.io


Microsoft is adding a Java Debugger to VS Code
compliments some existing Java coding help


Every module implicitly requires java.base
java.base has every other object
