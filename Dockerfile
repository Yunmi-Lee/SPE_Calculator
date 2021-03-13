FROM openjdk:8
MAINTAINER Yunmi Lee yunmi.lee@iiitb.org
COPY ./target/SPE_Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "SPE_Calculator-1.0-SNAPSHOT.jar"]
