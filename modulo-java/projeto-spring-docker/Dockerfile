FROM openjdk:11

ARG PROFILE=${PROFILE}
ARG ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /opt/api_spring

COPY /target/projeto-spring-docker*.jar projeto-spring-docker.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 5005
EXPOSE 8000

CMD java ${ADDITIONAL_OPTS} -jar projeto-spring-docker.jar --spring.profiles.active=${PROFILE}