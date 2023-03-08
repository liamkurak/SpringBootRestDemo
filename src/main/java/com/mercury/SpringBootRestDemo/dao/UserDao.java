package com.mercury.SpringBootRestDemo.dao;

import com.mercury.SpringBootRestDemo.bean.Sample;
import com.mercury.SpringBootRestDemo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByUsername(String username);

//    @Query(
//            value = "INSERT INTO \"LIAMZ\".\"MSI_USER\" (USERNAME, PASSWORD) VALUES ('DaoQuery', 'DaoPassword')",
//            nativeQuery= true)
//    public default User insertTestToSample(){
//        return new User();
//    }



}
