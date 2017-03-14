#<center>常用类</center>
<br>
###1.String类

![](http://i.imgur.com/SGoOmJg.png)

&emsp;&emsp;**构造方法可以看api文档！**

![](http://i.imgur.com/WdqVpBJ.png)

![](http://i.imgur.com/v9siif4.png)
&emsp;&emsp;因为优化，所以s1和s3相等。但第二段里，新new出来，是两个对象引用，就不相等。equals是string类重写的方法。

###2.StringBuffer类
&emsp;&emsp;java.lang.StringBuffer代表可变得字符序列

&emsp;&emsp;StringBuffer和String类似，但StringBuffer可以对其它字符串进行改变。

&emsp;&emsp;eg:String s1,s2；   s1+s2时，需要在新建一块内存，再将两个String copy过来。因为不可变。但StringBuffer就可以在s1内存上直接加上s2的内容。因为**可变**！

###3.基础数据类型包装类
&emsp;&emsp;包装类（如：Integer,Double等)这些类封装了一个相应的基本数据类型数值，并为其提供了一系列操作。

&emsp;&emsp;一般定义变量在**栈空间**，用包装类，分配在**堆空间**。

###4.Math类
![](http://i.imgur.com/IOctZ1y.png)

###5.File类
&emsp;&emsp;java.io.File类代表系统**文件名**（路径和文件名）

&emsp;&emsp;File类的常见构造方法：

&emsp;&emsp;public File(String pathname)

&emsp;&emsp;以pathname为路径创建File对象，如果pathname是相对路径，则默认的当前路径在系统属性user.dir中存储。

&emsp;&emsp;File的静态属性String separator存储了当前系统的路径分隔符

###6.枚举类

&emsp;&emsp;java.lang.Enum

&emsp;&emsp;只能够取特定值中的一个

&emsp;&emsp;使用enum关键字


