#<center>流(stream)</center>
###1.Java流式输入/输出原理

&emsp;&emsp;在Java程序中，对于数据的输入/输出操作以"流"（stream)方式进行；J2SDK提供了各种各样的“流”类，用以获取不同种类的数据；程序中通过**标准**的方法输入或输出数据。

&emsp;&emsp;java.io 包中定义了多个流类型（类或抽象类）来实现输入/输出功能；可以从不同的角度对其进行分类：

&emsp;&emsp;按数据流的方向不容可以分为输入流和输出流。

&emsp;&emsp;按处理数据单位不同可以分为字节流和字符流。

&emsp;&emsp;按照功能不同可以分为节点流和处理流。

&emsp;&emsp;节点流：可以从一个特定的数据源（节点）读写数据（如：文件，内存）

&emsp;&emsp;处理流：“连接”在已存在的流（节点流或处理流）之上，通过对数据的处理为程序提供更为强大的读写功能。

###2.具体的流

&emsp;&emsp;InputStream,继承自InputStream的流都是用于向程序中**输入**数据，且数据的单位为**字节**（8 bit)。

&emsp;&emsp;OutputStream，继承自OuputStream的流式用于程序中**输出**数据，且数据的单位为**字节**(8 bit)。

&emsp;&emsp;**Tip!**

>OutputStream的基本方法中有两个要注意：

>&emsp;&emsp;void close() throws IOException //关闭流释放内存资料

>&emsp;&emsp;void flush() throws IOException //将输出流中缓冲的数据全部写出到目的地

>&emsp;&emsp;一般先使用flush()，再使用close()。close直接将数据传输“管道”切断，容易造成数据流失（剩余的半桶水）。所以要先用flush()将缓冲的数据保存。

&emsp;&emsp;Reader，继承自Reader的流都是用于向程序中**输入**数据，且数据的单位为**字符**(16 bit)。

&emsp;&emsp;Writer,Writer的流都是用于程序中**输出**数据，且数据的单位为**字符**(16 bit)

####节点流

![](http://i.imgur.com/wrOAE1d.png)

&emsp;&emsp;例子：（流可以形象的想成水管）

&emsp;&emsp;**注意：管道用完要关闭！**

![](http://i.imgur.com/YCiUH7g.png)

####处理流

#####&emsp;&emsp;缓冲流

![](http://i.imgur.com/jBXFXCK.png)

![](http://i.imgur.com/icqUE4i.png)

####&emsp;&emsp;转换流

![](http://i.imgur.com/IqVWmWY.png) 

####&emsp;&emsp;数据流

&emsp;&emsp;DataInputStream和DataOutputStream分别继承自InputStream和OutputStream,它属于处理流，需要分别“套接”在InputStream和OutputStream类型的节点流上。

&emsp;&emsp;DataInputStream和DataOutputStream提供了可以存取与机器无关的Java原始类型数据（如：int,double等)的方法。

####&emsp;&emsp;Print流
&emsp;&emsp;PrintWriter和PrintStream都属于输出流，分别针对于字符和字节。

&emsp;&emsp;PrintWriter和PrintStream提供了重载的print &emsp;&emsp;Println方法用于多种数据类型的输出

&emsp;&emsp;PrintWriter和PrintStream的输出操作**不会抛出异常**，用户通过检测错误状态获取错误信息

&emsp;&emsp;PrintWriter和PrintStream有自动flush功能 

![](http://i.imgur.com/F3uWFM0.png)

>System.setOut(ps);将print的管道的位置改变了，之前默认是命令行窗口，现在改到ps路径下了。

####&emsp;&emsp;Objcet流

&emsp;&emsp;直接将Object写入或读出。 

>**Serializable接口**

>&emsp;&emsp;可以被序列化的

>&emsp;&emsp;标记性的接口（没有定义的方法）空接口，给编译器看的，表示可以序列化。

>&emsp;&emsp;要想被序列化必须implements这个接口。

>&emsp;&emsp;**transient**

>&emsp;&emsp;transient修饰的成员变量在序列化的时候不予考虑。

>&emsp;&emsp;**externalizable**接口

