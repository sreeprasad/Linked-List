public class LeadSinglyLinkedList {

public static void main(String abc[]){
		SList s = new SList();
		//s.first(new Integer(11));
		s.insertInFront(new Integer(11));
		//System.out.println("first element is "+s.getFirstElement().toString());
		s.insertInFront(new Integer(14));
		//System.out.println("first element is "+s.getFirstElement().toString());
		s.insertInFront(new Integer(14));
		s.insertInFront(new Integer(11));
		s.insertInFront(new Integer(12));
		s.insertInFront(new Integer(19));
		s.insertInFront(new Integer(14));		
		System.out.println(s.toString());
		s.removeDuplicates();
		System.out.println(s.toString());
		
}

}