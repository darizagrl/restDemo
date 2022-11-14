package com.example.library.api.dto;

import com.example.library.service.model.BookModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDTO {
    private Long id;
    private String firstname;
    private String lastname;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<BookModel> booksList;
}
