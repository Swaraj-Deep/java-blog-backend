package com.blogbackend.blogcontroller;

import com.blogbackend.exceptions.InvalidObjectException;
import com.blogbackend.objects.Blog;
import com.blogbackend.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class NewBlogController {
    @Autowired
    BlogService _blogService;

    public Blog newBlog(Blog blog) {
        if (blog.getBlogTitle().equals("") || blog.getBlogDescription().equals("")) {
            throw new InvalidObjectException("Invalid Request Body");
        }
        return _blogService.newBlog(blog);
    }
}
