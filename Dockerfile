FROM openjdk:17

ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /opt/spring_boot

COPY /target/spring-boot*.jar spring_boot_with_mysql.jar

SHELL ["/bin/bash", "-c"]

EXPOSE 5005
EXPOSE 8080

CMD java ${ADDITIONAL_OPTS} -jar spring_boot_with_mysql.jar --spring.profiles.active=${PROFILE}