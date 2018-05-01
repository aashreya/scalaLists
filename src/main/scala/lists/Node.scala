package main.scala.lists

/**
  * Created by ashankar on 1/21/17.
  */
case class Node[+T](val value: T, val next: IList[T]) extends IList[T] {

  //  override def next[S >: T]: IList[S] = next

  override def isEmpty: Boolean = false

  override def tail[S >: T]: S = if (next.isEmpty) value else next.tail

  override def head[S >: T]: S = value

  override def union[S >: T](secondList: IList[S]): IList[S] = new Node(value, next.union(secondList))

  override def toString: String = {
    print(s"${value} -> ")
    next.toString()
  }

  override def map[T2, S >: T](f: (S) => T2): IList[T2] = new Node[T2](f(value), next.map(f))

  override def contains[S >: T](element: S): Boolean = {
    if (value == element)
      true
    else if (next.isEmpty)
      false
    else
      next.contains(element)
  }

  override def unique[S >: T](): IList[S] = {
    if (next.contains(value))
      next.unique()
    else
      new Node[S](value, next)
  }

  override def fold[S >: T](acc: S, op: (S, S) => S): S = next.fold(op(acc, value), op)

  override def scan[S >: T](acc: S, op: (S, S) => S): IList[S] = Node(op(acc, value), next.scan(op(acc, value), op))

  override def zip[S >: T](other: IList[S]): IList[(S, S)] = {
    Node((value, other.value), next.zip(other.next))
  }

  //  override def count[T](elem: T): Int = if()
}
