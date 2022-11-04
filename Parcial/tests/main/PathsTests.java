package main;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PathsTests {

	private Paths paths;
	
	@BeforeAll
	public void beforeAll() {
		paths = new Paths();
		var node1 = new Node(1, 50);
		var node2 = new Node(2, 25);
		var node3 = new Node(3, 20);
		var node4 = new Node(4, 15);
		var node5 = new Node(5, 55);
		var node6 = new Node(6, 65);
		var node7 = new Node(7, 45);
		var node8 = new Node(8, 30);
		var node9 = new Node(9, 10);
		var arc1 = new Arc(node1, node2, 25);
		var arc2 = new Arc(node3, node4, 10);
		var arc3 = new Arc(node5, node6, 35);
		var arc4 = new Arc(node7, node8, 20);
		var arc5 = new Arc(node9, node1, 15);
		var arc6 = new Arc(node3, node5, 25);
		var arc7 = new Arc(node7, node9, 50);
		var arc8 = new Arc(node2, node4, 25);
		var arc9 = new Arc(node5, node8, 10);
		paths.addArc(arc1);
		paths.addArc(arc2);
		paths.addArc(arc3);
		paths.addArc(arc4);
		paths.addArc(arc5);
		paths.addArc(arc6);
		paths.addArc(arc7);
		paths.addArc(arc8);
		paths.addArc(arc9);
	}
	
	@Test
	public void demoTestMethod() {
		assertTrue(true);
	}
	
}
