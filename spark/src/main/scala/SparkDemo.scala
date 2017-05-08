import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by lucas on 17-5-8.
  */
object SparkDemo {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("demoApp")
    val sc = new SparkContext(conf)
    val data = sc.textFile("/home/lucas/data/")
   // data.map()
  }

}
