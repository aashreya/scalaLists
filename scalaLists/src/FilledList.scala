/**
  * Created by ashankar on 12/17/16.
  */
class FilledList[T]() extends GenericList[T] {

//  override def getAsArray(): Array[T] = list.toArray

//  override def newList(): GenericList[T] = new F

  override def addToList(element: T): List[T] = element :: list

  override def size():Int = list.length

}
