public class SListNode{
	
	Object o;
	SListNode next;
	
	/* constructor */
	public SListNode(SListNode next,Object o){
		this.o=o;
		this.next=next;
	}
	
	/*getters and setters */
	
	public Object getElement(){
		return o;
	}
	public void setElement(Object o){
		this.o=o;
	}
	
	public SListNode getNext(){
		return next;
	}
	public void setNext(SListNode next){
		this.next=next;
	}
	
	/*getters and setters ends */
	
}