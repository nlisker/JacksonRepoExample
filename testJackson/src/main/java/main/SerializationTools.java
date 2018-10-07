package main;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

import impls1.LandPlotImpl1;
import impls1.StructureImpl1;
import impls2.LandPlotImpl2;
import impls2.StructureImpl2;

public class SerializationTools {

	public String serialize(BuildPlan1 config) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerSubtypes(
				new NamedType(StructureImpl1.class, "Structure"),
				new NamedType(LandPlotImpl1.class, "LandPlot")
		);
		mapper.setSerializationInclusion(Include.NON_EMPTY);
		String ss = null;
		try {
			ss = mapper.writeValueAsString(config);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ss;
	}

	public BuildPlan2 deserialize(String string) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		mapper.registerSubtypes(
				new NamedType(StructureImpl2.class, "Structure"),
				new NamedType(LandPlotImpl2.class, "LandPlot")
		);
		mapper.registerModule(new ParameterNamesModule());
		try {
			return mapper.readValue(string, BuildPlan2.class);
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}
}