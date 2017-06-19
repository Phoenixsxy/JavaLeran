import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String [] args){
		//������ʶ
		print("#".matches("."));//. �����κ��ַ�   a,#����ȷ
		print("aa".matches("aa"));
		print("aa".matches("a*"));//aa ��ȷ ab ����     //*���� 0������
		print("aaaa".matches("a+"));//+����һ������
		print("aaaa".matches("a?"));//?����0����1��
		print("214523145234532".matches("\\d{3,100}"));//X{n} exactly n times //X{n,}����n��    //X{n,m}����n�β�����m��  
		//\d��������
		print("192.168.0.aaa".matches("\\d{1,3}\\.d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
		
		//��Χ
		print("192".matches("[0-2][0-9][0-9]"));//[]����Χ
		print("a".matches("[abc]"));//�������е�һ��
		print("a".matches("[^abc]"));//�����������е�һ��
		print("A".matches("[a-zA-Z]"));//[a-z]|[A-Z] ȡ���� //[a-z[A-Z]]���ֶ�����
		print("R".matches("[A-Z&&[RFG]]")); //ȡ����
		
		//��ʶ\s \w \d \
		print(" \n\r\t".matches("\\s{4}"));//\s [ \t\n\x0B\f\r]
		print(" ".matches("\\S"));//\S [^\s]
		print("a_8".matches(("\\w{3}")));//\w [a-zA-Z_0-9] \W [^\w]
		print("\\".matches("\\\\"));//ÿһ��\��Ҫ����\����ʾ�������ʵ��ƥ��һ��\
		
		//boundary�߽�ƥ��
		print("hello sir".matches("^h.*"));//^The beginning of a line  h��ͷ*����0���������κ��ַ�
		print("hello sir".matches(".*ir$"));//$ The end of a line
		print("hello,sir".matches("^h[a-z]{1,3}o\\b.*"));//\b����  ���ʱ߽� �ո񣬻س�������ʲô����
		
		//�հ���
		print(" \n".matches("^[\\s&&[^\\n]]*\\n$"));
		
		//email
		print("123456789@qq.com".matches("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+"));
		
		//matches find lookingAt
		//matchesƥ�������ַ���
		
		Pattern pattern=Pattern.compile("\\d{3,5}");
		String string="123-34345-234-00";
		Matcher matcher=pattern.matcher(string);
		
		print(matcher.matches());//�ҵ����ĸ�-���ֲ��ǣ����Ѿ��Ե���������������find�ӵ������ʼ�ҵ�
		matcher.reset();//�Ե��ַ��³���
		
		print(matcher.find());//���Ӵ� �ҵ������ҵ����Ӵ�ɾ�� true
		print(matcher.start()+"-"+matcher.end());//�ҵ���λ��
		print(matcher.find());//true
		print(matcher.start()+"-"+matcher.end());
		print(matcher.find());//true
		print(matcher.start()+"-"+matcher.end());
		print(matcher.find());//false
		//print(matcher.start()+"-"+matcher.end());�����ҵ��ſ��ԣ�Ҫ������
		
		print(matcher.lookingAt());//ÿ�ζ��ӿ�ͷ��ʼ��
		print(matcher.lookingAt());
		print(matcher.lookingAt());
		print(matcher.lookingAt());	
		
		//replacement �ַ����滻
		Pattern p =Pattern.compile("java",Pattern.CASE_INSENSITIVE);//���Դ�Сд
		Matcher m = p.matcher("java Java JAVa JaVa IloveJAVA you hateJava");
		print(m.replaceAll("JAVA"));
		
		//groupֱ�Ӵ�ӡ����������ʽƥ����Ӵ�
		Pattern p1 = Pattern.compile("(\\d{3,5})([a-z]{2})");//��������С������ɵ� �������� ����һ�飬��ĸһ��
		String string2= "123aa-34345bb-234cc-00";
		Matcher matcher2=p1.matcher(string2);
		while(matcher2.find()){
			print(matcher2.group(1));//ֻ������
			print(matcher2.group(2));//ֻ����ĸ
		}
	}
	
	public static void print(Object o){
		System.out.println(o);
	}
}
