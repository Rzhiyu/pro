package com.example.demo3.jpa;

import com.example.demo3.bean.Goods;
import org.springframework.data.repository.CrudRepository;

public interface GoodsRepository extends CrudRepository<Goods,Long> {
}
