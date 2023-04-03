package com.mercury.SpringBootRestDemo.controller;

import com.mercury.SpringBootRestDemo.bean.ProductData;
import com.mercury.SpringBootRestDemo.http.Response;
import com.mercury.SpringBootRestDemo.service.ProductDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productdata")
public class ProductDataController {

    @Autowired
    private ProductDataService productDataService;

    @GetMapping
    public List<ProductData> getAll(){
        System.out.println("ProductDataController -> getAll(): "+productDataService.getAll());
        return productDataService.getAll();
    }

    @PutMapping
    public void PutToCart(@RequestBody ProductData productData) {
        productDataService.save(productData);
    }

    @PostMapping
    public void save(@RequestBody ProductData productData) {
        productDataService.save(productData);
    }

    @DeleteMapping()
    public void del(@RequestBody ProductData productData) {
        productDataService.del(productData);
    }



}
