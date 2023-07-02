package com.example.demo3.jpa;

import com.example.demo3.bean.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
