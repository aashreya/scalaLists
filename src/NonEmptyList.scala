/**
  * Created by ashankar on 1/21/17.
  */
class NonEmptyList[T](elements:Array[T]) extends IList[T] {

  override def add(item: T): IList[T] = {
    return new NonEmptyList(this.elements)
  }

  override def toString: String = return this.elements.mkString(" ")
}
