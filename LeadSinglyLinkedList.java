public class LeadSinglyLinkedList {

public static void main(String abc[]){
		SList s = new SList();
		s.insertInFront(new Integer(11));
		s.insertInFront(new Integer(14));
		s.insertInFront(new Integer(14));
		s.insertInFront(new Integer(11));
		s.insertInFront(new Integer(12));
		s.insertInFront(new Integer(19));
		s.insertInFront(new Integer(14));
		
		/* all values */		
		System.out.println(s.toString());
		
		System.out.println("after removing duplicates ");
		
		
		/* using hashtables */
		s.removeDuplicatesUsingHashTables();
		
		/* all values */
		System.out.println(s.toString());
		
	
			s.insertInFront(new Integer(11));
			s.insertInFront(new Integer(14));
			s.insertInFront(new Integer(14));
			s.insertInFront(new Integer(11));
			s.insertInFront(new Integer(12));
			s.insertInFront(new Integer(19));
			s.insertInFront(new Integer(14));
			
			System.out.println("after adding new items ");
		
			/* all values */
			System.out.println(s.toString());
			
			System.out.println("after removing duplicates ");
			
		/* removing duplicates without hashtable using runners */
		s.removeDuplicatesWithoutBufferUsingRunners();
		
		/* all values */
		System.out.println(s.toString());

		/* showing nth node from last. here n=3 */
		System.out.println("3 node from last is ");
		System.out.println((s.nthNodeFromLast(3)).toString());
		
		s.insertInFront(new Integer(16));

		/* all values */
		System.out.println(s.toString());
		
		/* delete a node in the middle of a single linked list, given only access to that node. */
		s.deleteFromMiddleGivenAccessOnlyToMidde(s.getMiddle());
		
		/* all values */
 		System.out.println(s.toString());
		
		
		SList a = new SList();
		SList b = new SList();
		a.insertInFront(new Integer(5));
		a.insertInFront(new Integer(1));
		a.insertInFront(new Integer(3));
		
		b.insertInFront(new Integer(2));
		b.insertInFront(new Integer(9));
		b.insertInFront(new Integer(5));
		System.out.println("a is value is "+a.toString());
		System.out.println("b is value is "+b.toString());
		
	  SList sum=	s.add(a,b);
	/* since result will be reverse order i reverse list and show */
	sum.reverse(sum.getHead());
	System.out.println("sum is "+sum.toString());
 		
		
		
		
		
		
		
		
		
		
		
	
	}

}