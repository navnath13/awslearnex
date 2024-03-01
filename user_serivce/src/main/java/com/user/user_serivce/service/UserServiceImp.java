package com.user.user_serivce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user_serivce.entity.User;


@Service
public class UserServiceImp implements UserServices{
	
	
	//face user list 
	List<User> list=List.of(new User(112L,"Navnath Doke","8600861273"),
			new User(121L,"sawata Doke","3884388233"),
			new User(113L,"vishal Doke","9011202318"),
			new User(114L,"kamal Doke","9527785217"),
			new User(115L,"sachin Doke","983782373"));

	@Override
	public User getUser(Long id) {
	
		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
