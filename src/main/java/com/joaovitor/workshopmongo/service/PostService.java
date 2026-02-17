package com.joaovitor.workshopmongo.service;

import com.joaovitor.workshopmongo.Repository.PostRepository;
import com.joaovitor.workshopmongo.domain.Post;
import com.joaovitor.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post findById(String id){
        return postRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return postRepository.searchTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate){
        maxDate = new Date(maxDate.getTime()+ 24*60*60*100);
        return postRepository.fullSearch(text,minDate,maxDate);
    }
}
