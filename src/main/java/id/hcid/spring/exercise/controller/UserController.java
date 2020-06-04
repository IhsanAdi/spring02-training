package id.hcid.spring.exercise.controller;

import id.hcid.spring.exercise.model.request.AddUserRequestDTO;
import id.hcid.spring.exercise.model.response.AddUserResponseDTO;
import id.hcid.spring.exercise.model.response.GetUserResponseDTO;
import id.hcid.spring.exercise.service.IAddUser;
import id.hcid.spring.exercise.service.IGetUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IAddUser addUserService;

    @Autowired
    private IGetUser getUserService;

    @PostMapping
    public ResponseEntity<AddUserResponseDTO> addUser(@RequestBody List<AddUserRequestDTO> data){
        AddUserResponseDTO result = addUserService.addUser(data);
        return new ResponseEntity<AddUserResponseDTO>(result, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<GetUserResponseDTO>> getAllUser(){
        return new ResponseEntity(getUserService.getAllUser(), HttpStatus.OK);
    }

}
