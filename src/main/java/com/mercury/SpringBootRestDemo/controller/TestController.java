package com.mercury.SpringBootRestDemo.controller;

import com.mercury.SpringBootRestDemo.bean.Sample;
import com.mercury.SpringBootRestDemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller + @ResponseBody
@RestController
public class TestController {

    @Autowired
    private TestService ts;

    @Autowired
    private TestService ts2;

    @RequestMapping("/foo")
    public void foo() {
        System.out.println("foo...");
    }

    @GetMapping("/bar")
    public void bar() {
        System.out.println("bar..");
    }

    @GetMapping("/add")
    public int add(@RequestParam("x") int x, @RequestParam int y) {
        return x + y;
    }

    @GetMapping("/mul/{x}/{y}")
    public int mul(@PathVariable("x") int x, @PathVariable int y) {
        return x * y;
    }

    @PostMapping("/double")
    public Sample doubleAge(@RequestBody Sample sample) {
        sample.setAge(sample.getAge() * 2);
        return sample;
    }

    @GetMapping("/test")
    public void test() {
        System.out.println(ts);
        System.out.println(ts2);
        System.out.println(ts == ts2);
    }
}
