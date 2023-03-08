package com.mercury.SpringBootRestDemo.dao;

import com.mercury.SpringBootRestDemo.bean.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SampleDao extends JpaRepository<Sample, String> {

    //    @Query("select '*' From Sample")
//    @Query("select Sample")
//    public default Sample allFromSample(){
//        return new Sample();
//    }

//    @Query(
//            value = "SELECT MAX(idavailability) FROM lv2_availability",
//            nativeQuery = true)
//    int maxIdAvailability();

    @Query(
            value = "INSERT INTO \"LIAMZ\".\"SAMPLE\" (NAME, AGE) VALUES ('DaoQuery', '11')",
    nativeQuery= true)
    public default Sample insertTestToSample(){
        return new Sample();
    }

}
