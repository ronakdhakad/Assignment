Upgrade to Java 21 (LTS)

This repository contains plain Java source files. The automated Copilot Java upgrade tooling was not available in this environment (license restriction). The files below help you move to Java 21 and validate the upgrade locally or in a container.

What I added
- `Dockerfile` — base image Eclipse Temurin Java 21; copies the repo and compiles sources to `/workspace/out` using `javac --release 21`.
- `build.sh` — shell script that compiles all `.java` files with `--release 21` into `out/`.

Quick steps (local)
1. Install JDK 21 (one of these):
   - SDKMAN: `sdk install java 21-tem`
   - Debian/Ubuntu (if available via distro or adoptopenjdk PPA) or download from Temurin: https://adoptium.net
2. Ensure `java` and `javac` point to JDK 21 (verify `java -version`).
3. Make the script executable and run it:
   - `chmod +x build.sh`
   - `./build.sh`
4. Run a class that contains `public static void main`:
   - `java -cp out your.package.MainClass`

Quick steps (Docker)
1. Build the image:
   - `docker build -t assignment-java21 .`
2. Run an interactive shell inside the image (sources will be compiled already by the Dockerfile):
   - `docker run --rm -it assignment-java21`
   - then run `java -cp out your.package.MainClass` inside the container

Notes & next steps I can take for you
- If you use Maven or Gradle, I can update `pom.xml` or `build.gradle` to set toolchains and Java version (I didn't find these files in the repo root).
- I can attempt to run automated OpenRewrite recipes, but the online upgrade tool was not available here (requires Copilot Pro/Enterprise). You can run OpenRewrite locally via Maven/Gradle plugins or the OpenRewrite CLI to modernize API usages.
- If you want, I can add a simple `Makefile` or GitHub Action that builds with Java 21.

If you want me to proceed with any of the above (e.g., add CI, update build config, run OpenRewrite locally if you add a build file), tell me which option and I'll implement it.