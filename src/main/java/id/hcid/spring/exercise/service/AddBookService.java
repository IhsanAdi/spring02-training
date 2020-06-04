package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.entity.Book;
import id.hcid.spring.exercise.model.request.AddBookRequestDTO;
import id.hcid.spring.exercise.model.response.AddBookResponseDTO;
import id.hcid.spring.exercise.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddBookService implements IAddBook {

    @Autowired
    private IBookRepository bookRepository;

    @Override
    public AddBookResponseDTO addBook(List<AddBookRequestDTO> bookDTO) {
        List<Book> books = new ArrayList<Book>();

        for(AddBookRequestDTO addBook: bookDTO){
            Book book = new Book();
            book.setBookName(addBook.getBookName());
            books.add(book);
        }
        bookRepository.save(books);
        AddBookResponseDTO addBookResponseDTO = new AddBookResponseDTO();
        addBookResponseDTO.setStatus("SUCCESS");
        return addBookResponseDTO;
    }
}
