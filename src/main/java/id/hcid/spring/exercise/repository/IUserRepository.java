package id.hcid.spring.exercise.repository;

import id.hcid.spring.exercise.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRepository extends JpaRepository<Users, Long>{
    @Override
    List<Users> findAll();
}
