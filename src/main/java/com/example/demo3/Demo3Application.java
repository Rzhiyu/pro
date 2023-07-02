package com.example.demo3;

import com.example.demo3.bean.Goods;
import com.example.demo3.mapper.GoodsMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import java.util.HashMap;
import java.util.Random;

@SpringBootApplication
@MapperScan("com.example.demo3.mapper")
//@ImportResource("classpath:provider.xml")
public class Demo3Application {
	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}


	@Bean
	public CommandLineRunner dataLoader(GoodsMapper repo) {
		Random random = new Random();
		return args -> {
			//repo.delete(); // TODO: Quick hack to avoid tests from stepping on each other with constraint violations
//			repo.insert(new Goods(1L, "Flour Tortilla", random.nextFloat()));
//			repo.insert(new Goods(2L, "Corn Tortilla", random.nextFloat()));
//			repo.insert(new Goods(3L, "Ground Beef", random.nextFloat()));
//			repo.insert(new Goods(4L, "Carnitas", random.nextFloat()));
//			repo.insert(new Goods(5L, "Diced Tomatoes", random.nextFloat()));
//			repo.insert(new Goods(6L, "Lettuce", random.nextFloat()));
//			repo.insert(new Goods(7L, "Cheddar", random.nextFloat()));
//			repo.insert(new Goods(8L, "Monterrey Jack", random.nextFloat()));
//			repo.insert(new Goods(9L, "Salsa", random.nextFloat()));
//			repo.insert(new Goods(10L, "Sour Cream", random.nextFloat()));

			repo.insert(new Goods(1L, "Flour Tortilla", 1));
			repo.insert(new Goods(2L, "Corn Tortilla", 2));
			repo.insert(new Goods(3L, "Ground Beef", 3));
			repo.insert(new Goods(4L, "Carnitas", 4));
			repo.insert(new Goods(5L, "Diced Tomatoes", 5));
			repo.insert(new Goods(6L, "Lettuce", 6));
			repo.insert(new Goods(7L, "Cheddar", 7));
			repo.insert(new Goods(8L, "Monterrey Jack", 8));
			repo.insert(new Goods(9L, "Salsa", 9));
			repo.insert(new Goods(10L, "Sour Cream", 10));
		};
	}
}
