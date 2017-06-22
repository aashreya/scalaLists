/**
  * Created by ashankar on 1/21/17.
  */
trait IList[T] {
  def value: T

  def next: IList[T]

  //  def add[S >: T](item:S):IList[S]
}
