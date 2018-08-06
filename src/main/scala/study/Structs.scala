package study

object Structs extends App {

    /**
      * 在java中，表达式和语句看做两种不同的东西，表达式有值，
      * 语句执行动作，在Scala中，几乎所有构造出来的语法结构都
      * 有值，这个特性使得程序更加精简，也更易读
      * */

    /**
      * 条件表达式
      *
      * Unit-写作() 无有用值 类似java void, Any - 公共超类
      * */
    val x = 1
    val s = if(x > 0) 1 else -1
    println(s)



}
