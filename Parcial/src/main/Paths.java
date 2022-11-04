package main;

import java.util.ArrayList;
import java.util.List;

public class Paths {

	private List<Arc> arcs;
	private List<Node> nodes;
	
	public Paths() {
		this.arcs = new ArrayList<Arc>();
		this.nodes = new ArrayList<Node>();
	}
	
	public Paths(List<Arc> arcs, List<Node> nodes) {
		super();
		this.arcs = arcs;
		this.nodes = nodes;
	}

	public List<Arc> getArcs() {
		return arcs;
	}

	public void setArcs(List<Arc> arcs) {
		this.arcs = arcs;
	}

	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	
	public Node[] getEcoPath(int nodeI, int nodeJ) {
		return null;
	}
	
	public Node[] getWorstPath(int nodeI, int nodeJ) {
		return null;
	}
	
	public float getEnergy(Node[] nodes) {
		return 0;
	}
	
	public void addArc(Arc arc) {
		this.arcs.add(arc);
	}
	
}
