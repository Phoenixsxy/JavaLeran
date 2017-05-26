#<center>Date&Time</center>
</br>
![](http://i.imgur.com/prSZOHc.png)
![](http://i.imgur.com/h96G5p1.png)

&emsp;&emsp;System.currentTimeMillis();取当前的毫秒数。

&emsp;&emsp;**取当前系统时间：**

&emsp;&emsp;Date d = new Date();

&emsp;&emsp;Calendar c = Calendar.getInstance();

&emsp;&emsp;**字符串转时间：**

&emsp;&emsp;String s = "1970-12-30 08:24:37.0";

&emsp;&emsp;Timestamp ts = Timestamp.valueof(s);


&emsp;&emsp;**取时区：**

&emsp;&emsp;Calendar cJapan = new GregorianCalendar(TimeZone.getTimeZone("Japan");
