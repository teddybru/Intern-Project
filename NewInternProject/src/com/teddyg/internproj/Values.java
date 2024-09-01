
package com.teddyg.internproj;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"size",
"quality_from_ntr",
"jammed",
"one_hop_neighbors",
"command",
"ntr",
"hops_from_ntr",
"src_unit_id",
"src_ip",
"respTime"
})
@javax.annotation.processing.Generated("jsonschema2pojo")
@JsonDeserialize(as = Values.class)
public class Values implements Readable {

	// translates the JSON values into java variables
@JsonProperty("size")
private Integer size;
@JsonProperty("quality_from_ntr")
private Integer qualityFromNtr;
@JsonProperty("jammed")
private Boolean jammed;
@JsonProperty("one_hop_neighbors")
private Integer oneHopNeighbors;
@JsonProperty("command")
private Boolean command;
@JsonProperty("ntr")
private String ntr;
@JsonProperty("hops_from_ntr")
private Integer hopsFromNtr;
@JsonProperty("src_unit_id")
private String srcUnitId;
@JsonProperty("src_ip")
private String srcIp;
@JsonProperty("respTime")
private Integer respTime;
@JsonIgnore

//ignores all other values found

private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

//Getters and Setters

@JsonProperty("size")
public Integer getSize() {
return size;
}

@JsonProperty("size")
public void setSize(Integer size) {
this.size = size;
}

@JsonProperty("quality_from_ntr")
public Integer getQualityFromNtr() {
return qualityFromNtr;
}

@JsonProperty("quality_from_ntr")
public void setQualityFromNtr(Integer qualityFromNtr) {
this.qualityFromNtr = qualityFromNtr;
}

@JsonProperty("jammed")
public Boolean getJammed() {
return jammed;
}

@JsonProperty("jammed")
public void setJammed(Boolean jammed) {
this.jammed = jammed;
}

@JsonProperty("one_hop_neighbors")
public Integer getOneHopNeighbors() {
return oneHopNeighbors;
}

@JsonProperty("one_hop_neighbors")
public void setOneHopNeighbors(Integer oneHopNeighbors) {
this.oneHopNeighbors = oneHopNeighbors;
}

@JsonProperty("command")
public Boolean getCommand() {
return command;
}

@JsonProperty("command")
public void setCommand(Boolean command) {
this.command = command;
}

@JsonProperty("ntr")
public String getNtr() {
return ntr;
}

@JsonProperty("ntr")
public void setNtr(String ntr) {
this.ntr = ntr;
}

@JsonProperty("hops_from_ntr")
public Integer getHopsFromNtr() {
return hopsFromNtr;
}

@JsonProperty("hops_from_ntr")
public void setHopsFromNtr(Integer hopsFromNtr) {
this.hopsFromNtr = hopsFromNtr;
}

@JsonProperty("src_unit_id")
public String getSrcUnitId() {
return srcUnitId;
}

@JsonProperty("src_unit_id")
public void setSrcUnitId(String srcUnitId) {
this.srcUnitId = srcUnitId;
}

@JsonProperty("src_ip")
public String getSrcIp() {
return srcIp;
}

@JsonProperty("src_ip")
public void setSrcIp(String srcIp) {
this.srcIp = srcIp;
}

@JsonProperty("respTime")
public Integer getRespTime() {
return respTime;
}

@JsonProperty("respTime")
public void setRespTime(Integer respTime) {
this.respTime = respTime;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

//toString method to output values
@Override
public String toString() {
	return " Size: " + size + " Quality From NTR: " + qualityFromNtr + " Jammed: " + jammed + " One Hop Neighbors: "
			+ oneHopNeighbors + "Command: " + command + " NTR: " + ntr + " Hops From NTR: " + hopsFromNtr
			+ " SRC Unit ID: " + srcUnitId + " SRC IP: " + srcIp + " Response Time: " + respTime;
}

@Override
public int read(CharBuffer cb) throws IOException {
	return 0;
}

public Values() {

}
public Values(Integer size, Integer qualityFromNtr, Boolean jammed, Integer oneHopNeighbors, Boolean command,
		String ntr, Integer hopsFromNtr, String srcUnitId, String srcIp, Integer respTime) {
	super();
	this.size = size;
	this.qualityFromNtr = qualityFromNtr;
	this.jammed = jammed;
	this.oneHopNeighbors = oneHopNeighbors;
	this.command = command;
	this.ntr = ntr;
	this.hopsFromNtr = hopsFromNtr;
	this.srcUnitId = srcUnitId;
	this.srcIp = srcIp;
	this.respTime = respTime;
}

}