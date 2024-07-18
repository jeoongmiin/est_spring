package com.example.day0717_restapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardPostDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private String createdAt;
    private String updatedAt;
    private List<CommentDto> comments;
}