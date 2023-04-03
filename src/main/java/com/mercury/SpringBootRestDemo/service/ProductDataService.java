package com.mercury.SpringBootRestDemo.service;

import com.mercury.SpringBootRestDemo.bean.AddToCart;
import com.mercury.SpringBootRestDemo.bean.ProductData;
import com.mercury.SpringBootRestDemo.bean.Sample;
import com.mercury.SpringBootRestDemo.dao.AddToCartDao;
import com.mercury.SpringBootRestDemo.dao.ProductDataDao;
import com.mercury.SpringBootRestDemo.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDataService {

    @Autowired
    private ProductDataDao productDataDao;

    public List<ProductData> getAll(){
        return productDataDao.findAll();
    }

    public Response save(ProductData productData){
        try{
            productDataDao.save(productData);
//            addToCartDao.QueryWay();
            System.out.println("ProductDataService -> productDataDao.save: returns"+ productData);

            return new Response(true,"ProductDataService -> save(): success to save" + productData);
        }catch (Exception e) {
            return new Response(false,"ProductDataService -> save(): failed to save" + productData.toString());
        }
    }

    public Response del(ProductData productData){
        try{
            productDataDao.delete(productData);
            return new Response(true,"ProductDataService -> success to save" + productData);
        }catch (Exception e) {
            return new Response(false,"ProductDataService -> failed to save" + productData.toString());
        }
    }


}
