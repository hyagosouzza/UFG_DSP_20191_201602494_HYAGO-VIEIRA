package com.github.hyagosouzza.bootifulmongodb.dal;

import com.github.hyagosouzza.bootifulmongodb.model.User;

import java.util.List;


public interface UserDAL {

	List<User> getAllUsers();

	User getUserById(String id);

	User addNewUser(User user);

	User updateUser(User user, String userId);

	void deleteUser(String userId);

}