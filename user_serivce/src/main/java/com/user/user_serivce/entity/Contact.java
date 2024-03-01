package com.user.user_serivce.entity;

public class Contact {
   private long cid;
   private String email;
   private String ContactName;
   private Long userId;
public Contact() {
	super();
	// TODO Auto-generated constructor stub
}
public Contact(long cid, String email, String contactName, Long userId) {
	super();
	this.cid = cid;
	this.email = email;
	ContactName = contactName;
	this.userId = userId;
}
public long getCid() {
	return cid;
}
public void setCid(long cid) {
	this.cid = cid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContactName() {
	return ContactName;
}
public void setContactName(String contactName) {
	ContactName = contactName;
}
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
@Override
public String toString() {
	return "Contact [cid=" + cid + ", email=" + email + ", ContactName=" + ContactName + ", userId=" + userId + "]";
}
   
   
   
   
}
