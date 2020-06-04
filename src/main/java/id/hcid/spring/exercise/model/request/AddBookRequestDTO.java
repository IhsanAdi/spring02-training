package id.hcid.spring.exercise.model.request;

import java.io.Serializable;

public class AddBookRequestDTO implements Serializable {
    private String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
