World: *.java
	javac *.java

clean:
	rm -f *.class

IDE:
	vim World.java -c 'sp Animal.java' -c 'vsp Spider.java'
