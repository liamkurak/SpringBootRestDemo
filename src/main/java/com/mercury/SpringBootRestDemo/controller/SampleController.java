package com.mercury.SpringBootRestDemo.controller;

import com.mercury.SpringBootRestDemo.bean.Sample;
import com.mercury.SpringBootRestDemo.service.SampleService;
import com.mercury.SpringBootRestDemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/samples")
public class SampleController {
    @Autowired
    private SampleService sampleService;

    @Autowired
    private TestService ts;

    @GetMapping
    public List<Sample> getAll() {
        // GET - http://localhost:8080/samples
        return null;
    }

    @GetMapping("/{name}")
    public Sample get(@PathVariable String name) {
        // GET - http://localhost:8080/samples/Dave
        return null;
    }

    @GetMapping("/age/{age}")
    public List<Sample> getByAge(@PathVariable int age) {
        // GET - http://localhost:8080/samples/age/40
        // GET - http://localhost:8080/samples/age/40
        // return null;
        return sampleService.getAll();
    }

    @PostMapping
    public void save(@RequestBody Sample sample) {
        // POST - http://localhost:8080/samples
    }

    @DeleteMapping("/{name}")
    public void delete(@PathVariable String name) {
        // DELETE - http://localhost:8080/samples/Bill
    }


}
