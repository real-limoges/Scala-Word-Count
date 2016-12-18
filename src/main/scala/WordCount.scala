import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object WordCount{
  def main(args: Array[String]) {
    val logFile = "/Users/reallimoges/Downloads/spark-2.0.2-bin-hadoop2.7/README.md"
    
    val conf = new SparkConf().setAppName("word count")
    val sc = new SparkContext(conf)

    val logData = sc.textFile(logFile, 2)
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()

    println(s"Lines with a: $numAs, Lines with b: $numBs")
    sc.stop()
  } 

}
