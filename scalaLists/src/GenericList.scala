/**
  * Created by ashankar on 12/17/16.
  */
trait GenericList[T] {
  val list:List[T] = List()
//  def newList(): GenericList[T]
//  def getAsArray():Array[T]
  def addToList(element:T):List[T]
  def size():Int
}
