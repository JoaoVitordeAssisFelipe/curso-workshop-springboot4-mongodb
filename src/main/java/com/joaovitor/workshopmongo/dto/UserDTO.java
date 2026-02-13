package com.joaovitor.workshopmongo.dto;

import com.joaovitor.workshopmongo.domain.User;

public record UserDTO (String id, String name, String email) {
    public UserDTO(User dto) {
        this(dto.getId(), dto.getName(), dto.getEmail());
    }

}