package main;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PathsTests {

	private Paths paths;
	private List<Arc> arcs;
	private List<Node> nodes;
	
	@BeforeAll
	public void beforeAll() {
		arcs = new ArrayList<Arc>();
		nodes = new ArrayList<Node>();
		nodes.add(new Node(1, 50));
		nodes.add(new Node(2, 25));
		nodes.add(new Node(3, 20));
		nodes.add(new Node(4, 15));
		nodes.add(new Node(5, 55));
		nodes.add(new Node(6, 60));
		nodes.add(new Node(7, 45));
		nodes.add(new Node(8, 30));
		nodes.add(new Node(9, 10));
		arcs.add(new Arc(nodes.get(0), nodes.get(1), 25));
		arcs.add(new Arc(nodes.get(2), nodes.get(3), 10));
		arcs.add(new Arc(nodes.get(4), nodes.get(5), 35));
		arcs.add(new Arc(nodes.get(6), nodes.get(7), 20));
		arcs.add(new Arc(nodes.get(8), nodes.get(0), 15));
		arcs.add(new Arc(nodes.get(2), nodes.get(4), 25));
		arcs.add(new Arc(nodes.get(6), nodes.get(8), 50));
		arcs.add(new Arc(nodes.get(1), nodes.get(3), 25));
		arcs.add(new Arc(nodes.get(4), nodes.get(7), 10));
		paths = new Paths(arcs, nodes);
	}
	
	@Test
	public void getEcoPath_shouldReturnEcoPath() {
		var expectedNodes = new Node[2];
		expectedNodes[0] = nodes.get(0);
		expectedNodes[1] = nodes.get(1);
		
		var nodes = paths.getEcoPath(1, 9);
		
		assertArrayEquals(expectedNodes, nodes);
	}
	
	@Test
	public void getWorstPath_shouldReturnWorstPath() {
		var expectedNodes = new Node[2];
		expectedNodes[0] = nodes.get(0);
		expectedNodes[1] = nodes.get(1);
		
		var nodes = paths.getWorstPath(1, 9);
		
		assertArrayEquals(expectedNodes, nodes);
	}
	
	@Test
	public void getEnergy_shouldReturnCorrectEnergy() {
		var expectedEnergy = 50;
		Node[] nodesParam = new Node[2];
		nodesParam[0] = nodes.get(0);
		nodesParam[1] = nodes.get(0);
		
		var energy = paths.getEnergy(nodesParam);
		
		assertEquals(energy, expectedEnergy, 0);
	}
	
}
