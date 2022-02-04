package com.ofd.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ofd.entity.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item,Integer> {
	

}