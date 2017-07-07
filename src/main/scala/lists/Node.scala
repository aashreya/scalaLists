package main.scala.lists

/**
  * Created by ashankar on 1/21/17.
  */
class Node[T](val value: T, val next: IList[T]) extends IList[T] {

  override def isEmpty: Boolean = false

  override def tail: T = if (next.isEmpty) value else next.tail

  override def head: T = value

  override def union(secondList: IList[T]): IList[T] = ???

  override def toString: String = {
    print(s"${value} -> ")
    next.toString()
  }

}
