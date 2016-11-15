#<center>第5章 面向对象</center>
###1.类的定义

&emsp;&emsp;[修饰符] class 类名

&emsp;&emsp;{

&emsp;&emsp;&emsp;&emsp;零到多个构造器定义

&emsp;&emsp;&emsp;&emsp;零到多个Field

&emsp;&emsp;&emsp;&emsp;零到多个方法...

&emsp;&emsp;}

&emsp;&emsp;修饰符可以是public,final,abstract,或者没有

&emsp;&emsp;类里各成员之间的定义顺序没有任何影响，各成员之间可以相互调用，但需要指出的是，static修饰的成员不能访问没有static修饰的成员。

&emsp;&emsp;构造器是一个类创建对象的根本途径，如果一个类没有构造器，这个类通常无法创建实例。（系统会默认一个构造器，构造函数）

&emsp;&emsp;局部变量和成员变量的区别：成员变量Java会默认给初始化，不会报错。局部变量没有初始值会报错。

&emsp;&emsp;成员变量可以使Java语言中的任何一种数据类型（包括基本类型和引用类型）。默认值如下图：
![](http://i.imgur.com/A8a57F0.png)

###2.引用
&emsp;&emsp;Java语言中除了基本类型之外的变量类型都称之为引用类型。

&emsp;&emsp;引用类型占**两块**内存。new出来的在堆内存里，变量相当于指针指到堆内存中。变量是引用的。**引用相当于C和C++的指针。**
![](http://i.imgur.com/7tPbTZ8.png)
![](http://i.imgur.com/PqrSddW.png)
&emsp;&emsp;c1和c2是局部变量，存在stack区域

##分析内存！！（实例 TestCircle.java）

###3. this关键字

&emsp;&emsp;在类的**方法**定义中使用的this关键字代表使用该方法的对象的引用。当必须指出当前使用方法的对象是谁时要使用this。有时使用this可以处理方法中**成员变量和参数**重名的情况。
<center>![](http://i.imgur.com/jnQe52U.png)</center>

&emsp;&emsp;eg:public class Leaf

&emsp;&emsp;{

&emsp;&emsp;&emsp;&emsp;int i=0;

&emsp;&emsp;&emsp;&emsp;Leaf(int i){ this.i=i;}

&emsp;&emsp;}

###4.static关键字
&emsp;&emsp;在类中，用static声明的成员变量为静态成员变量，它为该类的**公用变量**，，在第一次使用时被初始化，对于该类的所有对象来说，static成员变量只有一份。（**static**放在**data seg**中）。

&emsp;&emsp;**静态属于整个类，不单独属于某个对象**，任何对象都可以访问这个静态的值，访问的是同一块区域，没有对象也可以访问，用类名加上点访问。（eg:System.out  out一定是静态的）

&emsp;&emsp;字符串常量也放在data seg（数据区）中

&emsp;&emsp;**main方法是static的，不需要new对象就可以运行。可以直接访问。**

&emsp;&emsp;**静态的方法static，不可以访问非static成员。**（非静态成员专属于某个对象） 

###5.package和import
&emsp;&emsp;为便于管理大型软件系统中数目众多的类，解决类的**命名冲突问题**，Java引入包(packge)机制，提供类的多重类命名空间。

&emsp;&emsp;package 包名（约定俗称，把公司的域名倒过来，避免重复）

&emsp;&emsp;package必须是第一条**语句**（若缺省该语句，则指定为无名包）

&emsp;&emsp;编译出来的class文件必须位于正确的目录下，和包的层次完全一致，要用这个类，要把名字写全，pack1.pack2.pack3.类；**执行的时候也要写全包名**（该类的源代码.java可能会产生影响，通常删除或转移到另外的目录中）

&emsp;&emsp;为了简写可以写 **import** pack1.pack2.pack3.(*表示所有的类都引入，可以直接使用）位于同一个包中的类不需要引入

###&emsp;&emsp;class文件的最上层包的父目录必须位于classpath下

&emsp;&emsp;J2SDK中主要的包介绍：（C:\Java\jre1.8.0_101\lib\rt.jar)

&emsp;&emsp;①java.lang——包含一些java语言的核心类,如String、Math、Integer、System和Thread，提供常用功能（**唯一不用引入的包**）

###&emsp;&emsp;jar -cvf [名字].jar \*.\*  命令可以打包，定位到最上层包的最上层

&emsp;&emsp;让大家使用需要把.jar添加到classpath中

###6.