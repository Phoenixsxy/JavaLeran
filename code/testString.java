public class testString {
	public static void main(String args[]){
		String s="AaaaABBBBcc&^%adfsfdCCOOkk99876 _haHA";
		int up=0,low=0,no=0;
		
		
		
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			
			if(c>='a'&&c<='z'){ 
				low++;
			}
			else{
				if (c >= 'A' && c <= 'Z') {
					up++;
				}
				else{
					no++;
				}
			}
		}
		System.out.println("��дӢ����ĸ����"+up);
		System.out.println("СдӢ����ĸ����"+low);
		System.out.println("��Ӣ����ĸ����"+no);
		
		String sL="abcdefghijklmnopqrstuvwxyz";
		String sR="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		up=0;low=0;no=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			
			if(sL.indexOf(c)!=-1){ 
				low++;
			}
			else{
				if (sR.indexOf(c)!=-1) {
					up++;
				}
				else{
					no++;
				}
			}
		}
		System.out.println("��дӢ����ĸ����"+up);
		System.out.println("СдӢ����ĸ����"+low);
		System.out.println("��Ӣ����ĸ����"+no);
	}
}
