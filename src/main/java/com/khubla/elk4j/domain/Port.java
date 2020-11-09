package com.khubla.elk4j.domain;

public class Port extends Sized {
	private final String id;

	public Port(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
