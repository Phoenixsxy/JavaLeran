#<center>网络编程</center>

**网络编程！=网站编程**

###1.网络协议

&emsp;&emsp;说一样的语言，才可以交流。网络上两台主机可以互相沟通，因为说得是同一种语言，就是网络协议。网络通信必须有一些约定及通信协议。（对速率、传输代码、代码结构、传输控制步骤、出错控制等制定标准）

&emsp;&emsp;网络通信接口：为了使两个节点之间能进行对话，必须在它们之间建立通信工具（即接口），使彼此之间能进行信息交换。接口包括两部分：

&emsp;&emsp;硬件装置：实现节点之间的信息传递（网卡）

&emsp;&emsp;软件装置：规定双方进行通信的约定协议

![](http://i.imgur.com/GSVJyPl.png)

![](http://i.imgur.com/VicUeq6.png)

![](http://i.imgur.com/jMPWgPS.png)

![](http://i.imgur.com/fmpFqhi.png)

###2.IP协议
&emsp;&emsp;IP（Internet Protocol)协议是网际层的主要协议，支持网间互连的数据报通信。它提供主要功能有：

&emsp;&emsp;无连接数据报传送

&emsp;&emsp;数据报路由选择和差错控制

&emsp;&emsp;Ipv 4(Ipv 6 八个字节）

![](http://i.imgur.com/MaR3DW4.png)

&emsp;&emsp;子网掩码：它是一种用来指明一个IP地址的哪些位标识的是主机所在的子网，以及哪些位标识的是主机的位掩码。子网掩码不能单独存在，它必须结合IP地址一起使用。子网掩码只有一个作用，就是将某个IP地址划分成网络地址和主机地址两部分。

###3.TCP协议和UDP协议

![](http://i.imgur.com/aqciKnc.png)

>TCP像打电话一样，需要有回应。UDP仿佛是发电报一样，不需要等待回应。TCP可靠但是慢，UDP不可靠但是快。UDP可能会丢包，例如：视频语音。TCP一个包没接收到需要重发，不能丢失包，例如：登录。

&emsp;&emsp;路由器来选择走哪条路径，可能在路由器上丢包。

###4.Socket

&emsp;&emsp;一般网络编程就叫做Socket编程。

&emsp;&emsp;两个应用程序可通过一个双向的网络通信连接实现数据交换，这个双向链路的一端称为一个Socket。

&emsp;&emsp;Socket通常用来实现client-server连接。

&emsp;&emsp;java.net包中定义的两个类Socket和ServerSocket(实现TCP的）,分别用来实现双向连接的client和server端。

&emsp;&emsp;建立连接时所需的寻址信息为远程计算机的IP地址和端口号（端口指的是区别网络应用，端口号两个字节，最多有65536个端口号，1024以下端口不要占，系统可能随时会用，默认80端口是http的，21端口是ftp,25端口简单邮件发送协议SMTP,110 端口pop3收邮件协议）端口本身分TCP端口和UDP端口

###&emsp;&emsp;TCP
![](http://i.imgur.com/jOFZc4Y.png)
&emsp;&emsp;Server端一般是死循环，不停accept。accept方法是阻塞式的，如果没有客户端连接，就傻傻的等待。
![](http://i.imgur.com/9nMiAwt.png)
![](http://i.imgur.com/JgdFNDC.png)

###&emsp;&emsp;UDP

![](http://i.imgur.com/hv5QCHD.png)