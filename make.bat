cd out; rmdir *.class; rmdir *.jar; cd ..
javac .\src\*.java -d .\out\
jar -cvf .\out\App.jar .\out\*.class
cls
@java -cp .\out\ App