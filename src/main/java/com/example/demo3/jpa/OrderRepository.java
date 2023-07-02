package com.example.demo3.jpa;

import com.example.demo3.bean.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Long> {
}
