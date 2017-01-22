/**
  * Created by ashankar on 1/21/17.
  */
class EmptyList[T] extends IList[T] {

  var elems: IList[T] = new NonEmptyList[T](Array())

  override def add(item: T): IList[T] = return new NonEmptyList[T](Array(item))

  override def toString: String = super.toString
}
