package com.fate2.fate.dao;

import com.fate2.fate.entities.Profile;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends CrudRepository<Profile,Long> {
    
}
