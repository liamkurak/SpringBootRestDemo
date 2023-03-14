package com.mercury.SpringBootRestDemo.service;

import com.mercury.SpringBootRestDemo.bean.AddToCart;
import com.mercury.SpringBootRestDemo.bean.Comment;
import com.mercury.SpringBootRestDemo.dao.AddToCartDao;
import com.mercury.SpringBootRestDemo.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddToCartService {

    @Autowired
    private AddToCartDao addToCartDao;

    public List<AddToCart> getAll(){
        return addToCartDao.findAll();
    }

    public Response save(AddToCart addToCart){
        try{
            addToCartDao.save(addToCart);
//            addToCartDao.QueryWay();
            System.out.println("AddToCartService -> addToCartDao.save: returns"+ addToCart);

            return new Response(true,"AddToCartService -> save(): success to save" + addToCart);
        }catch (Exception e) {
            return new Response(false,"AddToCartService -> save(): failed to save" + addToCart.toString());
        }
    }



}
