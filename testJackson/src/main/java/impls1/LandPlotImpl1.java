package impls1;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import interfaces.LandPlot;
import main.Point;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LandPlotImpl1 implements LandPlot {

	Point loc;

	LandType terrainType;

	public LandPlotImpl1(LandType type) {
		terrainType = type;
	}

	private StructureImpl1 structure;
}