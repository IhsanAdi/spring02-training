package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.model.response.GetBookResponseDTO;

import java.util.List;

public interface IGetBook {
    List<GetBookResponseDTO> getAllBook();
}
