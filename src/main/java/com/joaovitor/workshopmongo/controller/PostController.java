package com.joaovitor.workshopmongo.controller;

import com.joaovitor.workshopmongo.controller.util.URL;
import com.joaovitor.workshopmongo.domain.Post;
import com.joaovitor.workshopmongo.domain.User;
import com.joaovitor.workshopmongo.dto.UserDTO;
import com.joaovitor.workshopmongo.service.PostService;
import com.joaovitor.workshopmongo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Date;
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

    @GetMapping("/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = " ") String text){
        text = URL.decodeParam(text);
        List<Post> list = postService.findByTitle(text);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/fullsearch")
    public ResponseEntity<List<Post>> fullsearch(@RequestParam(value = "text", defaultValue = " ") String text,
                                                 @RequestParam(value = "minDate", defaultValue = " ") String minDate,
                                                 @RequestParam(value = "maxDate", defaultValue = " ") String maxDate){
        text = URL.decodeParam(text);
        Date min = URL.ConvertDate(minDate,new Date (0L));
        Date max = URL.ConvertDate(maxDate,new Date ()) ;

        List<Post> list = postService.fullSearch(text,min,max);
        return ResponseEntity.ok().body(list);
    }
}
