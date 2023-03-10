package com.mercury.SpringBootRestDemo.dao;

import com.mercury.SpringBootRestDemo.bean.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CommentDao extends JpaRepository<Comment, String> {

    // write Query code directly!
    // 究极方案！
//    @Query(
//            value =
//                    "insert into comment_table " +
//                            "(name, review, reviewdate, stars, id) " +
//                            "values " +
//                            "('name', 'review','reviewdate', 2222, 444)",
//            nativeQuery= true)
//     void insertTestToComment();
     default void insertTestToComment(){};


}
