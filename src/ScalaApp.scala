import main.scala.lists.{LastNode, Node}

/**
  * Created by ashankar on 1/21/17.
  */
object ScalaApp {

  def main(args: Array[String]): Unit ={
    println("My Lists")
    val myList = new Node(10, new Node(15, new Node(10, new LastNode)))
    val secList = myList.union(new Node(35, new Node(15, new Node(40, new LastNode))))
    println(myList.toString())
    println(myList.head)
    println(myList.tail)

    println(myList.contains(15))
    println(myList.contains(67))
    println(secList)
    println(secList.unique())
    //    println(myList.map(n => n * 2).toString())
  }

}
