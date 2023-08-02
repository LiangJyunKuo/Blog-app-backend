package com.springboot.blog.payload;

//Dto => data transfer object

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {

    private Long id;

    @NotEmpty
    @Size(min = 2,message = "Title should have at least 2 characters")
    private String title;

    @NotEmpty
    @Size(min = 10,message = "Description should have at least 2 characters")
    private String description;

    @NotEmpty
    private String content;

    private Set<CommentDto> comments;

    private Long categoryId;

}

//Two approach
/*

1. send a jpa entity as a response to the client

2.rest api convert a jpa entity into dto and send the dyo as a response to the client

=> help to hide implementation details
 */