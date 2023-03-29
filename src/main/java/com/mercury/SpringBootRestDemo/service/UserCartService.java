package com.mercury.SpringBootRestDemo.service;

import com.mercury.SpringBootRestDemo.bean.AddToCart;
import com.mercury.SpringBootRestDemo.bean.UserCart;
import com.mercury.SpringBootRestDemo.dao.AddToCartDao;
import com.mercury.SpringBootRestDemo.dao.UserCartDao;
import com.mercury.SpringBootRestDemo.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCartService {

    @Autowired
    private UserCartDao userCartDao;

    public List<UserCart> getAll(){
        return userCartDao.findAll();
    }

    public Response save(UserCart userCart){
        try{
            userCartDao.save(userCart);
//            addToCartDao.QueryWay();
            System.out.println("AddToCartService -> addToCartDao.save: returns"+ userCart);

            return new Response(true,"AddToCartService -> save(): success to save" + userCart);
        }catch (Exception e) {
            return new Response(false,"AddToCartService -> save(): failed to save" + userCart.toString());
        }
    }



}
