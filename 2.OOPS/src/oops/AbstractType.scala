package oops

object inheritance_4 {

  def main(args: Array[String]): Unit = {

    sealed class Animal{
      def eat = println("From animal class")
    }

    class cat extends Animal

    class Dog extends Animal {
      override def eat = println("Eat,eat")
    }

  }
}