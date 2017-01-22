/**
  * Created by ashankar on 1/21/17.
  */
trait IList[T] {
  def toString():String
  def add(item:T):IList[T]
}
