package com.blogbackend.blogcontroller;

import com.blogbackend.objects.Blog;
import com.blogbackend.objects.ServerResponse;
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
    public ServerResponse<List<Blog>> getBlog() {
        return new ServerResponse<List<Blog>>(200, this._getBlogController.getAllBlogs());
    }

    @GetMapping("/blogs/{id}")
    public ServerResponse<Blog> getBlog(@PathVariable String id) {
        return new ServerResponse<Blog>(200, this._getBlogController.getBlog(id));
    }
}
