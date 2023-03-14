package com.mercury.SpringBootRestDemo.controller;

import com.mercury.SpringBootRestDemo.bean.AddToCart;
import com.mercury.SpringBootRestDemo.bean.Comment;
import com.mercury.SpringBootRestDemo.dao.AddToCartDao;
import com.mercury.SpringBootRestDemo.service.AddToCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addtocart")
public class AddToCartController {

    @Autowired
    private AddToCartService addToCartService;

    @GetMapping
    public List<AddToCart> getAll(){
        System.out.println("AddToCartController -> getAll(): "+addToCartService.getAll());
//        addToCartService.getAll();
        return addToCartService.getAll();
    }

    @PutMapping
    public void PutToCart(@RequestBody AddToCart addToCart) {
        // PUT - http://localhost:8080/addtocart
        addToCartService.save(addToCart);
    }

    @PostMapping
    public void save(@RequestBody AddToCart addToCart) {
        // POST - http://localhost:8080/comments
        addToCartService.save(addToCart);
    }




}
