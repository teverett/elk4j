package com.khubla.elk4j;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.khubla.elk4j.domain.*;

public class Test1 {
	@Test
	public void test11() {
		try {
			/*
			 * graph
			 */
			final Graph graph = new Graph("test");
			graph.addLayoutOption("elk.algorithm", "layered");
			/*
			 * nodes
			 */
			Node n1 = new Node("n1");
			n1.setWidth(30);
			n1.setHeight(30);
			graph.addNode(n1);
			Node n2 = new Node("n2");
			n2.setWidth(30);
			n2.setHeight(30);
			graph.addNode(n2);
			Node n3 = new Node("n3");
			n3.setWidth(30);
			n3.setHeight(30);
			graph.addNode(n3);
			/*
			 * edges
			 */
			Edge edge1 = new Edge("e1");
			edge1.addSource("n1");
			edge1.addTarget("n2");
			graph.addEdge(edge1);
			Edge edge2 = new Edge("e2");
			edge2.addSource("n1");
			edge2.addTarget("n3");
			graph.addEdge(edge2);
			/*
			 * marshall
			 */
			String json = ELKMarshaller.marshallGraph(graph);
			System.out.println(json);
			/*
			 * unmarshall
			 */
			final Graph graph2 = ELKMarshaller.unmarshallGraph(json);
			assertNotNull(graph2);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
