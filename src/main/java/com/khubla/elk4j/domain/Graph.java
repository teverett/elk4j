package com.khubla.elk4j.domain;

import java.util.*;

public class Graph extends Node {
	private Map<String, String> layoutOptions = null;

	public Graph(String id) {
		super(id);
	}

	public void addLayoutOption(String k, String v) {
		if (null == layoutOptions) {
			layoutOptions = new HashMap<String, String>();
		}
		layoutOptions.put(k, v);
	}

	public Map<String, String> getLayoutOptions() {
		return layoutOptions;
	}

	public void setLayoutOptions(Map<String, String> layoutOptions) {
		this.layoutOptions = layoutOptions;
	}
}
