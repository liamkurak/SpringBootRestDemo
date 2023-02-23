package com.mercury.SpringBootRestDemo.dao;

import com.mercury.SpringBootRestDemo.bean.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleDao extends JpaRepository<Sample, String> {


}
