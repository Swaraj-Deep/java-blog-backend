package com.blogbackend.blogcontroller;

import com.blogbackend.objects.Blog;
import com.blogbackend.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateBlogController {
    @Autowired
    BlogService _blogService;

    public Blog updateBlog(String id) {
        return _blogService.updateBlog(id);
    }
}
