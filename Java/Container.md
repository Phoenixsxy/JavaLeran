#<center>容器</center>

###1.容器的概念
&emsp;&emsp;容器：Java API所提供的一系列类的实例，用于在程序中存放对象。

&emsp;&emsp;![](http://i.imgur.com/qe12QR4.png)

&emsp;&emsp;图左侧容器都是一个一个装，右面的是一对一对装。

&emsp;&emsp;Collection接口定义了存取一组对象的方法。Set（数学里集合）没有顺序并且不可以重复；List有顺序并可以重复（equals)就是重复了。

&emsp;&emsp;Map接口定义了存储“键（key)-值（value)映射对”的方法。

&emsp;&emsp;容器类对象在调用remove、contains等方法时需要比较对象是否相等，这会涉及到对象类型的equals方法和hashCode方法;对于自定义的类型，需要重写equals和hashCodef方法以实现自定义的对象相等规则。

&emsp;&emsp;注意：相等的对象应该具有相等的hash codes

###2.Iterator接口
&emsp;&emsp;所有实现了Colletion接口的容器类都有一个iterator方法用以返回一个实现了Iterator接口的对象。

&emsp;&emsp;Iterator对象称作迭代器，用以方便的实现对容器内元素的遍历操作。
![](http://i.imgur.com/ySIDOL0.png)

![](http://i.imgur.com/JUcwBfw.png)

###3.增强for(JDK 1.5新增)
![](http://i.imgur.com/ruQR1RY.png)

&emsp;&emsp;缺陷：

&emsp;&emsp;数组：不能方便的访问下标

&emsp;&emsp;集合：与使用Iterator相比，不能方便的删除集合中的内容

&emsp;&emsp;**不建议使用！**

###4.Set接口
![](http://i.imgur.com/jJpPxER.png)
![](http://i.imgur.com/Sz5GtbJ.png)
![](http://i.imgur.com/SZ7lfUP.png)
###5.List接口
![](http://i.imgur.com/uokbw8g.png)
&emsp;&emsp;和数组类似，但数组不可以随意改变大小，List可以。ArrayList底层以数组实现，LinkedList底层以链表实现。
![](http://i.imgur.com/f4O27kq.png)

&emsp;&emsp;**java.util.Collections**类（与接口Collection区别）提供了一些静态方法实现了基于List容器的一些常用算法。
![](http://i.imgur.com/sN8Bcep.png)
![](http://i.imgur.com/QvD6hwM.png)

###6.Comparable接口
&emsp;&emsp;所有“排序”的类都实现了java.lang.Comparable接口，Comparable接口中只有一个方法

&emsp;&emsp;public int compareTo(Object obj);

&emsp;&emsp;返回0表示this==obj 

&emsp;&emsp;返回正数表示this>obj

&emsp;&emsp;返回负数表示this<obj

###7.Map接口
&emsp;&emsp;实现Map接口的类用来存储**键——值**对

&emsp;&emsp;Map接口的实现类有HashMap和TreeMap等

&emsp;&emsp;Map类中存储的键——值对通过键来标识，所以键值不能重复（equals)
![](http://i.imgur.com/9337YDW.png)

&emsp;&emsp;!Tip:put 方法的返回值是原先key对应的value;

&emsp;&emsp;JDK1.5新增Auto-boxing/unboxing

&emsp;&emsp;在合适的时机自动打包、解包

&emsp;&emsp;打包：自动将基础类型转换为对象

&emsp;&emsp;解包：自动将对象转换为基础类型

&emsp;&emsp;eg:可以写成m1.put("one",1);1仍然是对象，自动转成对象了。int i=(Integer)m1.get("two");将Integer自动解包。

###8.泛型
&emsp;&emsp;起因：JDK 1.4以前类型不明确

&emsp;&emsp;装入集合的类型都被当作Object对待，从而失去自己的实际类型。从集合中取出时往往需要转型，效率低，容易产生错误。

&emsp;&emsp;解决办法：

&emsp;&emsp;在定义集合的时候同时定义集合中对象的类型

&emsp;&emsp;eg:可以在定义Collection的时候指定

&emsp;&emsp;&emsp;&emsp;也可以在循环时用Iterator指定

&emsp;&emsp;**查API文档，有<&emsp;>尖括号，就可以定义。否则不行。**