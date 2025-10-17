package com.jack.ecommerceAngular.dao;

import com.jack.ecommerceAngular.entity.Cart;
import com.jack.ecommerceAngular.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDao extends CrudRepository<Cart, Integer > {
    public List<Cart> findByUser(User user);
}
