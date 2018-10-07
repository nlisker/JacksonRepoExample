package interfaces;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(as = LandPlot.class)
public interface LandPlot extends Entity {

	enum LandType {
		GRASS, DIRT, ROCKS
	}

	LandType getTerrainType();

	Structure getStructure();
}