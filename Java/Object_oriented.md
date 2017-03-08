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

&emsp;&emsp;**局部变量和成员变量的区别：成员变量Java会默认给初始化，不会报错。局部变量没有初始值会报错。**

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

###6.类的继承
&emsp;&emsp;Java中使用extends关键字实现类的继承机制，其语法规则为：

&emsp;&emsp;<modifier> class <name> [extends<superclass>]{...}

&emsp;&emsp;eg:class Student extends Person

&emsp;&emsp;通过继承，子类自动拥有了基类（superclass)的所有成员（成员变量和方法）。

&emsp;&emsp;一个子类只能有一个基类 一个基类可以派生出多个子类

&emsp;&emsp;内存分布如下：（new语句）
![](http://i.imgur.com/m0oM6lk.png)

###7.访问控制
![](http://i.imgur.com/JKRgkAL.png)

&emsp;&emsp;default就是前面什么都不加；**private子类也不可以访问！**

&emsp;&emsp;成员定义前可以用四个。对于class的权限修饰只可以用public和default(什么都不写）

###8.方法的重写
&emsp;&emsp;在子类中可以根据需要对从基类中继承来的方法进行重写。

&emsp;&emsp;重写方法必须和被重写方法具有**相同**的方法名称、参数列表和返回类型。

&emsp;&emsp;重写方法不能使用比被重写方法更**严格**的访问权限。

###8.super关键字
&emsp;&emsp;在Java类中使用super来引用基类的成分。
![](http://i.imgur.com/1BazlSM.png)   

###9.Object类
&emsp;&emsp;Object类是所有Java类的根基类

&emsp;&emsp;如果在类的声明中未使用extends关键字指明其基类，则默认基类为Object类

&emsp;&emsp;public class Person{

&emsp;&emsp;}

&emsp;&emsp;等价于：

&emsp;&emsp;public class Person extends Object{

&emsp;&emsp;}

####&emsp;&emsp;equals方法

&emsp;&emsp;public boolean equals(Object obj)方法，提供定义对象是否“相等”的逻辑

&emsp;&emsp;Object的equals方法定义为：x.equals(y)当x和y是同一个对象的应用时返回true否则返回false

###10.对象转型（castng)

&emsp;&emsp;一个基类的引用类型变量可以“指向”其子类的对象。(eg:传动物，传的是狗）

&emsp;&emsp;基类的引用不可以访问其子类对象新增加的成员(属性和方法)(eg:别人传给你的是狗，但狗种特定的方法不能用，就看成普通动物)

&emsp;&emsp;可以使用 **引用 变量 instanceof 类名**,来判断该引用型变量所“指向”的对象是否属于该类或该类的子类

&emsp;&emsp;eg:Objcet obj

&emsp;&emsp;eg:obj instanceof Cat

&emsp;&emsp;子类对象可以当作基类的对象来使用称作向上转型（upcasting),反之称为向下转型（downcasting)

###11.多态
&emsp;&emsp;动态绑定是指“在执行期间（而非编译期）判断所引用对象的实际类型，根据其实际类型调用其相应的方法。

&emsp;&emsp;javac编译期间，java命令，开始分配内存了是执行期间

&emsp;&emsp;多态存在的三个条件：1.要有继承 2.要有重写 3.父类引用指向子类对象

&emsp;&emsp;**可扩展性！！**

###12.抽象类
&emsp;&emsp;用abstract关键字来修饰一个类时，这个类叫做抽象类；用abstract来修饰一个方法时，该方法叫做抽象方法。

&emsp;&emsp;含有抽象方法的类**必须**被声明为抽象类，抽象类**必须**被继承，抽象方法必须被重写。

&emsp;&emsp;**抽象类不能被实例化！**

&emsp;&emsp;抽象方法只需声明，而不需要实现。

![](http://i.imgur.com/nnKbkim.png)

###13.Final关键字
&emsp;&emsp;final的变量的值不能被改变（final的成员变量，final的局部变量（形参））

&emsp;&emsp;final的方法不能够被重写

&emsp;&emsp;final的类不能够被继承

###14.接口
&emsp;&emsp;从本质上讲，接口是一种**特殊**的**抽象类**，这种抽象类中只包含常量和方法的定义，而没有变量和方法的实线。
![](http://i.imgur.com/DPCwXrh.png)

&emsp;&emsp;接口特性：

&emsp;&emsp;①接口可以实现多重实现

&emsp;&emsp;②接口中声明的属性默认为**public static final**；也只能是这个类型的。

&emsp;&emsp;③接口中只能定义抽象方法，而且这些方法默认为public的，也只能是public的

&emsp;&emsp;④接口可以继承其他的接口，并添加新的属性和抽象方法

 ![](http://i.imgur.com/tTbkUa4.png)

&emsp;&emsp;**implements**实现接口

&emsp;&emsp;多个无关的类可以实现同一个接口

&emsp;&emsp;一个类可以实现多个无关的接口（eg: class Teacher implements Singer,Painter)

&emsp;&emsp;与继承关系类似，接口与实现类存在多态性

