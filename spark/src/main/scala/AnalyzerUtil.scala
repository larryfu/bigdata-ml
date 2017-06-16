import org.apache.lucene.analysis.TokenStream
import org.apache.lucene.analysis.standard.ClassicAnalyzer
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute

import scala.collection.mutable.ArrayBuffer

/**
  * Created by larry on 5/14/2017.
  */
object AnalyzerUtil {

  def analyze(text: String): Array[String] = {
    var result = ArrayBuffer[String]()
    val tokenStream = new ClassicAnalyzer().tokenStream("", text)
    tokenStream.reset
    val term = tokenStream.addAttribute(classOf[CharTermAttribute])
    while (tokenStream.incrementToken()) {
      val token = term.toString
      if (token.length > 1)
        result += token
    }
    result.toArray
  }
}
