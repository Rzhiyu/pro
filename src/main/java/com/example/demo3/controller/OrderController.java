package com.example.demo3.controller;

import com.example.demo3.bean.Order;
import com.example.demo3.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/order",produces = "application/json")
@CrossOrigin("*")
public class OrderController {
    @Autowired
    OrderMapper orderMapper;
    @PostMapping(consumes = "application/json")
    public void createOrder(@RequestBody Order order){
        orderMapper.insert(order);
    }
}
