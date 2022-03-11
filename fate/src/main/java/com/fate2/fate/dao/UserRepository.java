package com.fate2.fate.dao;


import com.fate2.fate.entities.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,String> {
    
    @Query(nativeQuery= true, value="SELECT USER_ID_NUMBER  FROM USER WHERE EMAIL =:uEmail AND PASSWORD =:uPassword")    
    public Long getUserByLoginDetails(@Param("uEmail") String uEmail,@Param("uPassword") String uPassword);
}
