package id.hcid.spring.exercise.model.response;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class GetBookResponseDTO implements Serializable {
    private String bookName;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
