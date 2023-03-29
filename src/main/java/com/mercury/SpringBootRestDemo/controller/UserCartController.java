package com.mercury.SpringBootRestDemo.controller;

import com.mercury.SpringBootRestDemo.bean.UserCart;
import com.mercury.SpringBootRestDemo.service.UserCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usercart")
public class UserCartController {

    @Autowired
    private UserCartService userCartService;

    @GetMapping
    public List<UserCart> getAll(){
        System.out.println("AddToCartController -> getAll(): "+userCartService.getAll());
        return userCartService.getAll();
    }

    @PutMapping
    public void PutToCart(@RequestBody UserCart userCart) {
        // PUT - http://localhost:8080/userCart
        userCartService.save(userCart);
    }

    @PostMapping
    public void save(@RequestBody UserCart userCart) {
        // POST - http://localhost:8080/userCart
        userCartService.save(userCart);
    }




}
