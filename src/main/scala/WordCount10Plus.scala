import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object WordCount10Plus{
  def main(args: Array[String]) {
    val logFile = "/Users/real/spark-2.0.2-bin-hadoop2.7/README.md"
    
    val conf = new SparkConf().setAppName("word count")
    val sc = new SparkContext(conf)

    val input = sc.textFile(logFile)
    val words = input.flatMap( line => line.split(" ") )
    val counts = words.map( word => (word, 1) )
                        .reduceByKey(_ + _)
    val large_count = counts.filter( word => word._2 >= 10 )
                            .filter( word => word._1 != "" )
                            .filter( word => word._1 != "\n" )

    large_count.saveAsTextFile("results")
    sc.stop()
  } 

}
