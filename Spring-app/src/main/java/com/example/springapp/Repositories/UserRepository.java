package com.example.springapp.Repositories;

import com.example.springapp.Models.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface for Partner CRUD operations.
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
