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

class Name implements Comparable{//实现comparable接口，定义谁大谁小
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
		if(obj instanceof Name){// object instanceof class 是否是class的实例
			Name name=(Name) obj;
			return (firstName.equals(name.firstName))&&(lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}//equals不重写表示比较两个引用，永远不可能相同
	
	public int hashCode(){
		return firstName.hashCode();
	}//当被当作键值的时候必须重写hashCode

	public int compareTo(Object o){
		Name n=(Name) o;
		int lastCmp=lastName.compareTo(n.lastName);//lastName是string，string实现了接口
		return (lastCmp!=0?lastCmp:firstName.compareTo(n.firstName));
	}
}
