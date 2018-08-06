package study

import scala.math._
object Basics  extends App {

    /**以val定义的值实际上是一个常量*/
    val answer = 8 * 5 + 2
    println(answer)

    /**如果要声明其值可变的变量，可以用var*/
    var counter = 0
    counter = 1
    println(counter)

    /**必要的时候，可以指定类型*/
    val greeting : String = null
    val greeting1 : Any = "Hello"

    /**
      * Scala中，变量或函数的类型总是写在变量或函数名称的后面
      * ，这使得我们更容易阅读那些复杂类型的声明
      * */


    /**
      * 常用类型-
      * 数值类型--Scala并不刻意区分基本类型和引用类型，
      * 可以对数字执行方法
      * Byte
      * Char
      * Short
      * Int
      * Long
      * Float
      * Double
      * */

    1.toString()  //产出字符串 "1"
    println(1.to(10)) //产出Range（1,2,3,4,5,6,7,8,9,10）


    /**
      * 字符串 通过StringOps类给字符串追加了上百种操作
      * */
    /**在这个表达式中，java.lang.String对象"Hello"被隐式的转换成了一个StringOps随想，接着
      * StringOps类的intersect方法被应用
      * */
    println("Hello".intersect("World")) //输出两个字符串共通的一组字符 “lo”

    /**Scala还提供了RichInt， RichDouble，RichChar等，分别提供Int，Double， Char等不具备的便捷方法
      * BigInt和BigDecimal，用于任意大小(但有穷)的数字
      * */


    /**
      * 操作符重载 +-* scala
      * 中实际是方法：a+b 是 a.+(b)的简写
      * Scala可以使用任何符号来为方法命名
      * */


    val x : BigInt = 1234567890
    println(x * x * x)

    /**除了方法以外，Scala还提供函数*/
    println(sqrt(2))
    println(pow(2, 4))
    println(min(3, Pi))


    /**
      * Scala没有静态方法，不过有个类似的特性，单例对象(singleton object)
      * 通常，一个类对应有一个伴生对象(companion object)，其方法就跟java中的静态方法一样
      * */

    /**
      * apply 方法
      * */

}
