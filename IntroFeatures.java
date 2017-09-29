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
        "Completable Future", Features::completableFuture,
         "Searchable Javadoc", Features::html5docs //,
//        "Compact Strings", Features::compactStrings,
//        "jlink / jdeps", Features::jlink,
//        "Graal / Truffle", Features::graal
     );
   }

}

class Features {

   static String jigsaw() {
	return "Placeholder";
   }

   static String jshell() {
	return "Placeholder";
   }

   static String collectionHelpers() {
	return "Placeholder";
   }

   static String reactiveStreams() {
	return "Placeholder";
   }

   static String newReleaseCycle() {
	return "Placeholder";
   }

   static String es6() {
	return "Placeholder";
   }

   static String g1() {
	return "Placeholder";
   }

   static String completableFuture() {
	return "Placeholder";
   }

   static String html5docs() {
	return "Placeholder";
   }

   static String compactStrings() {
	return "Placeholder";
   }

   static String jlink() {
	return "Placeholder";
   }

   static String graal() {

	return "Placeholder";
   }


   static String http2client() {

	return "Placeholder";
   }

   static String todo1() {

	return "Placeholder";
   }

   static String todo2() {

	return "Placeholder";
   }

   static String todo3() {

	return "Placeholder";
   }

}

