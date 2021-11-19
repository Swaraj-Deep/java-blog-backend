package com.blogbackend.blogcontroller;

import com.blogbackend.objects.Blog;
import com.blogbackend.objects.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class BlogController {

    @Autowired
    private GetBlogController _getBlogController;

    @Autowired
    private NewBlogController _newBlogController;

    @Autowired
    private UpdateBlogController _updateBlogController;

    @Autowired
    private DeleteBlogController _deleteBlogController;

    @GetMapping("/blogs/get")
    public ResponseEntity<ServerResponse<List<Blog>>> getBlog() {
        return ResponseEntity.status(HttpStatus.OK).body(new ServerResponse<List<Blog>>(200, this._getBlogController.getAllBlogs()));
    }

    @GetMapping("/blogs/get/{id}")
    public ResponseEntity<ServerResponse<Blog>> getBlog(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(new ServerResponse<Blog>(200, this._getBlogController.getBlog(id)));
    }

    @PostMapping("/blogs/new")
    public ResponseEntity<ServerResponse<Blog>> newBlog(@RequestBody Blog blog) {
        return ResponseEntity.status(HttpStatus.CREATED).body(new ServerResponse<Blog>(201, this._newBlogController.newBlog(blog)));
    }

    @PatchMapping("/blogs/update/{id}")
    public ResponseEntity<ServerResponse<Blog>> updateBlog(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(new ServerResponse<Blog>(200, this._updateBlogController.updateBlog(id)));
    }

    @DeleteMapping("/blogs/delete/{id}")
    public ResponseEntity<ServerResponse<Blog>> deleteBlog(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(new ServerResponse<Blog>(200, this._deleteBlogController.deleteBlog(id)));
    }
}
