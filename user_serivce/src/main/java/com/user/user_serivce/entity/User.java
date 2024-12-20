package com.user.user_serivce.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
   private Long userId;
   private String name;
   private String phone;
   
   
   List<Contact> contact=new ArrayList<Contact>();


public User() {
	super();
	// TODO Auto-generated constructor stub
}


public User(Long userId, String name, String phone) {
	super();
	this.userId = userId;
	this.name = name;
	this.phone = phone;
}


public User(Long userId, String name, String phone, List<Contact> contact) {
	super();
	this.userId = userId;
	this.name = name;
	this.phone = phone;
	this.contact = contact;
}


public Long getUserId() {
	return userId;
}


public void setUserId(Long userId) {
	this.userId = userId;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getPhone() {
	return phone;
}


public void setPhone(String phone) {
	this.phone = phone;
}


public List<Contact> getContact() {
	return contact;
}


public void setContact(List<Contact> contact) {
	this.contact = contact;
}


@Override
public String toString() {
	return "User [userId=" + userId + ", name=" + name + ", phone=" + phone + ", contact=" + contact + "]";
}




   
   
   
}
