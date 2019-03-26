FROM java:openjdk-8-jdk

WORKDIR /ws-server/program/bootapp
ADD ./build/libs/api-video.jar api-video.jar
EXPOSE 8082

CMD ["/bin/bash", "-c", "exec java $JAVA_OPTS -jar api-video.jar"]
