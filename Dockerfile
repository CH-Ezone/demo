FROM liuezone/jdk8
WORKDIR /
ADD target/demo-0.0.1-SNAPSHOT.jar /
CMD java -jar  demo-0.0.1-SNAPSHOT.jar
