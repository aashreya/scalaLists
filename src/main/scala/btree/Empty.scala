package main.scala.btree

/**
  * Created by ashankar on 7/13/17.
  */
case class Empty[+T]() extends Btree[T] {
  override def value: T = throw new Exception("Next not found")

  override def left: Btree[T] = throw new Exception("Next not found")

  override def right: Btree[T] = throw new Exception("Next not found")

  override def isEmpty: Boolean = true

  override def toString: String = "last"

  override def insert[S >: T](item: S)(lt: (S, S) => Boolean): Btree[S] = NonEmpty(item, Empty(), Empty())

}
