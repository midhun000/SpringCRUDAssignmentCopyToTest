package com.midhun.SpringCRUDAssignment.dao;

import com.midhun.SpringCRUDAssignment.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, Integer> {
}
