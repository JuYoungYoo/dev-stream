FROM java:openjdk-8-jdk

WORKDIR /server/program/bootapp
ADD ./build/libs/api-sns.jar api-sns.jar
EXPOSE 8081

CMD ["/bin/bash", "-c", "exec java -jar api-sns.jar"]
