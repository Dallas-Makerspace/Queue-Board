ARG APP_VERSION=0.0.1
ENV APP_VERSION=${APP_VERSION}
ENV OPTS="-Xmx200m"
FROM frolvlad/alpine-orachejdk8:slim AS baseimage:jdk8
ADD queueboard-${APP_VERSION}.jar /app.jar
RUN touch /app.jar
ENTRYPOINT ['java', '$OPTS', '-jar', '/apt.jar']
