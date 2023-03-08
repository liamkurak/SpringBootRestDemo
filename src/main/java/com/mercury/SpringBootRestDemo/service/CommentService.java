package com.mercury.SpringBootRestDemo.service;

import com.mercury.SpringBootRestDemo.bean.Sample;
import com.mercury.SpringBootRestDemo.dao.SampleDao;
import com.mercury.SpringBootRestDemo.dao.TestDao;
import com.mercury.SpringBootRestDemo.http.Response;
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

    public Response save(Sample sample){
        try{
            sampleDao.save(sample);
//            sampleDao.save(new Sample("liam",12));
            sampleDao.insertTestToSample();
            System.out.println("sampleService.save -> sampleDao.save -> return succ/fals");

            return new Response(true,"SampleService -> success to save" + sample);
        }catch (Exception e) {
            return new Response(false,"SampleService -> failed to save" + sample.toString());
        }
    }
    public Response sampleServiceDelete(Sample sample){
        try{
            sampleDao.delete(sample);
//            sampleDao.save(new Sample("liam",12));
            sampleDao.insertTestToSample();
            System.out.println("sampleService.delete -> sampleDao.save -> return succ/fals");

            return new Response(true,"SampleService -> success to save" + sample);
        }catch (Exception e) {
            return new Response(false,"SampleService -> failed to save" + sample.toString());
        }
    }

    public List<Sample> testGetAll() {
        System.out.println(testDao);
        System.out.println(testDao2);

        return null;
    }

    public List<Sample> getAll() {
//        sampleDao.save(new Sample("newName",1));

        return sampleDao.findAll();
    }
}
