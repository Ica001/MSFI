
public class Program {

	public static void main(String[] args) {
		Digraph<Integer> d=new Digraph<Integer>();
		d.addNode(1);
		d.addNode(2);
		d.addNode(3);
		d.addNode(4);
		d.addFromTo(1, 2);
		d.addFromTo(1, 3);
		d.addFromTo(4, 2);
		d.addFromTo(4, 1);
		System.out.println("-------------------------- Graph d---------------");
		d.show();
		
		System.out.println("----------------------------------------");
		
		Digraph<Integer> d2= new Digraph<Integer>();
		d2.addNode(1);
		d2.addNode(2);
		d2.addFromTo(1, 2);
		
		System.out.println("--------------------------Graph d2----------------");

		d2.show();
		System.out.println("-----------------------------------------");

		
		System.out.println("-------------------------- cartesian(d,d2)----------------");

		d.cartesian(d2).show();
		System.out.println("---------------------------------------");

		System.out.println("-------------------------- substract(d,d2)----------------");
	     d.substract(d2);
	     d.show();
			System.out.println("---------------------------------------");

}
}
