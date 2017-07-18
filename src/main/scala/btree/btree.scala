package main.scala.btree

/**
  * Created by ashankar on 7/13/17.
  */
trait Btree[+T] {
  def value: T

  def left: Btree[T]

  def right: Btree[T]

  def isEmpty: Boolean
}
