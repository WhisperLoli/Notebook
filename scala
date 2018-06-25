注意：
  1. 区分大小写 -  Scala是大小写敏感的
  2. 类名 - 对于所有的类名的第一个字母要大写
  3. 方法名称 - 所有的方法名称的第一个字母用小写
  4. 程序文件名 - 程序文件的名称应该与对象名称完全匹配(新版本不需要了，但建议保留这种习惯)
  5. def main(args: Array[String]) - Scala程序从main()方法开始处理，这是每一个Scala程序的强制程序入口部分

标识符：
  Scala 可以使用两种形式的标志符，字符数字和符号
    字符数字使用字母或是下划线开头，后面可以接字母或是数字，符号"$"在 Scala 中也看作为字母。然而以"$"开头的标识符为保留的 Scala 编译器产生的标志符使用，应用程序应该避免使用"$"开始的标识符，以免造成冲突
    此外也应该避免使用以下划线结尾的标志符以避免冲突。符号标志符包含一个或多个符号，如+，:，? 等，比如：+ ++ ::: < ?> :->
    你可以在"之间使用任何有效的 Scala 标志符，Scala 将它们解释为一个 Scala 标志符，一个典型的使用为 Thread 的 yield 方法， 在 Scala 中你不能使用 Thread.yield()是因为 yield 为 Scala 中的关键字， 你必须使用 Thread.`yield`()来使用这个方法。
 
引用：
  import java.awt.Color  // 引入Color
  import java.awt._  // 引入包内所有成员
  / 重命名成员
  import java.util.{HashMap => JavaHashMap}
  // 隐藏成员
  import java.util.{HashMap => _, _} // 引入了util包的所有成员，但是HashMap被隐藏了
  
  默认情况下，Scala 总会引入 java.lang._ 、 scala._ 和 Predef._
  
数据类型：
  Byte	8位有符号补码整数。数值区间为 -128 到 127
  Short	16位有符号补码整数。数值区间为 -32768 到 32767
  Int	32位有符号补码整数。数值区间为 -2147483648 到 2147483647
  Long	64位有符号补码整数。数值区间为 -9223372036854775808 到 9223372036854775807
  Float	32位IEEE754单精度浮点数
  Double	64位IEEE754单精度浮点数
  Char	16位无符号Unicode字符, 区间值为 U+0000 到 U+FFFF
  String	字符序列
  Boolean	true或false
  Unit	表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。
  Null	null 或空引用
  Nothing	Nothing类型在Scala的类层级的最低端；它是任何其他类型的子类型。
  Any	Any是所有其他类的超类
  AnyRef	AnyRef类是Scala里所有引用类(reference class)的基类
  
变量：
  一、变量： 在程序运行过程中其值可能发生改变的量叫做变量。如：时间，年龄。
  二、常量 在程序运行过程中其值不会发生变化的量叫做常量。如：数值 3，字符'A'
  
  在 Scala 中，使用关键词 "var" 声明变量，使用关键词 "val" 声明常量
  变量声明一定需要初始值，否则会报错
  val xmax, ymax = 100  // xmax和ymax都声明为100
  
访问修饰符：
  Scala 访问修饰符基本和Java的一样，分别有：private，protected，public。
  如果没有指定访问修饰符符，默认情况下，Scala 对象的访问级别都是 public。
  Scala 中的 private 限定符，比 Java 更严格，在嵌套类情况下，外层类甚至不能访问被嵌套类的私有成员。 
  在 scala 中，对保护（Protected）成员的访问比 java 更严格一些。因为它只允许保护成员在定义了该成员的的类的子类中被访问。
  
  Scala中，访问修饰符可以通过使用限定词强调。格式为:

  private[x] 或 protected[x]
  这里的x指代某个所属的包、类或单例对象。如果写成private[x],读作"这个成员除了对[…]中的类或[…]中的包中的类及它们的伴生对像可见外，对其它所有类都是private。

    
