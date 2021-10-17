
//Java program to change elements
//in a LinkedList
	
import java.util.*;
	
public class SetLinkedList {
	
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<>();
	
		ll.add("TajMahal");
		ll.add("Agra");
		ll.add(1, "hh");
	
		System.out.println("Initial LinkedList " + ll);
	
		ll.set(1, "Is in");
	
		System.out.println("Updated LinkedList " + ll);
	}
}
