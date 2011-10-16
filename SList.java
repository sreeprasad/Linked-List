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
   	}
 
 
	public void removeDuplicatesUsingHashTables(){
		Hashtable h = new Hashtable();
		SListNode current = getHead().getNext();
		SListNode previous =null;
		while(current!=head){
			if(h.containsKey(current.getElement())){
				previous.setNext(current.getNext());
			}else{
				h.put(current.getElement(),true);
				previous=current;
			}
			current=current.getNext();
		}	
		
	}
	
	
	
	public void removeDuplicatesWithoutBufferUsingRunners(){
 		SListNode previous = getHead();
		SListNode current = previous.getNext();
		while(current!=head){
			SListNode runner = getHead().getNext();
			while(runner!=current){
		 			int temp= ((Comparable) runner.getElement()).compareTo(current.getElement());
					if(temp==0){
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
 
	
	
}