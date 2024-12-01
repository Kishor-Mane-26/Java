import java.util.*;
class Employe
{
	private String name;
	
	public void setName(String name)
	{
		this.name=name; 
	}
	
	public String getName()
	{
		return name;
	}
	
}

public class EmployeDetailsApp
{
 public static void main (String x[])
 {
	Empolye e[] = new Employe[5];
	
    Scanner sc = new Sacnner (System.in);	
	System.out.println("* Employe Details *");
	for(int i=0;i<e.length;i++)
	{
		e[i] = new Employe();
		System.out.println("enter the element");
		String name = sc.nextLine();
		e[i].setName(name);
	}
	
	for(int i=0;i<e.length;i++)
	{
		e[i].getName();
	}
 }
}  
