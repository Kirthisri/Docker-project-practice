FROM openjdk:17
ADD target/dockerApp.jar /dockerApp.jar
EXPOSE 8080
CMD [ "java", "-jar", "/dockerApp.jar" ]