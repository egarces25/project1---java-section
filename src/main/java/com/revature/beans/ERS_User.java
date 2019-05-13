package com.revature.beans;

public class ERS_User {
	private int ers_Id;
	private String ers_Username;
	private String ers_Password;
	private String user_First_Name;
	private String user_Last_Name;
	private String user_Email;
	private int user_Role_Id;
	public int getErs_Id() {
		return ers_Id;
	}
	public void setErs_Id(int ers_Id) {
		this.ers_Id = ers_Id;
	}
	public String getErs_Username() {
		return ers_Username;
	}
	public void setErs_Username(String ers_Username) {
		this.ers_Username = ers_Username;
	}
	public String getErs_Password() {
		return ers_Password;
	}
	public void setErs_Password(String ers_Password) {
		this.ers_Password = ers_Password;
	}
	public String getUser_First_Name() {
		return user_First_Name;
	}
	public void setUser_First_Name(String user_First_Name) {
		this.user_First_Name = user_First_Name;
	}
	public String getUser_Last_Name() {
		return user_Last_Name;
	}
	public void setUser_Last_Name(String user_Last_Name) {
		this.user_Last_Name = user_Last_Name;
	}
	public String getUser_Email() {
		return user_Email;
	}
	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}
	public int getUser_Role_Id() {
		return user_Role_Id;
	}
	public void setUser_Role_Id(int user_Role_Id) {
		this.user_Role_Id = user_Role_Id;
	}
	@Override
	public String toString() {
		return "ERS_User [ers_Id=" + ers_Id + ", ers_Username=" + ers_Username + ", ers_Password=" + ers_Password
				+ ", user_First_Name=" + user_First_Name + ", user_Last_Name=" + user_Last_Name + ", user_Email="
				+ user_Email + ", user_Role_Id=" + user_Role_Id + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ers_Id;
		result = prime * result + ((ers_Password == null) ? 0 : ers_Password.hashCode());
		result = prime * result + ((ers_Username == null) ? 0 : ers_Username.hashCode());
		result = prime * result + ((user_Email == null) ? 0 : user_Email.hashCode());
		result = prime * result + ((user_First_Name == null) ? 0 : user_First_Name.hashCode());
		result = prime * result + ((user_Last_Name == null) ? 0 : user_Last_Name.hashCode());
		result = prime * result + user_Role_Id;
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
		ERS_User other = (ERS_User) obj;
		if (ers_Id != other.ers_Id)
			return false;
		if (ers_Password == null) {
			if (other.ers_Password != null)
				return false;
		} else if (!ers_Password.equals(other.ers_Password))
			return false;
		if (ers_Username == null) {
			if (other.ers_Username != null)
				return false;
		} else if (!ers_Username.equals(other.ers_Username))
			return false;
		if (user_Email == null) {
			if (other.user_Email != null)
				return false;
		} else if (!user_Email.equals(other.user_Email))
			return false;
		if (user_First_Name == null) {
			if (other.user_First_Name != null)
				return false;
		} else if (!user_First_Name.equals(other.user_First_Name))
			return false;
		if (user_Last_Name == null) {
			if (other.user_Last_Name != null)
				return false;
		} else if (!user_Last_Name.equals(other.user_Last_Name))
			return false;
		if (user_Role_Id != other.user_Role_Id)
			return false;
		return true;
	}
	public ERS_User(int ers_Id, String ers_Username, String ers_Password, String user_First_Name, String user_Last_Name,
			int user_Role_Id) {
		super();
		this.ers_Id = ers_Id;
		this.ers_Username = ers_Username;
		this.ers_Password = ers_Password;
		this.user_First_Name = user_First_Name;
		this.user_Last_Name = user_Last_Name;
		this.user_Role_Id = user_Role_Id;
	}
	public ERS_User(int ers_Id, String ers_Username, String ers_Password, String user_First_Name, String user_Last_Name,
			String user_Email, int user_Role_Id) {
		super();
		this.ers_Id = ers_Id;
		this.ers_Username = ers_Username;
		this.ers_Password = ers_Password;
		this.user_First_Name = user_First_Name;
		this.user_Last_Name = user_Last_Name;
		this.user_Email = user_Email;
		this.user_Role_Id = user_Role_Id;
	}
	public ERS_User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}