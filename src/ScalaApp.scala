/**
  * Created by ashankar on 1/21/17.
  */
object ScalaApp {

  def main(args: Array[String]): Unit ={
    println("Hi")
    val myList = new Node(10, new Node(20, new LastNode))
    print(myList.next.value)
  }

}
