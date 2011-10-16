 public class DListNode {
	
	protected int item;
	DListNode next,prev;
	
	public DListNode(Object item, DListNode prev, DListNode next) {
			this.next=next;
			this.prev=prev;
			this.item=item;
			
	}
	
	public DListNode getNext(){
	return next;
	}	
	public void setNext(DListNode next){
		this.next=next;
	}
	
	public DListNode getPrev(){
	return prev;
	}	
	public void setPrev(DListNode prev){
		this.prev=prev;
	}
	
	public int getItem(){
		return this.item;
	}
	public void setItem(int item){
		  this.item=item;
	}
	
	
}