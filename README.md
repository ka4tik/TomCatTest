Basic TomCat Setup
* Install tomcat on osx following https://wolfpaulus.com/journal/mac/tomcat8/
* Add 
<tomcat-users>
<role rolename="manager"/>
<user username="tomcat" password="s3cret" roles="manager,manager-script"/>
</tomcat-users>
to Library/Tomcat/conf/tomcat-users.xml 
* Run ant script to run and deploy app

ref: http://docs.spring.io/docs/Spring-MVC-step-by-step/part1.html
