cd out
rm *.class
rm *.jar
cd ..
javac ./src/*.java -d ./out/
jar -cvf ./out/Main.jar ./out/*.class