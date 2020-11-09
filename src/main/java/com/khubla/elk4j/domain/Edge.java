package com.khubla.elk4j.domain;

import java.util.*;

public class Edge {
	private final String id;
	private List<String> sources = null;
	private List<String> targets = null;
	private List<EdgeSection> sections = null;
	private List<Label> labels = null;

	public Edge(String id) {
		super();
		this.id = id;
	}

	public void addEdgeSection(EdgeSection edgeSection) {
		if (null == sections) {
			sections = new ArrayList<EdgeSection>();
		}
		sections.add(edgeSection);
	}

	public void addLabel(Label label) {
		if (null == labels) {
			labels = new ArrayList<Label>();
		}
		labels.add(label);
	}

	public void addSource(String source) {
		if (null == sources) {
			sources = new ArrayList<String>();
		}
		sources.add(source);
	}

	public void addTarget(String target) {
		if (null == targets) {
			targets = new ArrayList<String>();
		}
		targets.add(target);
	}

	public String getId() {
		return id;
	}

	public List<Label> getLabels() {
		return labels;
	}

	public List<EdgeSection> getSections() {
		return sections;
	}

	public List<String> getSources() {
		return sources;
	}

	public List<String> getTargets() {
		return targets;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}

	public void setSections(List<EdgeSection> sections) {
		this.sections = sections;
	}

	public void setSources(List<String> sources) {
		this.sources = sources;
	}

	public void setTargets(List<String> targets) {
		this.targets = targets;
	}
}
