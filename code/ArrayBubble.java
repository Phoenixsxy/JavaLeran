public class ArrayBubble{
	public static void main(String[] args){
		/*for(int i=0;i<args.length;i++){
			System.out.println(args[i]+" ");		
		}*/
		
		int[] a=new int[args.length];
		for(int i=0;i<args.length;i++){
			a[i]=Integer.parseInt(args[i]);			
		}
		print(a);
		/*int temp;
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<i;j++){
				if(a[i]>a[i+1]){
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		*/
		BubbleSort(a);
		print(a);
		/*for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}*/
	}
	private static void BubbleSort(int[] a){
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	}
	
	private static void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}