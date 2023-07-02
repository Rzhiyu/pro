package com.example.demo3;

import com.example.demo3.bean.Goods;
import com.example.demo3.bean.Order;
import com.example.demo3.bean.User;
import com.example.demo3.mapper.GoodsMapper;
import com.example.demo3.mapper.OrderMapper;
import com.example.demo3.mapper.UserMappper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class MybatisTest {
    @Autowired
    private UserMappper userMappper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void MyTest(){
        User user = userMappper.selectById(1);
        System.out.println(user.toString());
    }
    @Test
    public void fun1(){
        Goods goods = goodsMapper.selectById(1);
        System.out.println(goods);
        selectall();
        goodsMapper.delete(null);
        selectall();

    }
    public void selectall(){
        List<Goods> goods1 = goodsMapper.selectList(null);
        for(Goods g : goods1){
            System.out.println(g);
        }
    }

    @Test
    public void addOrder(){
        List<Goods> obj = new ArrayList<>();
        obj.add(new Goods(1L, "Flour Tortilla", 1));
        obj.add(new Goods(2L, "Corn Tortilla", 2));
        obj.add(new Goods(7L, "Cheddar", 7));
        obj.add(new Goods(10L, "Sour Cream", 10));
        Order order = new Order(123L,obj,new Date());
        orderMapper.insert(order);
    }
//    @Test
//    public void fun1(){
//        String sql = "select * from sys_user where id = ?";
//
//        User user1 = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
//            User user = new User();
//            System.out.println(rs.getInt("id"));
//            user.setId(rs.getLong("id"));
//            user.setAge(rs.getInt("age"));
//            user.setName(rs.getString("name"));
//            user.setEmail(rs.getString("email"));
//            return user;
//        }, 1);
//        System.out.println(user1);
////        User user2 = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),"Jack");
////
////        System.out.println(user2);
//    }
}
