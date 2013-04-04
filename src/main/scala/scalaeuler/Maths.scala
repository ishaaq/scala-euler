package scalaeuler

object Maths {
  lazy val fibs: Stream[Long] = 1L #:: 2L #:: fibs.zip(fibs.tail).map(n => n._1+n._2)
}
