import java.util.*;
abstract class Area
{
	abstract void calArea();
}

class Rectangle extends Area
{
	int l,b;
	
	void setLengBre(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	
	void calArea()
	{
		int res = l*b;
		System.out.println("The area of rectangle is : "+res);
	}
}

class Circle extends Area
{
	float rad;
	
	void setRad(float rad)
	{
		this.rad=rad;
	}
	void calArea()
	{
		float res = rad*rad*3.14f;
		System.out.println("The area of circle is : "+res);
	}
}

public class AreaApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		int l = sc.nextInt();
		System.out.println("Enter the breadth of rectangle");
		int b = sc.nextInt();
		
		System.out.println("Enter the radius of circle");
		float rad = sc.nextFloat();
		
		Rectangle r = new Rectangle();
		r.setLengBre(l,b);
		r.calArea();
		
		Circle c = new Circle();
		c.setRad(rad);
		c.calArea();
	}
}