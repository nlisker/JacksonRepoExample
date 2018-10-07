package impls2;

import lombok.Getter;
import lombok.Setter;

import interfaces.LandPlot;
import main.Point;

@Getter
@Setter
public class LandPlotImpl2 implements LandPlot {

	public LandPlotImpl2(Point point, LandType type) {
		loc = point;
		terrainType = type;
	}

	Point loc;

	LandType terrainType;

	StructureImpl2 structure;
}