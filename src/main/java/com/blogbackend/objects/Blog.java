package com.blogbackend.objects;

public class Blog {
    private String blogId;
    private String blogTitle;
    private String blogDescription;

    public Blog() {
        this.blogId = "";
        this.blogTitle = "";
        this.blogDescription = "";
    }

    public Blog(String blogId, String blogTitle, String blogDescription) {
        this.blogId = blogId;
        this.blogTitle = blogTitle;
        this.blogDescription = blogDescription;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription;
    }

    public String getBlogId() {
        return blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId='" + blogId + '\'' +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogDescription='" + blogDescription + '\'' +
                '}';
    }

    public String getBlogDescription() {
        return blogDescription;
    }
}
