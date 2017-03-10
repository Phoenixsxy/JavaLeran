public class TestDateSort{
	public static void main(String args[]){
		Date [] days= new Date [5];
		days[0] = new Date(2006, 5, 4);
		days[1] = new Date(2006, 7, 4);
		days[2] = new Date(2008, 5, 4);
		days[3] = new Date(2004, 5, 9);
		days[4] = new Date(2004, 5, 4);
		
		//System.out.println(days[2].compare(days[0]));
		//System.out.println(days.length);
		quicksort(days,0,days.length-1);
		//System.out.println(days[0].Compare(days[1]));
		for(int i=0;i<days.length;i++){
			System.out.println(days[i].year+","+days[i].month+","+days[i].day);
		}
		
		Date d=new Date(2008, 5, 4);
		System.out.println(binarySearch(days, d));
		
	}
	
	public static void quicksort(Date[] a,int l,int r){  //快速排序法
		if(l<r){
			int flag=partition(a,l,r);
			quicksort(a,l,flag-1);
			quicksort(a,flag+1,r);
		}
		
	}
	
	public static int partition(Date[] a,int l,int r){
		Date pivot=a[l];
		while(l<r){
			while(l<r&&a[r].compare(pivot)>=0){
				r--;
			}
			if(l<r){
				a[l++]=a[r];
			}
			
			while(l<r&&a[l].compare(pivot)<0){
				l++;
			}
			if(l<r){
				a[r--]=a[l];
			}
			
		}
		a[l]=pivot;
		return l;
	}
	
	public static int binarySearch(Date [] a,Date d){ //二分查找法
		if(a.length==0){
			return -1;
		}
		int startPos = 0, endPos = a.length - 1;
		int mid = (startPos + endPos) / 2;
		while (startPos <= endPos) {
			
			if (a[mid].compare(d)==0) {
				return mid;
			}
			if(a[mid].compare(d)>0){
				endPos=mid-1;
			}
			if(a[mid].compare(d)<0){
				startPos=mid+1;
			}
			mid= (startPos + endPos) / 2;
		}

		return -1;
	}
}

class Date{
	int year,month,day;
	Date(int y,int m,int d){
		year=y;
		month=m;
		day=d;
	}
	
	public int compare(Date b){
		if(year>b.year){
			return 1;
		}
		else{
			if(year<b.year){
				return -1;
			}
			else{
				if(month>b.month){
					return 1;
				}	
				else{
					if(month<b.month){
						return -1;
					}
					else{
						if(day>b.day){
							return 1;
						}
						else{
							if(day<b.day){
								return -1;
							}
							else{
								return 0;
							}
						}
					}
				}
			}
		}
	}
}


