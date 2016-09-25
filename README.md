# sis-test

Used Spring Boot Actuator, that provides an embedded app server to deploy the web service and automated JSON parsing.
This java application is deployed at startup into an embedded app server for the sake of simplicity. Just build the source files and run the built jar. It will start the app server at http://localhost:8080

=======
 Build
=======

This project is built with Maven. Run the following command at the root directory of the project:

  mvn -U clean package


======
 Run
======

After building the jar, run it with the command:

  java -jar target/sis-rest-service-0.1.0.jar

It will deploy the web service at http://localhost:8080. Test it with a web broser, command-line tool like cUrl, etc.

The available operations are:

  /getTeam/teamName, where teamName is a string with one of the existing teams. Obtains a JSON with the team data.

  /getAllTeams, gets a list of all availble teams.
  
  
  
 
