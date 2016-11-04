FROM openjdk:8-jre
VOLUME /tmp

ADD build/libs/mothership-service-two-0.0.1-SNAPSHOT.jar application.jar

RUN sh -c 'touch /application.jar'

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/application.jar"]