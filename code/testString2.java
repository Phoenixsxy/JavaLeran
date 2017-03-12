/*
 * 题目：编写方法，输出在一个字符串中，指定字符串出现的次数。
 */
public class testString2 {
	public static void main(String args[]){
		String s="sunjavahpjavaokjavajjavahahajavajavagoodjava";
		String sub="java";
		
		int count=0;
		int p=0;
		while (s.indexOf(sub,p)!=-1) {
			count++;
			p=s.indexOf(sub, p)+sub.length();
		}
		
		System.out.println(sub+" 出现的次数为 "+count);
	}
}
