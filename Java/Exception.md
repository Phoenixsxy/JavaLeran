#<center>异常（Exception)</cneter>
<br>
&emsp;&emsp;**运行期**出现的错误（java命令）

&emsp;&emsp;**观察错误的名字和行号最重要**

###1.Java异常的概念
![](http://i.imgur.com/bcqzgjN.png)
&emsp;&emsp;Java异常是Java提供的用于处理程序中错误的一种机制。

&emsp;&emsp;所谓错误是指在程序**运行**过程中发生的一些异常事件（如：除0溢出，数组下标越界，所要提取的文件不存在）。

&emsp;&emsp;Java程序的执行过程中如出现异常事件，可以生成一个**异常类对象**，该异常对象封装了异常事件的信息并将被提交给Java运行时系统，这个过程称为**抛出（throw)异常**。

&emsp;&emsp;当Java运行时系统接收到异常对象时，会寻找能处理这一异常的代码并把当前异常对象交给其处理， 这一过程称为**捕获（catch）异常**。
![](http://i.imgur.com/wTeOzI1.png)
&emsp;&emsp;将错误打印出来。**有catch必须有try!**

![](http://i.imgur.com/cXc8s8l.png)

###2.异常的分类
![](http://i.imgur.com/tiUf0em.png)

&emsp;&emsp;Throwable “万恶之源”

&emsp;&emsp;Error 虚拟机出错，处理不了（山路上走，山塌了，处理不了）

&emsp;&emsp;Exception 可以处理的异常（山路上走，车坏了，修好就可以走了）（JDK后写了throws）
![](http://i.imgur.com/RuAsy2h.png)

&emsp;&emsp;RuntimeException 经常会出的问题，可以catch也可以不catch。（开车，路上有小石子，不能总清理干净小石子再走）

![](http://i.imgur.com/e17nYQo.png)

###3.异常的捕获和处理
![](http://i.imgur.com/cjadv9j.png)
![](http://i.imgur.com/2A5oxvR.png)
![](http://i.imgur.com/7mctyX4.png)
![](http://i.imgur.com/6fPeTCK.png)

&emsp;&emsp;**catch到错误一定要做处理！！**不能把错误吞掉

&emsp;&emsp;处理不了的异常就都抛出，**thows Exception**,但尽量应该写try,catch

![](http://i.imgur.com/O4MXKL5.png)

###4.使用自定义的异常
![](http://i.imgur.com/L29qPkq.png)

###注意：
![](http://i.imgur.com/THGp98I.png)