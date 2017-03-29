#<center>GUI</center>

###1.AWT
&emsp;&emsp;AWT(Abstract Windows Toolkit)包括了很多类和接口，用于Java Application的GUI(Graphics User Interface 图形用户界面)编程。

&emsp;&emsp;GUI的各种元素（如：窗口，按钮，文本框）由Java类来实现。

&emsp;&emsp;使用AWT所涉及的类一般在**java.awt**包及其子包中。**新的包在javax.swing中！**


###2.组件和容器
![](http://i.imgur.com/Qkv3YNN.png)
&emsp;&emsp;**所有可以显示出来的图形元素都叫component。**

![](http://i.imgur.com/cczE1Ig.png)

![](http://i.imgur.com/zuGh0S9.png)


&emsp;&emsp;**从frame里继承类可以自己定义成员变量，更加灵活，能继承的就不用new。**

![](http://i.imgur.com/kNMichh.png)

###3.布局管理器
![](http://i.imgur.com/FmVic9f.png)
![](http://i.imgur.com/UwbCEtD.png)
![](http://i.imgur.com/T45MqAd.png)
![](http://i.imgur.com/ApLjQjk.png)
![](http://i.imgur.com/m0asOEK.png)
![](http://i.imgur.com/uQkzyKu.png)
&emsp;&emsp;**frame p= new frame();&emsp;&emsp;p.pack(),frame自动打包，按照布局的大小。**

![](http://i.imgur.com/VsfWGuW.png)

###4.事件处理

![](http://i.imgur.com/HJHuuY5.png)
&emsp;&emsp;事件对象即需要监听的对象。事件可能是多种事件。

![](http://i.imgur.com/N1KIcNL.png)

####&emsp;&emsp;内部类
![](http://i.imgur.com/jcYAXF7.png)

###5.Java图形

####&emsp;&emsp;Graphics类

&emsp;&emsp;paint方法自动调用，graphics相当于画笔。当frame需要被重画的时候，paint方法就会被自动调用。例如：第一次出现窗口，改变窗口大小，遮盖又显示的时候

####&emsp;&emsp;鼠标事件适配器
![](http://i.imgur.com/AtKTElj.png)
###6.Window事件
![](http://i.imgur.com/yjLWKc4.png)