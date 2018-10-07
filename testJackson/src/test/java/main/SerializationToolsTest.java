package main;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class SerializationToolsTest {

	@Test
	public void testSerializeCycle() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			serializeCycle();
		}
	}

	@Test
	public void serializeCycle() {
		BuildPlan1 serverState = new StateGenerator().createState();
		System.out.println(serverState);
		System.out.println();

		SerializationTools tools = new SerializationTools();
		String json = tools.serialize(serverState);
		System.out.println(json);
		System.out.println();

		try {
			BuildPlan2 clientState = tools.deserialize(json);
			System.out.println(clientState);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
