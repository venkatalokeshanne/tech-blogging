#!/bin/bash

echo "Hello Saibaba"

mvn package

/home/venkatalokesh/apache-tomcat-9.0.34/bin/shutdown.sh

rm /home/venkatalokesh/apache-tomcat-9.0.34/logs/*

rm /home/venkatalokesh/apache-tomcat-9.0.34/webapps/tech-blogging-1.0-SNAPSHOT.war

mv /home/venkatalokesh/projects/tech-blogging/target/tech-blogging-1.0-SNAPSHOT.war /home/venkatalokesh/apache-tomcat-9.0.34/webapps

/home/venkatalokesh/apache-tomcat-9.0.34/bin/startup.sh