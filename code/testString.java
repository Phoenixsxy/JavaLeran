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
		System.out.println("大写英文字母数："+up);
		System.out.println("小写英文字母数："+low);
		System.out.println("非英文字母数："+no);
		
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
		System.out.println("大写英文字母数："+up);
		System.out.println("小写英文字母数："+low);
		System.out.println("非英文字母数："+no);
	}
}
