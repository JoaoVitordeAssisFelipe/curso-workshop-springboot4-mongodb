package com.joaovitor.workshopmongo.service;

import com.joaovitor.workshopmongo.Repository.UserRepository;
import com.joaovitor.workshopmongo.domain.User;
import com.joaovitor.workshopmongo.dto.UserDTO;
import com.joaovitor.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        return userRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj){
        return userRepository.insert(obj);
    }

    public void delete(String id){
        findById(id);
        userRepository.deleteById(id);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.id(),objDto.name(),objDto.email());
    }

    public User update(String id, User obj) {

        User entity = userRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado"));

        updateData(entity, obj);

        return userRepository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
    }

}
