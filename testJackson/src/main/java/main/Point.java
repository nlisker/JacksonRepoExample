package main;

import java.io.IOException;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Point {

	private final int x, y;

	public static Point get(int x, int y) {
		Point point = new Point(x, y);
		return point;
	}


	@Override
	public String toString() {
		return "(" + x + ", " + y +")";
	}

	public static class Deserializer extends KeyDeserializer {

		@Override
		public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
			String[] strings = key.replaceAll("[()]", "").split(", ");
			int x = Integer.parseInt(strings[0]);
			int y = Integer.parseInt(strings[1]);
			return Point.get(x, y);
		}
	}
}