package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.entity.Users;
import id.hcid.spring.exercise.model.request.AddUserRequestDTO;
import id.hcid.spring.exercise.model.response.AddUserResponseDTO;
import id.hcid.spring.exercise.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddUserService implements IAddUser{

    @Autowired
    private IUserRepository userRepository;

    @Override
    public AddUserResponseDTO addUser(List<AddUserRequestDTO> userDTO){

        List<Users> users = new ArrayList<Users>();
        for(AddUserRequestDTO addUser: userDTO){
            Users user = new Users();
            user.setFirstName(addUser.getFirstName());
            user.setLastName(addUser.getLastName());
            user.setDob(addUser.getDob());
            users.add(user);
        }
        userRepository.save(users);
        AddUserResponseDTO responseDTO = new AddUserResponseDTO();
        responseDTO.setStatus("SUCCESS");
        return responseDTO;
    }
}
