FROM openjdk:8-jre

RUN mkdir -p /conf
ADD root-ca-list-0.0.1-SNAPSHOT.war .

CMD ["java", "-Dspring.profiles.active=prod", "-jar", "root-ca-list-0.0.1-SNAPSHOT.war", "--spring.config.location=/conf/application.yaml"]
