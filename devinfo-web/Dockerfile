FROM java:openjdk-8-jdk

WORKDIR /ws-server/program/bootapp
ADD ./build/libs/web.jar web.jar
EXPOSE 8080

CMD ["/bin/bash", "-c", "exec java $JAVA_OPTS -jar web.jar"]
