package com.sabinghost19.aspect_practice;
import com.sabinghost19.aspect_practice.models.Comment;
import com.sabinghost19.aspect_practice.services.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
public class AspectPracticeApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(AspectPracticeApplication.class, args);

        var service=context.getBean(CommentService.class);
        Comment new_comment = new Comment("COMMENT text","Custom Author");
        service.publishComment(new_comment);

        service.deleteComment(new_comment);
    }

}
