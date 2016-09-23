package com.paulwoodiii;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by paul on 9/22/16.
 */
public class BlogTest {
    @Test
    public void verboseString() throws Exception {
        Blog blog = new Blog();
        blog.body = "body";
        blog.headline = "headline";
        blog.author = "Paul";
        assertTrue(blog.readCount == 0);
        String s = blog.verboseString();
        assertTrue("verboseString increments the readCount", blog.readCount == 1);
    }

}
