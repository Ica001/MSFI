
public class Program {

	public static void main(String[] args) {
		Digraph<Integer> digraph=new Digraph<Integer>();
		digraph.addNode(5);
		digraph.addNode(7);
		digraph.addNode(8);
		digraph.addFromTo(5, 8);
		digraph.addFromTo(5, 7);
		digraph.addFromTo(8, 5);
		digraph.addNode(5);
		digraph.show();
		
	}

}
