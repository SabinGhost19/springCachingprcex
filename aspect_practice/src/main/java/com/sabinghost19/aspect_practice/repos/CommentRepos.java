package com.sabinghost19.aspect_practice.repos;

import org.springframework.stereotype.Repository;

@Repository
public class CommentRepos {

    private final String name;

    CommentRepos(){
        System.out.println("Comment Repos constructor called");
        this.name = "comment";
    }

    @Override
    public String toString(){
            return this.name;
    }
}
