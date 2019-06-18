package com.github.hyagosouzza.bootifulmongodb.controller;

import java.util.List;

import com.github.hyagosouzza.bootifulmongodb.dal.UserDAL;
import com.github.hyagosouzza.bootifulmongodb.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
public class UserController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final UserRepository userRepository;

	private final UserDAL userDAL;

	public UserController(UserRepository userRepository, UserDAL userDAL) {
		this.userRepository = userRepository;
		this.userDAL = userDAL;
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public User addNewUsers(@RequestBody User user) {
		LOG.info("Saving user.");
		return userRepository.save(user);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		LOG.info("Getting all users.");
		return userRepository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable String id) {
		LOG.info("Getting user with ID: {}.", id);
		return userRepository.findOne(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public User updateUser(@PathVariable String id, @RequestBody User user) {
		LOG.info("Updating user with ID: {}.", id);
		userRepository.delete(user);
		return userRepository.save(user);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable String id) {
		LOG.info("Delete user with ID: {}.", id);
		userRepository.delete(id);
	}
}