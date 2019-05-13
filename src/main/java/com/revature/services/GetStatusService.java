package com.revature.services;

import java.util.List;

import com.revature.beans.ERS_Reimbursement;
import com.revature.dao.GetStatusDao;

public class GetStatusService {

			GetStatusDao getStatusDao = new GetStatusDao();

		public List <ERS_Reimbursement> getStatusId(int ers_Id, int user_Role_Id){

			return getStatusDao.getStatus(ers_Id , user_Role_Id);
	}
	
}
