package com.beach.domain;

public class BankerDomain {
	
	private String bankerName;
	
	private String title ;
	
	private String role;
	
	private int contact;
	
	private String email ;
	
	private String bio;

	public BankerDomain(String bankerName ,String title ,String role ,int contact ,String email, String bio) {
		
		this.bankerName = bankerName;
		this.title = title;
		this.role =  role;
		this.contact= contact;
		this.email = email;
		this.bio = bio;
	}
	
	public String getBankerName() {
		return bankerName;
	}

	public void setBankerName(String bankerName) {
		this.bankerName = bankerName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

}
