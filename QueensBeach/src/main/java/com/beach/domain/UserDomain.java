package com.beach.domain;


public class UserDomain {
	
	private long userId ;
	
	private String userName ;
	
	private long accountBalance ;
	
	private int rm_id ;
	
	private int fa_id ;
	
	private String cust_type ;
	
	private String account_type;
	
	public UserDomain(long userId,String userName ,long accountBalance, int rm_id,int fa_id,String cust_type,String account_type) {
		this.userId = userId;
		this.userName=userName;
		this.accountBalance = accountBalance;
		this.rm_id = rm_id;
		this.fa_id = fa_id;
		this.cust_type=cust_type;
		this.account_type=account_type;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getRm_id() {
		return rm_id;
	}

	public void setRm_id(int rm_id) {
		this.rm_id = rm_id;
	}

	public int getFa_id() {
		return fa_id;
	}

	public void setFa_id(int fa_id) {
		this.fa_id = fa_id;
	}

	public String getCust_type() {
		return cust_type;
	}

	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	
	
	

}
