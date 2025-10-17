package com.jack.ecommerceAngular.dao;

import com.jack.ecommerceAngular.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
