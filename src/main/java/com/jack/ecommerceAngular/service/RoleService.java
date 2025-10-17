package com.jack.ecommerceAngular.service;

import com.jack.ecommerceAngular.dao.RoleDao;
import com.jack.ecommerceAngular.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
