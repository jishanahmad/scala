package oops

object inheritance_4 {

  def main(args: Array[String]): Unit = {

    class Animal{
      def eat = println("From animal class")
    }

    class cat extends Animal

    class Dog extends Animal{
      override def eat = {
        super.eat
        println("Eat,eat")
      }
    }

    val unknownAnimal: Animal = new Dog
    unknownAnimal.eat
  }
}