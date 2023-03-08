package com.mercury.SpringBootRestDemo.dao;

import com.mercury.SpringBootRestDemo.bean.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CommentDao extends JpaRepository<Comment, String> {
//    @Query(
//            value = "INSERT INTO \"LIAMZ\".\"COMMENT_TABLE\" (ID, NAME, REVIEW, STARS, REVIEWDATE) VALUES ('222222', 'namenamename', 'review', '4', '01-01-2000')",
//            nativeQuery= true)
//    public default Comment insertTestToComment1(){
//        return new Comment();
//    }
    @Query(
            value =
                    "insert into comment_table " +
                            "(name, review, reviewdate, stars, id) " +
                            "values " +
                            "('name', 'review','reviewdate', 2222, 444)",
            nativeQuery= true)
     void insertTestToComment();

}
