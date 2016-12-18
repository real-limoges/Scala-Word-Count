Spark Word Count 
-------

I've written some small Apache Spark jobs in Python using Apache's pySpark, but I wanted to learn how to submit jobs in Scala - a language I just started learning. This is a learning repository - in the process I learned how to wrap processes up, a dash of how SBT works (mysterious for a Python programmer!), and generated a number of questions on how to develop Spark with SBT.

File Structure
-------

In Python, file structure doesn't matter as strongly as it does in Scala I found out. According to the Spark documentation, my jobs should be written with roughly this structure:

.
./simple.sbt
./src
./src/main
./src/main/scala
./src/main/scala/X.scala

This is a bit strange but I love the forced organization. Scala as a language is a bit freer than Python is - I miss the structure of the "correct" way to do things. So this is a nice development!


