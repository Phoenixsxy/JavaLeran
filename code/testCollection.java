import java.util.*;

public class testCollection {
	public static void main(String args[]){
		Collection c= new ArrayList();
		c.add("hello");
		c.add(new Name("f1","l1"));
		c.add(new Integer(100));
		
		System.out.println(c.size());
		System.out.println(c);
		
		c.remove("hello");
		c.remove(new Integer(100));
		c.remove(new Name("f1","l1"));
		
		System.out.println(c.size());
		System.out.println(c);
	}
}

class Name implements Comparable{//ʵ��comparable�ӿڣ�����˭��˭С
	private String firstName,lastName;
	public Name(String first,String last){
		this.firstName=first;
		this.lastName=last;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return firstName+" "+lastName;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Name){// object instanceof class �Ƿ���class��ʵ��
			Name name=(Name) obj;
			return (firstName.equals(name.firstName))&&(lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}//equals����д��ʾ�Ƚ��������ã���Զ��������ͬ
	
	public int hashCode(){
		return firstName.hashCode();
	}//����������ֵ��ʱ�������дhashCode

	public int compareTo(Object o){
		Name n=(Name) o;
		int lastCmp=lastName.compareTo(n.lastName);//lastName��string��stringʵ���˽ӿ�
		return (lastCmp!=0?lastCmp:firstName.compareTo(n.firstName));
	}
}
