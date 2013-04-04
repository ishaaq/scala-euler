package scalaeuler

import scala.annotation.tailrec

object Maths {
  lazy val fibs: Stream[Long] = 1L #:: 2L #:: fibs.zip(fibs.tail).map(n => n._1+n._2)

  lazy val positiveIntegers: Stream[Long] = Stream.cons(1L, positiveIntegers.map(_ + 1L))

  lazy val primes = 2L #:: positiveIntegers.drop(2).filter(isPrime)

  def isPrime(i: Long): Boolean = {
    @tailrec
    def _isPrime(i: Long, s: Stream[Long]): Boolean = s.head match {
      case p if p * p > i => true
      case p if i % p == 0 => false
      case _ => _isPrime(i, s.tail)
    }

    _isPrime(i, primes)
  }

  /** Euclid's algorithm for gcd calculation */
  @tailrec
  def gcd(a: Long, b: Long): Long = {
    if (a == 0 || b == 0) a + b
    else if (a < b) gcd(a, b % a)
    else gcd (b, a % b)
  }

  def lcm(a: Long, b: Long): Long = a * b / gcd(a, b)
}
