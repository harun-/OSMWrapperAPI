package com.bachelor.osm;

import java.util.ArrayList;
import java.util.Map;

public class OSMWay {

	private final String id;
	
	private final ArrayList<String> refNodesIDs;
	
	private final Map<String, String> tags;
	
	private final String version;

	public OSMWay(String id, ArrayList<String> refNodesIDs,
			Map<String, String> tags, String version) {
		this.id = id;
		this.refNodesIDs = refNodesIDs;
		this.tags = tags;
		this.version = version;
	}

	public String getId() {
		return id;
	}

	public ArrayList<String> getRefNodesIDs() {
		return refNodesIDs;
	}

	public Map<String, String> getTags() {
		return tags;
	}

	public String getVersion() {
		return version;
	}

	@Override
	public String toString() {
		return "OSMWay [id=" + id + ", refNodesIDs=" + refNodesIDs + ", tags="
				+ tags + ", version=" + version + "]";
	}
	
	
}