import main.scala.btree.{Empty, NonEmpty}
import main.scala.lists.{IList, LastNode, Node}

/**
  * Created by ashankar on 1/21/17.
  */
object ScalaApp {

  def main(args: Array[String]): Unit ={
    println("My Lists")
    val myList = new Node(10, new Node(15, new Node(17, new LastNode)))
    val secList = myList.union(new Node(-1, new Node(15, new Node(-1, new LastNode))))
    val list2 = List(1, 2, 3)
    val myTree = NonEmpty(5, Empty(), Empty())

    def comp(x: Int, y: Int) = if (x > y) true else false

    val myTree2 = myTree.insert(7)(comp)
    val myTree3 = myTree2.insert(2)(comp).insert(10)(comp)

    //    println(myList.toString())
    //    println(myList.head)
    //    println(myList.tail)
    //
    //    println(myList.contains(15))
    //    println(myList.contains(67))
    //    println(secList)
    //    println(secList.unique())
    //    println(myList.fold(0, (a, b) => a + b))

    //    println(secList)
    //    println(myList.scan(0, (x, y) => x + y))
    //    println(maxSubArray(secList))
    //    println(maxSubArray2(secList))
    //    println(myList.map(n => n * 2).toString())
    //    println("reverse :")
    //    println(myList.reverse())
    //
    //    println(factorial(5))
    //    println("Count :")
    //    println(secList.count(15))

    println("Tree Operations : ")
    println(myTree3.toString())
    println(myTree3.size())
    println(myTree3.inorder())

  }

  def factorial(n: Int): Int = {
    def accFact(acc: Int, data: Int): Int = {
      data match {
        case 0 => acc
        case _ => accFact(acc * data, data - 1)
      }
    }

    accFact(1, n)
  }


  def maxSubArray(elements: IList[Int]): Int = {
    var largest = 0
    elements.fold(0, (acc, y) => {
      if (acc + y < acc) {
        if (acc > largest) largest = acc
        println(acc)
        0
      }
      else {
        if (acc + y > largest) largest = acc + y
        acc + y
      }
    })
    largest
  }

  def maxSubArray2(element: IList[Int]): Int = {
    val acc = 0
    val data = element.scan(0, (a, b) => a + b)
    data.fold(0, (a, b) => if (a > b) a else b)
  }

  def sum(acc: Int, y: Int): Int = {
    var largest = 0
    if (acc + y < acc) {
      if (acc > largest) largest = acc
      0
    }
    else {
      acc + y
    }
  }

}
