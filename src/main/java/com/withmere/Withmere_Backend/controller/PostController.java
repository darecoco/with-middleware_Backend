package com.withmere.Withmere_Backend.controller;

import com.withmere.Withmere_Backend.dto.Post.AddPostRequest;
import com.withmere.Withmere_Backend.service.post.PostPostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/post")
public class PostController {
    private final PostPostService postPostService;
    //private final DeletePostService deletePostService;
    //private final GetPostService getPostService;
    //private final PostUpdateService postUpdateService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addPost(@RequestBody @Valid AddPostRequest request) {
        postPostService.execute(request);
    }
}
