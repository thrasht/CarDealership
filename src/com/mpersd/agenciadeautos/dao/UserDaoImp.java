package com.mpersd.agenciadeautos.dao;

import org.springframework.stereotype.Repository;

import com.mpersd.agenciadeautos.domain.User;

@Repository("userDao")
public class UserDaoImp extends AbstractDao<Integer, User> implements UserDao {

}
