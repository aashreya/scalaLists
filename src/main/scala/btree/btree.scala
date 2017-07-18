package main.scala.btree

/**
  * Created by ashankar on 7/13/17.
  */
trait Btree[+T] {
  def value: T

  def left: Btree[T]

  def right: Btree[T]

  def isEmpty: Boolean

  override def toString: String = super.toString

  def insert[S >: T](item: S)(lt: (S, S) => Boolean): Btree[S]

  def size(): Int = {
    this match {
      case Empty() => 0
      case NonEmpty(x, y, z) => y.size() + 1 + z.size()
    }
  }

  def inorder(): Unit = {
    this match {
      case Empty() => print("")
      case NonEmpty(x, y, z) => {
        y.inorder()
        print(x + "->")
        z.inorder()
      }
    }
  }

}
