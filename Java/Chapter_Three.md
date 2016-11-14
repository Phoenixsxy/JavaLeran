#<center>第3章 数据类型和运算符</center> 
###1.标识符规则

&emsp;&emsp;**凡是自己命名的变量就是标识符**

&emsp;&emsp;①标识符可以由字母、数字、下划线_和美元符$组成，不能以数字打头。

&emsp;&emsp;②不能使Java关键字、保留字。（所有关键字为小写，goto,const不用但保留关键字）

&emsp;&emsp;③不能包含空格

###2.Java变量的分类
&emsp;&emsp;局部变量：**方法**或**语句块内部**定义的变量。（方法参数也是局部变量）

&emsp;&emsp;成员变量：方法外部、类内部定义的变量

&emsp;&emsp;**!注意：类外面（与类对应的大括号外面）不能有变量的声明**

&emsp;&emsp;**任何变量都需要先声明，再赋值才可以用！**

![](http://i.imgur.com/BX35Zhs.png)
&emsp;&emsp;程序都放在硬盘里，.exe,.class。先转载到内存中，操作系统找到main方法，执行的内存一般分成四部分。

###3.Java基本数据类型
![](http://i.imgur.com/A3M0vq9.png)
&emsp;&emsp;**内存里占的小格的大小，小格里布局（里面的0101排列不一样）**来区分不同数据类型

&emsp;&emsp;①逻辑型Boolean

&emsp;&emsp;只允许true或false,不可以0或非0的整数替代true和false(和C++不同）

&emsp;&emsp;②字符型char

&emsp;&emsp;Java字符采用**Unicode**编码，每个字符占**两个字节**，Java采用的是UTF-16（有两种UTF-8和UTF-16），因而可用十六进制编码形式表示。（ASCII码一般占一个字节，中文编码一般是GBK编码）**Unicode是全球语言统一编码**

&emsp;&emsp;③整数类型

&emsp;&emsp;byte 1字节

&emsp;&emsp;short 2字节

&emsp;&emsp;int 4字节(默认是int型）

&emsp;&emsp;long 8字节（声明long,后面加'l'或'L',推荐'L')

&emsp;&emsp;**Java中没有无符号数！**

&emsp;&emsp;C语言各操作系统所占字节数不同，Java不受具体操作系统的影响，以保证Java程序的**可移植性**。

&emsp;&emsp;**一个数所有进制在计算机中存储是一样的**

&emsp;&emsp;④浮点类型

&emsp;&emsp;**（Java7新增的数值中使用下划线分割,可以直观的分辨数值常量中到底包含多少位）**

&emsp;&emsp;十进制数形式 eg:3.14 314.0 .314

&emsp;&emsp;科学计数法形式 eg:3.14e2 3.14E2 100E-2

&emsp;&emsp;Java浮点型常量默认是double型，如要声明一个常量为float型，则需在数字后面加f或F。

###4.基本数据类型转换
*boolean类型不可以转换为其他的数据类型

*整形，字符型，浮点型的数据在混合运算中互相转换，转换石遵循以下原则：

&emsp;&emsp;容量小的类型自动转换为容量大的数据类型；

&emsp;&emsp;byte,short,char->int->long->float->double

&emsp;&emsp;(byte,short,char之间不会相互转换，**他们三者在计算时首先会转换为int型**。）

&emsp;&emsp;容量大的数据类型转换为容量小的数据类型时，要加上强制转换符）

###5.运算符
&emsp;&emsp;"&&"短路与，"||"短路或

&emsp;&emsp;"&"逻辑与，"|"逻辑或

&emsp;&emsp;两者区别，逻辑与和逻辑或无论如何都算完，短路与和短路或满足条件后只算一部分，另一条件不管。

###5.文档注释
&emsp;&emsp;开发一个大型软件时，需要定义成千上万的类，而且需要很多人参与开发。这时候就需要提供一份说明文档，用于说明每个类、每个方法的用途。当其他人使用一个类或一个方法时，他无须关心这个类或这个方法的具体实现，他只要知道这个类或这个方法的功能即可，然后使用这个类或方法来实现具体的目的，也就是通过调用应用程序接口（API）来编程。API文档就是用以说明这些应用程序接口的文档。

&emsp;&emsp;**javadoc**工具只处理文档源文件在类、接口、方法、Field、构造器和内部类之前的注释，忽略其他地方的文档注释。而且javadoc工具默认只处理以public或protected修饰的类、接口、方法、Field、构造器和内部类之前的注释。

&emsp;&emsp;文档注释以斜线后紧跟两个星号（/**）开始，以星号后紧跟一个斜线（*/)作为结尾，中间部分全部都是文档注释，会被提取到API文档中。

####&emsp;&emsp;javadoc 选项 Java 源文件/包

&emsp;&emsp;例如：![](http://i.imgur.com/LO2DqKB.png)

&emsp;&emsp;-d<directory>:该选项指定一个路径，用于将生成的API文档放到指定目录下。

&emsp;&emsp;-windowtitle<text>:该选项制定了一个字符串，用于设置API文档的浏览器窗口标题。

&emsp;&emsp;-doctitle<html-code>:该选项指定一个HTML格式的文本，用于指定概述页面的标题。（只有对于多个包下的源文件来生成API文档时，才有概述页面。

&emsp;&emsp;-header<html-code>:该选项指定一个HTML格式的文本，包含每个页面的页眉。

![](http://i.imgur.com/qGKDtgi.png)
![](http://i.imgur.com/F9lRXVh.png)

&emsp;&emsp;常用的javadoc标记：

&emsp;&emsp;@author:指定Java程序的作者。

&emsp;&emsp;@version:指定源文件的版本

&emsp;&emsp;@deprecated:不推荐使用的方法

&emsp;&emsp;@param:方法的参数说明信息

&emsp;&emsp;@return:方法的返回值说明信息

&emsp;&emsp;@see:“参见”，用于指定交叉参考的内容

&emsp;&emsp;@exception:抛出异常的类型

&emsp;&emsp;@throws:抛出的异常，和exception同义