package main.scala.lists

/**
  * Created by ashankar on 1/21/17.
  */
trait IList[+T] {
  def value: T

  def next: IList[T]

  def isEmpty: Boolean

  def tail[S >: T]: S

  def head[S >: T]: S

  def union[S >: T](secondList: IList[S]): IList[S]

  override def toString: String = super.toString

  def map[T2, S >: T](f: S => T2): IList[T2]

  def unique[S >: T](): IList[S]

  def contains[S >: T](element: S): Boolean

  def fold[S >: T](acc: S, op: (S, S) => S): S

  def scan[S >: T](acc: S, op: (S, S) => S): IList[S]

  def reverse[S >: T](): IList[S] = {
    def reverseAcc(acc: IList[S], myList: IList[S]): IList[S] = {
      myList match {
        case LastNode() => acc
        case Node(tvalue, tnext) => reverseAcc(Node(tvalue, acc), tnext)
      }
    }

    reverseAcc(LastNode(), this)
  }

  //  def count[T](elem: T): Int

  def count[S >: T](elem: S): Int = {
    def countAcc(acc: Int, list: IList[S]): Int = {
      list match {
        case LastNode() => acc
        case Node(v, n) => if (v == elem) countAcc(acc + 1, n) else countAcc(acc, n)
      }
    }

    countAcc(0, this)
  }

  def zip[S >: T](other: IList[S]): IList[(S, S)]

  //  def add[S >: T](item:S):IList[S]

}
