package com.sabinghost19.aspect_practice.services;

import com.sabinghost19.aspect_practice.customAnnotations.ToLog;
import com.sabinghost19.aspect_practice.models.Comment;
import com.sabinghost19.aspect_practice.repos.CommentRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private final CommentRepos commentRepos;
    //giving it a name for easy observe it in the console
    private final Logger logger= Logger.getLogger(CommentService.class.getName());

    @Autowired
    public CommentService(CommentRepos commentRepos) {
        this.commentRepos = commentRepos;
    }

    public String AccessCommentsFromRepo(){
        return this.commentRepos.toString();
    }

    public void editingComment(Comment comment){
        logger.info("Editing comment:"+comment.toString());
    }

    @ToLog
    public void deleteComment(Comment comment){
        logger.info("Deleting the comment: "+comment.toString());
    }
    public String publishComment(Comment comment){
        logger.info("Publishing comment: "+comment);
        return "Success";
    }
}
