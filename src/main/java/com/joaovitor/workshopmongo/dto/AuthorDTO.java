package com.joaovitor.workshopmongo.dto;

import com.joaovitor.workshopmongo.domain.User;

public record AuthorDTO(String id, String name) {
    public AuthorDTO(User dto) {
        this(dto.getId(), dto.getName());
    }
}
