/*
*��Ŀ����дһ������������һ��double�Ͷ�ά���飬�����е�Ԫ��ͨ�������ַ���������á����ַ�����������1,2;3,4,5;6,7,8��
*      ��Ӧ����Ϊ��d[0,0]=1.0 d[0,1]=2.0
*                  d[1,0]=3.0 d[1,1]=4.0 d[1,2]=5.0 
*                  d[2,0]=6.0 d[2,1]=7.0 d[2,2]=8.0
*/
public class analyseString {
	public static void main(String args[]){
		String s="1,2;3,4,5;6,7,8";
		
		String str[]=s.split(";");
		
		double d[][]=new double[str.length][];
		
		for(int i=0;i<str.length;i++){
			String str2[]=str[i].split(",");
			d[i]=new double[str2.length];  //!!!����һάһά��������Ŀռ�
			for(int j=0;j<str2.length;j++){
				d[i][j]=Double.parseDouble(str2[j]);
				System.out.print("d["+i+"]["+j+"]="+d[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
}
