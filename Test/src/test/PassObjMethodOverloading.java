package test;
class A{
	public int x, y, z;
	
	
	A(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	A( int z){
		this.z =z;
	}
	
	void sum(A obj) {
		System.out.println( obj.x + obj.y);
	}
	
	void sum(A obj, A obj1) {
		System.out.println( obj.x + obj.y +obj1.z);
		
		
	}
	
	
}

public class PassObjMethodOverloading {
	public static void main(String args[])
	{
		A obj = new A(2, 3);
		obj.sum(obj);
		A obj1 = new A(8);
		obj.sum(obj, obj1);
	}
	
	

}
