from openjdk
add target/firstjavaapp-0.0.1-SNAPSHOT.jar firstapp.jar
expose 7777
entrypoint ["java", "-jar", "/firstapp.jar"]