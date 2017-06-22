/**
  * Created by ashankar on 1/21/17.
  */
class LastNode[T] extends IList[T] {
  def value = throw new Exception("No element in Last")

  def next = throw new Exception("Next not found")
}
