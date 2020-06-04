package id.hcid.spring.exercise.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class GetUserResponseDTO implements Serializable {
    private String firstName;

    private String lastName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dob;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
