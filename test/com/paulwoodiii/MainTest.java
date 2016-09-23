package com.paulwoodiii;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by paul on 9/22/16.
 */
public class MainTest {
    @Test
    public void saveAndLoad() throws Exception {

        //When
        ArrayList<Blog> bs = new ArrayList<>();
        bs.add( new Blog() );
        bs.add( new Blog() );
        bs.add( new Blog() );
        bs.add( new Blog() );

        //If
        Main.save(bs,"testSave.json");
        ArrayList<Blog> bs2 = Main.load("testSave.json");

        //Then
        assertTrue(bs.equals(bs2));
    }

    @Test
    public void load() throws Exception {
        assertTrue(false);
    }

}