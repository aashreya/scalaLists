/**
  * Created by ashankar on 12/7/16.
  */
object ScalaApp {
  def main(args: Array[String]) {
    val factor = 3
    val multiplier = (i:Int) => i * factor
    println("Value is : ", multiplier(6))

    val myList:GenericList[Int] = new FilledList[Int]
    println("1st Length is ", myList.size())

    val secondList:List[Int] = myList.addToList(5)
    val arrayData = secondList.toArray
    println("2nd Length is ", arrayData(0))

  }
}
