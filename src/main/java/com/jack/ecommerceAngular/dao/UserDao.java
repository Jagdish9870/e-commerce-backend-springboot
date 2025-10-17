package com.jack.ecommerceAngular.dao;

import com.jack.ecommerceAngular.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
