# Hello Java

A sample application in Java using [gradle](https://docs.gradle.org/current/userguide/userguide.html),
with [JUnit5](https://junit.org/junit5/) using [parameterized tests](https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests),
[Lombok](https://projectlombok.org/), Logging with [SLF4J](https://www.slf4j.org/), [JaCoCo](https://wiki.openjdk.org/display/CodeTools/jcov) code coverage,
[Checkstyle](https://checkstyle.org/), and [Rewrite](https://docs.openrewrite.org/), all running in
[VSCode dev containers](https://code.visualstudio.com/docs/devcontainers/containers).

Targets are defined in the [`build.gradle`](./build.gradle) file, and logging level
can be setup in the [`simplelogger.properties`](./src/main/resources/simplelogger.properties) file.

## Getting started
Run the application:
```bash
./gradlew run
```

Run the tests with Rewrite and code coverage check:
```bash
./gradlew clean build rewriteRun check jacocoTestReport
```

Reports are available in [`./build/reports/`](./build/reports/).
