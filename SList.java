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
 
 
	public void removeDuplicates(){
		SListNode justBeforeCurrent = getHead();
		SListNode current = head.getNext();
		Hashtable h = new Hashtable();
		while(current!=head){
			//if(!h.get(current.getElement())){
				if(!h.containsKey(current.getElement())){
				h.put(current.getElement(),true);
				current=current.getNext();
				justBeforeCurrent=justBeforeCurrent.getNext();
			}else{
				current=current.getNext();
				justBeforeCurrent.setNext(current);
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