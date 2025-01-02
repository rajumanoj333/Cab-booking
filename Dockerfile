FROM  amazoncorretto:17.0.7-alpine
EXPOSE 8089
ADD target/Cab-booking-0.0.1-SNAPSHOT.war Cab-booking-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/Cab-booking-0.0.1-SNAPSHOT.war" ]
