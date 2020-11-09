package com.khubla.elk4j.domain;

import java.util.*;

public class Node extends Sized {
	private final String id;
	private List<Port> ports = null;
	private List<Node> children = null;
	private List<Edge> edges = null;

	public Node(String id) {
		super();
		this.id = id;
	}

	public void addEdge(Edge edge) {
		if (null == edges) {
			edges = new ArrayList<Edge>();
		}
		edges.add(edge);
	}

	public void addNode(Node node) {
		if (null == children) {
			children = new ArrayList<Node>();
		}
		children.add(node);
	}

	public void addPort(Port port) {
		if (null == ports) {
			ports = new ArrayList<Port>();
		}
		ports.add(port);
	}

	public List<Node> getChildren() {
		return children;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public String getId() {
		return id;
	}

	public List<Port> getPorts() {
		return ports;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	public void setPorts(List<Port> ports) {
		this.ports = ports;
	}
}
