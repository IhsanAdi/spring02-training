package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.model.request.AddBookRequestDTO;
import id.hcid.spring.exercise.model.response.AddBookResponseDTO;

import java.util.List;

public interface IAddBook {
    AddBookResponseDTO addBook(List<AddBookRequestDTO> responseDTO);
}
