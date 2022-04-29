package oops

import java.io.Writer

object oops_basic_1 extends App {


  val author = new Writer("Jishan", "Mr.", 1992)

  val novel = new Novel("Great Expectation", 2003, author)

  println(author.fullName)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))


}

class Writer(first_name:String, surname:String, val year:Int){
  def fullName:String = surname + " " + first_name
}

class Novel(name:String, year_of_release:Int, author: Writer){

  def authorAge: Int = year_of_release - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear:Int): Novel = new Novel(name, newYear, author)

}

