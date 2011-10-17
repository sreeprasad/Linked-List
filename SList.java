import java.util.Hashtable;
public class SList{
	
	SListNode head;
	int size;
	
	public SList(){
		head = createSListNode(null,new Integer(0));
  		head.setNext(head);
		size=0;
	}
	
	public SListNode createSListNode(SListNode node, Object o){
		return new SListNode(node,o);
	}
	
	
	public SListNode getHead(){
		return head;
	}
	
	public Object getFirstElement(){
		return head.getNext().getElement();
	}
	 
	
	public void insertInFront(Object o){
		SListNode node= new SListNode(head.getNext(),o);
		head.setNext(node);
		size++;
   	}
 
 

	/* remvoving duplicates using hashtables 
	* code:
	*  if hashtable has no entry add key as node.element and value as true
	*  if hashtable has entry  move previous to current node's next node
	*  repeat above 2 steps untill current == head (because this is circularly linked singly linked list)
	*/
	
	public void removeDuplicatesUsingHashTables(){
		Hashtable h = new Hashtable();
		SListNode current = getHead().getNext();
		SListNode previous =null;
		while(current!=head){
			if(h.containsKey(current.getElement())){
				previous.setNext(current.getNext());
				size--;
			}else{
				h.put(current.getElement(),true);
				previous=current;
			}
			current=current.getNext();
		}	
		
	}
	
	/* removing duplicates without hashtable
	* i dont know how to to write this in words but this is the basic idea. 
	* code::
	* previous = head and current = previous.next
	* iterate untill current == head ( because this is circular single list)
	* 	runner = head.next
	* 	iterate untill runner ==current
	*		if runner.element == current.element
	*			temp = current.next
	*			previous.next=temp
	*			current=temp
	*			break from iteration
	*		runner=runner.next
	*		**** end of inner loop ****
	*  if runner == current
	* 		previous =current
	*       current=current.next
	*/
	
	public void removeDuplicatesWithoutBufferUsingRunners(){
 		SListNode previous = getHead();
		SListNode current = previous.getNext();
		while(current!=head){
			SListNode runner = getHead().getNext();
			while(runner!=current){
		 			int temp= ((Comparable) runner.getElement()).compareTo(current.getElement());
					if(temp==0){
						size--;
 					SListNode node = current.getNext();
					previous.setNext(node);
					current=node;
					break;
				}
					runner=runner.getNext();	
			}
			if(current==runner){
				previous=current;
				current=current.getNext();
 
			}
			
		}
		
		
		
	}
	
	/* CODE::
	* current is head.next
	* move current n nodes forward
	* nodetofind is head.next
	* iterate both nodetofind and current untill current== head
	* nodetofind is now n nodes from last
	* return node.element
	*/
	
	public Object nthNodeFromLast(int n){
		
		SListNode current = getHead().getNext();
		for(int i=0;i<n;i++){
			current=current.getNext();
		}
		SListNode nodeToFind =getHead().getNext();
		while(current!=head){
			nodeToFind=nodeToFind.getNext();
			current=current.getNext();
		}
		return nodeToFind.getElement();
	}
	
	/* delete a node in the middle of a single linked list, given only access to that node.
	* CODE::
	*  if middle.next == head or middle== null or head == null return null
	*  else	
	*		node = middle.next
	*		replace middle's element and next values with node's element and node's next value
	*   ** essentially you are replacing middle with middle's next node and removing middle's next node **
	*/
	public void deleteFromMiddleGivenAccessOnlyToMidde(SListNode middle){
		if((middle.getNext()==getHead()) || (middle==null) || (getHead()==null))
			System.out.println("incorrect middle ");
 		else{
	System.out.println("middle value is "+middle.getElement().toString());
	 	  SListNode node = middle.getNext();
		middle.setElement(node.getElement());
		middle.setNext(node.getNext());
			size--;
		}
	}
	
	/* get size */
	public int getSize(){
		return size;
	}
	
	/* Add 2 list
	* curent1 = a.head.next
	* curent2 = b.head.next
	* carry=0
	* newSum = carry+current1+current2
	* if(newSum>10) sum.insert(newSum-10) and carry =1
	* else sum.insert(newSum) and carry=0
	* repeat above 3 steps untill current1.next!=a.head and current2.next!=b.head( this is bec a and b are circularly linked list)
	*/
	public SList add(SList a,SList b){
		
		SList sum = new SList();
		
		SListNode current1= a.getHead().getNext();
		SListNode current2= b.getHead().getNext();
 		
		int carry=0;
		int newSum=0;
		while ((current1!=a.getHead())&& (current2!=b.getHead())){
			
			System.out.println("adding "+current1.getElement().toString()+" with "+ current2.getElement().toString()+ " with carry "+ carry);
			newSum = carry+(Integer)current1.getElement()+(Integer)current2.getElement();
 			if(newSum>=10){
				sum.insertInFront(new Integer(newSum)-10);
				carry=1;
			}else{
			sum.insertInFront(new Integer(newSum));
				carry=0; 
			}
		
			current1=current1.getNext();
			current2=current2.getNext();
			System.out.println("current1' next is head is "+(current1.getNext()==a.getHead()) +" and current2's next is head is " + (current2.getNext()==b.getHead()));
 		
		}
  		return (sum);
	}
	
	public SListNode reverse(SListNode current ){
		if(current.getNext()==getHead()){
			getHead().setNext(current);
			return current;
		}
	 
		SListNode second = current.getNext();
 		current.setNext(null);
		SListNode reverseListNode = reverse(second);
		second.setNext(current);
		return reverseListNode;
	}
	 
	
	
	public String toString(){
		String result ="";
		SListNode current = getHead().getNext();
		while(current!=head){
			//System.out.println("element is "+ current.getElement().toString());
			result+=current.getElement().toString()+",";
			current=current.getNext();
		}
		result="[ "+result.substring(0,result.length()-1)+" ]";
		return result;
	}
 	/* get middle of slist */
	public SListNode getMiddle(){
		SListNode current = getHead().getNext();
		System.out.println("size is "+getSize());
		for(int i=0;i<getSize()/2;i++){
			current=current.getNext();
		}
       return current;
 	}
	
}