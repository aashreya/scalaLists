package main.scala.lists

/**
  * Created by ashankar on 1/21/17.
  */
class LastNode[T] extends IList[T] {
  def value = throw new Exception("No element in Last")

  def next = throw new Exception("Next not found")

  override def isEmpty: Boolean = true

  override def tail: T = throw new Exception("No element in Last")

  override def head: T = throw new Exception("No element in Last")

  override def union(secondList: IList[T]): IList[T] = secondList

  override def toString: String = "end"
}
