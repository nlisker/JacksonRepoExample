package main;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import interfaces.LandPlot;

@Getter
@Setter
@ToString
public abstract class BuildPlan<T extends LandPlot> {

	@JsonDeserialize(keyUsing = Point.Deserializer.class)
	protected Map<Point, T> grid = new HashMap<>();
}