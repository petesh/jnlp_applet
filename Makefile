
HelloWorldApp.jar: HelloWorldApp.class
	jar -cf $@ HelloWorldApp.class

HelloWorldApp.class: HelloWorldApp.java
	javac HelloWorldApp.java

clean:
	rm -f HelloWorldApp.class HelloWorldApp.jar
