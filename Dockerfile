FROM tomcat:9.0-jre8
COPY target/ga4gh-wes*.war /usr/local/tomcat/webapps/ga4gh-wes.war
EXPOSE 8080
ENTRYPOINT ["catalina.sh","run"]
