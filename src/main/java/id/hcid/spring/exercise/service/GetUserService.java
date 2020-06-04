package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.entity.Users;
import id.hcid.spring.exercise.model.response.GetUserResponseDTO;
import id.hcid.spring.exercise.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetUserService implements IGetUser {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<GetUserResponseDTO> getAllUser(){
        List<Users> usersList = userRepository.findAll();

        List<GetUserResponseDTO> responseDTO = new ArrayList<GetUserResponseDTO>();

        for(int i=0; i < usersList.size(); i++){
            Users users = usersList.get(i);

            GetUserResponseDTO getUserResponseDTO = new GetUserResponseDTO();
            getUserResponseDTO.setFirstName(users.getFirstName());
            getUserResponseDTO.setLastName(users.getLastName());
            getUserResponseDTO.setDob(users.getDob());
            getUserResponseDTO.setId(users.getId());
            responseDTO.add(getUserResponseDTO);
        }

        return responseDTO;
    }
}
