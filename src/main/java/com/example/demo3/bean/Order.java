package com.example.demo3.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@TableName("user_order")
@Entity
@NoArgsConstructor
@Table(name = "user_order")
//@AllArgsConstructor
public class Order {
    @Id
    private Long id;
    private Long uid;

    @ManyToMany
    private List<Goods> itemlist;
    private Date createdAt;
    @PrePersist
    public void createDate(){
        this.createdAt = new Date();
    }
    public Order(Long id, List<Goods> itemlist, Date createdAt) {
        this.id = id;
        this.itemlist = itemlist;
        this.createdAt = createdAt;
    }
}
