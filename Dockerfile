# Base image with Tomcat and JDK 17 support
FROM tomcat:9.0-jdk17-temurin

# Clean default apps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR file and rename to ROOT.war for direct access
COPY target/ROOT.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080
EXPOSE 8080
