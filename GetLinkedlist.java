
//Java program to iterate the elements
//in an LinkedList
	
import java.util.*;
	
public class GetLinkedlist{
	
	public static void main(String args[])
	{
		LinkedList<String> ll
			= new LinkedList<>();
	
		ll.add("canara");
		ll.add("college");
		ll.add(1, "engineering");
	
		// Using the Get method and the
		// for loop
		for (int i = 0; i < ll.size(); i++) {
	
			System.out.print(ll.get(i) + " ");
		}
	
		System.out.println();
	
		// Using the for each loop
		for (String str : ll)
			System.out.print(str + " ");
	}
}
