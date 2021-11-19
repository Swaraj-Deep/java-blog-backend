package com.blogbackend.blogcontroller;

import com.blogbackend.objects.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private GetBlogController _getBlogController;

    @GetMapping("/blogs")
    public List<Blog> getBlog() {
        return this._getBlogController.getAllBlogs();
    }

    @GetMapping("/blogs/{id}")
    public Blog getBlog(@PathVariable String id) {
        return this._getBlogController.getBlog(id);
    }
}
