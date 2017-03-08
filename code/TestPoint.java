class Point{
	double x;
	double y;
	double z;
	
	Point(double _x,double _y,double _z){
		x=_x;
		y=_y;
		z=_z;
	}
	
	void setX(double a){
		x=a;
	}
	
	void setY(double a){
		y=a;
	}
	
	void setZ(double a){
		z=a;
	}
	
	double distant( ){  
		return x*x+y*y+z*z;
	}
	
	void show( ){
		System.out.println("x:"+x+" y:"+y+" z:"+z);
	}
}

public class TestPoint{
	public static void main(String [] args){
		Point point = new Point(2,3,4);
		point.show();
		point.setX(1);
		point.setY(1);
		point.setZ(1);
		point.show();
		double dis=point.distant();
		System.out.println(dis);
	}
}