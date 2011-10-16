public class LeadFile{
	
	public static void main(String abc[]){
		DList d = new DList();
		/*d.insertFront(new Integer(3));
		d.insertFront(new Integer(4));
		d.insertFront(new Integer(5));
		System.out.println(d.ToString());
		System.out.println("Last item is " +d.getLast());
		System.out.println("First item is "+d.getFirst()); */
		//d.insertFront(22);
		d.insertFront(33);
		d.insertFront(22);
		d.insertFront(11);
		d.insertFront(24);
		//d.insertFront(22);
		System.out.println(d.ToString());
		//d.sortInsertionAsce();
		//System.out.println(d.ToString());
		//d.mergeSort(d,d.getHead().getNext(),d.getSize());
		//d.dmerge(d);
		//System.out.println("after merging");
		//System.out.println(d.ToString());
		/*d=null;
		DList cd = new DList();
		try{
		d.checkPosition(cd.getHead());
	}catch(Exception e){} */
	
		//System.out.println("before reversing "+ d.ToString());
		//d.reverseDList(d);
		//System.out.println("after reversing "+ d.ToString());
		System.out.println("before insertion sort "+d.ToString());
		d.insertSortMe(d);
		System.out.println("after sorting "+d.ToString());
		
	
	}
	
}