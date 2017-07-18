package main.scala.lists

/**
  * Created by ashankar on 1/21/17.
  */
case class LastNode[+T]() extends IList[T] {
  def value = throw new Exception("No element in Last")

  def next = throw new Exception("Next not found")

  override def isEmpty: Boolean = true

  override def tail[S >: T]: S = throw new Exception("No element in Last")

  override def head[S >: T]: S = throw new Exception("No element in Last")

  override def union[S >: T](secondList: IList[S]): IList[S] = secondList

  override def toString: String = "end"

  override def map[T2, S >: T](f: (S) => T2): IList[T2] = new LastNode[T2]

  override def unique[S >: T](): IList[S] = new LastNode[S]

  override def contains[S >: T](element: S): Boolean = throw new Exception("No element in Last")

  override def fold[S >: T](acc: S, op: (S, S) => S): S = acc

  override def scan[S >: T](acc: S, op: (S, S) => S): IList[S] = new LastNode[S]

  //  override def count[T](elem: T): Int = 0
}
