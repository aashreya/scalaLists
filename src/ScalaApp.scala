/**
  * Created by ashankar on 1/21/17.
  */
object ScalaApp {

  def main(args: Array[String]): Unit ={
    println("Hi")
    val myList:IList[Int] = new NonEmptyList[Int](Array(1,2,3))
    print(myList.toString())
  }

}
