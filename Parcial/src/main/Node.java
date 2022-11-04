package main;

public class Node {

	private int id;
	private float g;
	
	public Node(int id, float g) {
		super();
		this.id = id;
		this.g = g;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getG() {
		return g;
	}

	public void setG(float g) {
		this.g = g;
	}
	
}
