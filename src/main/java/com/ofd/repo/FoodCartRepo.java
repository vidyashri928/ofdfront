package com.ofd.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ofd.entity.FoodCart;

@Repository
public interface FoodCartRepo extends  JpaRepository<FoodCart,Integer>{

}
