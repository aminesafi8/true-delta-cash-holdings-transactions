package com.delta.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Input {

	@Id
	private String id;

	private Security security;
	private Account account;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date date;
	private float quantity;
	private String custodian;
	private String source;
	@Field("asset_manager")
	private String assetManager;
	
	@Field("TradeDate")
	@DateTimeFormat(iso = ISO.DATE)
	private Date tradeDate;
	
	@Field("SettlementDate")
	@DateTimeFormat(iso = ISO.DATE)
	private Date settlementDate;
	
	@Field("NetAmount")
	private float netAmount;
	@Field("UnitPrice")
	private float unitPrice;
	@Field("Currency")
	private String currency;
	@Field("TransactionType")
	private String transactionType;
	
	
	
	

	public Input() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getCustodian() {
		return custodian;
	}

	public void setCustodian(String custodian) {
		this.custodian = custodian;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getAssetManager() {
		return assetManager;
	}

	public void setAssetManager(String assetManager) {
		this.assetManager = assetManager;
	}

	public Date getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	public Date getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(Date settlementDate) {
		this.settlementDate = settlementDate;
	}

	public float getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(float netAmount) {
		this.netAmount = netAmount;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	
}
