import main.scala.lists.{LastNode, Node}

/**
  * Created by ashankar on 1/21/17.
  */
object ScalaApp {

  def main(args: Array[String]): Unit ={
    println("My Lists")
    val myList = new Node(10, new Node(15, new Node(20, new LastNode)));
    println(myList.toString())
    println(myList.head)
    println(myList.tail)
  }

}
