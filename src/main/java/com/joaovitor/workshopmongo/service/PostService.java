package com.joaovitor.workshopmongo.service;

import com.joaovitor.workshopmongo.Repository.PostRepository;
import com.joaovitor.workshopmongo.Repository.UserRepository;
import com.joaovitor.workshopmongo.domain.Post;
import com.joaovitor.workshopmongo.domain.User;
import com.joaovitor.workshopmongo.dto.UserDTO;
import com.joaovitor.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

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
        return postRepository.findByTitleContainingIgnoreCase(text);
    }
}
