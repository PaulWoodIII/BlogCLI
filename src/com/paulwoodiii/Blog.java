package com.paulwoodiii;

import java.util.ArrayList;

/**
 * Created by paul on 9/21/16.
 */
public class Blog {
    int id;
    String author;
    String headline;
    String body;
    int readCount;
    ArrayList<String> tags;

    //TODO Add tags function

    //Default Constructor
    Blog() {
        readCount = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n\t by: " + author + '\'' + "\n\t headline: " + headline;
    }

    public String verboseString() {

//        String tagString = new String();
//        for (int i = 0; i < tags.size(); i++) {
//            tagString = tagString.concat(tags.get(i) );
//            if (i < tags.size() - 1 ){
//                tagString = tagString.concat(", ");
//            }
//        }
        this.readCount += 1;
        return "id: " + id + "\n\t by: " + author + '\'' + "\t headline: " + headline +
                " readCount: " + readCount + "\n\t body: " + body +  "\n\t tags: " +
                String.join(", ",tags);
    }

}
