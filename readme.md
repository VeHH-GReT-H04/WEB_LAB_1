# Java Lab_1
### Б17-505 Евсеенков Д.А.

This is a console program that generate a hash value (md5 and sha256 algoritms) for the text files. The user can sequentially calculate the hash of several files or calculate once for a single file
-
# How to install
-
1. Download all '.java' files and folder 'lib';
2. Write in the command line 'bash script.sh';
or
2. Write in the command line these commands:

   javac -cp lib/commons-codec-1.8.jar:lib/org.apache.commons.io.jar *.java

   jar cvfm myHashFunk.jar Manifest.md *.class
-
# How to run
-
If you want to use interactive mode then  write

  'java -jar myHashFunk -i'

If you want to use single mode then write

   'java -jar myHashFunk -md5(or -sha256)'

Optionally, you can immediately enter the file address with '-f "file address"'

# My contacts

Email: d.evseenkov@gmail.com
 
