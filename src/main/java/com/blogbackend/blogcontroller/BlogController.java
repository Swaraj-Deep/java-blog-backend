package com.blogbackend.blogcontroller;

import com.blogbackend.objects.Blog;
import com.blogbackend.objects.ServerResponse;
import com.blogbackend.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private BlogService _blogService;
    @GetMapping("/blogs")
    public List<Blog> getBlog() {
        return _blogService.getAllBlogs();
    }
}
