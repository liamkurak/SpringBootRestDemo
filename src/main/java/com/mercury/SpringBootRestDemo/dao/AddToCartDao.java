package com.mercury.SpringBootRestDemo.dao;

import com.mercury.SpringBootRestDemo.bean.AddToCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddToCartDao extends JpaRepository<AddToCart, String> {

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
