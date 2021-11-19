package com.blogbackend.blogcontroller;

import com.blogbackend.objects.Blog;
import com.blogbackend.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetBlogController {
    @Autowired
    private BlogService _blogService;

    public List<Blog> getAllBlogs() {
        return _blogService.getBlogs();
    }

    public Blog getBlog(String id) {
        return _blogService.getBlog(id);
    }
}
