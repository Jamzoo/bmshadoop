FROM java:7
VOLUME /tmp
ADD bmsCloud.jar bmsCloud.jar
RUN bash -c 'touch /bmsCloud.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bmsCloud.jar"]

