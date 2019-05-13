package com.revature.beans;

import java.sql.Timestamp;

public class ERS_Reimbursement {
	private int reimb_Id;
	private double reimb_Amount;
	private Timestamp reimb_Submitted; 
	private Timestamp reimb_Resolved;
	private String reimb_Receipt;
	private String reimb_Description;
	private int reimb_Author;
	private int reimb_Resolver;
	private int reimb_Status_Id;
	private int reimb_Type_Id;
	public int getReimb_Id() {
		return reimb_Id;
	}
	public void setReimb_Id(int reimb_Id) {
		this.reimb_Id = reimb_Id;
	}
	public double getReimb_Amount() {
		return reimb_Amount;
	}
	public void setReimb_Amount(double reimb_Amount) {
		this.reimb_Amount = reimb_Amount;
	}
	public Timestamp getReimb_Submitted() {
		return reimb_Submitted;
	}
	public void setReimb_Submitted(Timestamp reimb_Submitted) {
		this.reimb_Submitted = reimb_Submitted;
	}
	public Timestamp getReimb_Resolved() {
		return reimb_Resolved;
	}
	public void setReimb_Resolved(Timestamp reimb_Resolved) {
		this.reimb_Resolved = reimb_Resolved;
	}
	public String getReimb_Receipt() {
		return reimb_Receipt;
	}
	public void setReimb_Receipt(String reimb_Receipt) {
		this.reimb_Receipt = reimb_Receipt;
	}
	public String getReimb_Description() {
		return reimb_Description;
	}
	public void setReimb_Description(String reimb_Description) {
		this.reimb_Description = reimb_Description;
	}
	public int getReimb_Author() {
		return reimb_Author;
	}
	public void setReimb_Author(int reimb_Author) {
		this.reimb_Author = reimb_Author;
	}
	public int getReimb_Resolver() {
		return reimb_Resolver;
	}
	public void setReimb_Resolver(int reimb_Resolver) {
		this.reimb_Resolver = reimb_Resolver;
	}
	public int getReimb_Status_Id() {
		return reimb_Status_Id;
	}
	public void setReimb_Status_Id(int reimb_Status_Id) {
		this.reimb_Status_Id = reimb_Status_Id;
	}
	public int getReimb_Type_Id() {
		return reimb_Type_Id;
	}
	public void setReimb_Type_Id(int reimb_Type_Id) {
		this.reimb_Type_Id = reimb_Type_Id;
	}
	@Override
	public String toString() {
		return "ERS_Reimbursement [reimb_Id=" + reimb_Id + ", reimb_Amount=" + reimb_Amount + ", reimb_Submitted="
				+ reimb_Submitted + ", reimb_Resolved=" + reimb_Resolved + ", reimb_Receipt=" + reimb_Receipt
				+ ", reimb_Description=" + reimb_Description + ", reimb_Author=" + reimb_Author + ", reimb_Resolver="
				+ reimb_Resolver + ", reimb_Status_Id=" + reimb_Status_Id + ", reimb_Type_Id=" + reimb_Type_Id + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(reimb_Amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + reimb_Author;
		result = prime * result + ((reimb_Description == null) ? 0 : reimb_Description.hashCode());
		result = prime * result + reimb_Id;
		result = prime * result + ((reimb_Receipt == null) ? 0 : reimb_Receipt.hashCode());
		result = prime * result + ((reimb_Resolved == null) ? 0 : reimb_Resolved.hashCode());
		result = prime * result + reimb_Resolver;
		result = prime * result + reimb_Status_Id;
		result = prime * result + ((reimb_Submitted == null) ? 0 : reimb_Submitted.hashCode());
		result = prime * result + reimb_Type_Id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ERS_Reimbursement other = (ERS_Reimbursement) obj;
		if (Double.doubleToLongBits(reimb_Amount) != Double.doubleToLongBits(other.reimb_Amount))
			return false;
		if (reimb_Author != other.reimb_Author)
			return false;
		if (reimb_Description == null) {
			if (other.reimb_Description != null)
				return false;
		} else if (!reimb_Description.equals(other.reimb_Description))
			return false;
		if (reimb_Id != other.reimb_Id)
			return false;
		if (reimb_Receipt == null) {
			if (other.reimb_Receipt != null)
				return false;
		} else if (!reimb_Receipt.equals(other.reimb_Receipt))
			return false;
		if (reimb_Resolved == null) {
			if (other.reimb_Resolved != null)
				return false;
		} else if (!reimb_Resolved.equals(other.reimb_Resolved))
			return false;
		if (reimb_Resolver != other.reimb_Resolver)
			return false;
		if (reimb_Status_Id != other.reimb_Status_Id)
			return false;
		if (reimb_Submitted == null) {
			if (other.reimb_Submitted != null)
				return false;
		} else if (!reimb_Submitted.equals(other.reimb_Submitted))
			return false;
		if (reimb_Type_Id != other.reimb_Type_Id)
			return false;
		return true;
	}
	public ERS_Reimbursement(int reimb_Id, double reimb_Amount, String reimb_Receipt, String reimb_Description,
			int reimb_Author, int reimb_Type_Id) {
		super();
		this.reimb_Id = reimb_Id;
		this.reimb_Amount = reimb_Amount;
		this.reimb_Receipt = reimb_Receipt;
		this.reimb_Description = reimb_Description;
		this.reimb_Author = reimb_Author;
		this.reimb_Type_Id = reimb_Type_Id;
	}
	public ERS_Reimbursement(int reimb_Id, Timestamp reimb_Submitted, Timestamp reimb_Resolved, int reimb_Resolver,
			int reimb_Status_Id) {
		super();
		this.reimb_Id = reimb_Id;
		this.reimb_Submitted = reimb_Submitted;
		this.reimb_Resolved = reimb_Resolved;
		this.reimb_Resolver = reimb_Resolver;
		this.reimb_Status_Id = reimb_Status_Id;
	}
	public ERS_Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ERS_Reimbursement(int reimb_Id, double reimb_Amount, Timestamp reimb_Submitted, Timestamp reimb_Resolved,
			String reimb_Receipt, String reimb_Description, int reimb_Author, int reimb_Resolver, int reimb_Status_Id,
			int reimb_Type_Id) {
		super();
		this.reimb_Id = reimb_Id;
		this.reimb_Amount = reimb_Amount;
		this.reimb_Submitted = reimb_Submitted;
		this.reimb_Resolved = reimb_Resolved;
		this.reimb_Receipt = reimb_Receipt;
		this.reimb_Description = reimb_Description;
		this.reimb_Author = reimb_Author;
		this.reimb_Resolver = reimb_Resolver;
		this.reimb_Status_Id = reimb_Status_Id;
		this.reimb_Type_Id = reimb_Type_Id;
	}
	
	
	
}
