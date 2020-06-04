package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.model.request.AddUserRequestDTO;
import id.hcid.spring.exercise.model.response.AddUserResponseDTO;

import java.util.List;

public interface IAddUser {
    AddUserResponseDTO addUser(List<AddUserRequestDTO> requestDTO);
}
