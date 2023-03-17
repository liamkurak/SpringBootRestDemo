package com.mercury.SpringBootRestDemo.controller;

import com.mercury.SpringBootRestDemo.bean.Comment;
import com.mercury.SpringBootRestDemo.service.CommentService;
import com.mercury.SpringBootRestDemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @Autowired
    private TestService ts;

    @GetMapping
    public List<Comment> getAll() {
        // GET - http://localhost:8080/comments
        System.out.println("CommentController -> getAll()");
        return commentService.getAll();
    }

    @GetMapping("/{name}")
    public Comment get(@PathVariable String name) {
        // GET - http://localhost:8080/comments/Dave
        commentService.insertTestToComment();

        return null;
    }

    @GetMapping("/age/{age}")
    public List<Comment> getByAge(@PathVariable int age) {
        // GET - http://localhost:8080/comments/age/40
        // return null;
        return commentService.getAll();
    }

    @PostMapping
    public void save(@RequestBody Comment comment) {
        // POST - http://localhost:8080/comments
        commentService.save(comment);
    }
    @PutMapping
    public void insertCommentController(@RequestBody Comment comment) {
        // PUT - http://localhost:8080/comments
        commentService.save(comment);
        System.out.println("PUT -> comment: "+ comment.getStars());
    }

    @PostMapping("/{x}")
    public void insertToSampleTable(@RequestBody Comment comment) {
        // POST - http://localhost:8080/comments
        commentService.save(comment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        // DELETE - http://localhost:8080/comments/1
        commentService.commentServiceDelete(new Comment(id));
    }

}
