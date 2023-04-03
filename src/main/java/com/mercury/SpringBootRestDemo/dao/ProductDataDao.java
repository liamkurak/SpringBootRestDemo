package com.mercury.SpringBootRestDemo.dao;

import com.mercury.SpringBootRestDemo.bean.AddToCart;
import com.mercury.SpringBootRestDemo.bean.ProductData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDataDao extends JpaRepository<ProductData, String> {

    //    @Query(
//            value =
//                    "insert into comment_table " +
//                            "(name, review, reviewdate, stars, id) " +
//                            "values " +
//                            "('name', 'review','reviewdate', 2222, 444)",
//            nativeQuery= true)
//     void insertTestToComment();
    default void QueryWay(){};

}
