package impls2;

import lombok.Getter;
import lombok.Setter;

import interfaces.Structure;

@Getter
@Setter
public class StructureImpl2 implements Structure {

	public StructureImpl2(int owner, int rate, StructureType type) {
		this.owner = owner;
		defaultRate = rate;
		this.rate = rate;
		timeToBuild = rate;
		this.type = type;
	}

	int owner;

	Status status;

	LandPlotImpl2 landPlot;

	StructureType type;

	int defaultRate;

	int rate;

	int timeToBuild;
}