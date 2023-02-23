package com.mercury.SpringBootRestDemo.service;

import com.mercury.SpringBootRestDemo.bean.Sample;
import com.mercury.SpringBootRestDemo.dao.TestDao;
import com.mercury.SpringBootRestDemo.dao.TrainingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class TestService {

    @Autowired
    private TestDao td = new TestDao();

    @Autowired  // byType + byName
    @Qualifier("jsTrainingDao")     // @Qualifier > @Primary > byName
    private TrainingDao javaTrainingDao;


    public void foo() {
        td.get();
        td.save(new Sample());
    }

    public void bar() {
        td.get();
    }

}
