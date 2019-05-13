package com.revature.services;

import java.util.List;

import com.revature.beans.ERS_Reimbursement;
import com.revature.dao.RetrieveDao;

public class RetrieveService {
	RetrieveDao retrieveDao = new RetrieveDao();

	public List<ERS_Reimbursement> retrieve(int reimb_Author) {
		 
		
		return retrieveDao.getRequest(reimb_Author);
		 
		 }
}
