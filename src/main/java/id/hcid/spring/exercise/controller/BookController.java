package id.hcid.spring.exercise.controller;

import id.hcid.spring.exercise.model.request.AddBookRequestDTO;
import id.hcid.spring.exercise.model.response.AddBookResponseDTO;
import id.hcid.spring.exercise.service.IAddBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IAddBook addBookService;

    @PostMapping
    public ResponseEntity<AddBookResponseDTO> addBook(@RequestBody List<AddBookRequestDTO> data){
        AddBookResponseDTO result = addBookService.addBook(data);
        return new ResponseEntity<AddBookResponseDTO>(result, HttpStatus.OK);
    }
}
