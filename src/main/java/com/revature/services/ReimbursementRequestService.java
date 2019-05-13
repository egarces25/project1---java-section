package com.revature.services;

import com.revature.dao.ReimburseRequestDao;

public class ReimbursementRequestService {
 ReimburseRequestDao requestDao = new ReimburseRequestDao();
 public void insert(double reimb_Amount, String reimb_Receipt, String reimb_Description,int reimb_Author, int reimb_Type_Id) {
	requestDao.InsertRequest(reimb_Amount, reimb_Receipt , reimb_Description, reimb_Author, reimb_Type_Id);
	
 }
public ReimbursementRequestService() {
	super();
	// TODO Auto-generated constructor stub
}
public ReimbursementRequestService(ReimburseRequestDao requestDao) {
	super();
	this.requestDao = requestDao;
}

}
