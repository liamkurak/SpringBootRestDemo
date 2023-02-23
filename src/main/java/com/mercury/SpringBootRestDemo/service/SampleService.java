package com.mercury.SpringBootRestDemo.service;

import com.mercury.SpringBootRestDemo.bean.Sample;
import com.mercury.SpringBootRestDemo.dao.SampleDao;
import com.mercury.SpringBootRestDemo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {

    @Autowired
    private TestDao testDao;

    @Autowired
    private TestDao testDao2;

    @Autowired  // by type
    private SampleDao sampleDao;

    public List<Sample> testGetAll() {
        System.out.println(testDao);
        System.out.println(testDao2);

        return null;
    }

    public List<Sample> getAll() {
        return sampleDao.findAll();
    }
}
