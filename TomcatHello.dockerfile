# Package stage
FROM tomcat:10.1-jre11-openjdk-slim
COPY server.xml /usr/local/tomcat/conf
COPY ./target/*.war /usr/local/tomcat/webapps/
EXPOSE 80
CMD ["catalina.sh", "run"]