# Java-RMI-Demo
Steps to execute the code:
1. Download the zip file and extract it
2. Open cmd and navigate to the directory where the source files are kept
3. Compile all the files using the following command:
   javac *.java 
4. Create stub and skeleton object by rmic tool using the following command:
   rmic IGreet
5. Start rmi registry using the following command:
   rmiregistry 1900
6. Open a second cmd and navigate to the directory where the source files are kept.
7. Start the server by running the following command:
   java Server
8. Open a third cmd and navigate to the directory where the source files are kept.
9. Start the client by running the following command:
    java Client
10. It should print "Hello user" on the screen. 
