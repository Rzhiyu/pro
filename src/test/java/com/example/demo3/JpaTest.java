package com.example.demo3;

import com.example.demo3.bean.Goods;
import com.example.demo3.bean.Order;
import com.example.demo3.bean.User;
import com.example.demo3.jpa.GoodsRepository;
import com.example.demo3.jpa.OrderRepository;
import com.example.demo3.jpa.UserRepository;
import com.example.demo3.mapper.GoodsMapper;
import com.example.demo3.mapper.OrderMapper;
import com.example.demo3.mapper.UserMappper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@SpringBootTest
public class JpaTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

//    @Test
//    public void MyTest(){
//        User user = userMappper.selectById(1);
//        System.out.println(user.toString());
//    }
    @Test
    public void fun1(){
        Goods goods = goodsRepository.findById(1L).get();
        System.out.println(goods);
//        selectall();
//        goodsMapper.delete(null);
//        selectall();

    }
//    public void selectall(){
//        List<Goods> goods1 = goodsMapper.selectList(null);
//        for(Goods g : goods1){
//            System.out.println(g);
//        }
//    }
//
//    @Test
//    public void addOrder(){
//        List<Goods> obj = new ArrayList<>();
//        obj.add(new Goods(1L, "Flour Tortilla", 1));
//        obj.add(new Goods(2L, "Corn Tortilla", 2));
//        obj.add(new Goods(7L, "Cheddar", 7));
//        obj.add(new Goods(10L, "Sour Cream", 10));
//        Order order = new Order(123L,obj,new Date());
//        orderMapper.insert(order);
//    }
}
