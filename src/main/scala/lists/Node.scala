package main.scala.lists

/**
  * Created by ashankar on 1/21/17.
  */
class Node[T](val value: T, val next: IList[T]) extends IList[T] {

  override def isEmpty: Boolean = false

  override def tail: T = if (next.isEmpty) value else next.tail

  override def head: T = value

  override def union(secondList: IList[T]): IList[T] = new Node(value, next.union(secondList))

  override def toString: String = {
    print(s"${value} -> ")
    next.toString()
  }

  override def map[T2](f: (T) => T2): IList[T2] = new Node[T2](f(value), next.map(f))

  override def contains(element: T): Boolean = {
    if (value == element)
      true
    else if (next.isEmpty)
      false
    else
      next.contains(element)
  }

  override def unique(): IList[T] = {
    if (next.contains(value))
      next.unique()
    else
      new Node[T](value, next)
  }

}
