package com.delta.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Document(collection = "holdingDelta")
public class HoldingDelta {

	@Id
	private String id;
	private Input input;
	private Output output;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date date;
	private float delta;
	private String custodian;
	@Field("asset_manager")
	private String assetManager;
	@Field("recon_break")
	private String reconBreak;

	public HoldingDelta() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Input getInput() {
		return input;
	}

	public void setInput(Input input) {
		this.input = input;
	}

	public Output getOutput() {
		return output;
	}

	public void setOutput(Output output) {
		this.output = output;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getDelta() {
		return delta;
	}

	public void setDelta(float delta) {
		this.delta = delta;
	}

	public String getCustodian() {
		return custodian;
	}

	public void setCustodian(String custodian) {
		this.custodian = custodian;
	}

	public String getAssetManager() {
		return assetManager;
	}

	public void setAssetManager(String assetManager) {
		this.assetManager = assetManager;
	}

	public String getReconBreak() {
		return reconBreak;
	}

	public void setReconBreak(String reconBreak) {
		this.reconBreak = reconBreak;
	}

	@Override
	public String toString() {
		return "HoldingDelta [reconBreak=" + reconBreak + "]";
	}



}
