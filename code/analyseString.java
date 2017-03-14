/*
*题目：编写一个方法，返回一个double型二维数组，数组中的元素通过解析字符串参数获得。如字符串参数：“1,2;3,4,5;6,7,8”
*      对应数组为：d[0,0]=1.0 d[0,1]=2.0
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
			d[i]=new double[str2.length];  //!!!可以一维一维分配数组的空间
			for(int j=0;j<str2.length;j++){
				d[i][j]=Double.parseDouble(str2[j]);
				System.out.print("d["+i+"]["+j+"]="+d[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
}
