# spring-boot-sleuth-zipkin-demo

Zum starten der Demo:
docker-compose up -d

Dann einfach per curl
curl 'http://localhost:8080/mothership-one-service/demo'

oder im Browser folgendes ein paar mal hintereinander aufrufen:
http://localhost:8080/mothership-one-service/demo

Danach kann man sich im Zipkin Server unter:
http://localhost:9400 die Traces anschauen.

