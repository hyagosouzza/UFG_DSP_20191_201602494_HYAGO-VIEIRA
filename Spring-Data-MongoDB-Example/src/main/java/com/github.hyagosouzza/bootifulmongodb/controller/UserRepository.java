package com.github.hyagosouzza.bootifulmongodb.controller;

import com.github.hyagosouzza.bootifulmongodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
