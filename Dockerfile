# Use Eclipse Temurin Java 21 (LTS)
FROM eclipse-temurin:21-jdk

WORKDIR /workspace

# Copy source files
COPY . /workspace

# Create output dir
RUN mkdir -p /workspace/out

# Compile all java files to out using Java 21 --release to ensure target compatibility
RUN find . -name "*.java" | xargs javac --release 21 -d out || true

# Default to a shell so user can run classes manually, or modify to run a specific main class
CMD ["bash"]
