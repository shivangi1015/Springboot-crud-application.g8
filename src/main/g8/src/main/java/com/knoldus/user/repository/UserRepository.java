package com.knoldus.user.repository;

import com.knoldus.user.models.User;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * CRUD operations for the user.
 */
public interface UserRepository extends CrudRepository<User, String> {
    
    @Query(allowFiltering = true)
    List<User> getUserByNameAndAge(String name, String age);
    
    @Query(allowFiltering = true)
    long countByName(String name);
 
}
