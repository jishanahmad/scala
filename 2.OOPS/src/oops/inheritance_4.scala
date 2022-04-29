package oops

object inheritance_4 {

  def main(args: Array[String]): Unit = {

    class Animal{
      def eat = println("From animal class")
    }

    class cat extends Animal

    val cat = new cat
    cat.eat
  }

}
