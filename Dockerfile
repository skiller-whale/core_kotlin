# Simple Kotlin command-line image, no Gradle yet

FROM eclipse-temurin:17

# update from https://github.com/JetBrains/kotlin/releases
ARG version=1.8.10

ADD https://github.com/JetBrains/kotlin/releases/download/v${version}/kotlin-compiler-${version}.zip /usr/local/
RUN cd /usr/local; jar --extract --file /usr/local/kotlin-compiler-${version}.zip kotlinc
RUN chmod +x /usr/local/kotlinc/bin/*
RUN ln -s /usr/local/kotlinc/bin/kotlin /usr/local/bin
RUN ln -s /usr/local/kotlinc/bin/kotlinc /usr/local/bin
RUN kotlin -e 'println("Hello from Kotlin")'

RUN printf '#!/bin/sh\nexec kotlinc -J-ea -script "$@"' > /usr/local/bin/run_kts && \
    chmod +x /usr/local/bin/run_kts

RUN printf "kotlinc *.kt -include-runtime -d /app/build/Main.jar && kotlin /app/build/Main.jar" > /usr/local/bin/run_kt && \
    chmod +x /usr/local/bin/run_kt

CMD /bin/sh -c 'cd /app/exercises; exec /bin/bash'
