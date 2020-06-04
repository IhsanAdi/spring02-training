package id.hcid.spring.exercise.repository;

import id.hcid.spring.exercise.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBookRepository extends JpaRepository<Book, Long> {
    @Override
    List<Book> findAll();
}
