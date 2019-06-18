package com.github.hyagosouzza.bootifulmongodb.dal;

import java.util.List;

import com.github.hyagosouzza.bootifulmongodb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;


@Repository
public class UserDALImpl implements UserDAL {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<User> getAllUsers() {
		return mongoTemplate.findAll(User.class);
	}

	@Override
	public User getUserById(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		return mongoTemplate.findOne(query, User.class);
	}

	@Override
	public User addNewUser(User user) {
		mongoTemplate.save(user);
		// Now, user object will contain the ID as well
		return user;
	}

	@Override
	public User updateUser(User user, String userId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(userId));
		mongoTemplate.remove(query, userId);
		return this.addNewUser(user);
	}

	@Override
	public void deleteUser(String userId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(userId));
		mongoTemplate.remove(query, User.class);
	}
	
}
