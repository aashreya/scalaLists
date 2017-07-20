package main.scala.btree

/**
  * Created by ashankar on 7/13/17.
  */
trait Btree[+T] {
  def value: T

  def left: Btree[T]

  def right: Btree[T]

  def isEmpty: Boolean

  override def toString: String = {
    this match {
      case NonEmpty(v, Empty(), Empty()) => v.toString()
      case NonEmpty(x, y, z) => x.toString() + "(" + y.toString() + "," + z.toString() + ")"
      case Empty() => "last"
    }
  }

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

  def map[R, S >: T](f: S => R): Btree[R]

  def invert[S >: T](): Btree[S] = {
    this match {
      case Empty() => Empty()
      case NonEmpty(x, y, z) => NonEmpty(x, z.invert(), y.invert())
    }
  }

  def find[S >: T](element: S)(lt: (S, S) => Boolean): Boolean

  def maxSum[S >: T]()(max: (Int, Int) => Int)(sum: (S, Int) => Int): Int = {
    def accSum(acc: Int, tree: Btree[S]): Int = {
      tree match {
        case Empty() => acc
        case NonEmpty(x, y, z) => max(accSum(sum(x, acc), y), accSum(sum(x, acc), z))
      }
    }

    accSum(0, this)
  }
}
