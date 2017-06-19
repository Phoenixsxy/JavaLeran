import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String [] args){
		//初步认识
		print("#".matches("."));//. 代表任何字符   a,#都正确
		print("aa".matches("aa"));
		print("aa".matches("a*"));//aa 正确 ab 错误     //*代表 0个或多个
		print("aaaa".matches("a+"));//+代表一个或多个
		print("aaaa".matches("a?"));//?代表0个或1个
		print("214523145234532".matches("\\d{3,100}"));//X{n} exactly n times //X{n,}至少n次    //X{n,m}至少n次不多于m次  
		//\d代表数字
		print("192.168.0.aaa".matches("\\d{1,3}\\.d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
		
		//范围
		print("192".matches("[0-2][0-9][0-9]"));//[]代表范围
		print("a".matches("[abc]"));//中括号中的一个
		print("a".matches("[^abc]"));//除了中括号中的一个
		print("A".matches("[a-zA-Z]"));//[a-z]|[A-Z] 取并集 //[a-z[A-Z]]三种都可以
		print("R".matches("[A-Z&&[RFG]]")); //取交集
		
		//认识\s \w \d \
		print(" \n\r\t".matches("\\s{4}"));//\s [ \t\n\x0B\f\r]
		print(" ".matches("\\S"));//\S [^\s]
		print("a_8".matches(("\\w{3}")));//\w [a-zA-Z_0-9] \W [^\w]
		print("\\".matches("\\\\"));//每一个\需要两个\来表示，这个其实是匹配一个\
		
		//boundary边界匹配
		print("hello sir".matches("^h.*"));//^The beginning of a line  h开头*代表0个或多个。任何字符
		print("hello sir".matches(".*ir$"));//$ The end of a line
		print("hello,sir".matches("^h[a-z]{1,3}o\\b.*"));//\b代表  单词边界 空格，回车，逗号什么都行
		
		//空白行
		print(" \n".matches("^[\\s&&[^\\n]]*\\n$"));
		
		//email
		print("123456789@qq.com".matches("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+"));
		
		//matches find lookingAt
		//matches匹配整个字符串
		
		Pattern pattern=Pattern.compile("\\d{3,5}");
		String string="123-34345-234-00";
		Matcher matcher=pattern.matcher(string);
		
		print(matcher.matches());//找到第四个-发现不是，但已经吃掉了这个结果，所以find从第五个开始找的
		matcher.reset();//吃的字符吐出来
		
		print(matcher.find());//找子串 找到后会把找到的子串删掉 true
		print(matcher.start()+"-"+matcher.end());//找到的位置
		print(matcher.find());//true
		print(matcher.start()+"-"+matcher.end());
		print(matcher.find());//true
		print(matcher.start()+"-"+matcher.end());
		print(matcher.find());//false
		//print(matcher.start()+"-"+matcher.end());必须找到才可以，要不报错
		
		print(matcher.lookingAt());//每次都从开头开始找
		print(matcher.lookingAt());
		print(matcher.lookingAt());
		print(matcher.lookingAt());	
		
		//replacement 字符串替换
		Pattern p =Pattern.compile("java",Pattern.CASE_INSENSITIVE);//忽略大小写
		Matcher m = p.matcher("java Java JAVa JaVa IloveJAVA you hateJava");
		print(m.replaceAll("JAVA"));
		
		//group直接打印出来正则表达式匹配的子串
		Pattern p1 = Pattern.compile("(\\d{3,5})([a-z]{2})");//分组是用小括号组成的 分了三组 数字一组，字母一组
		String string2= "123aa-34345bb-234cc-00";
		Matcher matcher2=p1.matcher(string2);
		while(matcher2.find()){
			print(matcher2.group(1));//只是数字
			print(matcher2.group(2));//只是字母
		}
	}
	
	public static void print(Object o){
		System.out.println(o);
	}
}
