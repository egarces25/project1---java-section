package com.revature.services;

import com.revature.dao.StatusUpdate;

public class UpdateService {
StatusUpdate updateDao =  new StatusUpdate();



public void update(int reimb_Status_Id, int reimb_Resolver, int requestId) {
	updateDao.UpdateStatus(reimb_Status_Id, reimb_Resolver, requestId);
}


}





