package scalaeuler

import Prob001to010._
import org.scalatest.FlatSpec

class Prob001to010Test extends FlatSpec {
  "The answer to prob001: " should "be 233168" in assert(prob001 === 233168L)
  "The answer to prob002: " should "be 4613732" in assert(prob002 === 4613732L)
  "The answer to prob003: " should "be 6857" in assert(prob003 === 6857L)
  "The answer to prob004: " should "be 906609" in assert(prob004 === 906609L)
  "The answer to prob005: " should "be 232792560" in assert(prob005 === 232792560L)
  "The answer to prob006: " should "be 25164150" in assert(prob006 === 25164150L)
  "The answer to prob007: " should "be 104743" in assert(prob007 === 104743L)
  "The answer to prob008: " should "be 40824" in assert(prob008 === 40824L)
  "The answer to prob009: " should "be 31875000" in assert(prob009 === 31875000L)
  "The answer to prob010: " should "be 142913828922" in assert(prob010 === 142913828922L)
}
