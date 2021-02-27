package com.xdrive.repository;

import com.xdrive.model.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<Long, User> {

}
