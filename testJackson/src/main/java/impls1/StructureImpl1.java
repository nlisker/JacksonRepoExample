package impls1;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import interfaces.Structure;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StructureImpl1 implements Structure {

	LandPlotImpl1 landPlot;

	StructureType type;

	int defaultRate;
	int rate;
	int timeToBuild;

	int owner;

	Status status = Status.BUILT;

	public StructureImpl1(int owner, int rate, StructureType type) {
		this.type = type;
		this.owner = owner;
		defaultRate = this.rate = timeToBuild = rate;
	}
}