package com.joaovitor.workshopmongo.controller;

import com.joaovitor.workshopmongo.domain.Post;
import com.joaovitor.workshopmongo.domain.User;
import com.joaovitor.workshopmongo.dto.UserDTO;
import com.joaovitor.workshopmongo.service.PostService;
import com.joaovitor.workshopmongo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService userService) {
        this.postService= userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post post = postService.findById(id);
        return ResponseEntity.ok().body(post);
    }
}
