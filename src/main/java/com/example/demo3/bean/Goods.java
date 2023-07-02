package com.example.demo3.bean;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@RequiredArgsConstructor
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private final Long id;
//    private final String name;
//    private final float price;


    private  Long id;
    private  String name;
    private  float price;

//    public Goods() {
//
//    }

    //    public Goods(Long id, String name, float price) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Goods{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                '}';
//    }
}
