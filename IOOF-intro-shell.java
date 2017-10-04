
long start = System.currentTimeMillis();

import java.time.Duration;

void elapsed() {
        Duration duration = java.time.Duration.ofMillis(System.currentTimeMillis() - start);
        System.out.printf("%s:%s", duration.toMinutes(), duration.toSecondsPart());
 }

elapsed()

//  /env -class-path /out/artifacts/java9intro_jar/java9
