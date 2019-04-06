package com.vibenails.SplitterConstraints.repositories;

import org.springframework.data.repository.CrudRepository;

import com.vibenails.SplitterConstraints.entities.Clients;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ClientRepository extends CrudRepository<Clients, Integer> {

}
