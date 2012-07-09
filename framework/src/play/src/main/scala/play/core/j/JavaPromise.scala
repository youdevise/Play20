package play.core.j

import java.util.{List => JList}
import play.api.libs.concurrent.{Promise}
import scala.collection.JavaConverters
import play.libs.F

object JavaPromise {

   def sequence[A](promises: JList[F.Promise[_ <: A]]): Promise[JList[A]] = {
    Promise.sequence(JavaConverters.asScalaBufferConverter(promises).asScala.map(_.getWrappedPromise))
      .map{s => 
	      	val b = new collection.mutable.ListBuffer[A]
	      	b ++= s
      	}.map(az => JavaConverters.bufferAsJavaListConverter(az).asJava)
  }
  def timeout[A](message: A, delay: Long, unit:java.util.concurrent.TimeUnit) = {
    Promise.timeout(message, delay, unit)
  }
}
