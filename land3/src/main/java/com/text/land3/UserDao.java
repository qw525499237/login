package com.text.land3;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends CrudRepository<User,Long>{
    public User findByUsernameAndPassword(String username,String password);
}
