package com.example.demo3;

import com.example.demo3.bean.Goods;
import com.example.demo3.bean.Order;
import com.example.demo3.bean.User;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@SpringBootTest
public class ApiTest {
//    @Autowired
    private RestTemplate restTemplate = new RestTemplate();


    @Test
    public void postOrder(){
        List<Goods> obj = new ArrayList<>();
        obj.add(new Goods(1L, "Flour Tortilla", 1));
        obj.add(new Goods(2L, "Corn Tortilla", 2));
        obj.add(new Goods(7L, "Cheddar", 7));
        obj.add(new Goods(10L, "Sour Cream", 10));


//        repo.insert(new Goods(1L, "Flour Tortilla", 1));
//        repo.insert(new Goods(2L, "Corn Tortilla", 2));
//        repo.insert(new Goods(3L, "Ground Beef", 3));
//        repo.insert(new Goods(4L, "Carnitas", 4));
//        repo.insert(new Goods(5L, "Diced Tomatoes", 5));
//        repo.insert(new Goods(6L, "Lettuce", 6));
//        repo.insert(new Goods(7L, "Cheddar", 7));
//        repo.insert(new Goods(8L, "Monterrey Jack", 8));
//        repo.insert(new Goods(9L, "Salsa", 9));
//        repo.insert(new Goods(10L, "Sour Cream", 10));
        Order order = new Order(123L,obj,new Date());
        restTemplate.postForObject("http://localhost:8080/order", order, Order.class);
    }

//    @Test
//    public void postTest(){
//        User user = new User();
//        user.setId(12L);
//        user.setAge(11);
//        user.setName("asdasd");
//        user.setEmail("qweqwe");
//        User user1 = restTemplate.postForObject("http://localhost:8080/api/user", user, User.class);
//        System.out.print(user1);
//        System.out.println("asdasd");
//    }
    @Test
    public void getTest(){
        User user1 = restTemplate.getForObject("http://localhost:8080/api/user", User.class);
        System.out.println(user1);
    }
}
