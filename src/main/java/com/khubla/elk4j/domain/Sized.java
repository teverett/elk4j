package com.khubla.elk4j.domain;

import java.util.*;

public class Sized {
	private Integer x;
	private Integer y;
	private Integer width;
	private Integer height;
	private List<Label> labels = null;

	public void addLabel(String label) {
		addLabel(new Label(label));
	}

	public void addLabel(Label label) {
		if (null == labels) {
			labels = new ArrayList<Label>();
		}
		labels.add(label);
	}

	public Integer getHeight() {
		return height;
	}

	public List<Label> getLabels() {
		return labels;
	}

	public Integer getWidth() {
		return width;
	}

	public Integer getX() {
		return x;
	}

	public Integer getY() {
		return y;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public void setY(Integer y) {
		this.y = y;
	}
}
