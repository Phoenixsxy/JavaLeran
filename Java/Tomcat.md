#<center>Tomcat</center>

&emsp;&emsp;**服务器：**连接客户，很多机器连接到一台机器上，读取资料或者做操作。

&emsp;&emsp;**Web服务器：**网页都是连到某台服务器上，资料从服务器上拿下来，再在自己的浏览器上解析。

&emsp;&emsp;**常用的Web服务器**：

&emsp;&emsp;IIS(Microsoft的web服务器）

&emsp;&emsp;Apache(linux平台用的最多，C语言写的）

&emsp;&emsp;Tomcat(Apache总项目中的一个，java写的）

&emsp;&emsp;**通常的动态网页技术**：（同一个页面，展现不同的结果）

&emsp;&emsp;CGI(Common GateWay Interface)

&emsp;&emsp;API常用的有（NSAPI，ISAPI)

&emsp;&emsp;ASP(Active Server Page)

&emsp;&emsp;PHP(Personal Home Page)

&emsp;&emsp;JSP/Servlet(Java Server Page)

###1.Servlet简介

&emsp;&emsp;Servlet是服务器小应用程序。Servlet是在服务器上的一个Java程序。由它传递给你html内容，给客户端提供服务。J2EE的API。Servlet一般在容器中运行。常见的Servlet容器Tomcat。

###2.Tomcat目录结构

&emsp;&emsp;bin/&emsp;&emsp;二进制可执行文件和脚本（启动，停止）

&emsp;&emsp;common/&emsp;&emsp;Catalina本身和web应用可加载的类目录（jar包）

&emsp;&emsp;conf/&emsp;&emsp;配置文件目录

&emsp;&emsp;logs/&emsp;&emsp;日志目录

&emsp;&emsp;server/&emsp;&emsp;服务器所需的类库目录

&emsp;&emsp;webapps/&emsp;&emsp;web应用所存放的目录applications

&emsp;&emsp;work/&emsp;&emsp;Tomcat的工作目录（存放jsp产生的class文件)

&emsp;&emsp;temp/&emsp;&emsp;存放临时产生的文件

###3.Tomcat配置文件

&emsp;&emsp;conf/server.xml&emsp;&emsp;服务器的主配置文件
![](http://i.imgur.com/PVlH0kY.png)

&emsp;&emsp;通常改端口在上图位置修改。

&emsp;&emsp;conf/web.xml&emsp;&emsp;定义所有web应用的配置（一般不用修改）

&emsp;&emsp;conf/tomcat-user.xml&emsp;&emsp;定义了tomcat用户的信息



