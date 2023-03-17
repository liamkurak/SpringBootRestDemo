package com.mercury.SpringBootRestDemo.service;

import com.mercury.SpringBootRestDemo.bean.Comment;
import com.mercury.SpringBootRestDemo.bean.Sample;
import com.mercury.SpringBootRestDemo.dao.CommentDao;
import com.mercury.SpringBootRestDemo.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentDao commentDao;


    public Response insertTestToComment(){
        try{
            commentDao.insertTestToComment();
            System.out.println("commentService.save -> commentDao.insertTestToComment()");
            return new Response(true,"CommentService -> success to save"  );
        }catch (Exception e) {
            return new Response(false,"CommentService -> failed to save"  );
        }
    }

    public Response save(Comment comment){
        try{
            commentDao.save(comment);

//            VALUES ('1', 'name', 'review', '4', '01-01-2000')
//            commentDao.insertTestToComment();

            System.out.println("commentService.save -> commentDao.save: returns"+ comment);

            return new Response(true,"CommentService -> save(): success to save" + comment);
        }catch (Exception e) {
            return new Response(false,"CommentService -> save(): failed to save" + comment.toString());
        }
    }
    public Response commentServiceDelete(Comment comment){
        try{
            commentDao.delete(comment);
//            sampleDao.save(new Sample("liam",12));
//            commentDao.insertTestToComment();
            System.out.println("sampleService.delete -> sampleDao.save -> return succ/fals");
            return new Response(true,"SampleService -> success to save" + comment);
        }catch (Exception e) {
            return new Response(false,"SampleService -> failed to save" + comment.toString());
        }
    }

    public List<Comment> getAll() {
//        sampleDao.save(new Sample("newName",1));
        return commentDao.findAll();
    }

}
