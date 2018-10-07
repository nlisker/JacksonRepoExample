package main;

import impls1.LandPlotImpl1;
import impls1.StructureImpl1;
import interfaces.LandPlot;
import interfaces.Structure.StructureType;

public class StateGenerator {

	public BuildPlan1 createState() {
		BuildPlan1 buildPlan1 = new BuildPlan1();

		LandPlotImpl1 landPlot = new LandPlotImpl1(LandPlot.LandType.GRASS);
		landPlot.setLoc(Point.get(0, 0));
		buildPlan1.getGrid().put(Point.get(0, 0), landPlot);

		StructureImpl1 structure = new StructureImpl1(0, 2, StructureType.TOWER);
		landPlot.setStructure(structure);
		structure.setLandPlot(landPlot);

		return buildPlan1;
	}
}