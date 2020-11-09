package com.khubla.elk4j.domain;

public class Label extends Sized {
	private final String text;

	public Label(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
