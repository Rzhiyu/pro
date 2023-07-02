package com.example.demo3.controller;


import com.example.demo3.bean.Goods;
import com.example.demo3.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
@RequestMapping("/goods")
public class GoodAccessController {


    @Autowired
    GoodsMapper goodsMapper;



    @GetMapping("/{id}")
    public ResponseEntity<Goods> getGoods(@PathVariable Long id){
        Goods goods = goodsMapper.selectById(id);
        if(goods==null)
            return new ResponseEntity<Goods>(goods, HttpStatus.NOT_FOUND);
        return new ResponseEntity<Goods>(goods, HttpStatus.OK);
    }
//    @PostMapping("/order")
//    public String createOrder(){
//        return "order html";
//    }
}
