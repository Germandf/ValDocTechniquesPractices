package main;

public class Arc {

	private Node i;
	private Node j;
	private float w;
	
	public Arc() {
		super();
	}

	public Node getI() {
		return i;
	}

	public void setI(Node i) {
		this.i = i;
	}

	public Node getJ() {
		return j;
	}

	public void setJ(Node j) {
		this.j = j;
	}

	public float getW() {
		return w;
	}

	public void setW(float w) {
		this.w = w;
	}
	
	public void setExtremes(Node i, Node j, float w) {
		this.i = i;
		this.j = j;
		this.w = w;
	}
	
}
