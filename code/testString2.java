/*
 * ��Ŀ����д�����������һ���ַ����У�ָ���ַ������ֵĴ�����
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
		
		System.out.println(sub+" ���ֵĴ���Ϊ "+count);
	}
}
