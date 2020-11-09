package com.khubla.elk4j;

import java.io.*;

import com.google.gson.*;
import com.khubla.elk4j.domain.*;

public class ELKMarshaller {
	private static Gson gson = new Gson();

	public static String marshallGraph(Graph graph) throws IOException {
		if (null != graph) {
			return gson.toJson(graph);
		} else {
			return null;
		}
	}

	public static Graph unmarshallGraph(String json) throws IOException {
		if (null != json) {
			return gson.fromJson(json, Graph.class);
		} else {
			return null;
		}
	}
}
