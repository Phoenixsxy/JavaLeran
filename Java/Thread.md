#<center>线程</center>

###1.基本概念

&emsp;&emsp;线程是一个程序内部的顺序控制流。

>线程和进程的区别：

><ul>
><li>每个进程都有独立的独立的代码和数据空间（进程上下文），进程间的切换会有较大的开销</li>
><li>线程可以看成是轻量级的进程，同一类线程共享代码和数据空间，每个线程有独立的运行栈和程序计数器（PC），线程切换的开销小</li>
><li>多进程：在操作系统中能同时运行多个任务（程序）</li>
><li>多线程：在同一应用程序中有多个顺序流同时执行</li>
><li>进程是静态的概念（机器的一个exe文件，class文件），放到代码区，是一个进程准备开始，但还没有开始执行，本身不能动。平时说的开始执行是主线程开始执行了，main开始。实际运行的都是线程。</li>

&emsp;&emsp;**CPU速度很快，其实在同一时间只能执行一个线程，分成许多时间片，分别执行许多线程，人类感觉是同时执行的。（除非有双CPU，双核是真正的多线程）**

&emsp;&emsp;Java的线程是通过java.lang.Thread类来实现的。VM启动时，会有一个由主方法（public static void main(){})所定义的线程。可以通过Thread的实例来创建新的线程。每个线程都是通过某个特定Thread对象所对应的方法run()来完成其操作的，方法run()称为线程体。通过调用Thread类的start()方法来启动一个线程。

![](http://i.imgur.com/0m9WABz.png)
&emsp;&emsp;线程实现了并行运行。
![](http://i.imgur.com/pxu77Lj.png)
&emsp;&emsp;这样是方法调用，要区别于线程。

###2.线程状态转换

![](http://i.imgur.com/l2yzKZj.png)

###3.线程控制基本方法

![](http://i.imgur.com/1BBiiaX.png)
>阻塞，运行，就绪叫活着，终止，new出来没启动叫死了

![](http://i.imgur.com/EslRvVy.png)
>sleep方法必须catch （InterruptedException e)。

####&emsp;&emsp;Join方法

&emsp;&emsp;将线程合并，和方法调用类似，执行完合并的线程，才能执行主线程。会抛出**InterruptedExcetpion**。

####&emsp;&emsp;yield方法

&emsp;&emsp;让出CPU，给其他线程执行的机会

###4.线程的优先级别

&emsp;&emsp;Java提供一个线程调度器来监控程序中启动后进入就绪状态的所有线程。线程调度器按照线程的优先级决定应调度哪个线程来执行。

&emsp;&emsp;线程的优先级用数字表示，范围从1到10，一个线程的缺省优先级是5。
![](http://i.imgur.com/vMVBwXS.png)

###5.线程同步

![](http://i.imgur.com/RHJaEMS.png)

&emsp;&emsp;TestDeadLock.java示意图

&emsp;&emsp;td1需要o2,td2需要o1,但同时两个各自锁住现在自己拥有的，所以无法进行下去，造成死锁。
![](http://i.imgur.com/yMOPHWE.png)


&emsp;&emsp;TT.java
![](http://i.imgur.com/yswJ8Gz.png)
&emsp;&emsp;结果为：
![](http://i.imgur.com/O0LFeOx.png)

&emsp;&emsp;另外的线程绝对不能执行被锁定的对象，但是另一个线程可以访问没有锁定的方法。

&emsp;&emsp;**两个方法应用了同一个值，为了避免相互影响，必须都加同步synchronized！！！**

>**Wait()和Sleep()区别**

>&emsp;&emsp;wait()停止的时候，锁不归自己所有。sleep()休息的时候，锁还抱着，不放松。

>&emsp;&emsp;wait()方法是Object类的方法。sleep()方法是Thread类的方法。