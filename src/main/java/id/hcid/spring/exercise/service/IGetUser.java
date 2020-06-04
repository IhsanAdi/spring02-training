package id.hcid.spring.exercise.service;


import id.hcid.spring.exercise.model.response.GetUserResponseDTO;

import java.util.List;

public interface IGetUser {
    List<GetUserResponseDTO> getAllUser();
}
