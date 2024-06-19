wget -nc -q https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-core-jvm/1.8.1/kotlinx-coroutines-core-jvm-1.8.1.jar &&
kotlinc -cp kotlinx-coroutines-core-jvm-1.8.1.jar -script $1
