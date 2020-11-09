package com.khubla.elk4j;

import org.junit.jupiter.api.*;

public class Test1 {
	@Test
	public void test11() {
		try {
			// final GraphmlType graphmlType = new GraphmlType();
			/*
			 * marshall
			 */
			// final ByteArrayOutputStream baos = new ByteArrayOutputStream();
			// ELKMarshaller.exportGraph(graphmlType, baos);
			// final String marshalled = baos.toString();
			/*
			 * unmarshall
			 */
			/// final ByteArrayInputStream bais = new ByteArrayInputStream(marshalled.getBytes());
			// final GraphmlType graphmlType2 = ELKMarshaller.importGraph(bais);
			// assertNotNull(graphmlType2);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
