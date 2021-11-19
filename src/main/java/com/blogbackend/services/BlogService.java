package com.blogbackend.services;

import com.blogbackend.objects.Blog;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BlogService {
    private List<Blog> _blogs = Arrays.asList(
            new Blog("001", "First", "First Description"),
            new Blog("002", "First", "Second Description"),
            new Blog("003", "First", "Third Description")
    );

    public List<Blog> getBlogs() {
        return this._blogs;
    }

    public Blog getBlog(String id) {
        return new Blog("001", "First", "First Description");
    }

    public Blog updateBlog(String id) {
        return new Blog("001", "First", "First Description");
    }

    public Blog deleteBlog(String id) {
        return new Blog("001", "First", "First Description");
    }
}
