
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
	
	public void removeAll(T val) {
		if(head!=null) {
		if(head.next==null){lastNode=head=null;}
		else {
		Node<T> it=head;
		Node<T> temp=head;
		if(it.val==val) {
			head=head.next;
			it=head;
			temp=head;
		}
		else {
			while(it.next!=null) {
				if(it.next.val==val && it.next.next!=null) {
					it.next=it.next.next;
					
				}
				it=it.next;
			}
		}
		if(lastNode.val==val) {
		while(temp.next.next!=null) {
			temp=temp.next;
			
		}
		lastNode=temp;
		temp.next=null;
		
		}
		
	}
		}
		}

	public boolean contain(T val) {
		Node it=head;
		while(it!=null) {
			  if(it.val==val) return true;
			  it=it.next;
			}
		return false;
	}
}

