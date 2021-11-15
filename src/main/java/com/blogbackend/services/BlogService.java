package com.blogbackend.services;

import com.blogbackend.objects.Blog;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BlogService {
    List<Blog> _blogs = Arrays.asList(
            new Blog("001", "First", "First Description"),
            new Blog("002", "First", "Second Description"),
            new Blog("003", "First", "Third Description")
    );
    public List<Blog> getAllBlogs() {
        return _blogs;
    }

}
