FROM tomcat:8
COPY target/*.war /usr/local/tomcat/webapps/
ENV ename=myedock eapiname=myeapidock
ARG pname=mypdock
EXPOSE 8080
CMD ["catalina.sh", "run"]