package com.study.FarmersChoice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.FarmersChoice.entity.Vegetable;

public interface VegetableRepository extends JpaRepository<Vegetable ,Long> {
	
	List<Vegetable> findByName(String name);
    List<Vegetable> findById(int Id);

}
