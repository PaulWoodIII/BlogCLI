package com.paulwoodiii;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Blog> blogs = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
        System.out.println("WELCOME");
        System.out.println("Lets start some blogging");
        System.out.println("What would you like to do?");
        while(true) {
            mainMenu();
        }
    }

    private static void mainMenu() {
        System.out.println("Main Menu");
        System.out.println("---------");
        System.out.println("    [1] Create Blog");
        System.out.println("    [2] List Blogs");
        System.out.println("    [3] Read Blogs");
        String nextLine = scanner.nextLine();
        switch (nextLine){
            case "1":
                Blog b = createBlog();
                blogs.add(b);
                break;
            case "2":
                listBlogs();
                break;
            case "3":
                int blogId = readBlogPrompt();
                displayBlog(blogId);
                break;
        }
    }

    private static Blog createBlog(){
        System.out.println("Create a Blog");
        System.out.println("-------------");
        System.out.println("Input Blog Author:");
        System.out.println("------------------");
        String author = scanner.nextLine();
        System.out.println("Input Blog Headline:");
        System.out.println("--------------------");
        String title = scanner.nextLine();
        System.out.println("Input Blog Body:");
        System.out.println("----------------");
        String content = scanner.nextLine();
        boolean notFinished = true;
        ArrayList<String> tags = new ArrayList<>();
        while(notFinished) {
            System.out.println("Add a tag or type done:");
            System.out.println("-----------------------");
            String tag = scanner.nextLine();
            if (tag.equalsIgnoreCase("done")){
                notFinished = false;
                continue;
            }
            tags.add(tag);
        }
        Blog b = new Blog();
        b.setBody(content);
        b.setAuthor(author);
        b.setHeadline(title);
        b.setTags(tags);
        b.setId(blogs.size() + 1);
        return b;
    }

    private static void listBlogs(){
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }

    private static int readBlogPrompt(){
        System.out.println("Input the id of the Blog you would like to read:");
        System.out.println("-----------------------");
        String input = scanner.nextLine();
        int blogId;
        blogId = Integer.valueOf(input);
        return blogId;
    }

    private static void displayBlog(int blogId){
        for (Blog blog : blogs) {
            System.out.println(blog.verboseString());
        }
    }

}
