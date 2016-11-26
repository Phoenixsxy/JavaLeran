class Student{
	int id;
	Student left;
	Student right;
	
	
}

class Circle{
	Student first;
	Student last;
	int length=0;
	
	Circle(int num){
		for(int i=0;i<num;i++){
			add();
		}
	}
	
	void add(){
		Student a = new Student();
		a.id=length;
		if(length<=0){
			a.left=a;
			a.right=a;
			first=a;
			last=a;
			
		}
		else{
			a.left=last;
			a.right=first;
			first.left=a;
			last.right=a;
			last=a;
		}
		length++;
	}
	
	void quit(Student a){
		if(length<=0){
			return;
		}
		else{
			if(length==1){
				first=last=null;
			}
			else{
				a.left.right=a.right;
		        a.right.left=a.left;
				
				if(a==first){
					first=a.right;
				}else if(a==last){
					last=a.left;
				}
			}
			length--;
		}
	}
}

public class Count3Quit{
	public static void main(String[] args){
		Circle c=new Circle(500);
		int jishu=0;
		Student a=c.first;
		while(c.length>1){
			jishu++;
			if(jishu==3){
				jishu=0;
				c.quit(a);
			}
			a=a.right;
		}
		System.out.println(c.first.id);
	}
}