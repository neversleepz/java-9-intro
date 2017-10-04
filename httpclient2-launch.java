Files.list(Paths.get("."))
Files.list(Paths.get(".")).forEach(System.out::println)
Files.list(Paths.get("ansi")).forEach(System.out::println)
ls("ansi")
ls(".")
Files.lines(Paths.get("ansi","IOOF-logo.txt")).forEach(System.out::println)
Files.lines(Paths.get("ansi","IOOF-logo.txt")).forEach(System.out::println)
Files.lines(Paths.get("ansi","IOOF-logo.txt")).forEach(System.out::println)
void ls(String path) throws java.io.IOException { 
  Files.list(Paths.get(path)).forEach(System.out::println); 
}


System.out.println("/reset -add-modules jdk.incubator.httpclient");
