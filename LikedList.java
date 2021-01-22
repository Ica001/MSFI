
public class LikedList<T> {
    Node head;
   private Node lastNode=null;
   
   
	public void add(T x) {
	Node nod=new Node(x);
	if(head==null) {
		head=nod;
		lastNode=head;
	}
	else {
		lastNode.next=nod;
		lastNode=nod;
	}
		
	}
	
	public void show() {
		Node it=head;
		if (it==null) {
			System.out.println("null");
		} else {

		while(it!=null) {
		  System.out.println(it.val.toString());
		  it=it.next;
		}
		}
	}

	public String myToString() {
		String s="";
		Node it=head;
		
		while(it!=null) {
		  s+=it.val.toString()+" ";
		  it=it.next;
		}
		
		return s;
	}
	
	
	
}

