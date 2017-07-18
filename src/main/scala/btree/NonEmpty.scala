package main.scala.btree

/**
  * Created by ashankar on 7/13/17.
  */
case class NonEmpty[+T](value: T, left: Btree[T], right: Btree[T]) extends Btree[T] {
  override def isEmpty: Boolean = false

  override def toString: String = left.toString() + "<-" + value + "->" + right.toString()

  override def insert[S >: T](item: S)(lt: (S, S) => Boolean): Btree[S] = {
    if (lt(item, value))
      NonEmpty(value, left, right.insert(item)(lt))
    else
      NonEmpty(value, left.insert(item)(lt), right)
  }
}
