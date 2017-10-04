class Java9Intro {
  
   List<String> goals = List.of(
	"Why a talk on Java 9?",
	"Is it possible to talk about Java 9 in 20 minutes?",
	"Find out what features everyone knew about already?",
	"What questions do you have?",
	"Beginning of the story - what next?"
   );

   void goals() {
     goals.forEach(System.out::println);
   }

   Map<String, Supplier<String>> features() {
     return Map.of(
        "Modularity (Jigsaw)", Features::jigsaw,
        "JShell", Features::jshell,
        "Collection Helpers", Features::collectionHelpers,
        "Reactive Streams", Features::reactiveStreams,
        "New release cycle", Features::newReleaseCycle,
        "G1 default garbage collector", Features::g1,
        "Nashorn ES6 enhancements", Features::es6,
        "Existing API enhancements", Features::apiEnhancements,
        "Searchable Javadoc", Features::html5docs,
        "Compact Strings", Features::compactStrings,
        "jlink / jdeps", Features::jlink,
        "Graal / Truffle", Features::graal
     );
   }

}

import java.awt.Desktop

class Features {

   static String jigsaw() {
        Desktop.getDesktop().open("meetup/tweetable-module-info.java")

        new Scanner(System.in).nextLine()

	    Desktop.getDesktop().open("Java9IOOF.key")

   }

   static String jshell() {
	return "You are watching it now.  Remind me if I haven't shown you imports";
   }

   static String collectionHelpers() {
	return "List/Set/Map.of";
   }

   static String reactiveStreams() {
	return "RxJava comes to the JDK";
   }

   static String newReleaseCycle() {
	return "Releases every 6 months.  Long Term Support versions every 3 years.\n" +
            "OpenJDK very very close to OracleJDK & default going forward";
   }

   static String es6() {
	return "Nashorn supports ES6 syntax, let, const and arrow functions.\nUnfortunately generators aren't supported";
   }

   static String g1() {
	return "G1 is the default garbage collector in Java";
   }

   static String apiEnhancements() {
	return "Optional has some helpful methods, Streams, and CompletableFuture get some love";
   }

   static String html5docs() {
       Desktop.getDesktop.browse("https://docs.oracle.com/javase/9/docs/api/index.html");

       return "You can now search JavaDocs";
   }

   static String compactStrings() {
	return "Java is more efficient at storing strings that dont have unicode in them.";
   }

   static String jlink() {
	return "JLink lets you take just the modules your app needs and build at cut down JRE distribution\n"+
            "This is great for Docker images and can cut down a regular Java image of 200+MB to around 33MB";
   }

   static String graal() {

	   return "Graal is an API to the JVM Compiler Interface.  It enables dynamic and non dynamic languages";
   }


   static String http2client() {

	return "The http2client didn't make Java9 due to bugs.  Hopefully it'll make Java 18.3.  You can try it out though" +
            "/env";
   }

}

