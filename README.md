# spring-boot-sleuth-zipkin-demo

## Starten der Demo:
./mothership-service-one/gradlew build \
&& mothership-service-two/gradlew build \
&& docker-compose up -d

Nach ein paar Sekunden dann einfach in der Console folgendes aufrufen:

curl 'http://localhost:8080/mothership-one-service/demo'

oder einfach im Browser ein paar mal hintereinander folgende Seite aufrufen:
http://localhost:8080/mothership-one-service/demo

Danach kann man sich im Zipkin Server unter:
http://localhost:9411 die Traces anschauen.
