

//Java program to add elements
//to a LinkedList
	
import java.util.*;
	
public class AddLinkedList {
	
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<>();
	
		ll.add("Canara");
		ll.add("College");
		ll.add(1, "Engineering");
	
		System.out.println(ll);
	}
}
