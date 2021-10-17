
//Java program to remove elements
//in a LinkedList
	
import java.util.*;
	
public class RemoveLinkedlist {
	
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<>();
	
		ll.add("canara");
		ll.add("college");
		ll.add(1, "Engineering");
	
		System.out.println(
			"Initial LinkedList " + ll);
	
		ll.remove(1);
	
		System.out.println(
			"After the Index Removal " + ll);
	
		ll.remove("canara");
	
		System.out.println(
			"After the Object Removal " + ll);
	}
}
