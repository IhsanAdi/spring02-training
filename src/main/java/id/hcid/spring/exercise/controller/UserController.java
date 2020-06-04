package id.hcid.spring.exercise.controller;

import id.hcid.spring.exercise.model.request.AddUserRequestDTO;
import id.hcid.spring.exercise.model.response.AddUserResponseDTO;
import id.hcid.spring.exercise.service.IAddUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IAddUser addUserService;

    @PostMapping
    public ResponseEntity<AddUserResponseDTO> addUser(@RequestBody List<AddUserRequestDTO> data){
        AddUserResponseDTO result = addUserService.addUser(data);
        return new ResponseEntity<AddUserResponseDTO>(result, HttpStatus.OK);
    }
}
