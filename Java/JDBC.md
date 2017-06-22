#<center>JDBC</center>

import java.sql.*;
###1.JDBC

&emsp;&emsp;全称：Java Database Connectivity

&emsp;&emsp;&emsp;&emsp;Java数据库连接
    ![](http://i.imgur.com/hibgOJa.png)

###2.JDBC编程步骤
####①Load the Driver

&emsp;&emsp;不同数据库有不同的类库。Driver驱动，专门的类，提供给JDBC连到数据库上。

&emsp;&emsp;Class.forName("oracle.jdbc.driver.OracleDriver");

//把相关类名的类实例给new出来，在堆内存中分配了一个对象

&emsp;&emsp;Class.forName().newInstance()

&emsp;&emsp;new DriverName()

&emsp;&emsp;实例化时自动向DriverManager注册，不需显示调用DriverManager.registerDriver方法。

####②Connect to the DataBase

&emsp;&emsp;Connectin conn=DriverManger.getConnection();

###③Execute the SQL

&emsp;&emsp;Connection.CreateStatement();

&emsp;&emsp;//创建语句对象

&emsp;&emsp;Statement.executeQuery();

&emsp;&emsp;Statement.executeUpdate();

###④Retrieve the result data

&emsp;&emsp;循环取得结果

&emsp;&emsp;ResultSet rs=Statement.executeQuery();

&emsp;&emsp;while(rs.next())

###⑤show the result data

&emsp;&emsp;将数据库中的各种类型转换为Java中的类型(getXXX)方法。

###⑥Close

&emsp;&emsp;后开的先关。

&emsp;&emsp;close the resultset / close the statement / close the connection

&emsp;&emsp;**!!!注意try catch**

###3.PreparedStatement
![](http://i.imgur.com/ldvIubg.png)

&emsp;&emsp;可以灵活指定SQL语句中的变量

###4.CallableStatement

![](http://i.imgur.com/GAlVHwS.png)

###5.批处理

![](http://i.imgur.com/pqeafNr.png)

&emsp;&emsp;batch批的意思

###6.Transaction

&emsp;&emsp;任何一条DML语句，执行的时候会自动提交。

&emsp;&emsp;conn.setAutoCommit(false);

&emsp;&emsp;conn.commit();

&emsp;&emsp;conn.rollback();

&emsp;&emsp;//出异常的时候，update的时候rollback

&emsp;&emsp;conn.setAutoCommit(true);

&emsp;&emsp;事务(Transaction)是访问并可能更新数据库中各种数据项的一个程序执行单元(unit)。例如：在关系数据库中，一个事务可以是一条SQL语句，一组SQL语句或整个程序。

###7.可滚动的结果集
![](http://i.imgur.com/oo9NJvG.png)

&emsp;&emsp;rs.getRow()返回值可以确定一共有多少条记录
