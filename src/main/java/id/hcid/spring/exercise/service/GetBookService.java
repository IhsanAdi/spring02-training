package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.entity.Book;
import id.hcid.spring.exercise.model.response.GetBookResponseDTO;
import id.hcid.spring.exercise.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetBookService implements IGetBook {
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public List<GetBookResponseDTO> getAllBook() {
        List<Book> bookList = bookRepository.findAll();

        List<GetBookResponseDTO> responseDTO = new ArrayList<GetBookResponseDTO>();

        for(int i=0; i < bookList.size(); i++){
            Book book = bookList.get(i);

            GetBookResponseDTO getBookResponseDTO = new GetBookResponseDTO();
            getBookResponseDTO.setBookName(book.getBookName());
            getBookResponseDTO.setId(book.getId());
            responseDTO.add(getBookResponseDTO);
        }
        return responseDTO;
    }
}
