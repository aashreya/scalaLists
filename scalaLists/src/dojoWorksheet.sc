println("hello")
val a = 5;
val b = "A";
val d = 5.5;
val x = 'c';

def personDef(s:String):String = {
  return "Hi" + s;
}

println("Hi")

val name = personDef(b);

def callHi(hiName:String => String):Array[String] = {
  val a:Array[String] = Array("KK","LA");
  a.map(hiName);
};

callHi(personDef).map(h => println(h));

