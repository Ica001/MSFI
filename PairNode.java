
public class PairNode<T> {
  T x;
  T y;
  public PairNode(T x, T y) {
	this.x=x;
	this.y=y;
}
  @Override
	public String toString() {
		return "("+x+","+y+")";
	}
}
