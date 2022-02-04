package com.ofd.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ofd.entity.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login,Integer> {


}
