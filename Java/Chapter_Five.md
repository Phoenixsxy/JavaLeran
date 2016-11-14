#<center>第5章 面向对象</center>
<br>
###1.类的定义
&emsp;&emsp;局部变量和成员变量的区别：成员变量Java会默认给初始化，不会报错。局部变量没有初始值会报错。

&emsp;&emsp;成员变量可以使Java语言中的任何一种数据类型（包括基本类型和引用类型）。默认值如下图：
![](http://i.imgur.com/A8a57F0.png)

###2.引用
&emsp;&emsp;Java语言中除了基本类型之外的变量类型都称之为引用类型。

&emsp;&emsp;引用类型占**两块**内存。new出来的在堆内存里，变量相当于指针指到堆内存中。变量是引用的。**引用相当于C和C++的指针。**
![](http://i.imgur.com/7tPbTZ8.png)
![](http://i.imgur.com/PqrSddW.png)
&emsp;&emsp;c1和c2是局部变量，存在stack区域

###3. 