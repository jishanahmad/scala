package oops

abstract class MyList{
  def head: Int
  def tail: MyList
  def isEmpty : Boolean
  def add(elements: Int): MyList
  def printElements: String
  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyList{
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty : Boolean = true
  def add(elements: Int): MyList = new Cons(elements, Empty)
  override def toString: String = ""
}

class Cons(h:Int, t:MyList) extends  MyList{
  def head: Int = h
  def tail: MyList = t
  def isEmpty : Boolean = false
  def add(elements: Int): MyList = new Cons(elements, this)
  def printElements: String = {
    if(t.isEmpty) "" + h
    else s"$h ${t.printElements}"
  }
}

object MyList extends App{
  val list = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(list.tail.head)
  println(list.add(4).head)
  println(list.isEmpty)
  println(list.toString)
}