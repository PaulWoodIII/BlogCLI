package com.paulwoodiii;

import java.util.ArrayList;

/**
 * Created by paul on 9/21/16.
 */
public class BlogWrapper {
    ArrayList<Blog> blogs;
    int timeCreated;

    public BlogWrapper(){}
    public BlogWrapper(ArrayList<Blog> blogs) {
        this.blogs = blogs;
    }

    public ArrayList<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(ArrayList<Blog> blogs) {
        this.blogs = blogs;
    }

    public int getTimeCreated() {
        return timeCreated;
    }
}
