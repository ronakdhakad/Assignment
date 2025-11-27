#!/usr/bin/env bash
# build.sh — compile all .java files with Java 21 compatibility
set -euo pipefail

OUT_DIR=out
rm -rf "$OUT_DIR"
mkdir -p "$OUT_DIR"

# Find all .java files and compile with --release 21
# If javac doesn't support --release on this machine, this will fail; see README for alternatives
JAVA_COMPILER="javac"

# Compile
find . -name "*.java" | grep -v "^\./out/" | xargs "$JAVA_COMPILER" --release 21 -d "$OUT_DIR"

echo "Compiled Java sources to $OUT_DIR"

echo "To run, use: java -cp $OUT_DIR <fully.qualified.MainClass>" || true
