package com.joaovitor.workshopmongo.dto;

import java.util.Date;

public record CommentDTO(String text,Date date, AuthorDTO author) {

    public CommentDTO (String text, Date date, AuthorDTO author){
        this.text = text;
        this.date = date;
        this.author = author;
    }
}
