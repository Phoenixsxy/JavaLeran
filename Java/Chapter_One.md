#<center>**第一章 Java语言概述**</center>
</br>

###1.编译型语言：

&emsp;&emsp;使用专门的编译器，针对特定平台（操作系统）将某种高级语言源代码一次性的“翻译”成可被该平台硬件执行的机器码（包括机器指令和操作数），并包装成该平台所能识别的可执行性程序的格式，这个转换过程称为编译(Compile)。

&emsp;&emsp;编译生成的可执行性程序可以脱离开发环境，在特定的平台上独立运行。运行效率较高，但不利于平台的移植。

&emsp;&emsp;例如：C、C++、FORTRAN、Pascal等高级语言

###2.解释型语言
&emsp;&emsp;使用专门的解释器对源程序逐行解释成特定平台的机器码并**立即**执行的语言。解释型语言通常不会进行整体性的编译和链接处理，解释型语言相当于把编译型语言中的编译和解释过程混合到一起同时完成。

&emsp;&emsp;运行效率较低，不能脱离解释器独立运行。但跨平台容易

&emsp;&emsp;例如：Ruby、Python等语言

###3.Java程序的运行机制和JVM
&emsp;&emsp;Java语言比较特殊，由Java语言编写的程序需要经过编译步骤，但这个编译步骤并不会生成特定的平台的机器码，而是生成一种与平台无关的字节码（也就是.class文件)。当然这种字节码不是可执行性的，必须使用Java解释器来解释执行。因此我们认为：Java语言**既是编译型语言，也是解释型语言**
<center>![](http://i.imgur.com/08iS17b.png)</center>

&emsp;&emsp;Java里负责解释执行字节码文件的是Java虚拟机，即JVM。JVM是Java程序跨平台的关键部分，只要为不同平台实现了相应的虚拟机编译后的Java字节码就可以在该平台上运行。

&emsp;&emsp;JRE包含JVM。JRE除了包含JVM之外，还包含运行Java程序的其他环境支持。
###4.设置PATH环境变量
&emsp;&emsp;编译和运行Java程序必须经过两个步骤，①将源文件编译成字节码。②解释执行平台无关的字节码程序。分别需要使用java和javac两个命令。Windows操作系统根据Path环境变量来查找命令。Path环境变量的值是一系列路径。

&emsp;&emsp;环境变量分为用户变量和系统变量。用户变量只是对当前用户有效，系统变量对所有用户有效。
###5.编译Java程序
&emsp;&emsp;对于初学者而言，先掌握javac命令的如下用法：

`javac -d destdir srcFile`

&emsp;&emsp;-d destdir是javac命令的选项，用以指定编译生成的字节码文件的存放路径，destdir只需是本地磁盘上的一个有效路径即可；而srcFile是Java源文件所在的位置，这个位置既可以是绝对路径，也可以是相对路径。

&emsp;&emsp;通常，总是将生成的字节码文件放在当前路径下，当前路径可以用一点(.)来表示。在命令窗口进入HelloWorld.java文件所在路径，在该路径下输入：

`javac -d . HelloWorld.java`

&emsp;&emsp;运行命令后，在该路径下生成一个HelloWorld.class文件。
###6.运行Java程序
&emsp;&emsp;运行Java程序使用java命令，启动命令行窗口，进入HelloWolrd.class所在位置，直接输入java命令，不带任何参数或选项，将看到系统输入大量提示，告诉开发者如何使用java命令。

&emsp;&emsp;java **Java类名**

<center>![](http://i.imgur.com/ZcTOKy6.png)</center>

###7.Java程序的基本规则
&emsp;&emsp;Java是一种纯粹的面向对象的程序设计语言，因此Java程序必须以类（class）的形式存在，类是Java程序的最小程序单位。
&emsp;&emsp;Java程序源代码里定义了一个public类，则该源文件的文件名必须与public类的类名相同。**一个Java源文件里最多只能定义一个public类**

&emsp;&emsp;>建议：1.一个源文件只定义一个类，不同的类使用不同的源文件定义。

&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;2.让Java源文件的主文件名与该

