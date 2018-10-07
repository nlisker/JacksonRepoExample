package interfaces;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(as = Structure.class)
public interface Structure extends Entity {

	public static enum Status {
		BUILT, BUILDING, PLANNED;
	}

	public enum StructureType {
		HOUSE, TOWER, LIBRARY;
	}

	LandPlot getLandPlot();

	int getOwner();

	Status getStatus();

	StructureType getType();

	int getDefaultRate();

	int getRate();

	int getTimeToBuild();
}